import java.util.Scanner;;
public class ejercicio2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int peso=0;
        double altura=0;
        int ims=0;

        //pedimos el peso y altura del paciente
        System.out.println("Ingrese el peso del paciente: ");
        peso=sc.nextInt();
        System.out.println("Ingrese la altrura del paciente: ");
        altura=sc.nextDouble();

        //calculamos el ims
        ims= (int) (peso/(altura*altura));
        //mostramos el ims
        System.out.print("El indice de masa del paciente es: " +ims);

        //verificamos si el ims del paciente es saludable
        if(ims>18||ims==25){
            System.out.println("\n");
            System.out.println("El paciente tiene un indice de masa saludable");
            System.out.println("\n");
        }else{
            System.out.println("\n");
            System.out.println("El paciente tiene un indice de masa no saludable");
            System.out.println("\n");
        }
    }

}