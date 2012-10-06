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

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class RALoc {
	String world;
	int x;
	int y;
	int z;
	float yaw;
	float pitch;
	
	
	public RALoc (Location loc){
		this.world = loc.getWorld().getName();
		this.x = loc.getBlockX();
		this.y = loc.getBlockY();
		this.z = loc.getBlockZ();
		this.yaw= loc.getYaw();
		this.pitch = loc.getPitch();
	
	}
	
	public RALoc (String world, int x, int y, int z, float yaw, float pitch){
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;
		this.yaw= yaw;
		this.pitch = pitch;
	}
	
	public Location getLocation(){
		return new Location (Bukkit.getWorld(world),x,y,z,yaw,pitch);
	}
	
	public boolean equalToLoc(Location loc){
		return 	(loc.getWorld().getName().equalsIgnoreCase(this.world)&&
				(loc.getBlockX()==this.x)&&
				(loc.getBlockY()==this.y)&&
				(loc.getBlockZ()==this.z));
	}
	
	

}
