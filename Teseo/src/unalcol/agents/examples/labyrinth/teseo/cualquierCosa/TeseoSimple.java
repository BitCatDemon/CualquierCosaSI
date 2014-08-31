/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package unalcol.agents.examples.labyrinth.teseo.cualquierCosa;

import unalcol.agents.examples.labyrinth.teseo.simple.*;

/**
 *
 * @author Jonatan
 */
public class TeseoSimple extends CualquierCosaAgentProgram {
    enum cardinales {NORTE ,SUR, IZQUIERDA, DERECHA}
    private cardinales orientacion = cardinales.NORTE;
    private void rotate(){
        if( this.orientacion == cardinales.NORTE){
            this.orientacion = cardinales.DERECHA;
        }else if (orientacion == cardinales.DERECHA){
            orientacion = cardinales.SUR;
        }else if (orientacion == cardinales.SUR){
            orientacion = cardinales.IZQUIERDA;
        }else{
            orientacion = cardinales.NORTE;
        }
        System.out.println(orientacion);
    }
    public TeseoSimple() {}
    @Override
    public int accion(boolean PF, boolean PD, boolean PA, boolean PI, boolean MT) {
        if (MT) return -1;
        if (!PI){ 
            rotate();
            return 3;
        }
        if (!PF) return 0;
        if (!PD) return 1;
        return 2;
    }   
}
