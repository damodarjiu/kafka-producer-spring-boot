package com.kafka.producer.service;

import com.kafka.producer.dto.request.UserRequest;

import java.util.List;

public interface UserService {
  void publishUserInformation(List<UserRequest> userRequest);
}
