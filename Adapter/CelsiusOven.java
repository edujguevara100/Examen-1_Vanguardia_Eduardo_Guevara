/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author edujg
 */
public class CelsiusOven {    
    public double getTempInF(double tempC){
     return (tempC* 9/5) + 32;   
    }
}
