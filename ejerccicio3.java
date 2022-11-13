import java.util.Scanner;
public class ejerccicio3 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in); 
       int[] notas= new int[4];
       for(int i=0;i<notas.length;i++){
        notas[i]=(int)(Math.random()*100);//llenado con numeros de 0 al 100
        System.out.println("Mostrando notas del alumno["+ i + "] :"+notas[i]);
        }
         //metod de seleccion
         for(int i=0; i<notas.length;i++){
            int minimo=1;
            for (int j = 0; j<notas.length; j++) {
                if(notas[minimo]<notas[j]){
                    minimo=j;
                }
            }
            int temp=notas[i];
            notas[i]= notas[minimo];
            notas[minimo]=temp;
        }
        for(int elementos: notas){
            System.out.println(+elementos);
        }
       
    }

}
