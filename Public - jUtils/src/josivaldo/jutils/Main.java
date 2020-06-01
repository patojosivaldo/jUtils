package josivaldo.jutils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import josivaldo.jutils.commands.ReportCMD;
import josivaldo.jutils.verify.PlayerVerification;
import josivaldo.jutils.verify.WordVerification;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage("§b§ljUtils§r Iniciado com sucesso!");
		loadEvents();
		loadCommands();
	}
	
	public void loadEvents() {
		PluginManager pm = Bukkit.getPluginManager();
		
		pm.registerEvents(new PlayerVerification(), this);
		pm.registerEvents(new WordVerification(), this);
	}
	
	public void loadCommands() {
		getCommand("report").setExecutor(new ReportCMD());
	}
	
	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage("§b§ljUtils§r Desabilitado com sucesso!");
	}

}
