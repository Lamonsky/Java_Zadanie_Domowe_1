package com.mycompany.zadanie_domowe_1;

import javax.swing.*;
import java.awt.*;


public class Zadanie_Domowe_1 {
    JButton DodajZamowienie;
    JButton EdytujZamowienie;
    JButton UsunZamowienie;
    DefaultListModel<Zamowienie> model = new DefaultListModel<>();
    DefaultListModel<Towar> modeltowaru = new DefaultListModel<>();
    JPanel panel = new JPanel();
    JPanel paneltowarow = new JPanel();
    JSplitPane splitpane = new JSplitPane();
    JSplitPane splitpane2 = new JSplitPane();
    JList<Zamowienie> listazamowien = new JList<>();
    JList<Towar> listatowarow = new JList<>();
    JTextField nazwa = new JTextField();
    JTextField nazwakontrahenta = new JTextField();
    JTextField nazwatowaru = new JTextField();
    JTextField cenatowaru = new JTextField();
    JTextField stawkavat = new JTextField();
    JTextField ilosctowaru = new JTextField();
    public Zadanie_Domowe_1(){
        //Główne okno
        JFrame okno = new JFrame("Zamowienia");
        okno.setVisible(true);
        okno.setSize(800,600);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setLocationRelativeTo(null);
        okno.add(splitpane);
        //JList z listą zamówień
        listazamowien.setModel(model);
        splitpane.setLeftComponent(new JScrollPane(listazamowien));
        listazamowien.setSize(150,600);
        splitpane.setRightComponent(panel);
        nazwa.setSize(150,300);
        nazwakontrahenta.setSize(150,300);
        panel.setLayout(new GridLayout(3,2));
        panel.add(new JLabel("Nazwa: "));
        panel.add(nazwa);
        panel.add(new JLabel("Nazwa kontrahenta:"));
        panel.add(nazwakontrahenta);
        panel.add(new JLabel("Lista towarow: "));
        panel.setVisible(false);
        panel.add(splitpane2);
        listatowarow.setModel(modeltowaru);
        splitpane2.setLeftComponent(new JScrollPane(listatowarow));
        splitpane2.setRightComponent(paneltowarow);
        paneltowarow.setVisible(true);
        paneltowarow.setLayout(new GridLayout(2,2));
        paneltowarow.add(new JLabel("Nazwa towaru"));
        paneltowarow.add(nazwatowaru);
        paneltowarow.add(new JLabel("Cena netto towaru: "));
        paneltowarow.add(cenatowaru);
        paneltowarow.add(new JTextArea("Stawka VAT towaru: "));
        paneltowarow.add(stawkavat);
        paneltowarow.add(new JLabel("Ilość towaru: "));
        paneltowarow.add(ilosctowaru);

        listazamowien.getSelectionModel().addListSelectionListener(e -> {
            modeltowaru.removeAllElements();
            panel.setVisible(true);
            panel.setSize(650,600);
            Zamowienie z = listazamowien.getSelectedValue();
            nazwa.setText(z.getNazwa());
            nazwakontrahenta.setText(z.getNazwaKontrahenta());
            System.out.println(z.getListaTowarow().size());
            for(int i=0;i<z.getListaTowarow().size();i++){
                modeltowaru.addElement(z.getTowar(i));
                System.out.println(z.getTowar(i).getNazwa());
            }



        });
        listatowarow.getSelectionModel().addListSelectionListener(x ->{

            Towar t = listatowarow.getSelectedValue();
            nazwatowaru.setText(t.getNazwa());
            cenatowaru.setText(Double.toString(t.getCenaNetto()));
            stawkavat.setText(Integer.toString(t.getStawkaVAT()));
            ilosctowaru.setText(Integer.toString(t.getIlosc()));
        });

        Towar komputer = new Towar("Komputer", 3000.00, 23, 1);
        Towar drukarka = new Towar("Drukarka", 1000.00, 23, 1);
        Zamowienie uczelnia = new Zamowienie("Uczelnia", "WSB", 1);
        Zamowienie bank = new Zamowienie("Bank", "PKO", 2 );
        uczelnia.DodajTowar(komputer);
        bank.DodajTowar(drukarka);
                //Zamówienia
        model.addElement(uczelnia);
        model.addElement(bank);


        //Towary
    }




    public static void main(String[] args) {

        SwingUtilities.invokeLater(Zadanie_Domowe_1::new);
        
    }
}
