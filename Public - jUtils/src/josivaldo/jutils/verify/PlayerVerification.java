package josivaldo.jutils.verify;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerVerification implements Listener {
	
	private ArrayList<Player>JOIN = new ArrayList<>();
	private ArrayList<String>BLACKLIST = new ArrayList<>();
	public Player VAR1;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		
		BLACKLIST.add("ROD123S");
		BLACKLIST.add("Felipeey");
		
		if(JOIN.contains(VAR1)) {
			return;
		} else {
			JOIN.add(VAR1);
			VAR1.kickPlayer("§3§lCHECK§r\nSua conta esta sendo checada, aguarde para entrar.");
		}
		
		if(BLACKLIST.contains(VAR1.getName())) {
			VAR1.kickPlayer("§3§lBLACKLIST§r\nInfelizmente seu nick está em nossa blacklist.\nTente entrar com outro nick!");
		}
	}

}
