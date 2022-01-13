package com.qkrfowns45.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@ToString
@AllArgsConstructor
@Entity//DB가 해당 객체를 인식 가능 (해당 클래스로 테이블을 만든다)
@NoArgsConstructor //디폴트 생성자 이게 있어야 디폴트값을 선언할수 있다.
@Getter
public class Article {

    @Id // 대표값을 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) //자동 생성 어노테이션 DB가 자동으로 생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
