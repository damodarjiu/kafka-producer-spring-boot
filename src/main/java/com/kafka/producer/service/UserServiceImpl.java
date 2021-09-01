package com.kafka.producer.service;

import com.kafka.producer.dto.request.ShareHoldingsInformation;
import com.kafka.producer.writer.ShareHoldingsKafkaWriter;
import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class UserServiceImpl implements UserService {

  Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
  private static final String COMMA_DELIMITER = ",";
  @Autowired private ShareHoldingsKafkaWriter userKafkaWriter;

  @Override
  public void publishUserInformation() {

    /* BufferedReader br =
    new BufferedReader(
            new InputStreamReader(getClass().getResourceAsStream("/sample-data.csv")))*/
    List<ShareHoldingsInformation> holdingsInformations = new ArrayList<>();
    try (CSVReader csvReader =
        new CSVReader(new InputStreamReader(getClass().getResourceAsStream("/sample-data.csv")))) {
      holdingsInformations =
          new CsvToBeanBuilder<ShareHoldingsInformation>(csvReader)
              .withType(ShareHoldingsInformation.class)
              .build()
              .parse();

    } catch (Exception ex) {
      logger.info(ex.getMessage());
    }
    userKafkaWriter.write(holdingsInformations);
  }
}
