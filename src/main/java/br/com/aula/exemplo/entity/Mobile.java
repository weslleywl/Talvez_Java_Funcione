package br.com.aula.exemplo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Mobile {

    private Integer price;
    private String code;
    private String model;
    private String brand;
    private String photo;
    private String date;
}
