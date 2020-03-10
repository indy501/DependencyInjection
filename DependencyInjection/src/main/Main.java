/*
 * Example of Dependency Injection
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 */

package main;

import car.Car;
import engine.Engine;

public class Main {

	public static void main(String[] args) {
		Engine engine;
		try {
			engine = new Engine("Thumper", 440);
			Car corvette = new Car(engine);
			System.out.println(corvette.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
