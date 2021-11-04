/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Palo
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> list;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.list = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors) {
            if(!(sensor.isOn())){
                return false;
            }
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        if(this.sensors.isEmpty() || this.isOn() == false){
            throw new IllegalStateException();
        } else{
            int counter = 0;
            int sum = 0;
            for(Sensor sensor : sensors){
                sum = sum + sensor.read();
                counter++;
            }
            this.list.add(sum/counter);
            return sum/counter;
        }
    }
    
    public List<Integer> readings(){
        return this.list;
    }
}
