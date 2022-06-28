package main.java.com.wyf.kprunner.character.core;

import lombok.Builder;
import lombok.Data;
import main.java.com.wyf.kprunner.common.core.CEntity;

@Data @Builder
public class Character extends CEntity<String> {

    private String name;

    private String birthDay;

    private int age;

    private int sex;

    private String description;

    private String identity;

    private


}
