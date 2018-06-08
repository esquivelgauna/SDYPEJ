package servidor;

public class Servidor {
    
    public static void main(String[] args) throws Exception {
        View MiTabla = new View();
        new ServidorA(MiTabla);
    }
}