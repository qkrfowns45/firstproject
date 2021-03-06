package com.qkrfowns45.firstproject.dto;

import com.qkrfowns45.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

//롬복 어노테이션 코드 단축
@ToString
@AllArgsConstructor
public class ArticleForm {

    private Long id;
    private String title;
    private String content;

    public Article toEntity() {

        return new Article(id,title,content);
    }
}

