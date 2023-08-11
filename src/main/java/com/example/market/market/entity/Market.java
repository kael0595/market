package com.example.market.market.entity;

import com.example.market.entity.BaseEntity;
import com.example.market.products.entity.Product;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Member;
import java.util.List;

@Entity
@Getter
@Setter
public class Market extends BaseEntity {
    private String email;
    private String name;
    private String info;
    @OneToOne
    private Member member;

    @OneToMany(mappedBy = "market", cascade = CascadeType.REMOVE)
    private List<Product> productList;
}
