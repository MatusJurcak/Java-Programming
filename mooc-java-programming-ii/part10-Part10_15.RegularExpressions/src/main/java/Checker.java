

public class Checker {
    
    
    public boolean isDayOfWeek(String string){
        if(string.matches("mon")){
            return true;
        } else if(string.matches("tue")){
            return true;
        } else if(string.matches("wed")){
            return true;
        } else if(string.matches("thu")){
            return true;
        } else if(string.matches("fri")){
            return true;
        } else if(string.matches("sat")){
            return true;
        } else if(string.matches("sun")){
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String string){
        if(string.matches("[a|e|i|o|u]*")){
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string){
        if(string.matches("[0-1][0-9]:[0-5][0-9]:[0-5][0-9]")){
            return true;
        }
        else if(string.matches("2[0-3]:[0-5][0-9]:[0-5][0-9]")){
            return true;
        }
        return false;
    }
}
