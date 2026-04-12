package controller;

import model.Grupo;
import model.Usuario;

public class GruposController {


    //El usuario pertenece a un grupo?

    public boolean pertenece (Grupo grupo, Usuario usuario){

        if (grupo.getUsuarios().contains(usuario)) {
            return true;
        } else {
            for (Grupo subgrupo : grupo.getSubGrupos()){
                return pertenece(subgrupo, usuario);
            }
        }
        return false;
    }

}
