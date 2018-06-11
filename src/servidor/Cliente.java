package servidor;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Vector;
import javax.swing.JFrame;

class Cliente extends Thread {

    private View view;

    private Socket s = null;
    ObjectInputStream DDatos = null;

    public static String p1 = null, p2 = null, p3 = null, p4 = null, p7 = null, p5 = null, p6 = null, p8 = null, p9 = null, p10 = null;
    public static boolean b1 = false;
    public static HashMap<String, String> Lista = new HashMap<>();

    public Cliente(Socket socket, View Tabla) {
        this.view = Tabla;
        this.s = socket;
    }

    public void run() {

        try {
            //informacion en la consola
            System.out.println("Conexion desde la IP: " + s.getInetAddress());

            DDatos = new ObjectInputStream(s.getInputStream());

            //Lista =   ; 
            Conexion((HashMap) DDatos.readObject());

            /*
                //this.Tabla.setVisible(false);
                
                String n1 = Lista.get(0);
                p1 = n1;
                String n2 = Lista.get(1);
                p2 = n2;
                String n3 = Lista.get(2);
                p3 = n3;
                String n4 = Lista.get(3);
                p4 = n4;
                String n5 = Lista.get(4);
                p5 = Lista.get(4);
                String n6 = Lista.get(5);
                p6 = Lista.get(5);
                String n7 = Lista.get(6);
                p7 = n7;
                String n8 = Lista.get(7);
                p8 = Lista.get(7);
                String n9 = Lista.get(8);
                p9 = Lista.get(8);
                String n10 = Lista.get(9);
                p10 = Lista.get(9);
                
                if(s.isConnected())
                {
                    b1 = true;
                }            
                //Tab.addPc(Lista);
                //Ventana f = new Ventana();
                //f.setVisible (true);  
                //System.out.println("Lista: "+ Lista );
                System.out.println("Descripcion: "+n1);
                System.out.println("Nombre: "+n2);
                System.out.println("Nombre CPU: "+n3);           
                System.out.println("Modelo: "+n4);
                System.out.println("MHZ: "+n5);
                System.out.println("Total de nuecleos de CPU: "+n6);
                System.out.println("Uso total de nuecleos de CPU: "+n7);
                System.out.println("RAM total: "+n8+" MB");
                System.out.println("RAM disponible: "+n9+" MB");
                System.out.println("RAM usada: "+n10+" MB");*/
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (s != null) {
                    s.close();
                }
                System.out.println("Conexion cerrada!");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    public void Conexion(HashMap Lista) {
        //this.view.Clientes
        String Mac = (String) Lista.get("MAC");
        if(Existe(Mac)){
            
            System.out.println("Ya existe");
        }else{
            
            System.out.println("No existe..");
        }
        this.view.Clientes.put( Mac, Lista );
        Tabla();
        
        
        /*Vector<Object> fila = new Vector<Object>();
        fila.add("#");
        for (int i = 0; i < 12; i++) {
            fila.add(Lista.get(i));
        }*/
        //Añadir el vector a la tabla de la clase View
        
        
    }

    public Boolean Existe(String Mac) {
        return this.view.Clientes.containsKey(Mac);
    }
    
    public void Tabla(){
        //System.out.println(this.view.Clientes);
        Set<String> keys = this.view.Clientes.keySet();
        
        Vector<Object> fila = new Vector<Object>();

        for(String key: keys){
            System.out.println("Value of "+key+" is: "+ this.view.Clientes.get(key) );
            fila.add(this.view.Clientes.get(key).get("MAC"));
            fila.add(this.view.Clientes.get(key).get("IP"));
            fila.add(this.view.Clientes.get(key).get("Desc"));
            fila.add(this.view.Clientes.get(key).get("CPU"));
            fila.add(this.view.Clientes.get(key).get("Model"));
            fila.add(this.view.Clientes.get(key).get("MHZ"));
            fila.add(this.view.Clientes.get(key).get("Cores"));
            fila.add(this.view.Clientes.get(key).get("CoresU"));
            fila.add(this.view.Clientes.get(key).get("RAMT"));
            fila.add(this.view.Clientes.get(key).get("RAMF"));
            fila.add(this.view.Clientes.get(key).get("RAMU"));
            //fila.add(this.view.Clientes.get(key).get("RAMT"));
            
            /* Set<String> keys2 = this.view.Clientes.get(key).keySet();
            for(String key2: keys2){
                fila.add(this.view.Clientes.get(key).get(key2));
            }*/
            this.view.dtm.setRowCount(0);
            this.view.dtm.addRow(fila);
        }
        
        
    }
}
