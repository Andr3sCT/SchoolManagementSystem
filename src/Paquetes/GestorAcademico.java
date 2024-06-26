package Paquetes;

import Exceptions.EstudianteNoInscritoEnCursoException;
import Exceptions.EstudianteYaInscritoException;
import Interfaz.ServiciosAcademicosI;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class GestorAcademico implements ServiciosAcademicosI {
    private ArrayList<Estudiante> Estudiantes = new ArrayList<>();
    private ArrayList<Curso> Cursos = new ArrayList<>();
    private HashMap<Integer, ArrayList<Estudiante>> inscripciones;

    public GestorAcademico() {
        Estudiantes = new ArrayList<>();
        Cursos = new ArrayList<>();
        this.inscripciones = new HashMap<>();
    }

    @Override
    public void matricularEstudiante(Estudiante estudiante) throws Exception{
        for(Estudiante e : Estudiantes){
            if (e.getId() == estudiante.getId()){
                throw new Exception("El estudiante ya está matriculado");
            }
        }
        Estudiantes.add(estudiante);
    }

    @Override
    public void agregarCurso(Curso curso) throws Exception{
        for (Curso c : Cursos){
            if (c.getId() == curso.getId()){
                throw new Exception("El curso ya existe.");
            }
        }
            Cursos.add(curso);
inscripciones.put(curso.getId(), new ArrayList<>());
        }


    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException{
        if (!inscripciones.containsKey(idCurso)){
            throw new EstudianteYaInscritoException("El curso con ID " + idCurso + "no existe.");
        }

        ArrayList<Estudiante> Inscritos = inscripciones.get(idCurso);
        if (Inscritos.contains(estudiante)){
            throw new EstudianteYaInscritoException("El estudiante ya esta inscrito en este curso" );
        }

        Inscritos.add(estudiante);
    }

    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        if (!inscripciones.containsKey(idCurso)){
            throw new EstudianteNoInscritoEnCursoException("El curso con ID" + idCurso + "no existe.");
        }

        ArrayList<Estudiante> Inscritos = inscripciones.get(idCurso);
        boolean estudianteInscrito = false;
        for (Estudiante e : Inscritos){
            if (e.getId() == idEstudiante){
                Inscritos.remove(e);
                estudianteInscrito = true;
                break;
            }
        }

        if(!estudianteInscrito){
            throw new EstudianteNoInscritoEnCursoException("El estudiante no esta inscrito en este curso.");
        }
    }
}
