package jtabledb;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;
import java.util.ArrayList;

public class Servidor {
    @SuppressWarnings("resource")
    public static String p1 = null, p2 = null, p3 = null, p4 = null, p7 = null, p5=null,p6=null,p8=null,p9=null,p10=null;
    public static Socket s = null;
    public static boolean b1 = false; 
    public static ArrayList<String> Lista= new ArrayList<String>();
    
    public static void main(String[] args) throws Exception
    {
        ObjectInputStream DDatos = null;
        ServerSocket ss = new ServerSocket(5434);
        
        while(true)
        {
            try
            {
                // el ServerSocket da el Socket
                s = ss.accept();

                //informacion en la consola
                System.out.println("Conexion desde la IP: "+s.getInetAddress());

                DDatos = new ObjectInputStream( s.getInputStream());
                
                Lista =  (ArrayList)DDatos.readObject(); 
                
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
                System.out.println("RAM usada: "+n10+" MB");
            }
            catch(Exception ex)
            {
                    ex.printStackTrace();
            }
            finally
            {     
                if( s != null) s.close();
                System.out.println("En espera.."); 
                
            }      
        } 
        
    } 
}
