package com.qkrfowns45.firstproject.ioc;

import org.springframework.stereotype.Component;

@Component //이걸 등록해야 한다. Ioc 컨테이너에 등록해야한다.
public class Chef {

    private  IngreDientFactory ingreDientFactory;
    //DI
    public Chef(IngreDientFactory ingreDientFactory) {
        this.ingreDientFactory = ingreDientFactory;
    }

    public String cook(String menu){
        //재료 준비
        IngreDient ingreDient = ingreDientFactory.get(menu);

        //요리반환환
        return ingreDient.getName() + "으로 만든 "+ menu;
    }
}
