package net.noyark.www.minecraft.nukkit.config;

import cn.nukkit.utils.Config;
import net.noyark.www.minecraft.nukkit.API.RPGMain;

public class CreateThingsConfig {
    private static RPGMain api = new RPGMain();
    public static Config InitWeaponConfig(String name){
        return new Config(api.getDataFolder()+"/"+name+".yml");
    }
}
