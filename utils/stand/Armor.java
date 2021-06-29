package nay.gmail.com.zo.utils.stand;

import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

public class Armor {

    public void setAnimationArmor(Player p, ArmorStand e){

        e.setChestplate(p.getInventory().getChestplate());
        e.setBoots(p.getInventory().getBoots());
        e.setLeggings(p.getInventory().getLeggings());


    }
}
