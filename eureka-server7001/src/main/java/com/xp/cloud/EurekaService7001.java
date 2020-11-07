package com.xp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 * User: xp
 * Date: 2020/10/28
 * Time: 22:03
 * Description: No Description
 */
@EnableEurekaServer//开启EurekaServer
@SpringBootApplication
public class EurekaService7001 {
  public static void main(String[] args) {
    SpringApplication.run(EurekaService7001.class, args);
  }
}
