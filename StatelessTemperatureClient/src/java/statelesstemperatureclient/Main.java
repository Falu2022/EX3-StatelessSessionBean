/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statelesstemperatureclient;

/**
 *
 * @author poom_
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread(1);
        myThread1.start();

        try {
            myThread1.join();
        }
        catch(Exception e) {
            
        }
        // TODO code application logic here
    }
    
}
