package com.company;

import java.io.IOException;

class Built {

    public static void main(String[] args){
        Dog Amy =new Dog();
        Amy.Weight= 14.7;
        Amy.Age= 10;
        Amy.Color= "brown";
        Amy.Height= 50;
        Amy.Race= "Mischling";
        Amy.Name= "Amy";
        System.out.println(Amy);


        Dog Kira=new Dog();
        Kira.Weight= 14.7;
        Kira.Age= 10;
        Kira.Color= "black";
        Kira.Height= 50;
        Kira.Race= "Mischling";
        Kira.Name= "Kira";
        System.out.println(Kira);
      }

    public static void print(char array[]){
        for(int i=0; i<array.length; i++){ // Assign empty dashes at start "_ _ _ _ _ _ _ _"
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean isTheWordGuessed(char[] array){
        boolean condition = true;
        for(int i=0; i<array.length; i++){
            if(array[i] == '_'){
                condition = false;
            }
        }
        return condition;
    }
}