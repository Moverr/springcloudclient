/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springcloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 *
 * @author muyin
 */
//@Configuration
//@EnableAutoConfiguration
//@EnableDiscoveryClient 

@SpringBootApplication
 @Profile("mover")
   
public class Application {

            
            
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
