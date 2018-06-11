package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorA {
    
    private View view;

    ServidorA(View Tabla) throws IOException {
        this.view = Tabla;
        Inicio();
    }
    public void Inicio() throws IOException {
        Socket s = null;
        ServerSocket ss = new ServerSocket(5432);
        
        while (true) {
            try {
                // ServerSocket me da el Socket
                s = ss.accept();
                // instancio un Thread
                (new Cliente(s, this.view )).start();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
