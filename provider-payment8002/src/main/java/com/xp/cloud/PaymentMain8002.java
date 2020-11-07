package com.xp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 * User: xp
 * Date: 2020/10/29
 * Time: 11:34
 * Description: No Description
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8002 {
  public static void main(String[] args) {
    SpringApplication.run(PaymentMain8002.class, args);
  }
}
