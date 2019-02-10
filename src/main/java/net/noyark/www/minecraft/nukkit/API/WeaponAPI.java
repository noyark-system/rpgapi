package net.noyark.www.minecraft.nukkit.API;

import cn.gulesberry.www.tech.WeaponID;
import cn.nukkit.item.Item;
import cn.nukkit.item.enchantment.Enchantment;
import cn.nukkit.nbt.tag.CompoundTag;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import net.noyark.www.minecraft.nukkit.Item.Weapon;
import net.noyark.www.minecraft.nukkit.config.CreateThingsConfig;

import java.io.File;
import java.util.Map;
import java.util.Set;


/**Gulesberry Technology Co. Ltd.
 * <p>本插件第一个功能</p>
 * <p>武器获取</p>
 * 通过该类的方法来获取一个Item实例，通过添加属性来获取想要的武器实例
 */
public class WeaponAPI implements API{
    /**
     *定义Weapon对象w
     * number为数量
     * isAddConfig是是否创建到配置文件
     * @param w
     * @param isAddConfig
     * @param number
     */
    public Item[] getWeapon(Weapon w, Integer number, boolean isAddConfig,PluginBase plugin){
        Item[] is = new Item[number];
        int id = w.getId();//武器id
        Item weapon = new Item(WeaponID.idTypes.get(id));//生成物品
        weapon.setNamedTag(new CompoundTag(w.Introduction()));
        weapon.setDamage(w.getDamage());
        weapon.setCustomName(w.getName());
        setSkills(w,weapon);
        for(int i = 0;i<is.length;i++){
            is[i] = weapon;
        }
        addConfig(w,isAddConfig,plugin.getDataFolder());
        return is;
    }
    public Item[] getWeapon(Weapon w,PluginBase plugin){
        return getWeapon(w,1,true,plugin);
    }
    public Item[] getWeapon(Weapon w,boolean isAddConfig,PluginBase plugin){
        return getWeapon(w,1,isAddConfig,plugin);
    }

    /**
     * 设置武器的附加属性
     * @param w
     * @param weapon
     */
    private void setSkills(Weapon w,Item weapon){
        Set<Map.Entry<Integer,Integer>> set = w.getSkills().entrySet();
        for(Map.Entry<Integer,Integer> e:set){
            Integer skillId = e.getKey();
            Integer level = e.getValue();
            weapon.addEnchantment(Enchantment.getEnchantment(skillId).setLevel(level));
        }
    }

    /**
     * 添加到配置文件中
     * @param w
     * @param isAddConfig
     * @param dataFolder 插件的文件路径
     */
    private void addConfig(Weapon w, boolean isAddConfig, File dataFolder){
        if(isAddConfig){
            Config c = CreateThingsConfig.InitWeaponConfig(dataFolder+"/"+w.getName());
            c.set(w.getName()+".id",w.getId());
            Set<Map.Entry<Integer,Integer>> set = w.getSkills().entrySet();
            for(Map.Entry<Integer,Integer> e:set){
                Integer skillId = e.getKey();
                Integer level = e.getValue();
                c.set(w.getName()+"."+skillId,level);
            }
            c.save();
        }
    }
}
