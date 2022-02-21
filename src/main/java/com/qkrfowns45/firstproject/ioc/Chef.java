package com.qkrfowns45.firstproject.ioc;

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
