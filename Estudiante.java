public class Estudiante{
    private String nombre;
    private int codigoEstudiante;
    private int notaPP;
    private int notaSP;
    private int notaEF;
    private int NotaFinal;
    
    public Estudiante(String name, int CE) {
        nombre = name;
        codigoEstudiante = CE;
    }

    public void NotaFinal(){
        NotaFinal = ((notaPP + notaSP + notaEF)/3);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(int codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public int getNotaPP() {
        return notaPP;
    }

    public void setNotaPP(int notaPP) {
        this.notaPP = notaPP;
    }

    public int getNotaSP() {
        return notaSP;
    }

    public void setNotaSP(int notaSP) {
        this.notaSP = notaSP;
    }

    public int getNotaEF() {
        return notaEF;
    }

    public void setNotaEF(int notaEF) {
        this.notaEF = notaEF;
    }

    public int getNotaFinal() {
        return NotaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        NotaFinal = notaFinal;
    }   
        
}