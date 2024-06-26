package Interfaz;

import Exceptions.EstudianteNoInscritoEnCursoException;
import Exceptions.EstudianteYaInscritoException;
import Paquetes.Estudiante;
import Paquetes.Curso;

public interface ServiciosAcademicosI {
    void matricularEstudiante(Estudiante estudiante) throws Exception;

    void agregarCurso(Curso curso) throws Exception;

    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException;

    void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException;
}
