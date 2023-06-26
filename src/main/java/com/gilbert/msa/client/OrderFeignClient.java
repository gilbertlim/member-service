package com.gilbert.msa.client;

import com.gilbert.msa.domain.dto.OrderDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order", url = "${service.order.base-url}")
public interface OrderFeignClient {

    @GetMapping("/orders")
    List<OrderDto> getOrders();
}