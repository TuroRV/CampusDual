package com.campusdual.repaso;


/*Crear un programa que sea una agenda
 * La agenda contendrá una serie de personas que tendrá información sobre ellas:
 * nombre, apellido, ciudad, CP, y listas de teléfonos.
 * De tal manera que una persona tenga un teléfono móvil o un teléfono fijo, dos teléfonos móviles, cinco
 * teléfonos móviles, etc. Uno de esos teléfonos tiene que ser el teléfono principal.
 * La agenda tiene que tener métodos para añadir, eliminar, listar su contenido.
 * La persona podrá llamar a otra persona de la agenda (a su número principal)
 * Las personas tendrán que tener un DNI.
 * */

import java.util.HashMap;
import java.util.Map;

public class Agenda {

private Map<String,Contact> contactMap = new HashMap<>();

    public Agenda() {
    }

    public Map<String, Contact> getContactMap() {
        return contactMap;
    }

    public void setContactMap(Map<String, Contact> contactMap) {
        this.contactMap = contactMap;
    }

    public void addContact(Contact c){
        this.getContactMap().put(c.getDni(),c);
    }

    public void removeContact(String dni){
        this.getContactMap().remove(dni);
    }



}

