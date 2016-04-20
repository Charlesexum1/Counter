/*
 * Counter.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Counter {
	
	private int counter;
	
	public void counterReset(){
		counter = 0;
		}
		
	public void countUp(int countTo){
		for (int i = 0; i <= countTo; i++){
			counter += 1;
			System.out.println(counter);
		}
	}
	public void countDown(int countTo){
		for (int x = 0; x <= countTo; x++){
		
		if (counter <= 0) {
			System.out.println("Counter must stay positive!");
			System.exit(0);
			} 
		else {
			counter -= 1;
			System.out.println(counter);
			}
		}
	}
	public static void main (String args[]) {
		
		Counter demo = new Counter();
		demo.counterReset();
		demo.countUp(5);
		demo.countUp(10);
		demo.countDown(20);
		
	}
}

