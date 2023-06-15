package Cau1;

import java.io.Serializable;

public class Car implements Serializable {
    private String carName;
    private String carColor;
    private String engine;
    public Car(){}
    public Car(String carName, String carColor, String engine){
        this.carName = carName;
        this.carColor = carColor;
        this.engine = engine;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return " carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engine='" + engine + '\'' ;
    }
}
