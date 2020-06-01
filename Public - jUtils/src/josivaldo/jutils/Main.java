package josivaldo.jutils;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§b§ljUtils§r Iniciado com sucesso!");
		
	}
	
	public void loadEvents() {
		
	}
	
	public void loadCommands() {
		
	}

}
