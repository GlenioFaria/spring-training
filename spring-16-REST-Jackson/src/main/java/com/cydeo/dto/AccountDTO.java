package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"address","country","state"},ignoreUnknown = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountDTO {

    private String name;
    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;

    @JsonBackReference// this field is not going to be serialized
    private UserDTO user;

}
