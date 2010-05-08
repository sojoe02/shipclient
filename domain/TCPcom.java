/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package domain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soren V. Jorgensen
 */
public class TCPcom {

    private int port;
    private String host;


    public TCPcom(String host,int port){
	this.port = port;
	this.host = host;
    }



    public void connectToServer(String gpsCoor) {

	try {
	    Socket skt = new Socket(host, port);
	    OutputStream os = skt.getOutputStream();
	    ObjectOutputStream oos = new ObjectOutputStream(os);

	    oos.writeChars(gpsCoor);
	    
	    os.close();
	    oos.close();
	    skt.close();



	} catch (UnknownHostException ex) {
	    Logger.getLogger(TCPcom.class.getName()).log(Level.SEVERE, null, ex);
	} catch (IOException ex) {
	    Logger.getLogger(TCPcom.class.getName()).log(Level.SEVERE, null, ex);
	}

	
    }
}
