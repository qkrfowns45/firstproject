package com.qkrfowns45.firstproject.controller;

import com.qkrfowns45.firstproject.dto.ArticleForm;
import com.qkrfowns45.firstproject.entity.Article;
import com.qkrfowns45.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {

    @Autowired //스프링 부트가 미리 생성해높은 객체를 가져다가 자동으로 연결(DI)
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){

        System.out.println(form.toString());

        //1.Dto 변환 Emtity
        Article article = form.toEntity();
        System.out.println(article.toString());

        //2.Repository에게 Entity를 DB안에 저장
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }
}
