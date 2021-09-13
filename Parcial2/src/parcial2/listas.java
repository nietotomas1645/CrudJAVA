/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial2;

/**
 *
 * @author Tomas
 */
public class listas {
    private int patente;
    private int tipo;
    private double presupuesto;
    private int CantDiasTrabajo;

    public listas(int patente, int tipo, double presupuesto, int CantDiasTrabajo) {
        this.patente = patente;
        this.tipo = tipo;
        this.presupuesto = presupuesto;
        this.CantDiasTrabajo = CantDiasTrabajo;
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public int getCantDiasTrabajo() {
        return CantDiasTrabajo;
    }

    public void setCantDiasTrabajo(int CantDiasTrabajo) {
        this.CantDiasTrabajo = CantDiasTrabajo;
    }
    
    public String Combo(){
    String c = "";
    switch(tipo)
    {
        case 1: c = "Mecanica Liviana";break;
        case 2: c = "electricidad";break;
        case 3: c = "Gomeria";break;
        case 4: c = "Mecanica Principal";break;
    }
   
    
    
    return c;
    
    }
    

    @Override
    public String toString() {
        return "listas{" + "patente=" + patente + ", tipo=" + Combo() + ", presupuesto=" + presupuesto + ", CantDiasTrabajo=" + CantDiasTrabajo + '}';
    }
    
    
    
}
