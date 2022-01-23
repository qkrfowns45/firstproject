package com.qkrfowns45.firstproject.service;

import com.qkrfowns45.firstproject.repository.ArticleRepository;
import com.qkrfowns45.firstproject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleRepository articleRepository;
}
