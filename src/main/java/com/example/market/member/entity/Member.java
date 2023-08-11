package com.example.market.member.entity;

import com.example.market.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Member extends BaseEntity {

    @Column(unique = true)
    private String username;

    private String password;

    private String nickName;

    private String email;

    private String isActive;

}
