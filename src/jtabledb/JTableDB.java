
package jtabledb;

import java.awt.EventQueue;

public class JTableDB {
//MAIN CLASS
    public static void main(String[] args) {
        //CALL UPDATER CLASS WHICH IS OUR GUI CLASS
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Updater().setVisible(true);
            }
        });
        
        
    }

}