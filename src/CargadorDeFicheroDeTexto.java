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
            String palabraMasLarga=" ";
            while (linea != null) {
                String[] palabras = linea.split(" ");
                numeroDeLineas++;
                for (String palabra: palabras ) {
                    if (palabra.contains(".")){
                        palabra.replaceAll("."," ");

                    }
                    contadorDePalabras++;
                    System.out.println(palabra);
                    if (palabra.length()>palabraMasLarga.length()){
                        palabraMasLarga=palabra;

                    }
                }


                linea = bufferedReader.readLine();

            }
            System.out.println(palabraMasLarga);
            System.out.println(contadorDePalabras);
            System.out.println(numeroDeLineas);
            bufferedReader.close();

        } catch (IOException excepcionPropia) {
            throw new ExcepcionPropia();
        }




        return new LinkedList<>();
    }
}