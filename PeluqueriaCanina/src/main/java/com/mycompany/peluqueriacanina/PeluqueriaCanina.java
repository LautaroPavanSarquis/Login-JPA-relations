/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.peluqueriacanina;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logica.*;
import persistencia.persistenceController;

/**
 *
 * @author Lauti
 */
public class PeluqueriaCanina {

    public static void main(String[] args) {
        
        
        persistenceController controladora = new persistenceController();
        
        //Creo las listas xq sino no puedo crear los dueños        
        LinkedList<Mascota> Mascotas01 = new LinkedList();
        
        LinkedList<Mascota> Mascotas02 = new LinkedList();
        
        
        //Creo los dueños sin persistir 
        Dueño dueño01= new Dueño( "Pepe", "Piparo",123456789,"Av. Siempre Viva 742",Mascotas01);
        
        
        Dueño dueño02= new Dueño( "Lola", "Lopez",789456123,"Calle falsa 123",Mascotas02);;
        
        
        
        //Creo las mascotas y seteo los dueños sin persistir         
        Mascota masco1 = new Mascota("Firulais","Caniche","Blanco",false,false,dueño01);

        Mascota masco2 = new Mascota("Toby","Labrador","Negro",false,true,dueño01);

        Mascota masco3 = new Mascota("Luna","Ovejero","Marrón",true,false,dueño02);
        
                    
        //Agrego las mascotas a las listas correspondientes
        Mascotas01.add(masco1);
        Mascotas01.add(masco2);
        Mascotas02.add(masco3);
        
        
        //Persistir TODO
        controladora.crearDueño(dueño01);
        controladora.crearDueño(dueño02);

        System.out.println("Hello World!");
        
        
    }
}
