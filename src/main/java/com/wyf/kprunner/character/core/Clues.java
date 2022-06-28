package com.wyf.kprunner.character.core;

/*
* 线索
* */
public class Clues {

    public Clues(boolean isNeedClues, Skill skill, int level, String info) {
        this.isNeedClues = isNeedClues;
        this.skill = skill;
        this.level = level;
        this.info = info;
    }

    //是否需要线索
    private final boolean isNeedClues;

    //需要的技能
    private Skill skill;

    //成功登记  0-失败 1-成功 2-困难成功 3-极限成功 4-大成功
    private int level;

    //线索信息
    private String info;


    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public boolean isNeedClues() {
        return isNeedClues;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
