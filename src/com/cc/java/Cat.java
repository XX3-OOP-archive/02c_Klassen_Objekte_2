package com.cc.java;

public class Cat {
    
    private String name;
    private String furColor;
    private int age;
    private boolean isFemale;

    private int counter;

    public Cat(String name, String furColor, int age, boolean isFemale) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
        this.isFemale = isFemale;
    }

    public String getStringAttributes(String flag){
        switch (flag) {
            case "#name":
                return name;
            case "#color":
                return furColor;
            default:
                return "#!?";
        }  
    }

    public String getAge(){
        return checkCompliance();
    }

    private String checkCompliance() {
        if (isFemale) {
            return checkEscalationLevel();
        } else {
            return Integer.toString(age); 
        }   
    }

    private String checkEscalationLevel(){

        counter++;

        switch (counter) {
            case 1:
                return "This is an inappropriate question!"; 
            case 2:
                return "I've told you once!"; 
            case 3:
                return "Talk to the hand!"; 
            default:
                return "1#!?&&%"; 
        } 
    }

}
