package com.crpdev.mssc.oil.inventory.failover.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by rajapandian
 * Date: 14/09/20
 * Project: mssc-oil-eureka
 * Package: com.crpdev.mssc.oil.inventory.failover.config
 **/
@EnableDiscoveryClient
@Profile("local-discovery")
@Configuration
public class LocalDiscovery {
}
