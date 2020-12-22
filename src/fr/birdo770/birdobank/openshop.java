package fr.birdo770.birdobank;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class openshop implements Listener {

    private Main instance;

    public openshop(Main pluginInstance) {
        this.instance = pluginInstance;
    }
	
	@EventHandler
	private void onChestOpen(PlayerInteractEvent e) {
		
		Player p = e.getPlayer();
		
		if(e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getClickedBlock().getType() == Material.TRAPPED_CHEST) {
			
			e.setCancelled(true);
			String n = e.getPlayer().getName();
			
			boolean chocolat = n.equalsIgnoreCase("Nushashu") || n.equalsIgnoreCase("32Poney") || n.equalsIgnoreCase("Joueur_") || n.equalsIgnoreCase("Malbono") || n.equalsIgnoreCase("Pinpinou") || n.equalsIgnoreCase("Tamarixe") || n.equalsIgnoreCase("Relapsebot2") || n.equalsIgnoreCase("Adbloo") || n.equalsIgnoreCase("Lumiel__") || n.equalsIgnoreCase("El0ux") || n.equalsIgnoreCase("XxBiomxX") || n.equalsIgnoreCase("_skyzix_") || n.equalsIgnoreCase("Watiik") || n.equalsIgnoreCase("NeyBey") || n.equalsIgnoreCase("Bretzelcookies") || n.equalsIgnoreCase("Harkocookies") || n.equalsIgnoreCase("Arielle3en1") || n.equalsIgnoreCase("_To0m_ ") || n.equalsIgnoreCase("Paraboom");
			boolean coco = n.equalsIgnoreCase("Slimeys_Master") || n.equalsIgnoreCase("Kasaii_") || n.equalsIgnoreCase("Afoxameurs") || n.equalsIgnoreCase("GAMERROUGE") || n.equalsIgnoreCase("XBGC08") || n.equalsIgnoreCase("Kasaiii_") || n.equalsIgnoreCase("Jxst_Kinander0") || n.equalsIgnoreCase("tomtomson91") || n.equalsIgnoreCase("Fuspace") || n.equalsIgnoreCase("NeiTsaBXIV") || n.equalsIgnoreCase("A_SPACEBURG") || n.equalsIgnoreCase("zeprofdecran") || n.equalsIgnoreCase("Teken25") || n.equalsIgnoreCase("nonorin92") || n.equalsIgnoreCase("Lunedd") || n.equalsIgnoreCase("Caldos_") || n.equalsIgnoreCase("nowsite") || n.equalsIgnoreCase("Unknowk") || n.equalsIgnoreCase("L_Paperblue13");
			boolean vanille = n.equalsIgnoreCase("MissZebi") || n.equalsIgnoreCase("SK_Wolfyy") || n.equalsIgnoreCase("ZouYX") || n.equalsIgnoreCase("lukazgames_19") || n.equalsIgnoreCase("Wizi_89") || n.equalsIgnoreCase("Massouch") || n.equalsIgnoreCase("_____Lama_____") || n.equalsIgnoreCase("Kuuroko") || n.equalsIgnoreCase("C0bbl3L4D") || n.equalsIgnoreCase("__Raptor_") || n.equalsIgnoreCase("TheBan18") || n.equalsIgnoreCase("LeBossGrec") || n.equalsIgnoreCase("nemexi") || n.equalsIgnoreCase("MrDroniX") || n.equalsIgnoreCase("makikata") || n.equalsIgnoreCase("SonicSousCoc") || n.equalsIgnoreCase("xReyZo") || n.equalsIgnoreCase("Kibyu") || n.equalsIgnoreCase("Sky_IceWall");
			boolean caramel = n.equalsIgnoreCase("Taykow") || n.equalsIgnoreCase("TMNT_Diabolo") || n.equalsIgnoreCase("Leona__") || n.equalsIgnoreCase("LuxyZelda") || n.equalsIgnoreCase("El_Chico_Gamer") || n.equalsIgnoreCase("KaGuya_a") || n.equalsIgnoreCase("LegaSsy") || n.equalsIgnoreCase("GPriUnComboDe13") || n.equalsIgnoreCase("TwIx_LNKOUIL") || n.equalsIgnoreCase("Jigmey_MP4") || n.equalsIgnoreCase("Marshali") || n.equalsIgnoreCase("_ArKaa") || n.equalsIgnoreCase("feufeudu44") || n.equalsIgnoreCase("Akatsuchiasse") || n.equalsIgnoreCase("ToufDoof20") || n.equalsIgnoreCase("Xelerios") || n.equalsIgnoreCase("Douida") || n.equalsIgnoreCase("Nocturno_") || n.equalsIgnoreCase("Almelyo");
			
					Inventory graine = Bukkit.createInventory(null, 27, ChatColor.GRAY+"Dépose tes émeraudes");
							
					ItemStack animal = new ItemStack(Material.STAINED_GLASS_PANE, 64, (byte)14);
					ItemMeta animalM = animal.getItemMeta();
					animalM.setDisplayName(ChatColor.DARK_GREEN+"Vendre 64");
					animal.setItemMeta(animalM);
							
					graine.setItem(15, animal);
					
					ItemStack animal3 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)14);
					ItemMeta animal3M = animal3.getItemMeta();
					animal3M.setDisplayName(ChatColor.DARK_GREEN+"Vendre 1");
					animal3.setItemMeta(animal3M);
							
					graine.setItem(11, animal3);
							
					ItemStack animal2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)1);
					ItemMeta animal2M = animal2.getItemMeta();
					animal2M.setDisplayName(ChatColor.DARK_GREEN+"Vendre TOUT");
					animal2.setItemMeta(animal2M);
							
					graine.setItem(13, animal2);
							
					ItemStack decoration = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)7);
					ItemMeta decorationM = decoration.getItemMeta();
					decorationM.setDisplayName(" ");
					decoration.setItemMeta(decorationM);
					
					ItemStack decoration1 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)4);
					ItemMeta decoration1M = decoration1.getItemMeta();
					decoration1M.setDisplayName("Pseudo : " + e.getPlayer().getName());
					decoration1.setItemMeta(decoration1M);
					
					if(vanille) {
					ItemStack decoration2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)4);
					ItemMeta decoration2M = decoration2.getItemMeta();
					decoration2M.setDisplayName("Team : " + "Vanille");
					decoration2.setItemMeta(decoration2M);
					graine.setItem(1, decoration2);
					}
					
					if(caramel) {
					ItemStack decoration2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)4);
					ItemMeta decoration2M = decoration2.getItemMeta();
					decoration2M.setDisplayName("Team : " + "Caramel");
					decoration2.setItemMeta(decoration2M);
					graine.setItem(1, decoration2);
					}
					
					if(coco) {
					ItemStack decoration2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)4);
					ItemMeta decoration2M = decoration2.getItemMeta();
					decoration2M.setDisplayName("Team : " + "Coco");
					decoration2.setItemMeta(decoration2M);
					graine.setItem(1, decoration2);
					}
					
					if(chocolat) {
					ItemStack decoration2 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (byte)4);
					ItemMeta decoration2M = decoration2.getItemMeta();
					decoration2M.setDisplayName("Team : " + "Chocolat");
					decoration2.setItemMeta(decoration2M);
					graine.setItem(1, decoration2);
					}
					
					graine.setItem(0, decoration);
					graine.setItem(2, decoration);
					graine.setItem(3, decoration);
					graine.setItem(4, decoration);
					graine.setItem(5, decoration);
					graine.setItem(6, decoration);
					graine.setItem(7, decoration1);
					graine.setItem(8, decoration);
					graine.setItem(9, decoration);
					graine.setItem(10, decoration);
					graine.setItem(12, decoration);
					graine.setItem(14, decoration);
					graine.setItem(16, decoration);
					graine.setItem(17, decoration);
					graine.setItem(18, decoration);
					graine.setItem(19, decoration);
					graine.setItem(20, decoration);
					graine.setItem(21, decoration);
					graine.setItem(22, decoration);
					graine.setItem(23, decoration);
					graine.setItem(24, decoration);
					graine.setItem(25, decoration);
					graine.setItem(26, decoration);
							
					p.openInventory(graine);
					e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onClicGlass(InventoryClickEvent e) {
		if(e.getInventory().getTitle().equalsIgnoreCase(ChatColor.GRAY+"Dépose tes émeraudes")) {
			if(e.getCurrentItem().getType() == Material.STAINED_GLASS_PANE) {
				
				if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GREEN+"Vendre TOUT")) {
					instance.instance(e.getWhoClicked(), shop.getNb(Material.EMERALD, e.getWhoClicked()));
					shop.sell(Material.EMERALD, e.getWhoClicked(), shop.getNb(Material.EMERALD, e.getWhoClicked()));
					e.getWhoClicked().closeInventory();
			}
				
				if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GREEN+"Vendre 1")) {
					//shop.sell_1(Material.EMERALD, e.getWhoClicked());
					//instance.instance(e.getWhoClicked(), 1);
					e.getWhoClicked().sendMessage(ChatColor.RED+"Fonction actuellement indisponible");
			}
				if(e.getCurrentItem().hasItemMeta() && e.getCurrentItem().getItemMeta().hasDisplayName() && e.getCurrentItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.DARK_GREEN+"Vendre 64")) {
					//shop.sell_64(Material.EMERALD, e.getWhoClicked());
					//instance.instance(e.getWhoClicked(), 64);
					e.getWhoClicked().sendMessage(ChatColor.RED+"Fonction actuellement indisponible");
			}
			
				e.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void onCommandes(PlayerCommandPreprocessEvent e) {
		
		String msg = e.getMessage();
		String[] args = msg.split(" ");
		
		if(args[0].equalsIgnoreCase("/score")){
			instance.instance2(e.getPlayer());			
			e.setCancelled(true);
		}
		
		if(args[0].equalsIgnoreCase("/ResetScoreAll")){
			instance.instance3(e.getPlayer(), "vanille");
			instance.instance3(e.getPlayer(), "coco");
			instance.instance3(e.getPlayer(), "chocolat");
			instance.instance3(e.getPlayer(), "caramel");
			e.setCancelled(true);
		}
		
		if(args[0].equalsIgnoreCase("/ResetScoreVanille")){
			instance.instance3(e.getPlayer(), "vanille");
			e.setCancelled(true);
		}
		
		if(args[0].equalsIgnoreCase("/ResetScoreCoco")){
			instance.instance3(e.getPlayer(), "coco");
			e.setCancelled(true);
		}
		
		if(args[0].equalsIgnoreCase("/ResetScoreChocolat")){
			instance.instance3(e.getPlayer(), "chocolat");
			e.setCancelled(true);
		}
		
		if(args[0].equalsIgnoreCase("/ResetScoreCaramel")){
			instance.instance3(e.getPlayer(), "caramel");
			e.setCancelled(true);
		}
		
		if(args[0].equalsIgnoreCase("/BankHelp")){
			e.getPlayer().sendMessage(ChatColor.GOLD+"Liste des commandes disponibles pour le plugin : Bank");
			e.getPlayer().sendMessage("");
			e.getPlayer().sendMessage(ChatColor.AQUA+"/BankHelp : Permet d'avoir la liste des commande disponible du plugin");
			e.getPlayer().sendMessage(ChatColor.AQUA+"/Score : Affiche le ScoreBoard dans le chat du jeu");
			e.getPlayer().sendMessage(ChatColor.AQUA+"/ResetScoreAll : Remet le score de toutes les équipes à 0");
			e.getPlayer().sendMessage(ChatColor.AQUA+"/ResetScoreVanille : Remet le score de l'équipe " + ChatColor.BLUE+"Vanille" + ChatColor.AQUA+" à 0");
			e.getPlayer().sendMessage(ChatColor.AQUA+"/ResetScoreCoco : Remet le score de l'équipe " + ChatColor.BLUE+"Coco" + ChatColor.AQUA+" à 0");
			e.getPlayer().sendMessage(ChatColor.AQUA+"/ResetScoreChocolat : Remet le score de l'équipe " + ChatColor.BLUE+"Chocolat" + ChatColor.AQUA+" à 0");
			e.getPlayer().sendMessage(ChatColor.AQUA+"/ResetScoreCaramel : Remet le score de l'équipe " + ChatColor.BLUE+"Caramel" + ChatColor.AQUA+" à 0");
			e.setCancelled(true);
		}
	}
}
