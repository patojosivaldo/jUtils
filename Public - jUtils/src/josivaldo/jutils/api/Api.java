package josivaldo.jutils.api;

import org.bukkit.entity.Player;

/**
 * Essa api � privada! 
 * Mesmo assim, pode ser usada por quem a possui.
 * 
 * @author Josivaldo (PatoDEV)
 *
 */

public class Api {
	
	/**
	 * API usada para checar se o jogador � staff.
	 * 
	 * @param p
	 * @return Se � staff
	 */
	
	public static boolean isStaff(Player p) {
		/**
		 * Se o jogador tiver a permiss�o ele retornara true.
		 */
		if(p.hasPermission("api.staff")) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Api usada para checar se o jogar � um jogador.
	 * 
	 * @param p
	 * @return Se � youtuber.
	 */
	
	public static boolean isYoutuber(Player p) {
		/**
		 * Se o jogador tiver a permiss�o ele retornara true.
		 */
		if(p.hasPermission("api.youtuber")) {
			
			return true;
		} else {
			return false;
		}
	}

}
