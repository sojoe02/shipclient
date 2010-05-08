/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 *
 * @author japper
 */
public class getGps {

    public String readGps() {
	StringBuffer buffer = new StringBuffer();
	try {
	    FileInputStream fis = new FileInputStream("gps/gps.txt");
	    InputStreamReader isr = new InputStreamReader(fis, "UTF8");

	    Reader in = new BufferedReader(isr);

	    int ch;

	    while ((ch = in.read()) > -1) {
		buffer.append((char) ch);
	    }
	    in.close();
	    return buffer.toString();

	} catch (IOException e) {
	    e.printStackTrace();
	    return null;
	}

    }
}
