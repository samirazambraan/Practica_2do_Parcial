import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] persona = new String[20];
        int[] sueldos = new int[20];

        String nombre;
        int sueldomayor;

        int i = 0;

        System.out.println("Nombres y Sueldos de cada persona: ");                                        
        System.out.print("Persona " + (i + 1) + ": ");
        persona[i] = sc.nextLine();
        System.out.print("Sueldo: ");
        sueldos[i] = sc.nextInt();

        //aqui tomaremos los primeros datos como mayores
        sueldomayor = sueldos[i];
        nombre = persona[i];

        //mostraremos a las otras personas
        for (i = 1; i < persona.length; i++) {
            sc.nextLine();
            System.out.print("Empleado " + (i + 1) + ": ");
            persona[i] = sc.nextLine();
            System.out.print("Sueldo: ");
            sueldos[i] = sc.nextInt();

         
            if (sueldos[i] > sueldomayor) {
                sueldomayor = sueldos[i];
                nombre = persona[i];
            }
        }

        //mostrar resultados
        System.out.println("El empleado que gana mas es: " + nombre );                                         
        System.out.println("Su sueldo es: " + sueldomayor);
    }
}