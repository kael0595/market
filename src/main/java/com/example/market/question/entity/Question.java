package com.example.market.question.entity;

import com.example.market.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Question extends BaseEntity {

    private int memberId;

    private String title;

    private String content;


}
