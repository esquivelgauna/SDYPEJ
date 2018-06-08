package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ServidorA {

    private View view;

    ServidorA(View Tabla) throws IOException {
        this.view = Tabla;
        Vector<Object> fila = new Vector<Object>();
        fila.add("id");
        fila.add("idsd");
        fila.add("idasd");
        //Añadir el vector a la tabla de la clase View
        this.view.dtm.getRowCount();
        this.view.dtm.addRow(fila);
        
        
        Inicio();
    }
    public void Inicio() throws IOException {
        Socket s = null;
        ServerSocket ss = new ServerSocket(5432);
        //this.Tabla.dtm.addRow("sfsdf");
        //this.Tabla.setVisible(true);
        //this.Tabla.Agregar("adsfdsf");
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
