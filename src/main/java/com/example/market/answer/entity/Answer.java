package com.example.market.answer.entity;

import com.example.market.entity.BaseEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Answer extends BaseEntity {

    private int memberId;

    private int questionId;

    private String comment;
}
