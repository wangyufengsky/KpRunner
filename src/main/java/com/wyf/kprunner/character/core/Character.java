package com.wyf.kprunner.character.core;

import com.wyf.kprunner.common.core.CEntity;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Character extends CEntity<String> {

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
    //时间 地点
    private Map<DateTime,List<Situation>> situations=new HashMap<>();




}
