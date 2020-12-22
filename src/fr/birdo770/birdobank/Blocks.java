package fr.birdo770.birdobank;

import org.bukkit.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class Blocks {

    public static ItemStack getItemStackDecoration() {

        ItemStack decoration = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)7);
        ItemMeta decorationM = decoration.getItemMeta();
        decorationM.setDisplayName(" ");
        decoration.setItemMeta(decorationM);

        return decoration;
    }

    public static ItemStack getItemStackArmorStandTeam01() {

        ItemStack armorStandTeam01 = new ItemStack(Material.STICK);
        ItemMeta armorStandTeam01M = armorStandTeam01.getItemMeta();
        armorStandTeam01M.setDisplayName("spawnTeamUn");
        armorStandTeam01.setItemMeta(armorStandTeam01M);

        return armorStandTeam01;
    }
}


