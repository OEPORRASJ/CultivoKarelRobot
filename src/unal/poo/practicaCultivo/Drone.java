
package unal.poo.practicaCultivo;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;


public abstract class Drone extends Robot {
    protected String icono;
    
    abstract public void consumirEnergia();

    public Drone(String icono, City city, int i, int i1, Direction drctn, int i2) {
        super(city, i, i1, drctn, i2);
        this.icono = icono;
    }
    
    public int medirDistancia(int posX, int posY){
        return 1;
    }
    
    public void cargarEnergia(){
        
    }
    
    public void irZonaCarga(){
        
    }
    
    
    
    
}
