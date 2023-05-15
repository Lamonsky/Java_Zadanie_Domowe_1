package com.mycompany.zadanie_domowe_1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.ArrayList;


public class Zamowienie extends Towar{
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int ID;
    private String Nazwa;
    private String NazwaKontrahenta;
    private int PozycjaNaLiscie;
    private ArrayList<Towar> ListaTowarow;
    public Zamowienie(
            String Nazwa,
            String NazwaKontrahenta,
            int PozycjaNaLiscie){
        this.ID = count.incrementAndGet();
        this.Nazwa = Nazwa;
        this.NazwaKontrahenta = NazwaKontrahenta;
        this.PozycjaNaLiscie = PozycjaNaLiscie;
        this.ListaTowarow = new ArrayList<Towar>();
    }

    public Zamowienie(){
        this.ID = count.incrementAndGet();
        this.Nazwa = "defaultNazwa";
        this.NazwaKontrahenta = "defaultNazwaKontrahenta";
        this.PozycjaNaLiscie = 0;
        this.ListaTowarow = new ArrayList<Towar>();
    }

    public void DodajTowar(Towar t){
        this.ListaTowarow.add(t);
    }
    public int getcount(){
        return Zamowienie.count.get();
    }
    
    public int getID(){
        return this.ID;
    }
    
    public String getNazwa(){
        return this.Nazwa;
    }
    
    public void setNazwa(String nowaNazwa){
        this.Nazwa = nowaNazwa;
    }
    
    public String getNazwaKontrahenta(){
        return this.NazwaKontrahenta;
    }
    
    public void setNazwaKontrahenta(String nowaNazwaKontrahenta){
        this.NazwaKontrahenta = nowaNazwaKontrahenta;
    }
    
    public int getPozycjaNaLiscie(){
        return this.PozycjaNaLiscie;
    }
    
    public void setPozycjaNaLiscie(int nowaPozycjaNaLiscie){
        this.PozycjaNaLiscie = nowaPozycjaNaLiscie;
    }
    
    public Towar getTowar(int i){
        return ListaTowarow.get(i);
    }

    public ArrayList<Towar> getListaTowarow(){
        return this.ListaTowarow;
    }

    @Override
    public String toString() {
        return this.Nazwa;
    }

}
