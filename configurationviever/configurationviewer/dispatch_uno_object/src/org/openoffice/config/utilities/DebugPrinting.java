/*************************************************************************
 *
 *  The Contents of this file are made available subject to
 *  the terms of GNU Lesser General Public License Version 2.1.
 *
 *
 *    GNU Lesser General Public License Version 2.1
 *    =============================================
 *    Copyright 2008 by Giuseppe Castagno beppec56@openoffice.org
 *
 *    This library is free software; you can redistribute it and/or
 *    modify it under the terms of the GNU Lesser General Public
 *    License version 2.1, as published by the Free Software Foundation.
 *
 *    This library is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *    Lesser General Public License for more details.
 *
 *    You should have received a copy of the GNU Lesser General Public
 *    License along with this library; if not, write to the Free Software
 *    Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *    MA  02111-1307  USA
 *
 ************************************************************************/

package org.openoffice.config.utilities;

import java.util.Date;

public class DebugPrinting {

	public static String getTimeMs() {
		Date aDate = new Date();
		String time = String.format( "%20d ", aDate.getTime() );
		return time.substring( 14,17 ) +"."+ time.substring( 17 );
	}
	// ////////////////debug methods
	public String getHashHex() {
		return DebugPrinting.getTimeMs() + String.format( "%8H", hashCode() );
	}

	public void printlnName(String _sMex) {
//		System.out.println( getHashHex() + " " + getClass().getName() + ": " + _sMex );
	}

	public void printName(String _sMex) {
//		System.out.print( getHashHex() + " " + getClass().getName() + ": " + _sMex );
	}

	public void printHash(String _sMex) {
//		System.out.print(  getHashHex() + " " + _sMex );
	}

	public void print(String _sMex) {
//		System.out.print( " " + _sMex );
	}

	public void println(String _sMex) {
//		System.out.println( getHashHex() + " " + _sMex );
	}

	public void passert(String a_message, Object _tocheck) {
//		println( a_message + ": " + ( _tocheck != null ) );
	}
}
