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
public class Guerrero extends Personaje {
    
    private boolean caballo;

    public Guerrero(boolean caballo, Position ubicacion, String nick) {
        super(ubicacion, nick);
        this.caballo = caballo;
    }

    public boolean isCaballo() {
        return caballo;
    }

    public void setCaballo(boolean caballo) {
        this.caballo = caballo;
    }
    
    @Override
    public void avanzar() {
        if (caballo) {
            switch (getOrientacion()) {
               case 'N':
                ubicacion.setY(ubicacion.getY()-10);
                break;
                case 'S':
                ubicacion.setY(ubicacion.getY()+10);
                break;
                case 'E':
                ubicacion.setX(ubicacion.getX()+10);
                break;
                case 'O':
                ubicacion.setX(ubicacion.getX()-10);
                break;
                default:
                    break;
            }
        } else {
            super.avanzar();
        }   
         }
    
    @Override
    public void disparar() {
       super.disparar();
       if (energia<30){
           caballo=false;
           System.out.println("No tengo mas caballo, comprame otro que estoy triste");
       }
    }
        
}
