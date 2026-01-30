package controller;

import model.Alumno;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.OptionalDouble;

public class Gestor {

    private ArrayList<Alumno> alumnos;
    private HashMap<String, Alumno> alumnosMap;

    public Gestor(){
        alumnos = new ArrayList<>();
        alumnosMap = new HashMap<>();
    }

    //AGREGAMOS ALUMNOS
    //solo se pueden agregar con un DNI que no esté ya en la lista.

    public void agregarAlumno(Alumno alumno){
     /* if(alumnosMap.containsKey(alumno.getDni())){
            System.out.println("No se puede agregar");
        } else {
            alumnosMap.put(alumno.getDni(), alumno);
            System.out.println("Agregado correctamente");
        }

        //El put retorna un null si lo puede agreggar.
        //El put retorna un ALUMNO si no lo puede agregar.
       /* if(alumnosMap.put(alumno.getDni(), alumno)==null){
            System.out.println("Agregado correctamente");
        } else{
            System.out.println("DNI Duplicado. Alu,no no agregado.");
        }*/

      /*  for (Alumno item: alumnos){
            if (item.getDni().equals(alumno.getDni())){
                System.out.println("No puedo");
                return;
            }
        }
        alumnos.add(alumno);*/


      if(alumnos.stream().anyMatch(item-> item.getDni().equals(alumno.getDni()))){
          System.out.println("El DNI está en la lista. No se puede agregar");
      }else{
          System.out.println("Usuario agregado con éxito.");
          alumnos.add(alumno);
      }
    }

    public void mostrarAlumno(){
        alumnos.forEach(Alumno::mostrarDatos);
    }

    public void calificarAlumno(){
        alumnos.forEach(item ->{
            if(item.getNota()==-1){
                item.setNota((int) (Math.random()*11));
            }
        });
    }

    public void calcularMedia(){
        //alumnos.stream().map(item->item.getNota()).forEach(item->acumulador+=item);
       //double media = alumnos.stream().mapToDouble(Alumno::getNota).sum()/alumnos.size();
        OptionalDouble media = alumnos.stream().mapToDouble(Alumno::getNota).average();
        System.out.println(media.getAsDouble());
    }

}
