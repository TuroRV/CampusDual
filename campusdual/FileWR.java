package com.campusdual;

import java.io.*;
import java.util.Random;

public class FileWR {

    private Random r = new Random();

    // Crear un fichero de nombre salida.txt, que escriba 10 números aleatorios.

    public static void main(String[] args) throws IOException {

        FileWR wr = new FileWR();
        try {
            wr.writeNumbers();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        wr.readNumbers();

    }

    private void readNumbers() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(new File("salida.txt")))) {
        String line;
            while ((line = br.readLine()) != null){
            System.out.println(line);
        }

        } catch (IOException e) {
            throw e;
        }

    }

    private void writeNumbers() throws FileNotFoundException {
        try(PrintWriter pw = new PrintWriter(new File("salida.txt"))){
            for (int i=0;i<10; i++) {
                pw.println(this.r.nextInt(10) + 1);
            }
    } catch (FileNotFoundException e) {
            throw e;
        }


    }

    }
