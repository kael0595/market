package com.example.market.answer.entity;

import com.example.market.entity.BaseEntity;
import com.example.market.member.entity.Member;
import com.example.market.question.entity.Question;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Answer extends BaseEntity {
    private String comment;
    @OneToOne
    private Member member;
    @OneToOne
    private Question question;
}
