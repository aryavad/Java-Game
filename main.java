import java.util.Scanner;
import java.io.*;
// import java.util.Random;
// import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {
    Scanner reader = new Scanner (System.in);
    // Random rand = new Random();
   //  DecimalFormat decform = new DecimalFormat ("0.00");

    //variables
        int yesno;
        int outfit;
        int item;
        
        String title = "LATE TO SCHOOL";
        for (int a= 0; a < title.length(); a++){
             System.out.print(title.charAt(a));
             try {
                Thread.sleep(70); 
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
        }


       String wait = "   ";
        for (int b= 0; b < wait.length(); b++){
             System.out.print(wait.charAt(b));
             try {
                Thread.sleep(1500); 
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
        }
        System.out.println (" ");


        System.out.println("Would you like to start?");
        System.out.println("Yes = 1  ,  No = 0");
        yesno = reader.nextInt();
        
        if (yesno == 0){   // if answer : no

        String dot = "...";                               
        for (int c= 0; c < dot.length(); c++){
             System.out.print(dot.charAt(c));
             try {
                Thread.sleep(300); 
                } catch (InterruptedException e) {
                e.printStackTrace();
                }
        }
        System.exit(0);
        }

        else{            // if answer : yes  
            String text = "This game follows your life as a student faced with many unexpected challenges along your path." + '\n' + "You will be given many options on the way. Choose wisely as it may have an affect on your game environment!";
             for (int d= 0; d < text.length(); d++){
                System.out.print(text.charAt(d));
                try {
                    Thread.sleep(70); 
                 } catch (InterruptedException e) {
                    e.printStackTrace();
                 }
                }
                System.out.print (wait);                    //wait before welcome player
                for (int ee= 0; ee < wait.length(); ee++){
                    System.out.print(wait.charAt(ee));
                     try {
                        Thread.sleep(1500); 
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }}

            System.out.println (" " + '\n' + " ");

            System.out.println ("Welcome player!" + '\n' + "Let's start off with your name..." + '\n');
            System.out.println("What would you like to be called?");
            String name = reader.next();
            System.out.println ("Hello " + name + "!");
            System.out.println ("Enough chit-chat!");
            System.out.println ("You have to wake up soon. The time is");
            String dot = ". . .";                    
                for (int b= 0; b < dot.length(); b++){

                    System.out.print(dot.charAt(b));
                     try {
                        Thread.sleep(400); 
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }}
            System.out.println ("6:30!");
            System.out.print (wait);                   
                for (int ee= 0; ee < wait.length(); ee++){
                    System.out.print(wait.charAt(ee));
                     try {
                        Thread.sleep(1000); 
                        } catch (InterruptedException e) {
                        e.printStackTrace();
                        }}
            System.out.println ('\n' + "How are we already so late to school." + '\n' + "Quick choose what you will wear today.");
            System.out.println ("1. School Uniform" +'\n'+ "2. Pajamas" +'\n'+ "3. Snow Gear (?)" +'\n');
            System.out.println ("What will you choose?");
            outfit = reader.nextInt();
            switch (outfit){

                case 1 :  // school uniform option
                    System.out.println("Good choice." +'\n'+ "Now, what will you bring with you to school?");
                    System.out.println ("1. School Bag" +'\n'+ "2. Sports Bag" +'\n'+ "3. Mystery Box (?)" +'\n');
                    System.out.println ("What will your choice be?");
            //         item = reader.nextInt();
            //         switch (item){

            //             case 1 : // school bag option
            //                 System.out.println ("A school bag. What else should I have expected.");
            //                 System.out.println ("Since we are all ready now... let's LEAVE!");
            //                 String wait2 = "   ";                    
            //                     for (int ee= 0; ee < wait2.length(); ee++){
            //                         System.out.print(wait2.charAt(ee));
            //                          try {
            //                              Thread.sleep(1500); 
            //                              } catch (InterruptedException e) {
            //                              e.printStackTrace();
            //                      }}

            //                 System.out.print ("You make your way out of the door." + '\n' + "An eerie silence filled the usually busy street outside of " + name + "'s house");
            //                    for (int f= 0; f < wait.length(); f++){
            //                     System.out.print(wait.charAt(f));
            //                     try {
            //                         Thread.sleep(1000); 
            //                         } catch (InterruptedException e) {
            //                         e.printStackTrace();
            //                     }}
                            


            //             case 2 : // sports bag option 


            //             }
                            
            //     case 2 :  // pajamas option
            //          System.out.println ("Cozy it is!");

            //     case 3 :  // snow gear
            //          System.out.println ("Snow gear? Interesting... Anyways");




             }

    
    




        
    } 
  }
}
