import Paquetes.Curso;
import Paquetes.Estudiante;
import Paquetes.GestorAcademico;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante(1, "Juan", "Alcachofa", "19/04/1990", "Inscrito");
        Estudiante estudiante2 = new Estudiante(2, "Armando", "Paredes", "21/02/1982", "Inscrito");

        Curso curso1 = new Curso(1, "Excel", "Curso de Excel avanzado", "10", "2.0");
        Curso curso2 = new Curso(2, "Programación", "Curso de SpringBoot", "20", "5.0");

        GestorAcademico serv = new GestorAcademico();

        try{
            serv.matricularEstudiante(estudiante1);
            serv.matricularEstudiante(estudiante2);
            System.out.println("Estudiantes matriculados");

            serv.agregarCurso(curso1);
            serv.agregarCurso(curso2);
            System.out.println("Cursos agregados");

            serv.inscribirEstudianteCurso(estudiante1, 1);
            serv.inscribirEstudianteCurso(estudiante1, 2);

            serv.inscribirEstudianteCurso(estudiante2, 1);
            serv.inscribirEstudianteCurso(estudiante2, 2);
            System.out.println("Estudiantes inscritos a cursos");

            serv.desinscribirEstudianteCurso(1, 2);
            System.out.println("Estudiante desinscrito de un curso");


        } catch(Exception e){
            System.out.println("Falla en el sistema de matriculación ");
            System.out.println("");
            e.printStackTrace();
        }
    }
}