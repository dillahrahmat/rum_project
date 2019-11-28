/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.echo.clientserver.sayhello.client_asdos;

import javax.swing.SwingUtilities;
import login_form.login_all;
/**
 *
 * @author R
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SwingUtilities.invokeLater(new Runnable(){
            
            public void run(){
                login_all client = new login_all();
                client.setVisible(true);
            }
        });
    }
    
}
