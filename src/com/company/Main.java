package com.company;

import java.io.IOException;

class Built {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] Brands = new String[5]; //{"nike", "supreme", "adidas", "jordan", "yeezy"};
        Brands[0] ="nike";
        Brands[1]="supreme";
        Brands[2]="adidas";
        Brands[3]="jordan";
        Brands[4]="yeezy";

        boolean weArePlaying = true;
        while(weArePlaying){
            System.out.println("Lasst uns Hangman spielen PS: Nur kleine Buchstaben zählen;)");
            int randomNumber = random.lenght; //random.nextInt(10);
            char randomWord[] = Brands[randomNumber].toCharArray(); // Nike <-> N,i,k,e | Adidas <-> a,d,i,d,a,s
            int guesthenumber = randomWord.length; //Versuche um die Marke zu erraten
            char Striche[] = new char[guesthenumber]; // "_ _ _ _ _ _ _ _"

            for(int s = 0; s<Striche.length;s++){ // empty dashes at start "_ _ _"
                Striche[s] =  '_';
            }

            boolean erraten = false;
            int tries = 0-3;

            while(!erraten && tries != guesthenumber){
                System.out.println("Frage:");
                System.out.println("Welche Marken werden von Reseller oft verkauft? ");
                System.out.printf("Du hast noch %d Versuche übrig. \r", guesthenumber-tries);
                System.out.println("\nGib einen einzelnen Buchstaben ein: ");
                print(Striche);
                //String input = scanner.next();
                char c = 0;
                try {
                    c = (char)System.in.read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                tries++;

                if(c == '-'){
                    erraten = true;
                    weArePlaying = false;
                } else{
                    for(int i=0; i<randomWord.length; i++){
                        if(randomWord[i] == c){
                            Striche[i] = c;
                        }
                    }
                    if(isTheWordGuessed(Striche)){
                       erraten = true;
                        System.out.println("Herzlichen Glückwunsch");
                    }
                }
            } /* Ende des Spiels */
            if(!erraten){
                System.out.println("Du hast keine Versuche mehr..");
            }

            System.out.println("Bist du cool genug um nochmal zu spielen? (ja/nein) ");
            String choice = scanner.nextLine();
            if(choice.equals("nein")){
                weArePlaying = false;
            }

        }/*End of the Play*/

        System.out.println("   _______________");
        System.out.println("   ||           _|_ ");
        System.out.println("   ||           _|_ ");
        System.out.println("   ||           _|_ ");
        System.out.println("   ||           _|_ ");
        System.out.println("   ||          /   \\ ");
        System.out.println("   ||         |    | ");
        System.out.println("   ||         \\_ _/ ");
        System.out.println("   ||           _||_ ");
        System.out.println("   ||          / || \\ ");
        System.out.println("   ||           /  \\  ");
        System.out.println("___||___       /    \\ ");
        System.out.println("GAME OVER!"+ " Probiere es nochmal");
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