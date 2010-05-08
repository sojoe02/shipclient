/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Soren V Jorgensen
 */
public class ScriptExec {

    public void readRfcomm0() {
	try {

	    Process proc = Runtime.getRuntime().exec("./readserialport.sh");

	} catch (Exception e) {

	    System.out.println(e.getMessage());

	    e.printStackTrace();
	}
    }
}
