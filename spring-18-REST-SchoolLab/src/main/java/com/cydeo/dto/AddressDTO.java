package com.cydeo.dto;

import com.cydeo.enums.AddressType;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(/*value = {"id"}*/ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDTO {

    @JsonIgnore// can put in the top
    private Long id;

    private String street;
    private String country;
    private String state;
    private String city;
    private String postalCode;

    private AddressType addressType;

    @JsonBackReference (value = "student-address-reference") //default reference
    private StudentDTO student;

    @JsonBackReference (value = "parent-address-reference") //default reference
    private ParentDTO parent;//  @JsonManagedReference(value = "parent-address-reference") in ParentDTO class

    @JsonBackReference (value = "teacher-address-reference")  //default reference
    private TeacherDTO teacher;

    private Integer currentTemperature; //Weather information, which we will later get it from 3rd party API

}