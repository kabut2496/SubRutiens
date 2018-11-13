/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menuemethods;
import java.util.Scanner;
/**
 *
 * @author kabut2496
 */
public class MenueMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyedInput = new Scanner (System.in);
        String ans;
        int num1,num2;
        
        System.out.println("hey would you like to do some math Pleas enter yes or no");
        
        ans=keyedInput.next();
        
        switch(ans){
            case("yes"):case("Yes"):
                System.out.println("YAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!!!!!!!");
                break;
             case("no"):case("No"):
                 System.out.println("well that is sad you are going to do some math");
                 break;
    }
        System.out.println("do you want to do addition,subtraction,multiplication,divition or power a number(s) please enter your answer");
        ans=keyedInput.next();
        switch (ans){
            case("addition"):
                System.out.println("please enter number 1");
                num1=keyedInput.nextInt();
                System.out.println("please enter number 2");
                num2=keyedInput.nextInt();
                math1(num1,num2);
                break;
            case("subtraction"):
               System.out.println("please enter number 1");
                num1=keyedInput.nextInt();
                System.out.println("please enter number 2");
                num2=keyedInput.nextInt();
                math2(num1,num2);
                break;

            case("multiplication"):
               System.out.println("please enter number 1");
                num1=keyedInput.nextInt();
                System.out.println("please enter number 2");
                num2=keyedInput.nextInt();
                math3(num1,num2);
                break;
                
            case("divition"):
              System.out.println("please enter number 1");
                num1=keyedInput.nextInt();
                System.out.println("please enter number 2");
                num2=keyedInput.nextInt();
                math4(num1,num2);
                break;
            case ("power"):
              System.out.println("please enter the base number and then the number you want to use as the power");
                num1=keyedInput.nextInt();
                num2 = keyedInput.nextInt();
                math5(num1,num2);
                break;
                
            default:
                System.out.println("there was a ErRoR PleAse tRy AgAiN");
                break;
        }
    }
    
    public static void math1 (int n1, int n2){      
   int sum = n1 + n2;
        System.out.println("the answer you are looking for is " + sum);
    }
            
    public static void math2 (int n1, int n2){
        int bignum,smallnum,sum;
        bignum = Math.max(n1,n2);
        smallnum = Math.min(n1,n2);
        sum = bignum - smallnum;
        System.out.println("you subtracted the biger number from the smaller number and the answer is " + sum);
    }
    
    public static void math3 (int n1,int n2){
        int sum = n1*n2;
        
        System.out.println("the answer is "+sum);
    }
    public static void math4 (int n1,int n2){
         int bignum,smallnum,sum;
        bignum = Math.max(n1,n2);
        smallnum = Math.min(n1,n2);
        sum = bignum/smallnum;
        System.out.println("you divided the biger number from the smaller number and the answer is " + sum);
    }
    public static void math5 (int n1,int n2){
        System.out.println(Math.pow(n1,n2));
    }
}
