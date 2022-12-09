package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.embedded.EmbeddedMongoAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.application.cli.CliOrderController;

@SpringBootApplication
@PropertySource(value = { "classpath:application.properties" })
//@EnableAutoConfiguration(exclude = { EmbeddedMongoAutoConfiguration.class })
public class AplicationDddApplication implements CommandLineRunner {

	//public static void main(String[] args) {
		//SpringApplication.run(AplicationDddApplication.class, args);
		  public static void main(final String[] args) {
		        SpringApplication application = new SpringApplication(AplicationDddApplication.class);
		        // uncomment to run just the console application
		        // application.setWebApplicationType(WebApplicationType.NONE);
		        application.run(args);
		    }
	
		@Autowired
	    public CliOrderController orderController;

	    @Autowired
	    public ConfigurableApplicationContext context;

	    @Override
	    public void run(String... args) throws Exception {
	        orderController.createCompleteOrder();
	        orderController.createIncompleteOrder();
	        // uncomment to stop the context when execution is done
	        // context.close();
	    }
}
