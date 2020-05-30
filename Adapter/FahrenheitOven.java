/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import Adapter.FtoCAdapter;
import Adapter.Adapter;

/**
 *
 * @author edujg
 */
public class FahrenheitOven implements Adapter{
    
    @Override
    public String Cook(double tempF) {
        return "Cooking at: "+tempF+" Fahrenheit";
    }
}
