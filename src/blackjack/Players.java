/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author maria
 */
public class Players {
    private String name;
    private int age;
    
    public Players(String name) {
        this.name = name;
    }
    
    public Players (String name, int age) {
        this.age = age;
    }
    
    //getters
    public String getName() { return name; }
    public int getAge() { return age; }
    
    //setters
    public void setName() {}
    
    	@Override
    public String toString() {
        return 	"Enter UserName: " + name + 
                "\n**************************************";
    
}

