import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        Path unArchivo = Paths.get(args[0]);
        System.out.println(unArchivo.toAbsolutePath());

        int numeros [] = new int[0];

        System.out.println("Los numeros ingresados son:");
        for (String linea : Files.readAllLines(unArchivo)){
            System.out.println(linea);
            String numerosSeparados[] = linea.split(" ");
            int n[]=new int[numerosSeparados.length];
            for (int i=0;i<numerosSeparados.length;i++){
                n[i]=Integer.parseInt(numerosSeparados[i]);
            }
            numeros=n;
        }
        
        if (args[1].equals("S")){
            int suma = 0;
            for (int n : numeros){
                suma+=n;
            }
            System.out.println("El resultado de la suma es: \n" + suma);
        }
        
        else if (args[1].equals("M")){
            int multiplicacion = 1;
            for (int n : numeros){
                multiplicacion*=n;
            }
            System.out.println("El resultado de la multiplicacion es: \n" + multiplicacion);
        }
        
        else
            System.out.println("Debe ingresar como parametro el caracter S para suma o M para multiplicacion luego de la ruta del archivo");

        //Files.


    }
}