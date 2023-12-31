package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Sink;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableBinding(Sink.class)
public class SpringCloudStreamSubcriberApplication {
			
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamSubcriberApplication.class, args);
	}
}
