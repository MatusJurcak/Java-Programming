import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        if(this.history.size() == 0){
            return 0;
        }
        double max = this.history.get(0);
        for(double number : history){
            if(number > max){
                max = number;
            }
        }
        return max;
    }
    
    public double minValue(){
        if(this.history.size() == 0){
            return 0;
        }
        double min = this.history.get(0);
        for(double number : history){
            if(number < min){
                min = number;
            }
        }
        return min;
    }
    
    public double average(){
        if(this.history.size() == 0){
            return 0;
        }
        double sum = 0;
        for(double number : history){
            sum = sum + number;
        }
        return 1.0 * sum/this.history.size();
    }
    public String toString(){
        return this.history.toString();
    }
}
