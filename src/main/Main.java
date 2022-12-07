/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import View.InicioGUI;
import View.Splash_GUI;

/**
 *
 * @author manager
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                        
                                             
                      Controller.testa_DB.carregaDriver();
                      new Splash_GUI().setVisible(true);

    }
    
}
