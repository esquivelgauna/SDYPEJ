package servidor;

import java.awt.EventQueue;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
        
    
    public static void main(String[] args) throws Exception {
        Socket s = null;
        ServerSocket ss = new ServerSocket(5432);
        ;
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tabla().setVisible(true);
            }
        });
        
        while (true) {
            try {
                // ServerSocket me da el Socket
                s = ss.accept();
                // instancio un Thread
                (new Cliente(s)).start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}