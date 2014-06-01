/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package beadando;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.sql.SQLException;
import java.util.ArrayList;
import javafx.beans.binding.Bindings;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import machine.KaloriatablaDDD;
import machine.KaloriatablaDDDImpl;

/**
 *
 * @author zbocskay
 */
public class KaloriaSzamlalo extends javax.swing.JFrame {
    private static Component frame;

    /**
     * Creates new form KaloriaSzamlalo
     */
    public KaloriaSzamlalo() {
        initComponents();
        setLocationRelativeTo(null); 

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nevText = new javax.swing.JFrame();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nevSaveText = new javax.swing.JTextField();
        kaloriaText = new javax.swing.JTextField();
        feherjeText = new javax.swing.JTextField();
        szenhidratText = new javax.swing.JTextField();
        saveKaja = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        reggel = new javax.swing.JLabel();
        del = new javax.swing.JLabel();
        este = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        countButton = new javax.swing.JButton();
        saveButtonCounted = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        grammReggelField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        grammDelField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        grammEsteField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        kaloriaCountOutput = new javax.swing.JTextField();
        feherjeCountOutput = new javax.swing.JTextField();
        szenhidratCoutnOutput = new javax.swing.JTextField();
        sulyCountOutput = new javax.swing.JTextField();
        addKaja = new javax.swing.JButton();
        dateInput = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        listKaja = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        kajaLista = new javax.swing.JTextArea();

        nevText.setTitle("Új kaja felvétele");
        nevText.setResizable(false);

        jLabel10.setText("Név");

        jLabel11.setText("Kalória");

        jLabel12.setText("Fehérje");

        jLabel13.setText("Szénhidrát");

        saveKaja.setText("Mentés");
        saveKaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveKajaActionPerformed(evt);
            }
        });

        jLabel14.setText("100g - ban");

        javax.swing.GroupLayout nevTextLayout = new javax.swing.GroupLayout(nevText.getContentPane());
        nevText.getContentPane().setLayout(nevTextLayout);
        nevTextLayout.setHorizontalGroup(
            nevTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nevTextLayout.createSequentialGroup()
                .addGroup(nevTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nevTextLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(saveKaja, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nevTextLayout.createSequentialGroup()
                        .addGroup(nevTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(nevTextLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                            .addGroup(nevTextLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nevSaveText)
                                .addGap(18, 18, 18)))
                        .addGroup(nevTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(nevTextLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97))
                            .addGroup(nevTextLayout.createSequentialGroup()
                                .addComponent(kaloriaText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(feherjeText, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(szenhidratText, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        nevTextLayout.setVerticalGroup(
            nevTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nevTextLayout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(nevTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(nevTextLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(szenhidratText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feherjeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kaloriaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nevSaveText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(saveKaja)
                .addGap(50, 50, 50))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kalóriaszámláló");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        reggel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        reggel.setText("Reggel");

        del.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        del.setText("Délben");

        este.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        este.setText("Este");

        KaloriatablaDDD dao = new KaloriatablaDDDImpl();
        ArrayList<Kaja> kajak;
        kajak = dao.getKajak();
        DefaultListModel model = new DefaultListModel();
        for ( Kaja nev:kajak){
            model.addElement(nev.getNev());
        }
        jList1.setModel(model);
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(model);
        jScrollPane2.setViewportView(jList2);

        jList3.setModel(model);
        jScrollPane3.setViewportView(jList3);

        countButton.setText("Mentés");
        countButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countButtonActionPerformed(evt);
            }
        });

        saveButtonCounted.setText("Számol");
        saveButtonCounted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonCountedActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kalória:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Fehérje:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Szénhidrát:");

        jLabel4.setText("Mennyiség:");

        jLabel5.setText("gramm");

        jLabel6.setText("gramm");

        jLabel7.setText("gramm");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Súly:");

        addKaja.setText("Kajafelvétel");
        addKaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addKajaActionPerformed(evt);
            }
        });

        jLabel9.setText("Dátum:");

        listKaja.setText("Listázás");
        listKaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listKajaActionPerformed(evt);
            }
        });

        kajaLista.setColumns(20);
        kajaLista.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        kajaLista.setRows(5);
        jScrollPane4.setViewportView(kajaLista);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane4)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(reggel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(grammReggelField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addComponent(este, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(grammDelField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(grammEsteField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(countButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(saveButtonCounted, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(kaloriaCountOutput))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(feherjeCountOutput))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(szenhidratCoutnOutput))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sulyCountOutput))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addKaja, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(listKaja, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(del)
                            .addComponent(este)))
                    .addComponent(reggel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grammReggelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(grammDelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(grammEsteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(countButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveButtonCounted, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kaloriaCountOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(feherjeCountOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(szenhidratCoutnOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sulyCountOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addKaja, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(dateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(listKaja))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void countButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countButtonActionPerformed
        ArrayList<Kaja> val;
        KaloriatablaDDD dao = new KaloriatablaDDDImpl();
        val = dao.getKajak();
        for ( Kaja kaj:val){
            if( kaj.getNev().equals((String) jList1.getSelectedValue()) && tryParse(grammReggelField.getText()) > 0 ){
                Kapcsolo kapcs;
                kapcs = new Kapcsolo(dao.getKajabyazon(kaj.getId(),tryParse(grammReggelField.getText()) ), dao.getNapszak(1), tryParse(grammReggelField.getText()));
                System.out.println(kapcs.toString());
                dao.setKajabyDate(kapcs);
            }
            if( kaj.getNev().equals((String) jList2.getSelectedValue()) && tryParse(grammDelField.getText()) > 0 ){
                Kapcsolo kapcs;
                kapcs = new Kapcsolo(dao.getKajabyazon(kaj.getId(),tryParse(grammDelField.getText()) ), dao.getNapszak(2), tryParse(grammDelField.getText()));
                System.out.println(kapcs.toString());
                dao.setKajabyDate(kapcs);
            }
            if( kaj.getNev().equals((String) jList3.getSelectedValue()) && tryParse(grammEsteField.getText()) > 0){
                Kapcsolo kapcs;
                kapcs = new Kapcsolo(dao.getKajabyazon(kaj.getId(),tryParse(grammEsteField.getText()) ), dao.getNapszak(3), tryParse(grammEsteField.getText()));
                System.out.println(kapcs.toString());
                dao.setKajabyDate(kapcs);
            }
            
        }
        JOptionPane.showMessageDialog(frame, "Lementve az adatbázisba!", "Mentés",JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_countButtonActionPerformed

    private void saveButtonCountedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonCountedActionPerformed
        ArrayList<Kaja> val;
        KaloriatablaDDD dao = new KaloriatablaDDDImpl();
        val = dao.getKajak();
        float osszkal = 0;
        float osszfeh = 0;
        float osszsze = 0;
        for ( Kaja kaj:val){
            if( kaj.getNev().equals((String) jList1.getSelectedValue())){
                osszkal += kaj.getKaloria()*tryParse(grammReggelField.getText())/100;
                osszfeh += kaj.getFeherje()*tryParse(grammReggelField.getText())/100;
                osszsze += kaj.getSzenhidrat()*tryParse(grammReggelField.getText())/100;
            }
            if( kaj.getNev().equals((String) jList2.getSelectedValue())){
                osszkal += kaj.getKaloria()*tryParse(grammDelField.getText())/100;
                osszfeh += kaj.getFeherje()*tryParse(grammDelField.getText())/100;
                osszsze += kaj.getSzenhidrat()*tryParse(grammDelField.getText())/100;
            }
            if( kaj.getNev().equals((String) jList3.getSelectedValue())){
                osszkal += kaj.getKaloria()*tryParse(grammEsteField.getText())/100;
                osszfeh += kaj.getFeherje()*tryParse(grammEsteField.getText())/100;
                osszsze += kaj.getSzenhidrat()*tryParse(grammEsteField.getText())/100;
            }
            kaloriaCountOutput.setText(Float.toString(osszkal));
            feherjeCountOutput.setText(Float.toString(osszfeh));
            szenhidratCoutnOutput.setText(Float.toString(osszsze));
            sulyCountOutput.setText(Float.toString(tryParse(grammReggelField.getText())+tryParse(grammDelField.getText())+tryParse(grammEsteField.getText())));
            
        }
    }//GEN-LAST:event_saveButtonCountedActionPerformed

    private void listKajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listKajaActionPerformed
        KaloriatablaDDD dao = new KaloriatablaDDDImpl();
        String kajak = dao.getKajabyDate(dateInput.getText());
        
        kajaLista.setEditable(false);
        kajaLista.setText(kajak);

    }//GEN-LAST:event_listKajaActionPerformed

    private void addKajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addKajaActionPerformed
 //       JFrame frames = new JFrame("Button Sample");
        nevText.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        nevText.setSize(500, 150);
        nevText.setResizable(false);
        nevText.setVisible(true);
        nevText.setLocationRelativeTo(null);


        
    }//GEN-LAST:event_addKajaActionPerformed

    private void saveKajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveKajaActionPerformed
        KaloriatablaDDD dao = new KaloriatablaDDDImpl();
        Kaja kaj = new Kaja(nevSaveText.getText(), tryParse(kaloriaText.getText()),tryParse(feherjeText.getText()), tryParse(szenhidratText.getText()));
        dao.saveKaja(kaj);
        JOptionPane.showMessageDialog(frame, "Lementve az adatbázisba!", "Mentés",JOptionPane.INFORMATION_MESSAGE);
        nevSaveText.setText("");
        kaloriaText.setText("");
        feherjeText.setText("");
        szenhidratText.setText("");
    }//GEN-LAST:event_saveKajaActionPerformed
public static Integer tryParse(String text) {
  try {
      if(text.isEmpty()){
          return 0;
      }else
    return new Integer(text);
  } 
  catch (NumberFormatException e) {
      JOptionPane.showMessageDialog(frame, "Hibás érték, adjon meg egy számot!", "Hiba",JOptionPane.ERROR_MESSAGE); 
    return null;}
  }

    /**
     * @param args the command line arguments
     */


    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KaloriaSzamlalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KaloriaSzamlalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KaloriaSzamlalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KaloriaSzamlalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KaloriaSzamlalo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addKaja;
    private javax.swing.JButton countButton;
    private javax.swing.JTextField dateInput;
    private javax.swing.JLabel del;
    private javax.swing.JLabel este;
    private javax.swing.JTextField feherjeCountOutput;
    private javax.swing.JTextField feherjeText;
    private javax.swing.JTextField grammDelField;
    private javax.swing.JTextField grammEsteField;
    private javax.swing.JTextField grammReggelField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea kajaLista;
    private javax.swing.JTextField kaloriaCountOutput;
    private javax.swing.JTextField kaloriaText;
    private javax.swing.JButton listKaja;
    private javax.swing.JTextField nevSaveText;
    private javax.swing.JFrame nevText;
    private javax.swing.JLabel reggel;
    private javax.swing.JButton saveButtonCounted;
    private javax.swing.JButton saveKaja;
    private javax.swing.JTextField sulyCountOutput;
    private javax.swing.JTextField szenhidratCoutnOutput;
    private javax.swing.JTextField szenhidratText;
    // End of variables declaration//GEN-END:variables
}
