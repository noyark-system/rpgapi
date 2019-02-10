package net.noyark.www.minecraft.nukkit.Item;

import java.util.HashMap;

/**
 * 武器类,最终会转化为Item类型存储
 * @author magiclu550
 */
public class Weapon{
    public static final long WID = 0x0;

    private Integer weaponId;
    private String name;
    private HashMap<Integer,Integer> skills;
    private String Introduction;
    private Integer damage;
    public Weapon(Integer weaponId,String name,String Introduction,HashMap<Integer,Integer> skills,Integer damage){
        this.weaponId= weaponId;
        this.name = name;
        this.Introduction = Introduction;
        this.skills = skills;
        this.damage = damage;
    }
    public Weapon(Integer weaponId,String name,String Introduction,HashMap<Integer,Integer> skills){
        this(weaponId,name,Introduction,skills,255);
    }
    public String getName(){
        return name;
    }
    public Integer getId(){
        return weaponId;
    }
    public HashMap<Integer,Integer> getSkills(){
        return skills;
    }
    public String Introduction(){
        return Introduction;
    }
    public Integer getDamage(){
        return damage;
    }
}
