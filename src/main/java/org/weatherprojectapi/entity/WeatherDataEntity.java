package org.weatherprojectapi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "weather")
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDataEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @Column(name = "latitude")
  private String latitude;

  @Column(name = "longitude")
  private String longitude;

  @Column(name = "temperature")
  private String temperature;

  @Column(name = "created")
  private LocalDateTime timeCreated;


}
