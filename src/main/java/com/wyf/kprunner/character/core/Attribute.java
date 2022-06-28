package com.wyf.kprunner.character.core;

import com.wyf.kprunner.common.core.IValueObject;




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

    public void setSTR(int STR) {
        this.STR = STR;
    }

    public void setDEX(int DEX) {
        this.DEX = DEX;
    }

    public void setINS(int INS) {
        this.INS = INS;
    }

    public void setCON(int CON) {
        this.CON = CON;
    }

    public void setSIZ(int SIZ) {
        this.SIZ = SIZ;
    }

    public void setAPP(int APP) {
        this.APP = APP;
    }

    public void setEDU(int EDU) {
        this.EDU = EDU;
    }

    public void setPOW(int POW) {
        this.POW = POW;
    }

    public void setLUCK(int LUCK) {
        this.LUCK = LUCK;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public void setSAN(int SAN) {
        this.SAN = SAN;
    }

    public void setDB(String DB) {
        this.DB = DB;
    }

    public void setARMOR(int ARMOR) {
        this.ARMOR = ARMOR;
    }

    public void setMOV(int MOV) {
        this.MOV = MOV;
    }

    public int getSTR() {
        return STR;
    }

    public int getDEX() {
        return DEX;
    }

    public int getINS() {
        return INS;
    }

    public int getCON() {
        return CON;
    }

    public int getSIZ() {
        return SIZ;
    }

    public int getAPP() {
        return APP;
    }

    public int getEDU() {
        return EDU;
    }

    public int getPOW() {
        return POW;
    }

    public int getLUCK() {
        return LUCK;
    }

    public int getHP() {
        return HP;
    }

    public int getMP() {
        return MP;
    }

    public int getSAN() {
        return SAN;
    }

    public String getDB() {
        return DB;
    }

    public int getARMOR() {
        return ARMOR;
    }

    public int getMOV() {
        return MOV;
    }


}
