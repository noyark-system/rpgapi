package net.noyark.www.minecraft.nukkit.proctocol;
/**
 *NPC移动的数据包
 */

import cn.nukkit.network.protocol.DataPacket;

public class NPCMovePacket extends DataPacket {
    @Override
    public byte pid(){
        return 0xF;
    }
    @Override
    public void decode() {
    }

    @Override
    public void encode(){

    }
}
