package net.noyark.www.minecraft.nukkit.API;


import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;

/**<h3>Gulesberry Technology Co. Ltd. Java Lib.</h3>
 * <hr>
 * <p>RPGAPI的主运行类,本类在使用上<strong>没有任何特殊意义</strong></p>
 * <a href="magic.noyark.net">Company Owner's Personal Web</a>
 * <hr>
 * <p>本类拥有{@code onEnable}方法</p>
 * <p>实现最基本的启动功能</p>
 * @author magiclu550
 * @see cn.nukkit.plugin.PluginBase
 * @see cn.nukkit.plugin.Plugin
 * @see cn.nukkit.command.CommandExecutor
 * @since JDK 1.8_201
 * @since Nukkit 1.9_1.0.7API
 *
 */
public class RPGMain extends PluginBase{
    @Override
    public void onLoad(){
        this.getLogger().info("RPGMain v0.0.1 is starting;powered by MagicLu");
    }
    @Override
    public void onEnable(){
        this.getLogger().info("加载成功，正在初始化");
    }
    @Override
    public void onDisable(){
        this.getLogger().info("插件关闭成功");
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return false;
    }
}
