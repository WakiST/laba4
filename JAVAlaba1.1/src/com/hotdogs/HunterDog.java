package com.hotdogs;

//  ласс HunterDog, наследующийс€ от HotDog (без public)
public class HunterDog extends HotDog {

    //  онструктор, задающий название и цену дл€ HunterDog
    public HunterDog() {
        super("HunterDog", 2.5); // ѕередаем название и цену в конструктор родительского класса
    }
}
