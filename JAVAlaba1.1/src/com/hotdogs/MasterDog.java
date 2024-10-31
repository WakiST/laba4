package com.hotdogs;

//  ласс MasterDog, наследующийс€ от HotDog (без public)
public class MasterDog extends HotDog {

    //  онструктор, задающий название и цену дл€ MasterDog
    public MasterDog() {
        super("MasterDog", 3.0); // ѕередаем название и цену в конструктор родительского класса
    }
}
