
package com.cydeo.dto;

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
public class ClassDTO {

    @JsonIgnore // or put in top of the class like a value
    private Long id;

    private String name;
    private Integer year;

    private CourseDTO course;

    private TeacherDTO teacher;

}