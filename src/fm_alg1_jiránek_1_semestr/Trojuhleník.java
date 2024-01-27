/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fm_alg1_jiránek_1_semestr;

import java.util.Scanner;

/**
 *
 * @author matee
 */
public class Trojuhleník {

     private static final Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args) {
        double a =0,b =0, c= 0;
        System.out.println("Zadej délky stran trojúhelníka");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        
        if(x <= 0 || y <= 0 || z <= 0){
            System.out.println("Nutno zadat kladná čísla");
            return;
        }
        
        if (x + y <= z || x+z <= y || z+y <= x){
            System.out.println("Nelze sestrojit trojuhelník");
            return;
            //System.exit()
        }
        // vypocitat plochu a obvod
        double O = x+y+z;
        double s = O/2;
        double S = Math.sqrt(s*(s-x)*(s-y)*(s-z));
        
        //priradit hodnoty aby platilo c=>=b=>a
        if (x>y & x>z){
        c = x;
            if (y>z){
                b = y;
                a = z;
            }else if (z>y){
                    b = z;
                    a =y;
            }
        }
        if (z>x & z>y){
        c = z;
            if (y>x){
                b = y;
                a = x;
            }else if (x>y){
                    b = x;
                    a =y;
            }
        }
        if (y>x & y>z){
        c = y;
            if (z>x){
                b = z;
                a = x;
            }else if (x>z){
                    b = x;
                    a =y;
            }
        }
        
        System.out.println("1. " + a + " 2. " + b + " 3. " +c + "\n");
        
        //urci typ dle stran
        if (a == b && b == c && a == c){
            System.out.println("Trojúhelník je rovnostranný\n");
        
        }else if (a == b || c == a || b==c){
            System.out.println("Trojúhelník je rovnostranný");
        }else{
            System.out.println("Trojúhelník je obecný");
        }
        
        //urci typ dle uhlu pravouhly (c^2 = a^2 + b^2) ostrouhly (c^2 < a^2 + b^2) tupouhly (c^2 = a^2 + b^2)
        if (c*c == a*a+b*b){
            System.out.println("Trojúhelník je pravoúhlý");
        
        }else if (c*c < a*a + b*b){
            System.out.println("Trojúhelník je ostorúhlý");
        
        }else{
            System.out.println("Trojúhleník je tupoúhlý");
            
        }
      
         
    }
    
}
