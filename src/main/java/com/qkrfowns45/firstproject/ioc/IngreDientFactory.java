package com.qkrfowns45.firstproject.ioc;

import org.springframework.stereotype.Component;

@Component //해당 클래스를 객체를 만들고, 이를 Ioc 컨테이너 등록
public class IngreDientFactory {
    public IngreDient get(String menu) {
        switch (menu){
            case "돈가스":
                return new Pork("한돈 등심");
            case "스테이크":
                return new Beef("한우 꽃등심");
            case "크리스피 치킨":
                return new Chicken("국내산 10호 닭");
            default:
                return null;
        }
    }
}
