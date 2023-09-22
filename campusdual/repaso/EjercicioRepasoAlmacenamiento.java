package com.campusdual.repaso;

import com.campusdual.Utils;

public class EjercicioRepasoAlmacenamiento {

    /*Crear un programa que sea una agenda
    * La agenda contendrá una serie de personas que tendrá información sobre ellas:
    * nombre, apellido, ciudad, CP, y listas de teléfonos.
    * De tal manera que una persona tenga un teléfono móvil o un teléfono fijo, dos teléfonos móviles, cinco
    * teléfonos móviles, etc. Uno de esos teléfonos tiene que ser el teléfono principal.
    * La agenda tiene que tener métodos para añadir, eliminar, listar su contenido.
    * La persona podrá llamar a otra persona de la agenda (a su número principal)
    * Las personas tendrán que tener un DNI.
    * */

    public static void main(String[] args) {
//        Contact p1 = new Contact("Pepito","Pepitez", "A Coruña",15008,"11111111Y");
//        p1.addNumber("668541299");
//        Contact p2 = new Contact("Abel","Caballero", "Viva Vigo",36208,"11111111B");
//        p2.addNumber("658412779");
//
//        p1.callPerson(p2);

        Agenda agenda1 = new Agenda();
        Contact c = new Contact();
        c.addNumber(Utils.string("Introduce número de teléfono: "));
        agenda1.addContact(c);
    }

}
