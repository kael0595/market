package com.example.market.member.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@Entity
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String userName;

    private String password;

    private String nickName;

    private String email;

    @CreatedDate
    private LocalDate createDate;

    @LastModifiedDate
    private LocalDate modifyDate;


}
