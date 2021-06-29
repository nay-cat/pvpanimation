package nay.gmail.com.zo.utils;

import nay.gmail.com.zo.ZoWIP;
import nay.gmail.com.zo.utils.stand.Armor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Animation {
    public Entity stand;


    public void Animator(Player playerHead) {

        Location lDeath = playerHead.getLocation().add(0, 2, 0);

        ArmorStand animation = lDeath.getWorld().spawn(lDeath, ArmorStand.class);
        animation.setCustomName(playerHead.getDisplayName());
        animation.setBasePlate(false);
        animation.setCustomNameVisible(true);

        ItemStack head = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta meta = (SkullMeta) head.getItemMeta();
        meta.setOwner(playerHead.getDisplayName());
        head.setItemMeta(meta);
        animation.setVisible(false);
        animation.setHelmet(head);
        animation.setArms(true);
        animation.setInvulnerable(true);

        Armor a = new Armor();
        a.setAnimationArmor(playerHead, animation);

        //ZoWIP.getPluginType().despawnArmorStand(animation, 50);

        ZoWIP.getPluginType().setAnimationStart(animation, 50);



    }


}



