/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soren V. jorgensen
 */
public class GpsThread implements Runnable {

    private volatile Thread gpsGet;
    private getGps gps = new getGps();
    private TCPcom netcom = new TCPcom("localhost", 1234);

    public void run() {

	Thread thisThread = Thread.currentThread();


	while (gpsGet == thisThread) {

	    System.out.println(gps.readGps()); //testing
	    netcom.connectToServer(gps.readGps());
	}
	try {
	    Thread.sleep(5000*60); //sleep for 5 min
	} catch (InterruptedException ex) {
	    Logger.getLogger(GpsThread.class.getName()).log(Level.SEVERE, null, ex);
	}
    }



    
}
