
public enum Education {
    PHD("PHD"),
    MA("MA"),
    BA("BA"),
    HS("HS");
    
    private String degree;
    
    private Education(String degree){
        this.degree = degree;
    }
    
    public String getDegree(){
        return this.degree;
    }
}
