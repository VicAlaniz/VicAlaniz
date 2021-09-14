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
public abstract class Personaje {
    protected Position ubicacion;
    protected String nick;
    protected int vidas=3;
    protected int energia=100;
    protected char orientacion='N';

    public Personaje(Position ubicacion, String nick) {
        this.ubicacion = ubicacion;
        this.nick = nick;
    }

    public Position getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Position ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public char getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(char orientacion) {
        this.orientacion = orientacion;
    }
    
    public void disparar() {
        if (energia>=10) {
        energia -= 10;
        }
        else {
            System.out.println("Cargame, me quedé sin energía");
        }
    }
    
    public void girar() {
        switch (getOrientacion()) {
            case 'N':
                orientacion = 'E';
                System.out.println("Estoy mirando al Este");
                break;
            case 'E':
                orientacion = 'S';
                System.out.println("Estoy mirando al Sur");
                break;
            case 'S':
                orientacion = 'O';
                System.out.println("Estoy mirando al Oeste");
                break;
            case 'O':
                orientacion = 'N';
                System.out.println("Volvi a mirar al Norte");
                break;
            default:
                break;
        }
    }
    
    public void avanzar() {
        if (energia > 10){
        switch (getOrientacion()) {
            case 'N':
                ubicacion.setY(ubicacion.getY()-1);
                break;
            case 'S':
                ubicacion.setY(ubicacion.getY()+1);
                break;
            case 'E':
                ubicacion.setX(ubicacion.getX()+1);
                break;
            case 'O':
                ubicacion.setX(ubicacion.getX()-1);
                break;
            default:
                break;
        }
        }
        else {System.out.println("No puedo avanzar, no tengo energia");}
    }
}
