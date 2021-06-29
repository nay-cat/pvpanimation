package nay.gmail.com.zo.utils;

import org.bukkit.ChatColor;

public class Local {

    public static void logger(String msg){
        System.out.println(ChatColor.translateAlternateColorCodes('&', "PvP &c"+msg));
    }
}
