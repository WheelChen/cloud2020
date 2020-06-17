package me.wheelchen.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author Kelvin Chen
 * @date 2020-06-16 15:46:31
 */

public interface LoadBalancer {

    ServiceInstance chooseInstance(@NotEmpty List<ServiceInstance> serviceInstances);
}
