package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {

        Scanner comando = new Scanner(System.in);

        String subnombre;
        String subap;
        String subam;

        System.out.println("Ingresa nombre: ");
        String nombre = comando.nextLine();

        System.out.println("apellido paterno: ");
        String apellidop = comando.nextLine();

        System.out.println("apellido materno: ");
        String apellidom = comando.nextLine();

        System.out.println("Fecha (AAMMDD): ");
        String fecha = comando.nextLine();

        System.out.println("Sexo (H o M: )");
        String sexo = comando.nextLine();

        System.out.println("Entidad Federativa(BC): ");
        String entidad = comando.nextLine();

        Random aleatorio = new Random();
        int n = aleatorio.nextInt(9);
        int m = aleatorio.nextInt(9);
        int homo1 = aleatorio.nextInt(9);
        int homo2 = aleatorio.nextInt(9);


        subnombre = nombre.substring(0,1);
        subap = apellidop.substring(0,2);
        subam = apellidom.substring(0,1);

        String curp = subap + subam + subnombre + fecha + sexo + entidad + consonanteCURP(apellidop)+ consonanteCURP(apellidom) + consonanteCURP(nombre) + m + n;
        System.out.println("El CURP es: ");
        System.out.println(curp);

        String rfc = subap + subam + subnombre + fecha + m + "H" + n;
        System.out.println("El RFC es: ");
        System.out.println(rfc);

    }
    public static boolean esConsonante(char letra){
        if(letra == 'a' ||letra == 'e' || letra == 'i' || letra =='o' || letra == 'u'){
            return false;
        }
        return true;
    }
    public static char consonanteCURP(String nombre) {
        for (int i = 1; i < nombre.length(); i++) {
            char a = nombre.charAt(i);
            if (esConsonante(Character.toLowerCase(a))) {
                return a;
            }
        }
        return '\0';
    }
}
