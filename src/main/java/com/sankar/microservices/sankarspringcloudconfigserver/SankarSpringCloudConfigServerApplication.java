package com.sankar.microservices.sankarspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

// to enable the spring config server through this app.
@EnableConfigServer
@SpringBootApplication
public class SankarSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SankarSpringCloudConfigServerApplication.class, args);
	}

}
