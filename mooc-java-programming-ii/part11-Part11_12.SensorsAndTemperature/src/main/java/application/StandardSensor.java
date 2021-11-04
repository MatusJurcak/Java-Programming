package application;

/**
 *
 * @author Palo
 */
public class StandardSensor implements Sensor{
    private int parameter;
    
    public StandardSensor(int parameter){
        this.parameter = parameter;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
        
    }

    @Override
    public void setOff() {
    
    }

    @Override
    public int read() {
        return this.parameter;
    }
    
}
