package com.zzz.wilson.lai.Config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ Author     ：Wilson.lai
 * @ Date       ：创建于 2020/11/11 23:41
 * @ Description：
 * @ Modified By：
 * @ Version:
 */
@Configuration
public class GatewayConfig {
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_zzz", r->r.path("/spring/cloud").uri("https://spring.io/projects/spring-cloud-gateway#overview"));
        return routes.build();
    }
}
