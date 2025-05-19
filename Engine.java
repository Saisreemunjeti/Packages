package com.vechicles.parts;

public class Engine {
    private int horsePower;
    private String engineName;
       public void setHorsePower(int horsePower) {
       this.horsePower = horsePower;
    }
       public void setEngineName(String engineName) {
       this.engineName = engineName;
    }
       public int gethorsePower() {
       return horsePower;
    }
       public String getengineName(){
       return engineName;
    }
       public void showEngineDetails() {
         System.out.println("Engine Horse Power: " + horsePower);
         System.out.println("Engine Name:" + engineName);
    }
}
