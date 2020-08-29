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
public class Producto implements Strategy{
     public int CalculoOperador(int num1, int num2) {
      return num1 * num2;
   }
}
