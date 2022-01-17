package com.qkrfowns45.firstproject.service;

import com.qkrfowns45.firstproject.dto.ArticleForm;
import com.qkrfowns45.firstproject.entity.Article;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest //해당 클래스는 스프링부트와 연동되어 테스트된다.
class ArticleServiceTest {

    @Autowired
    ArticleService articleService;

    @Test
    void index() {
        //예상
        Article a = new Article(1L,"첫번째 데이터","이것이 첫번째");
        Article b = new Article(2L,"두번째 데이터","이것이 두번째");
        Article c = new Article(3L,"세번째 데이터","이것이 세번째");

        List<Article> expected = new ArrayList<Article>(Arrays.asList(a,b,c));

        //실재
        List<Article> articles = articleService.index();

        //비교
        assertEquals(expected.toString(), articles.toString());
    }

    @Test
    void show_성공() {
        //예상
        Long id = 1L;
        Article expected = new Article(id,"첫번째 데이터","이것이 첫번째");

        //실재
        Article article = articleService.show(id);
        //비교
        assertEquals(expected.toString(),article.toString());

    }

    @Test
    void show_실패() {
        //예상
        Long id = -1L;
        Article expected = null;

        //실재
        Article article = articleService.show(id);
        //비교
        assertEquals(expected,article);
    }

    //content와 title만 있는 dto입력 생성,수정,삭제는 무조건 트랜잭셔널해서 롤백해줘야한다 왜? 테스트니까!
    @Test
    @Transactional
    void create_성공() {

        //예상
        String title = "네번째 데이터";
        String content = "이것은 네번째";

        ArticleForm dto = new ArticleForm(null,title,content);
        Article expected = new Article(4L,title,content);

        //실재
        Article article = articleService.create(dto);
        //비교
        assertEquals(expected.toString(),article.toString());
    }

    //id가 포합된 dto
    @Test
    @Transactional
    void create_실패() {

        //예상
        String title = "";
        String content = "";

        ArticleForm dto = new ArticleForm(4L,title,content);
        Article expected = null;

        //실재
        Article article = articleService.create(dto);
        //비교
        assertEquals(expected,article);

    }
}