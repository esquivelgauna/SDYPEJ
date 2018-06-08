package servidor;

public class Servidor {
    
    public static void main(String[] args) throws Exception {
        Tabla MiTabla = new Tabla();
        new ServidorA(MiTabla);
        
    }

}