package josivaldo.jutils.api;

import org.bukkit.entity.Player;

/**
 * Essa api é privada! 
 * Mesmo assim, pode ser usada por quem a possui.
 * 
 * @author Josivaldo (PatoDEV)
 *
 */

public class Api {
	
	/**
	 * API usada para checar se o jogador é staff.
	 * 
	 * @param p
	 * @return Se é staff
	 */
	
	public static boolean isStaff(Player p) {
		/**
		 * Se o jogador tiver a permissão ele retornara true.
		 */
		if(p.hasPermission("api.staff")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Api usada para checar se o jogar é um jogador.
	 * 
	 * @param p
	 * @return Se é youtuber.
	 */
	
	public static boolean isYoutuber(Player p) {
		/**
		 * Se o jogador tiver a permissão ele retornara true.
		 */
		if(p.hasPermission("api.youtuber")) {
			
			return true;
		} else {
			return false;
		}
	}

}
