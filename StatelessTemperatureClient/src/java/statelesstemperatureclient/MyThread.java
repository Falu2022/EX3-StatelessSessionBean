/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelesstemperatureclient;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import main.StatelessTemperatureBeanRemote;

/**
 *
 * @author poom_
 */
public class MyThread extends Thread {
StatelessTemperatureBeanRemote counterBean = lookupStatelessTemperatureBeanRemote();
    private int num;
    public MyThread(int i) {
        num = i;
    }
    @Override
    public void run() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        double faren, celsius;
                
        try {
            sleep(r.nextInt(10));
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("Enter degree in Fahrenheit: ");  faren = sc.nextDouble();
        celsius = counterBean.fToC(faren);
        System.out.printf(faren+"  Fahrenheit = %.2f Celsius",celsius);
    }

    private StatelessTemperatureBeanRemote lookupStatelessTemperatureBeanRemote() {
        try {
            Context c = new InitialContext();
            return (StatelessTemperatureBeanRemote) c.lookup("java:comp/env/StatelessTemperatureBean");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
