package com.wyf.kprunner.character.core;

import com.wyf.kprunner.common.core.IValueObject;

public class DateTime implements IValueObject {

    private int Date;
    //时间段 0,1,2,3
    private int quantum;

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        Date = date;
    }

    enum TimeQuantum{
         // [6,12)
         MORNING,
         // [12,18)
         AFTER_NOON,
         // [18,24)
         EVENING,
         // [0,6)
         BEFORE_DAWN,
    }
}
