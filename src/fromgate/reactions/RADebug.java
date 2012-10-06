/*  
 *  ReActions, Minecraft bukkit plugin
 *  (c)2012, fromgate, fromgate@gmail.com
 *  http://dev.bukkit.org/server-mods/weatherman/
 *   * 
 *  This file is part of ReActions.
 *  
 *  WeatherMan is free software: you can redistribute it and/or modify
 *	it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  WeatherMan is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with WeatherMan.  If not, see <http://www.gnorg/licenses/>.
 * 
 */

package fromgate.reactions;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class RADebug {
	HashMap<String,Boolean> debug = new HashMap<String,Boolean>();
	
	public void setPlayerDebug (Player p, boolean debugmode){
		debug.put (p.getName(),debugmode);
	}
	
	public void offPlayerDebug(Player p){
		if (debug.containsKey(p.getName())) debug.remove(p.getName());
	}
	
	public boolean checkFlagAndDebug (Player p, boolean flag){
		if (debug.containsKey(p.getName())) return (debug.get(p.getName()));
		return flag;
	}

}
