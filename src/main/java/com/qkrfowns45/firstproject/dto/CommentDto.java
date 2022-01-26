package com.qkrfowns45.firstproject.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.qkrfowns45.firstproject.entity.Comment;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CommentDto {
    private Long id;
    @JsonProperty("article_id") //자동으로 json에서 값을 가져오게 한다!
    private Long articleId;
    private String nickname;
    private String body;

    public static CommentDto createCommentDto(Comment comment) {
        return new CommentDto(
                  comment.getId(),
                  comment.getArticle().getId(),
                comment.getNickname(),
                comment.getBody()
        );
    }
}
