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
public class FtoCAdapter extends FahrenheitOven{
    CelsiusOven ov;
    public FtoCAdapter(CelsiusOven ov){
        this.ov = ov;
    }
    @Override
    public String Cook(double tempC){
        return "Cooking at: "+ov.getTempInF(tempC)+" Fahrenheit";
    }
}
