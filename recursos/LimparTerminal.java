package org.example.recursos;

public class LimparTerminal {

    public static void limpar() {
        //Valido para Linux, Mac os e Windows

        try {
            final String os = System.getProperty("os.name");

            if (os.contains("Windows")){
                Runtime.getRuntime().exec("cls");

            }else{
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}