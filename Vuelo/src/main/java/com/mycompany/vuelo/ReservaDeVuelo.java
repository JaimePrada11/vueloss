
package com.mycompany.vuelo;

public class ReservaDeVuelo extends TiposDeVuelo  {
    
    // Atributos
    protected String origen;
    protected String destino;
    protected int distancia;
    protected int tiempo;
    protected int total;
    
    
    // Constructores
    public ReservaDeVuelo(int costo, String origen, String destino, int distancia, int tiempo, int total) {
        super(costo);
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.total = total;
    }


    public ReservaDeVuelo(int costo, String origen, String destino, int distancia, int tiempo) {
        super(costo);
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
        this.tiempo = tiempo;
    }

    public ReservaDeVuelo() {
    }

    
   

    
    // Getters  y Setters
    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        if(distancia <0 ){
            this.distancia = 0 ;
        }else {
            this.distancia = distancia;

        }
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        if(distancia <0 ){
            this.tiempo = 0 ;
        }else {
            this.tiempo = tiempo;

        }
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    
    // Metodos


    @Override
    public String toString() {
        return "ReservaDeVuelo{" + "origen=" + origen + ", destino=" + destino + ", distancia=" + distancia + ", tiempo=" + tiempo + '}';
    }

    public int cobrar(){
        return total = super.costo * tiempo;
    }

   
    

   
    
    
}
