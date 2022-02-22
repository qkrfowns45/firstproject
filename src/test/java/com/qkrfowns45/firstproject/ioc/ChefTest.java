package com.qkrfowns45.firstproject.ioc;

//import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChefTest {

    @Autowired
    IngreDientFactory ingreDientFactory;

    @Autowired
    Chef chef;

    @Test
    void 돈가스_요리하기(){
        //준비
//        IngreDientFactory ingreDientFactory =new IngreDientFactory();

//        Chef chef = new Chef(ingreDientFactory);
        String menu = "돈가스";

        //수행
        String food = chef.cook(menu);

        //예상
        String expected = "한돈 등심으로 만든 돈가스";

        //검증
        assertEquals(expected,food);
        System.out.println(food);

    }

    @Test
    void 스테이크_요리하기(){
        //준비
//        IngreDientFactory ingreDientFactory =new IngreDientFactory();

//        Chef chef = new Chef(ingreDientFactory);
        String menu = "스테이크";

        //수행
        String food = chef.cook(menu);

        //예상
        String expected = "한우 꽃등심으로 만든 스테이크";

        //검증
        assertEquals(expected,food);
        System.out.println(food);
    }

    @Test
    void 크리스피_치킨_요리하기(){

        //준비 DI방식 코드개선
//        IngreDientFactory ingreDientFactory =new IngreDientFactory();
//        Chef chef = new Chef(ingreDientFactory);
        String menu = "크리스피 치킨";

        //수행
        String food = chef.cook(menu);

        //예상
        String expected = "국내산 10호 닭으로 만든 크리스피 치킨";

        //검증
        assertEquals(expected,food);
        System.out.println(food);
    }

    @Test
    void 전_부치기(){
        String menu = "맛있는 전";

        //수행
        String food = chef.cook(menu);

        //예상
        String expected = "밀가루와 도구들으로 만든 맛있는 전";

        //검증
        assertEquals(expected,food);
        System.out.println(food);

    }

}