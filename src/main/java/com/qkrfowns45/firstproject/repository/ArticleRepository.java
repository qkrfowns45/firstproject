package com.qkrfowns45.firstproject.repository;

import com.qkrfowns45.firstproject.entity.Article;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface ArticleRepository extends CrudRepository<Article,Long> {
    @Override
    ArrayList<Article> findAll();
}
