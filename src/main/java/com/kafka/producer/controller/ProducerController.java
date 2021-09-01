package com.kafka.producer.controller;

import com.kafka.producer.dto.request.UserRequest;
import com.kafka.producer.service.UserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** ProducerController is a sample producer class for kafka producer. */
@RestController
@RequestMapping("/kafka-producer")
public class ProducerController {

  @Autowired UserService userService;

  @PostMapping("/publishUser")
  public String publishInform(
      @RequestHeader String authorization, @RequestBody List<UserRequest> userRequest) {
    Logger logger = LoggerFactory.getLogger(UserRequest.class);
    logger.debug("::Strating of PublishInformation::");
    userService.publishUserInformation(userRequest);
    return "Information published...!!";
  }
}
