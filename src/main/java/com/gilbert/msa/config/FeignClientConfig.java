package com.gilbert.msa.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "com.gilbert.msa.client")
@Configuration
public class FeignClientConfig {

}
