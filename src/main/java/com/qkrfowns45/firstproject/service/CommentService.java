package com.qkrfowns45.firstproject.service;

import com.qkrfowns45.firstproject.dto.CommentDto;
import com.qkrfowns45.firstproject.entity.Comment;
import com.qkrfowns45.firstproject.repository.ArticleRepository;
import com.qkrfowns45.firstproject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleRepository articleRepository;

    public List<CommentDto> comment(Long artricleId) {
        //조회 : 댓글 목록
        List<Comment> comments = commentRepository.findbyArticleId(artricleId);

        //변환 : 엔티티 ->Dto
        List<CommentDto> dtos = new ArrayList<CommentDto>();
        for(int i=0; i< comments.size(); i++){
            Comment c = comments.get(i);
            CommentDto dto = CommentDto.createCommentDto(c);
            dtos.add(dto);
        }
        //반환
        return dtos;
    }
}
