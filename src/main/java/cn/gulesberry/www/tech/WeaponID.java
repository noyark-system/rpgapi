package cn.gulesberry.www.tech;

import java.util.HashMap;

public class WeaponID{
    static {
        setId();
    }
    /**
     * key : 武器id
     * value:　物品id
     * 相应武器id对应物品id
     */
    public static final HashMap<Integer,Integer> idTypes = new HashMap<>();
    //60种物品
    public static void setId(){
        idTypes.put(0,256);//铁铲子
        idTypes.put(1,257);//铁稿子
        idTypes.put(2,258);//铁斧头
        idTypes.put(3,259);//打火石
        idTypes.put(4,261);//弓
        idTypes.put(5,262);//箭
        idTypes.put(6,264);//钻石
        idTypes.put(7,265);//铁锭
        idTypes.put(8,266);//金锭
        idTypes.put(9,267);//铁剑
        idTypes.put(10,268);//木剑
        idTypes.put(11,269);//木铲
        idTypes.put(12,270);//木稿
        idTypes.put(13,271);//木斧
        idTypes.put(14,272);//石剑
        idTypes.put(15,273);//石铲
        idTypes.put(16,274);//石稿
        idTypes.put(17,275);//石斧
        idTypes.put(18,276);//钻石剑
        idTypes.put(19,277);//钻石铲
        idTypes.put(20,278);//钻石稿
        idTypes.put(21,279);//钻石斧
        idTypes.put(22,280);//木棍
        idTypes.put(23,283);//金剑
        idTypes.put(24,284);//金铲
        idTypes.put(25,285);//金稿
        idTypes.put(26,286);//金斧
        idTypes.put(27,287);//线
        idTypes.put(28,288);//羽毛
        idTypes.put(29,289);//火药
        idTypes.put(30,290);//木锄
        idTypes.put(31,291);//石锄
        idTypes.put(32,292);//铁锄
        idTypes.put(33,293);//钻石锄
        idTypes.put(34,294);//金锄
        idTypes.put(35,346);//钓鱼杆
        idTypes.put(36,369);//大金棒
    }
}
