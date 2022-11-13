import java.util.Scanner;
import java.util.ArrayList;
public class ClaseIntroProg {
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    Scanner sc = new Scanner(System.in);
    Estudiante alumno;

    public void inicio(){
        boolean salir = false;
        System.out.println("Sistema para Clases de Introduccion a la Programacion");
        do {
            System.out.println("[1]. Registrar estudiante \n [2]. Retirar Estudiante \n [3]. Ingresar Notas \n [4]. Mostrar Lista \n [5]. Notas del Estudiante \n [6]. Salir");
            int seleccion = sc.nextInt();
            switch (seleccion){
                case 1:
                    System.out.println("Ingrese nombre y codigo de estudiante: ");
                    registrarEstudiate(sc.next(), sc.nextInt());    
                break;
                case 2:
                    System.out.println("ingrese el codigo del estudiante que desea retirar");
                    RetirarEstudiante(sc.nextInt());
                break;
                case 3:
                    System.out.println("Ingrese codigo del estudiante");
                    IngresarNotas(sc.nextInt());
                break;
                case 4:
                    MostarLista();
                break; 
                case 5:
                    System.out.println("ingrese el codigo del estudiante: ");
                    MostrarNotas(sc.nextInt());
                break; 
                case 6:
                    salir = true;
                break;
                default:
                System.out.println("ERROR");
                    break;
            }
            if(salir){
                break;
            }
        } while (true);
    }

    public void registrarEstudiate(String name, int CE){
        alumno = new Estudiante(name, CE);
        listaEstudiantes.add(alumno);
    }

    public void RetirarEstudiante(int codEst){
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if(codEst == listaEstudiantes.get(i).getCodigoEstudiante()){
                listaEstudiantes.remove(i);
            }
        }
        
    }

    public void IngresarNotas(int codEst){

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if(codEst == listaEstudiantes.get(i).getCodigoEstudiante()){
                System.out.println("Ingrese nota Primer Parcial");
                alumno.setNotaPP(sc.nextInt());
                System.out.println("Ingrese nota Segundo parcial");
                alumno.setNotaSP(sc.nextInt());
                System.out.println("Ingrese nota Examen Final");
                alumno.setNotaEF(sc.nextInt());
            }
        }

        
    }

    public void MostarLista(){
        int nroAP = 0; 
        int nroRP = 0;
        int mediaAP = 0;
        int mediaRP = 0;

        for (int i = 0; i < listaEstudiantes.size(); i++) {
            listaEstudiantes.get(i).NotaFinal();
            if(listaEstudiantes.get(i).getNotaFinal() >= 51 ){
                mediaAP = mediaAP + listaEstudiantes.get(i).getNotaFinal();
                nroAP++; 
            }else{
                mediaRP = mediaRP + listaEstudiantes.get(i).getNotaFinal();
                nroRP++;
            }
        }
        if(nroAP > 0 && nroRP > 0){
            mediaAP = mediaAP / nroAP;
            mediaRP = mediaRP / nroRP;
        }
        
        
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if (listaEstudiantes.get(i).getNotaFinal() >= 51 ) {
                System.out.println(i + 1 + ". " + listaEstudiantes.get(i).getNombre() + "\n Codigo de estudiante:  " + listaEstudiantes.get(i).getCodigoEstudiante() + "\n " + "Nota PP: " + listaEstudiantes.get(i).getNotaPP() + "\n Nota SP: " + listaEstudiantes.get(i).getNotaSP() + "\n Examen final: " + listaEstudiantes.get(i).getNotaEF() + "\n Promedio Final: " + listaEstudiantes.get(i).getNotaFinal() + "  APROBAD@");
            }else{
                System.out.println(i + 1 + ". " + listaEstudiantes.get(i).getNombre() + "\n Codigo de estudiante:  " + listaEstudiantes.get(i).getCodigoEstudiante() + "\n " + "Nota PP: " + listaEstudiantes.get(i).getNotaPP() + "\n Nota SP: " + listaEstudiantes.get(i).getNotaSP() + "\n Examen final: " + listaEstudiantes.get(i).getNotaEF() + "\n Promedio Final: " + listaEstudiantes.get(i).getNotaFinal() + "  REPROBAD@");
            }
        }
        System.out.println("Media de aprobados: " + mediaAP);
        System.out.println("Media de reprobados: " + mediaRP);
    }

    public void MostrarNotas(int codEst){
        for (int i = 0; i < listaEstudiantes.size(); i++) {
            if(codEst == listaEstudiantes.get(i).getCodigoEstudiante()){
                System.out.println(i + 1 + ". " + listaEstudiantes.get(i).getNombre() + "\n Codigo de estudiante:  " + listaEstudiantes.get(i).getCodigoEstudiante() + "\n " + "Nota PP: " + listaEstudiantes.get(i).getNotaPP() + "\n Nota SP: " + listaEstudiantes.get(i).getNotaSP() + "\n Examen final: " + listaEstudiantes.get(i).getNotaEF());
            }
        }
    }
}
