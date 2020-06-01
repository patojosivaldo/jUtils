package josivaldo.jutils.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ReportCMD implements CommandExecutor {
	
	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] args) {
		if(!(sender instanceof Player )) {
			return false;
		}
		Player VAR1 = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("report")) {
			if(args.length < 1) {
			VAR1.sendMessage("§c§lERRO§r Sintaxe errada! Por favor use /report <player> <categoria>");
			}
		}
		Player VAR2 = Bukkit.getPlayer(args[0]);
		if(VAR2 == null) {
			VAR1.sendMessage("§c§lERRO§r O jogador precisa estar online.");
		}
		if(args[1].equalsIgnoreCase("hack")) {
			VAR1.sendMessage("§3§lREPORT§r Jogador report com §a§lSUCESSO§r.");
			for(Player VAR3 : Bukkit.getOnlinePlayers()) {
				VAR3.sendMessage("§3§l    REPORT\n§rUm report foi enviado, favor analisar\nJogador: " + VAR2.getName() + "\nCategoria: Hack");
			}
		} else if(args[1].equalsIgnoreCase("ofenca")) {
			VAR1.sendMessage("§3§lREPORT§r Jogador report com §a§lSUCESSO§r.");
			for(Player VAR3 : Bukkit.getOnlinePlayers()) {
				VAR3.sendMessage("§3§l    REPORT\n§rUm report foi enviado, favor analisar\nJogador: " + VAR2.getName() + "\nCategoria: Ofença");
			}
		} else if(args[1].equalsIgnoreCase("antijogo")) {
			VAR1.sendMessage("§3§lREPORT§r Jogador report com §a§lSUCESSO§r.");
			for(Player VAR3 : Bukkit.getOnlinePlayers()) {
				VAR3.sendMessage("§3§l    REPORT\n§rUm report foi enviado, favor analisar\nJogador: " + VAR2.getName() + "\nCategoria: Anti-Jogo");
			}
		} else {
			VAR1.sendMessage("§c§lERROR§r Essa categoria é inválida! As categorias são: hack, ofenca e antijogo (escreva-as assim).");
		}
		
		return false;
	}

}
