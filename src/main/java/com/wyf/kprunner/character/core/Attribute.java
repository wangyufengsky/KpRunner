package main.java.com.wyf.kprunner.character.core;

import lombok.Getter;
import main.java.com.wyf.kprunner.common.core.IValueObject;

@Getter
public class Attribute implements IValueObject {

    public Attribute(int STR, int DEX, int INS, int CON, int SIZ, int APP, int EDU, int POW, int LUCK, int ARMOR) {
        this.STR = STR;
        this.DEX = DEX;
        this.INS = INS;
        this.CON = CON;
        this.SIZ = SIZ;
        this.APP = APP;
        this.EDU = EDU;
        this.POW = POW;
        this.LUCK = LUCK;
        this.SAN = POW;
        this.ARMOR = ARMOR;
        this.HP = (CON+SIZ)/10;
        this.MP = POW/5;
        this.MOV =
    }

    //力量
    private int STR;
    //敏捷
    private int DEX;
    //智力
    private int INS;
    //体质
    private int CON;
    //体型
    private int SIZ;
    //外貌
    private int APP;
    //教育
    private int EDU;
    //意志
    private int POW;
    //幸运
    private int LUCK;
    //生命
    private int HP;
    //魔法
    private int MP;
    //理智
    private int SAN;
    //伤害加值
    private String DB;
    //护甲
    private int ARMOR;
    //移动力
    private int MOV;





}
