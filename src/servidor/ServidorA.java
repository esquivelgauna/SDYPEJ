package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.text.View;
import javax.swing.JFrame;


public class ServidorA {
    public JFrame Tabla;
    
    ServidorA(JFrame Tabla) throws IOException {
        this.Tabla = Tabla;
        Inicio( );
    }

    public void Inicio( ) throws IOException {
        Socket s = null;
        ServerSocket ss = new ServerSocket(5432);
        this.Tabla.setVisible(true);
        while (true) {
            try {
                // ServerSocket me da el Socket
                s = ss.accept();
                // instancio un Thread
                (new Cliente(s,this.Tabla)).start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
