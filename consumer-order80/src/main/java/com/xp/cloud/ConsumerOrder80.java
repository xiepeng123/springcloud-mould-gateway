package com.xp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 * User: xp
 * Date: 2020/10/28
 * Time: 17:24
 * Description: No Description
 */
@EnableEurekaClient
@SpringBootApplication
public class ConsumerOrder80 {

  public static void main(String[] args) {
    SpringApplication.run(ConsumerOrder80.class, args);
  }

}
