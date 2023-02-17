/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.ejb.Remote;

/**
 *
 * @author poom_
 */
@Remote
public interface StatelessTemperatureBeanRemote {

    //double fToC(double fahrenheit);

    double fToC(final double fahrenheit);
    
}
