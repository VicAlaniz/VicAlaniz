/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testherencia;

/**
 *
 * @author Administrador
 */
public class TestHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Position Ub = new Position (100, 200);
        Guerrero T = new Guerrero(true,Ub, "Thor");
        T.girar();
        T.girar();
        T.girar();
        System.out.println("Mi ubicacion es hacia el: "+T.orientacion);
        T.avanzar();
        T.avanzar();
        T.avanzar();
        T.avanzar();
        T.avanzar();
        T.disparar();
        T.disparar();
        T.disparar();
        T.disparar();
        T.disparar();
        T.disparar();
        T.disparar();
        T.disparar();
        System.out.println("Mi posición es: "+T.getUbicacion().getX()+" "+T.getUbicacion().getY());
        System.out.println("Tengo esto de energia: "+T.getEnergia());
        T.avanzar();
        T.avanzar();
        T.avanzar();
        T.disparar();
        T.disparar();
        T.avanzar();
        T.girar();
        System.out.println("Mi ubicacion es hacia el: "+T.orientacion);
// TODO code application logic here
    }
    
}
