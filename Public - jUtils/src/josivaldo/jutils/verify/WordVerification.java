package josivaldo.jutils.verify;

import java.util.ArrayList;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class WordVerification implements Listener {
	
	private ArrayList<String>CHATWORDS = new ArrayList<>();
	private Player VAR1;
	
	@EventHandler
	public void onChat(AsyncPlayerChatEvent e) {
		if(e.getMessage().equals((CharSequence) CHATWORDS)) {
			e.setCancelled(true);
			VAR1.sendMessage("§3§lCHAT§r Bacana né? Falando merda no chat >:(");
		}
	}

}
