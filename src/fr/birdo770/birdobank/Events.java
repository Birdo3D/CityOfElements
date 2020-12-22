package fr.birdo770.birdobank;

import org.bukkit.*;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class Events implements Listener {

    public Events(Main main) {
    }

    ItemStack armorteam01 = Blocks.getItemStackArmorStandTeam01();

    @EventHandler
    public void onClicSpawn01(PlayerInteractEvent e) {

        Player p = e.getPlayer();

        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            if (e.getItem() != null) {
                if (e.getItem().getType() == Material.STICK) {
                    if (e.getItem().hasItemMeta() && e.getItem().getItemMeta().hasDisplayName() && e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("spawnTeamUn")) {
                        if (e.getPlayer().getGameMode() == GameMode.CREATIVE) {

                            World w = e.getClickedBlock().getLocation().getWorld();
                            Double x = e.getClickedBlock().getLocation().getX() + 0.5;
                            Double y = e.getClickedBlock().getLocation().getY() + 1;
                            Double z = e.getClickedBlock().getLocation().getZ() + 0.5;
                            Location loc = new Location(w, x, y, z);
                            loc.setPitch((float) e.getPlayer().getLocation().getPitch());
                            loc.setYaw((float) e.getPlayer().getLocation().getYaw());

                            ArmorStand as = (ArmorStand) e.getPlayer().getWorld().spawnEntity(loc, EntityType.ARMOR_STAND);
                            as.setHelmet(new ItemStack(Material.LEATHER_HELMET));
                            as.setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
                            as.setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
                            as.setBoots(new ItemStack(Material.LEATHER_BOOTS));
                            as.setCustomName(ChatColor.RED+"Points : " + ChatColor.GREEN+"0");
                            as.setCustomNameVisible(true);
                            as.setGravity(false);
                            as.setInvulnerable(false);
                        }
                    }
                }
            }
        }
    }
}