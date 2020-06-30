package com.example.configservere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableConfigServer					//如果引入不了此注解，可能是maven下载的此jar包有问题，可在网上下载该jar包即可
public class ConfigServereApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServereApplication.class, args);
	}

}
