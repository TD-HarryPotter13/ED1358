/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasadt1358;

import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;

/**
 *
 * @author estra
 */
public class ListasADT1358 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Brandon"));
        lsl.append(new String("Imanol"));
        lsl.append(new String("Herelyn"));
        lsl.append("Sarai");
        lsl.transversal();
        
        LinkedListADT lsl2 = new LinkedListADT();
        //Objetos del tipo empleado
        lsl2.append(new Empleado(1, "Brandon", "Estrada", "Romaña", 5000f, 2018, 9));
        lsl2.append(new Empleado(2, "Imanol", "Solano", "Soriano", 5000f, 2020, 8));
        lsl2.append(new Empleado(3, "Herelyn", "Corona", "Estrada", 6500f, 2017, 3));
        lsl2.append(new Empleado(4, "Sarai", "Rogel", "Cornejo", 7000f, 2019, 2));
        
        lsl2.transversal();
    }
    
}
