package org.rpsingh.servicediscovery.ribbon;

import org.rpsingh.servicediscovery.ribbon.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@RibbonClient(name = "ping-a-server", configuration = RibbonConfiguration.class)
@EnableEurekaClient
@SpringBootApplication
public class SpringCloudLoadBalancerRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudLoadBalancerRibbonApplication.class, args);
	}

}
