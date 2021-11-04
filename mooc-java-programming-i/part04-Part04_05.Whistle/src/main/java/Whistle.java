/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Palo
 */
public class Whistle {
    private String sound;
    
    public Whistle(String soundOfAnimal){
        this.sound = soundOfAnimal;
    }
    
    public void sound (){
        System.out.println(this.sound);
    }
}
