package com.wyf.kprunner.character.core;


/*
* 特质
* */
public enum Trait{

    fight("斗殴"),
    dodge("闪避"),
    library("图书馆"),
    listen("聆听"),
    investigation("侦查"),
    psychology("心理学"),
    verbal_trick("话术"),
    persuade("说服"),
    intimidation("恐吓"),
    charm("魅惑"),
    stealth("潜行"),
    steal("妙手"),
    chemical("化学"),
    education("教育");




    ;

    Trait(String name) {
        this.name = name;
    }

    private final String name;

    public String getName() {
        return name;
    }
}
