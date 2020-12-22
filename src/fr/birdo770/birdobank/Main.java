package fr.birdo770.birdobank;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {

        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[CityOfElements - Plugin] Plugin activé !");
        saveDefaultConfig();
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new openshop(this), this);
        pm.registerEvents(new CreativeInventory(this), this);
        pm.registerEvents(new Events(this), this);
    }

    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage(ChatColor.RED + "[CityOfElements - Plugin] Plugin désactivé !");

    }

    public Main instance(HumanEntity player, int number) {

        String n = player.getName();
        boolean chocolat = n.equalsIgnoreCase("Nushashu") || n.equalsIgnoreCase("32Poney") || n.equalsIgnoreCase("Joueur_") || n.equalsIgnoreCase("Malbono") || n.equalsIgnoreCase("Pinpinou") || n.equalsIgnoreCase("Tamarixe") || n.equalsIgnoreCase("Relapsebot2") || n.equalsIgnoreCase("Adbloo") || n.equalsIgnoreCase("Lumiel__") || n.equalsIgnoreCase("El0ux") || n.equalsIgnoreCase("XxBiomxX") || n.equalsIgnoreCase("_skyzix_") || n.equalsIgnoreCase("Watiik") || n.equalsIgnoreCase("NeyBey") || n.equalsIgnoreCase("Bretzelcookies") || n.equalsIgnoreCase("Harkocookies") || n.equalsIgnoreCase("Arielle3en1") || n.equalsIgnoreCase("_To0m_ ") || n.equalsIgnoreCase("Paraboom");
        boolean coco = n.equalsIgnoreCase("Slimeys_Master") || n.equalsIgnoreCase("Kasaii_") || n.equalsIgnoreCase("Afoxameurs") || n.equalsIgnoreCase("GAMERROUGE") || n.equalsIgnoreCase("XBGC08") || n.equalsIgnoreCase("Kasaiii_") || n.equalsIgnoreCase("Jxst_Kinander0") || n.equalsIgnoreCase("tomtomson91") || n.equalsIgnoreCase("Fuspace") || n.equalsIgnoreCase("NeiTsaBXIV") || n.equalsIgnoreCase("A_SPACEBURG") || n.equalsIgnoreCase("zeprofdecran") || n.equalsIgnoreCase("Teken25") || n.equalsIgnoreCase("nonorin92") || n.equalsIgnoreCase("Lunedd") || n.equalsIgnoreCase("Caldos_") || n.equalsIgnoreCase("nowsite") || n.equalsIgnoreCase("Unknowk") || n.equalsIgnoreCase("L_Paperblue13");
        boolean vanille = n.equalsIgnoreCase("MissZebi") || n.equalsIgnoreCase("SK_Wolfyy") || n.equalsIgnoreCase("ZouYX") || n.equalsIgnoreCase("lukazgames_19") || n.equalsIgnoreCase("Wizi_89") || n.equalsIgnoreCase("Massouch") || n.equalsIgnoreCase("_____Lama_____") || n.equalsIgnoreCase("Kuuroko") || n.equalsIgnoreCase("C0bbl3L4D") || n.equalsIgnoreCase("__Raptor_") || n.equalsIgnoreCase("TheBan18") || n.equalsIgnoreCase("LeBossGrec") || n.equalsIgnoreCase("nemexi") || n.equalsIgnoreCase("MrDroniX") || n.equalsIgnoreCase("makikata") || n.equalsIgnoreCase("SonicSousCoc") || n.equalsIgnoreCase("xReyZo") || n.equalsIgnoreCase("Kibyu") || n.equalsIgnoreCase("Sky_IceWall");
        boolean caramel = n.equalsIgnoreCase("Taykow") || n.equalsIgnoreCase("TMNT_Diabolo") || n.equalsIgnoreCase("Leona__") || n.equalsIgnoreCase("LuxyZelda") || n.equalsIgnoreCase("El_Chico_Gamer") || n.equalsIgnoreCase("KaGuya_a") || n.equalsIgnoreCase("LegaSsy") || n.equalsIgnoreCase("GPriUnComboDe13") || n.equalsIgnoreCase("TwIx_LNKOUIL") || n.equalsIgnoreCase("Jigmey_MP4") || n.equalsIgnoreCase("Marshali") || n.equalsIgnoreCase("_ArKaa") || n.equalsIgnoreCase("feufeudu44") || n.equalsIgnoreCase("Akatsuchiasse") || n.equalsIgnoreCase("ToufDoof20") || n.equalsIgnoreCase("Xelerios") || n.equalsIgnoreCase("Douida") || n.equalsIgnoreCase("Nocturno_") || n.equalsIgnoreCase("Almelyo");

        if (chocolat || coco || vanille || caramel) {

            if (vanille) {
                getConfig().set("vanille", getConfig().getInt("vanille") + number);
                saveConfig();
                player.sendMessage(ChatColor.GREEN + "Transaction r?ussie !");
            }

            if (chocolat) {
                getConfig().set("chocolat", getConfig().getInt("chocolat") + number);
                saveConfig();
                player.sendMessage(ChatColor.GREEN + "Transaction r?ussie !");
            }

            if (coco) {
                getConfig().set("coco", getConfig().getInt("coco") + number);
                saveConfig();
                player.sendMessage(ChatColor.GREEN + "Transaction r?ussie !");
            }

            if (caramel) {
                getConfig().set("caramel", getConfig().getInt("caramel") + number);
                saveConfig();
                player.sendMessage(ChatColor.GREEN + "Transaction r?ussie !");
            }
        } else {
            player.sendMessage(ChatColor.RED + "Erreur : Contact un administateur rapidement (er0245_pseudo_non_r?pertori?)");
        }
        return null;
    }

    public Main instance2(Player player) {
        player.sendMessage(ChatColor.GOLD + "ScoreBoard :");
        player.sendMessage(" ");
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Team chocolat : " + getConfig().getInt("chocolat"));
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Team vanille : " + getConfig().getInt("vanille"));
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Team coco : " + getConfig().getInt("coco"));
        player.sendMessage(ChatColor.LIGHT_PURPLE + "Team caramel : " + getConfig().getInt("caramel"));
        player.sendMessage(" ");
        return null;
    }

    public Main instance3(Player player, String team) {

        if (player.getName().equalsIgnoreCase("Birdo770") || player.getName().equalsIgnoreCase("Bretzelcookies") || player.getName().equalsIgnoreCase("MrDroniX") || player.getName().equalsIgnoreCase("Teken25")) {
            getConfig().set(team, 0);
            saveConfig();
            player.sendMessage(ChatColor.GREEN + "Le score de la team " + team + " ? bien ?t? remis ? 0 !");
        } else {
            player.sendMessage(ChatColor.RED + "Tu n'a pas le droit de faire ceci !");
        }
        return null;
    }
}