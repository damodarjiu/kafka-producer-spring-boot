package com.kafka.producer.dto.request;

import com.opencsv.bean.CsvBindByPosition;
import lombok.Data;

@Data
public class ShareHoldingsInformation {
  @CsvBindByPosition(position = 0)
  private String holdingName;

  @CsvBindByPosition(position = 1)
  private String shareHolder;

  @CsvBindByPosition(position = 2)
  private String holdingPercentage;

  @CsvBindByPosition(position = 3)
  private String deficitFactor;

  @CsvBindByPosition(position = 4)
  private String currentNAV;

  @CsvBindByPosition(position = 5)
  private String shareValue;

  @CsvBindByPosition(position = 6)
  private String organization;

  @CsvBindByPosition(position = 7)
  private String sector;

  @CsvBindByPosition(position = 8)
  private String intialFactor;
}
