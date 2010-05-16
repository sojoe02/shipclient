/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/**
 *
 * @author japper
 */
public class getGps {

    Scanner s = null;

    public String readGps() {

	String gppsa = null;

	try {
	    s = new Scanner(new BufferedReader(new FileReader("src/gps")));

	    while (s.hasNext()) {
		gppsa += s;
	    }

	} catch (FileNotFoundException ex) {
	    System.out.println("src/gps not found");
	}
	return gppsa;
    }
}
