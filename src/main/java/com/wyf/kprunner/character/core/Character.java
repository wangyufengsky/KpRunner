package com.wyf.kprunner.character.core;

import com.wyf.kprunner.common.core.CEntity;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
* 人物
* */
public class Character extends CEntity<String> {

    public Character() {
    }

    public Character(String name, int age, int sex, String description, String identity, Attribute attribute, Image appearance, Map<Skill, Integer> skills, List<Trait> traits, String experience, Map<DateTime, List<Situation>> situations, Map<Character, Relationship> relationships, boolean isStayWithPC) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.identity = identity;
        this.attribute = attribute;
        this.appearance = appearance;
        this.skills = skills;
        this.traits = traits;
        this.experience = experience;
        this.situations = situations;
        this.relationships = relationships;
        this.isStayWithPC = isStayWithPC;
    }

    private String name;

    private int age;
    //0-男 1-女
    private int sex;
    //外表描述
    private String description;
    //身份
    private String identity;
    //属性
    private Attribute attribute;
    //外表图片
    private Image appearance;
    //技能 能力值
    private Map<Skill, Integer> skills= new HashMap<>();
    //性格
    private List<Trait> traits = new ArrayList<>();
    //经历
    private String experience;
    //在某时间可能出现的地点
    private Map<DateTime,List<Situation>> situations=new HashMap<>();
    //和其他NPC的关系
    private Map<Character,Relationship> relationships=new HashMap<>();
    //是否和PC同行
    private boolean isStayWithPC;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public Image getAppearance() {
        return appearance;
    }

    public void setAppearance(Image appearance) {
        this.appearance = appearance;
    }

    public Map<Skill, Integer> getSkills() {
        return skills;
    }

    public void setSkills(Map<Skill, Integer> skills) {
        this.skills = skills;
    }

    public List<Trait> getTraits() {
        return traits;
    }

    public void setTraits(List<Trait> traits) {
        this.traits = traits;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public Map<DateTime, List<Situation>> getSituations() {
        return situations;
    }

    public void setSituations(Map<DateTime, List<Situation>> situations) {
        this.situations = situations;
    }

    public Map<Character, Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(Map<Character, Relationship> relationships) {
        this.relationships = relationships;
    }

    public boolean isStayWithPC() {
        return isStayWithPC;
    }

    public void setStayWithPC(boolean stayWithPC) {
        isStayWithPC = stayWithPC;
    }
}
