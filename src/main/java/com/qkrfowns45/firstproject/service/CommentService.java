package com.qkrfowns45.firstproject.service;

import com.qkrfowns45.firstproject.dto.CommentDto;
import com.qkrfowns45.firstproject.entity.Article;
import com.qkrfowns45.firstproject.entity.Comment;
import com.qkrfowns45.firstproject.repository.ArticleRepository;
import com.qkrfowns45.firstproject.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private ArticleRepository articleRepository;

    public List<CommentDto> comment(Long articleId) {
        //조회 : 댓글 목록
        //List<Comment> comments = commentRepository.findbyArticleId(articleId);

        //변환 : 엔티티 ->Dto
//        List<CommentDto> dtos = new ArrayList<CommentDto>();
//        for(int i=0; i< comments.size(); i++){
//            Comment c = comments.get(i);
//            CommentDto dto = CommentDto.createCommentDto(c);
//            dtos.add(dto);
//        }
        //스트링 문법으로 개선

        //반환
        return commentRepository.findbyArticleId(articleId).stream().map(comment -> CommentDto.createCommentDto(comment)).collect(Collectors.toList());
    }

    @Transactional
    public CommentDto create(Long articleId, CommentDto dto) {
        //게시글 조회 및 예외 발생
        Article article = articleRepository.findById(articleId).orElseThrow(() -> new IllegalArgumentException("댓글 생성 실패! 대상 게시글이 없습니다."));

        //댓글 엔티티 생성
        Comment comment = Comment.createComment(dto, article);

        //댓글 엔티티를 DB로 저장
        Comment created = commentRepository.save(comment);

        //DTO로 변경하여 반환
        return CommentDto.createCommentDto(created);
    }
}
