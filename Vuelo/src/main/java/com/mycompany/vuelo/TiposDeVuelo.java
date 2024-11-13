
package com.mycompany.vuelo;


public abstract class TiposDeVuelo {
    
    protected int costo;

    public TiposDeVuelo(int costo) {
        this.costo = costo;
    }

    public TiposDeVuelo() {
    }
    

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }



  
}
