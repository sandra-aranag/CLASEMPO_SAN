package model;

import java.util.HashSet;
import java.util.Set;

public class Grupo {

    private String nombre;
    private Set<Usuario>  usuarios;
    private Set<Grupo> subGrupos;

    //El Set<> parecido a un ArrayList, pero no puedes meter un usuario con los mismos valores

    public Grupo() {

        usuarios = new HashSet<>();
        subGrupos = new HashSet<>();

    }

    public Grupo(String nombre) {
        this.nombre = nombre;
        usuarios = new HashSet<>();
        subGrupos = new HashSet<>();
    }

    public void addUsuario(Usuario u){
        this.usuarios.add(u);
    }

    public void addSubGrupo(Grupo grupo){
        subGrupos.add(grupo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Set<Grupo> getSubGrupos() {
        return subGrupos;
    }

    public void setSubGrupos(Set<Grupo> subGrupos) {
        this.subGrupos = subGrupos;
    }


}
