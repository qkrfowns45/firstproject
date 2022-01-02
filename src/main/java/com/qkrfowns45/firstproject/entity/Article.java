package com.qkrfowns45.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@ToString
@AllArgsConstructor
@Entity//DB가 해당 객체를 인식 가능
@NoArgsConstructor //디폴트 생성자 이게 있어야 디폴트값을 선언할수 있다.
public class Article {

    @Id // 대표값을 지정
    @GeneratedValue //자동 생성 어노테이션
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
