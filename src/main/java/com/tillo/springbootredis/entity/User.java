package com.tillo.springbootredis.entity;


import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable
{
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Integer age;
}