package josivaldo.jutils.rank;

import org.bukkit.entity.Player;

public class RankAPI {
	
	public static String ceo = "§4§lCEO";
	public static String admin = "§c§lADMIN";
	public static String mod = "§5§lMOD";
	public static String helper = "§2§lHELPER";
	public static String yt = "§3§lYT";
	public static String ultra = "§d§lULTRA";
	public static String legend = "§4§lLEGEND";
	public static String light = "§a§lLIGHT";
	public static String membro = "§7§lMEMBRO";
	
	public static final String getRank(final Player p) {
	
		if(p.hasPermission("rank.ceo")) {
			return ceo;
		} else if(p.hasPermission("rank.admin")) {
			return admin;
		} else if(p.hasPermission("rank.mod")) {
			return mod;
		} else if(p.hasPermission("rank.helper")) {
			return admin;
		} else if(p.hasPermission("rank.yt")) {
			return yt;
		} else if(p.hasPermission("rank.ultra")) {
			return ultra;
		} else if(p.hasPermission("rank.legend")) {
			return legend;
		} else if(p.hasPermission("rank.light")) {
			return light;
		} else {
			return membro;
		}
		
	}
	
	public static void setMomentTag(Player p, String tag) {
		p.setDisplayName(tag);
	}

}
