package fr.birdo770.birdobank;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CreativeInventory implements Listener {

    public CreativeInventory(Main main) {
    }

    ItemStack decoration = Blocks.getItemStackDecoration();
    ItemStack armorteam01 = Blocks.getItemStackArmorStandTeam01();

    @EventHandler
    public void onCommande(PlayerCommandPreprocessEvent e) {

        Player p = e.getPlayer();
        String msg = e.getMessage();
        String[] args = msg.split(" ");

        if (args[0].equalsIgnoreCase("/inv")) {
            if (p.getGameMode() == GameMode.CREATIVE) {

                Inventory creativeInventory = Bukkit.createInventory(null, 6 * 9, "Creative Inventory");

                creativeInventory.setItem(0, decoration);
                creativeInventory.setItem(1, decoration);
                creativeInventory.setItem(2, decoration);
                creativeInventory.setItem(3, decoration);
                creativeInventory.setItem(4, decoration);
                creativeInventory.setItem(5, decoration);
                creativeInventory.setItem(6, decoration);
                creativeInventory.setItem(7, decoration);
                creativeInventory.setItem(8, decoration);
                creativeInventory.setItem(9, decoration);
                creativeInventory.setItem(10, armorteam01);
                //creativeInventory.setItem(11, decoration);
                //creativeInventory.setItem(12, decoration);
                //creativeInventory.setItem(14, decoration);
                //creativeInventory.setItem(16, decoration);
                creativeInventory.setItem(17, decoration);
                creativeInventory.setItem(18, decoration);
                //creativeInventory.setItem(19, decoration);
                creativeInventory.setItem(20, decoration);
                creativeInventory.setItem(21, decoration);
                creativeInventory.setItem(22, decoration);
                creativeInventory.setItem(23, decoration);
                creativeInventory.setItem(24, decoration);
                creativeInventory.setItem(25, decoration);
                creativeInventory.setItem(26, decoration);

                p.openInventory(creativeInventory);
            }
            e.setCancelled(true);
        }
    }

}
