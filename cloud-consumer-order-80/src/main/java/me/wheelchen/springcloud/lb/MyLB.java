package me.wheelchen.springcloud.lb;


import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Kelvin Chen
 * @date 2020-06-16 15:54:15
 */
@Slf4j
@Component
public class MyLB implements LoadBalancer {
    private AtomicInteger nextServerCyclicCounter;

    public MyLB() {
        this.nextServerCyclicCounter = new AtomicInteger(0);
    }

    @Override
    public ServiceInstance chooseInstance(List<ServiceInstance> serviceInstances) {
        int index = incrementAndGetModulo(serviceInstances.size());
        return serviceInstances.get(index);
    }

    private final int incrementAndGetModulo(int modulo) {
        int current;
        int next;
        do {
            current = nextServerCyclicCounter.get();
            // 防止溢出
            if (current >= Integer.MAX_VALUE || current < 0) {
                current = 0;
            }
            next = (current + 1) % modulo;
        } while (!nextServerCyclicCounter.compareAndSet(current, next));
        log.info(" *** next value is {}", next);
        return next;
    }
}
