/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

/**
 *
 * @author Diego
 */
public class RunApp {
     public static void main(String[] args) {
        int a= 10;
        int b= 5;
      Context context = new Context(new Suma());		
      System.out.println(a +" + " + b + " = " + context.executeStrategy(a, b));

      context = new Context(new Resta());		
      System.out.println(a +" - " + b + " = " + context.executeStrategy(a, b));

      context = new Context(new Producto());		
      System.out.println(a +" * " + b + " = " + context.executeStrategy(a, b));
      }
}
