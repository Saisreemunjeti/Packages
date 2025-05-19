package com.vechicles.app;

import com.vechicles.Car;
import com.vechicles.parts.Engine;

public class CarApp {

	    public static void main(String [] args){
	       Car car=new Car();
	          car.setBrand("TATA MOTORS");
	          car.setModel("BMW");
	          car.setPrice(4300000);
	       Engine engine=new Engine();
	          engine.setHorsePower(738);
	          engine.setEngineName("N63");   
            car.showCarDetails();
              System.out.println();
	  		engine.showEngineDetails();
	}
	   }

