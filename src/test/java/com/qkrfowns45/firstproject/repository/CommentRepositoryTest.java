package com.qkrfowns45.firstproject.repository;

import com.qkrfowns45.firstproject.entity.Article;
import com.qkrfowns45.firstproject.entity.Comment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest // jpa와 연동한 테스트!
class CommentRepositoryTest {

    @Autowired CommentRepository commentRepository;

    @Test
    @DisplayName("특정 게시글의 모든 댓글 조회")
    void findbyArticleId() {
        //Case 1:4번 게시글의 모든 댓글 조회
        {
            //입력 데이터 준비
            Long articleId = 4L;
            //실제 수행
            List<Comment> comments = commentRepository.findbyArticleId(articleId);
            //예상하기
            Article article = new Article(4L,"당신의 인생 영화는", "댓글 작성");
            Comment a = new Comment(1L,article,"Park","인셉션");
            Comment b = new Comment(2L,article,"Kim","쇼생크탈출");
            Comment c = new Comment(3L,article,"Choi","어거스트러쉬");
            List<Comment> expected = Arrays.asList(a,b,c);
            //검증
            assertEquals(expected.toString(),comments.toString(),"4번 글의 모든 댓글을 출력!");
        }
        //Case 2:1번 게시글의 모든 댓글 조회
        {
            //입력 데이터 준비
            Long articleId = 1L;
            //실제 수행
            List<Comment> comments = commentRepository.findbyArticleId(articleId);
            //예상하기
            Article article = new Article(1L,"첫번째 데이터", "이것이 첫번째");

            List<Comment> expected = Arrays.asList();
            //검증
            assertEquals(expected.toString(),comments.toString(),"1번 글은 댓글이 없음!");
        }
    }

    @Test
    @DisplayName("특정 닉네임의 모든 댓글 조회")
    void findByNickname() {
        //Case 1:"Park의 모든 댓글 조회"
        {
            //입력 데이터 준비
            String nickname = "Park";
            //실제 수행
            List<Comment> comments = commentRepository.findByNickname(nickname);
            //예상하기
            Comment a = new Comment(1L,new Article(4L,"당신의 인생 영화는", "댓글 작성"),"Park","인셉션");
            Comment b = new Comment(4L,new Article(5L,"당신의 소울 푸드는", "댓글 작성"),"Park","치킨");
            Comment c = new Comment(7L,new Article(6L,"당신의 취미는", "댓글 작성"),"Park","조깅");
            List<Comment> expected = Arrays.asList(a,b,c);
            //검증
            assertEquals(expected.toString(),comments.toString(),"Park의 모든 댓글을 출력!");
        }
    }
}