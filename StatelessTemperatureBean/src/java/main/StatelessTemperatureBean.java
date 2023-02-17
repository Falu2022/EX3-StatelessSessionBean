/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.ejb.Stateless;

/**
 *
 * @author poom_
 */
@Stateless
public class StatelessTemperatureBean implements StatelessTemperatureBeanRemote {

    @Override
    public double fToC(final double fahrenheit) {
        double celsius = (fahrenheit - 32) * ((double)5)/9 ; 
        return celsius;
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
