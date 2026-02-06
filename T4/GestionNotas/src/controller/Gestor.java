package controller;

import model.Alumno;

import java.util.*;
import java.util.function.BiPredicate;

public class Gestor {

    private List<Alumno> alumnos;
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

    //El número de usuarios que han aprobado

    public long getNumeroAprobados() {
        //recorro, pregunto, incremento
        /*int nAP=0;*/
        /*for (Alumno alumno: alumnos) {
            if (alumno.getNota()>=5){
                nAP++;
            }
        }
        return nAP;*/

       return alumnos.stream().filter(item -> item.getNota() > 4).count();

    }

    public ArrayList<Alumno> getAprobados(){
        //recorrro, pregunto y añadi list
        return (ArrayList<Alumno>) alumnos.stream()
                .filter(item->item.getNota()>=5).toList();
    }

    public Optional<Alumno> getAlumnoByDni(String dni){

        return alumnos.stream().filter(item->item.getDni().equals(dni)).findFirst();
    }

    public void ordenarNotas(){
       alumnos = alumnos.stream().sorted(Comparator.comparingInt(Alumno::getNota)).toList();
    }

    public void getAlumnosUmbral(int nota){
        alumnos.stream().filter(item-> item.getNota()>=nota).forEach(Alumno::mostrarDatos);
    }

    public void getAlumnosUmbral(BiPredicate<Alumno, Integer> predicate, int nota){
        alumnos.stream().filter(item->predicate.test(item,nota)).forEach(Alumno::mostrarDatos);
    }


}
