package kz.spring.springboot.springbootdemo.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private Long id;
    private String name;
    private double engineVolume;
    private int maxSpeed;
}