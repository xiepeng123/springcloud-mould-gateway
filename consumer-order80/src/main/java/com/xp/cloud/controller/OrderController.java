package com.xp.cloud.controller;

import com.xp.cloud.entities.CommonResult;
import com.xp.cloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



/**
 * @ClassName: OrderController
 * @description:
 * @author: XZQ
 * @create: 2020/3/5 21:18
 **/
@RestController
@Slf4j
public class OrderController {

//  private final static String PAYMENT_URL = "http://localhost:8001";

  private final static String PAYMENT_URL = "http://PROVIDER-PAYMENT8001";

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/consumer/payment/get/{id}")
  public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
    return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class, id);
  }

  @PostMapping("/consumer/payment/create")
  public CommonResult<Payment> create(@RequestBody Payment payment) {
    return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
  }


}
