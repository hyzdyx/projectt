package com.cdrail.service.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@MapperScan("com.cdrail.service.mapper")
@EnableSwagger2
public class ServiceConfigure {
}
