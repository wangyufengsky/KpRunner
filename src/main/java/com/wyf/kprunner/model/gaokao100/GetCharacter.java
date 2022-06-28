package com.wyf.kprunner.model.gaokao100;

import com.wyf.kprunner.character.core.Attribute;
import com.wyf.kprunner.character.core.Character;
import com.wyf.kprunner.character.core.Skill;
import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GetCharacter {

    private static List<Character> characters=new ArrayList<>();

    static {
        getLizixun();
    }



    private static void getLizixun(){
        //李子洵
        Character Lizixun = new Character();
        Lizixun.setName("李子洵");
        Lizixun.setAge(35);
        Lizixun.setSex(1);
        Lizixun.setIdentity("六中校长，雇佣调查员的委托人");
        Lizixun.setAttribute(new Attribute(45,50,75,60,50,75,80,80,45,0));
        Lizixun.setAppearance(new Image(""));
        Map<Skill, Integer> skills=new HashMap<>(){{
            put(Skill.fight,45);
            put(Skill.dodge,25);
            put(Skill.library,70);
            put(Skill.listen,60);
            put(Skill.investigation,40);
            put(Skill.education,80);
            put(Skill.chemical,75);
            put(Skill.stealth,50);
            put(Skill.charm,70);
            put(Skill.psychology,50);
        }};
        Lizixun.setSkills(skills);
        Lizixun.setStayWithPC(true);
        Lizixun.setRelationships(new HashMap<>());
        Lizixun.setSituations(new HashMap<>());
        Lizixun.setDescription("""
                
                """);
        Lizixun.setExperience("""
                
                """);
        characters.add(Lizixun);
    }


}
