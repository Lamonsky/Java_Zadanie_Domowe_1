package com.mycompany.zadanie_domowe_1;

import java.util.concurrent.atomic.AtomicInteger;


public class Towar {

    private static final AtomicInteger count = new AtomicInteger(0);
    private int ID;    
    private String Nazwa;
    private double CenaNetto;
    private int StawkaVAT;
    private int Ilosc;

    public Towar(
            String Nazwa, 
            double CenaNetto, 
            int StawkaVAT, 
            int Ilosc){
        ID = count.incrementAndGet();
        this.Nazwa = Nazwa;
        this.CenaNetto = CenaNetto;
        this.StawkaVAT = StawkaVAT;
        this.Ilosc = Ilosc;
    }

    public Towar(){
        ID = count.incrementAndGet();
        this.Nazwa = "defaultNazwa";
        this.CenaNetto = 0;
        this.StawkaVAT = 23;
        this.Ilosc = 0;
    }
    
    public int getID(){
        return (int) this.ID;
    }
    
    public double getCenaNetto(){
        return (double) this.CenaNetto;
    }
    
    public void setCenaNetto(double nowaCena){
        this.CenaNetto = nowaCena;
    }
    
    public String getNazwa(){
        return this.Nazwa;
    }
    
    public void setNazwa(String Nazwa){
        this.Nazwa = Nazwa;
    }
    
    public int getStawkaVAT(){
        return (int) this.StawkaVAT;
    }
    public void setStawkaVAT(int nowaStawkaVAT){
        this.StawkaVAT = nowaStawkaVAT;
    }
    
    public int getIlosc(){
        return (int) this.Ilosc;
    }
    
    public void setIlosc(int nowaIlosc){
            this.Ilosc = nowaIlosc;
    }

    @Override
    public String toString() {
        return this.Nazwa;
    }


}
