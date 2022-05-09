import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CargadorDeFicheroDeTexto {
    BufferedReader bufferedReader;

    public List<String[]> lectorDeTextos() throws ExcepcionPropia {


        try {
            bufferedReader = new BufferedReader(new FileReader("Resources/texto.txt"));
            String linea = bufferedReader.readLine();
            int contadorDePalabras=0;
            int numeroDeLineas=0;
            while (linea != null) {
                String[] palabras = linea.split(" ");
                numeroDeLineas++;
                for (String palabra: palabras ) {
                    contadorDePalabras++;
                    System.out.println(palabra);
                }
                linea = bufferedReader.readLine();

            }
            System.out.println(contadorDePalabras);
            System.out.println(numeroDeLineas);
            bufferedReader.close();

        } catch (IOException excepcionPropia) {
            throw new ExcepcionPropia();
        }




        return new LinkedList<>();
    }
}