package com.kafka.producer.service;

import com.kafka.producer.dto.request.UserRequest;
import com.kafka.producer.writer.UserKafkaWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

  @Autowired private UserKafkaWriter userKafkaWriter;

  @Override
  public void publishUserInformation(List<UserRequest> userRequest) {
    userKafkaWriter.write(userRequest);
  }
}
