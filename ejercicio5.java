import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        // El arreglo
        int n=0;
        System.out.println("ingrese el tamaño del arreglo: ");
        n=sc.nextInt();
        int[] arreglo = new int[n];
       
        for(int i=0;i<arreglo.length;i++){
            arreglo[i]=(int)(Math.random()*100);//llenado con numeros de 0 al 100
        }

        System.out.println("Imprimiendo arreglo antes de ordenar...");
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
       
        ordenarPorSeleccion(arreglo);

        System.out.println("\nImprimiendo arreglo después de ordenar...");
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
    }
    



    public static void ordenarPorSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }  
}
