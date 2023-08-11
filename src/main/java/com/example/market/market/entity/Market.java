package com.example.market.market.entity;

import com.example.market.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Market extends BaseEntity {

    private int memberId;

    private String email;

    private String name;

    private String info;

}
