import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class CargadorDeFicheroDeTexto {
    BufferedReader bufferedReader;

    public List<String[]> lectorDeTextos() throws ExcepcionPropia {
        List<String[]> palabras = new LinkedList<>();

        try {
            bufferedReader = new BufferedReader(new FileReader("Resources/texto.txt"));
            String linea = bufferedReader.readLine();
            while (linea != null) {
                String[] palabra = linea.split(" ");
                palabras.add(palabra);
                linea = bufferedReader.readLine();

            }
            bufferedReader.close();

        } catch (IOException excepcionPropia) {
            throw new ExcepcionPropia();
        }




        return palabras;
    }
}