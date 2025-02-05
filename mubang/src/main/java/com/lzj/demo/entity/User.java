package com.lzj.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author  xcp
 * @version 1.0
 */
@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class User {
    Integer collegeInfluence;
    Integer coin;
    String name;
    String password;
    String college;
    String phoneNumber;
    String UID;
    String dateTime;
    String task;
    Integer towerNumber;
}
