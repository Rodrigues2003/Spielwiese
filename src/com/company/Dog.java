package com.company;

public class Dog {
    public String Name; //Name
    public int Height; //Höhe in cm
    public String Color; //Farbe
    public int Age; //Alter in Jahre
    public String Race; //Rasse
    public double Weight; //Gewicht in kg
    @Override
    public String toString(){
        return this.Name+":"+"\n"+Age+" Jahre alt"+"\n"+"Gewicht: "+Weight+"\n"+"Höhe: "+Height+"cm"+"\n"+"Rasse: "+Race+"\n";
    };
}
