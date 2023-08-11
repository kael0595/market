package com.example.market.products.entity;

import com.example.market.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product extends BaseEntity {

    private int marketId;

    private String name;

    private int price;

    private int hitCount;

    private String isActive;

    private String Description;
}
