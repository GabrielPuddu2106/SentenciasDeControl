import java.util.Scanner;

public class SentenciasDeControl{
    public static void main(String[] args)throws Exception{
        //Sentencia condicional simple 
        Scanner lector = new Scanner(System.in);
        System.out.println("Edad: ");
        byte edad = lector.nextByte();
        System.out.println("Sexo (f/m): ");
        char sexo = lector.next().charAt(0);
        if(edad <= 0){
            System.out.println("Usted no ha nacido");
        }else if (edad <18){
            System.out.println("Usted es menor de edad.");
        }else {
            System.out.println("Usted es mayor de edad ");
        }   


        lector.close();
    }
}
