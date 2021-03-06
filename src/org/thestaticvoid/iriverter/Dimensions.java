/*
 * Dimensions.java
 * Copyright (C) 2005-2007 James Lee
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 * 
 * $Id$
 */
package org.thestaticvoid.iriverter;

public class Dimensions {
	private int width, height;
	
	public Dimensions(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public Dimensions(String dimensions) {
		width = Integer.parseInt(dimensions.substring(0, dimensions.indexOf('x')));
		height = Integer.parseInt(dimensions.substring(dimensions.indexOf('x') + 1));
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public String toString() {
		return width + "x" + height;
	}
}
