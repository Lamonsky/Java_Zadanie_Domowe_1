//package com.mycompany.zadanie_domowe_1;
//
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import javax.swing.*;
//
//
//public class Okno {
//    private JButton DodajZamowienie;
//    private JButton EdytujZamowienie;
//    private JButton UsunZamowienie;
//    DefaultListModel<Zamowienie> model = new DefaultListModel<Zamowienie>();
//    JPanel panel = new JPanel();
//    JSplitPane splitpane = new JSplitPane();
//    JList<Zamowienie> listazamowien = new JList<>();
//    JLabel label = new JLabel();
//    public Okno(){
//        JFrame okno = new JFrame("Zamowienia");
//        okno.setVisible(true);
//        okno.setSize(400,300);
//        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//        okno.setLocationRelativeTo(null);
//        listazamowien.setModel(model);
//        splitpane.setLeftComponent(new JScrollPane(listazamowien));
//        panel.add(label);
//        splitpane.setRightComponent(panel);
//        okno.add(splitpane);
//
//        model.addElement(new Zamowienie("Uczelnia", "WSB", 1 , new Towar("Komputer", 3000.00, 23, 1)));
//    }
//
//
//}
