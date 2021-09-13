/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

import java.util.ArrayList;

/**
 *
 * @author Tomas
 */
public class Gestor {
    
    private ArrayList<listas> listaListas;
    
    public Gestor(){
        listaListas = new ArrayList<>();
    }
    
    public void agregarLista (listas nueva){
    listaListas.add(nueva);
        
    }
    //Metodo de memoria para listar y mostrar (metodo ventana set list tab)
    
    public Object[] listar() {    
    return listaListas.toArray();
    
    }
    
    public float Sumatoria1(){
    float s =0;
        for (listas listaLista : listaListas) {
            if (listaLista.getTipo() == 1 || listaLista.getTipo() == 4 )
                s += listaLista.getPresupuesto();
            
            
        }
   
    return s;
    }
    
    
    public String supera30() {
        String c = "";
        int acu = 0;
        for (listas listaLista : listaListas) {
            acu += listaLista.getCantDiasTrabajo();
        }
        if (acu > 30) {
            c = "La sumatoria de la duracion de todos los trabajos es mayor a 30 dias";
        } else {
            c = "La sumatoria de la duracion de todos los trabajos no es mayor a 30 dias";
        }

        return c;
    }
    
    public float PromedioDiario(){
    float prom = 0;
        for (listas listaLista : listaListas) {
            prom += listaLista.getPresupuesto() / listaLista.getCantDiasTrabajo();
            
        }
    
    
    
    
    
    return prom;
    
    
    }
    
    
    
    
    
    
    
}

