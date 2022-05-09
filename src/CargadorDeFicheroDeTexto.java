import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CargadorDeFicheroDeTexto {
    BufferedReader bufferedReader;

    public List<String[]> lectorDeTextos() throws ExcepcionPropia {


        try {
            bufferedReader = new BufferedReader(new FileReader("Resources/texto.txt"));
            String linea = bufferedReader.readLine();
            while (linea != null) {
                String[] palabras = linea.split(" ");
                for (String palabra: palabras ) {
                    System.out.println(palabra);
                }
                linea = bufferedReader.readLine();

            }
            bufferedReader.close();

        } catch (IOException excepcionPropia) {
            throw new ExcepcionPropia();
        }




        return new LinkedList<>();
    }
}