package com.example.market.question.entity;

import com.example.market.entity.BaseEntity;
import com.example.market.member.entity.Member;
import com.example.market.products.entity.Product;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Question extends BaseEntity {

    private String title;
    private String content;

    @ManyToOne
    private Member member;

    @ManyToOne
    private Product product;

}
