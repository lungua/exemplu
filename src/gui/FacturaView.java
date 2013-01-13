
package gui;

import drepturiAcces.Acces;
import ent.Clienti;
import ent.Comenzi;
import ent.Materiale;
import ent.MaterialeComanda;
import ent.Salariati;
import java.awt.event.ItemEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class FacturaView extends javax.swing.JPanel {

    Comenzi[] comenziArray;
    List<Comenzi> comenziList;
    Comenzi comanda;
    int man_ora = 95;
    int valMateriale = 0;
    SimpleDateFormat formatter;
    public Salariati wsal;


    public FacturaView(java.awt.Frame parent, boolean modal, Salariati wsal) {
        // super(parent, modal);
        this.wsal = wsal;
        initComponents();
        this.wsal = wsal;
        Acces ac = new Acces(wsal.getTip());

        if (!ac.fc_accesSalariatiView(wsal.getTip())) {  //verifica daca utilizatorul are drepturi pt. acest modul
            JOptionPane.showMessageDialog(this, "Nu aveti drepturi pentru aceasta optiune..");
             this.disable();
            //System.exit(0);
        }
        formatter = new SimpleDateFormat("dd.MM.yyyy");
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        em = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ComputerServicePU").createEntityManager();
        clientiQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT c FROM Clienti c");
        clientiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientiQuery.getResultList();
        materialeQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT m FROM Materiale m");
        materialeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : materialeQuery.getResultList();
        materialeComandaQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT m FROM MaterialeComanda m");
        materialeComandaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : materialeComandaQuery.getResultList();
        salariatiQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT s FROM Salariati s");
        salariatiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : salariatiQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtNrFact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jCboClient = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListComanda = new javax.swing.JList();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtOre = new javax.swing.JTextField();
        jTxtValManopera = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTxtManopera_Ora = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTxtDataFact1 = new javax.swing.JFormattedTextField(new SimpleDateFormat("dd.MM.yyyy"));
        jButtFacturare = new javax.swing.JButton();
        jButtSalv = new javax.swing.JButton();
        jTxtDataFact3 = new javax.swing.JFormattedTextField(new SimpleDateFormat("dd.MM.yyyy"));

       // setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("SC ComputerService SRL");

        jLabel2.setText("Strada Bujorului nr 15 Bucuresti");

        jLabel3.setText("Nr.Fact.");

        jTxtNrFact.setEnabled(false);

        jLabel4.setText("Data Factura");

        jLabel5.setText("Client");

        jLabel6.setText("Adresa");

        jTextField3.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jCboClient, org.jdesktop.beansbinding.ELProperty.create("${selectedItem.nume}"), jTextField3, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel7.setText("Telefon");

        jTextField4.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jCboClient, org.jdesktop.beansbinding.ELProperty.create("${selectedItem.adresa}"), jTextField4, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTextField5.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jCboClient, org.jdesktop.beansbinding.ELProperty.create("${selectedItem.telefon}"), jTextField5, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Produs", "Pret Unitar", "Cantitate", "Valoare Totala"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientiList, jCboClient);
        bindingGroup.addBinding(jComboBoxBinding);

        jCboClient.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboClientItemStateChanged(evt);
            }
        });

        jLabel8.setText("Selecteaza client");

        jListComanda.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListComandaValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jListComanda);

        jLabel9.setText("Selecteaza comanda");

        jLabel11.setText("Total timp de lucru[ore]");

        jLabel12.setText("Total Valoare Manopera");

        jTxtOre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTxtOreFocusLost(evt);
            }
        });

        jLabel10.setText("Tarif manopera/ora");

        jLabel13.setText("Data facturare");

        jButtFacturare.setText("Facturare");
        jButtFacturare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtFacturareActionPerformed(evt);
            }
        });

        jButtSalv.setText("SalvareFact");
        jButtSalv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtSalvActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(39, 39, 39)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCboClient, 0, 155, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(31, 31, 31)
                                .addComponent(jTxtValManopera, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTxtDataFact1, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(jTxtManopera_Ora, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(jTxtOre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE))))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButtFacturare, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtSalv)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jCboClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jTxtDataFact1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTxtOre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTxtManopera_Ora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jTxtValManopera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtFacturare)
                            .addComponent(jButtSalv)))
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTxtDataFact3.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTxtNrFact)
                            .addComponent(jTxtDataFact3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTxtNrFact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTxtDataFact3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();

      //  pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCboClientItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboClientItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            int idx = jCboClient.getSelectedIndex();
            Clienti clie = clientiList.get(idx);
            comenziList = findListComenzi(clie.getIdClient());
            comenziArray = new Comenzi[comenziList.size()];
            Iterator it = comenziList.iterator();
            int i = 0;
            while (it.hasNext()) {
                Comenzi comm = (Comenzi) it.next();
                comenziArray[i] = comm;
                i++;
            }

            jListComanda.setModel(new javax.swing.AbstractListModel() {

                Comenzi[] strings = comenziArray;

                public int getSize() {
                    return strings.length;
                }

                public Object getElementAt(int i) {
                    return strings[i];
                }
            });

            jTable1.setModel(new javax.swing.table.DefaultTableModel(
                    new Object[][]{
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null},
                        {null, null, null, null}
                    },
                    new String[]{
                        "Produs", "Pret unitar", "Cantitate", "Valoare Totala"
                    }) {

                boolean[] canEdit = new boolean[]{
                    false, false, false, false
                };

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit[columnIndex];
                }
            });

        }

    }//GEN-LAST:event_jCboClientItemStateChanged

    private void jListComandaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListComandaValueChanged
        // TODO add your handling code here:
        int bb = jListComanda.getMinSelectionIndex();
        if (bb != -1) {
            fillTable();
            if (comanda.getDataFinalizare() != null) {
                jTxtOre.setText("" + comanda.getTimpDeLucru());
                jTxtManopera_Ora.setText("" + man_ora);
                jTxtValManopera.setText("" + comanda.getValoareManopera());
                jTxtDataFact1.setText(formatter.format(comanda.getDataFinalizare()));
                jTxtDataFact3.setText(formatter.format(comanda.getDataFinalizare()));
                jTxtNrFact.setText("" + comanda.getIdComanda());
                jButtFacturare.setEnabled(false);
                jButtSalv.setEnabled(false);
                jTxtOre.setEnabled(false);
                jTxtManopera_Ora.setEnabled(false);
                jTxtValManopera.setEnabled(false);
                jTxtDataFact1.setEnabled(false);


            } else {
                jTxtOre.setText("0");
                jTxtManopera_Ora.setText("0");
                jTxtValManopera.setText("0");
                jTxtDataFact1.setText("");
                jButtFacturare.setEnabled(true);
                jButtSalv.setEnabled(true);


            }
        }
    }//GEN-LAST:event_jListComandaValueChanged

    private void jButtFacturareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtFacturareActionPerformed
        // TODO add your handling code here:
        jButtFacturare.setEnabled(false);
        jTxtOre.setEnabled(true);
        jTxtManopera_Ora.setEnabled(false);
        jTxtValManopera.setEnabled(false);
        jTxtDataFact1.setEnabled(true);

        // SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        //Calendar calendar;
        Date date = new Date();
        String strDate = formatter.format(date);
        jTxtDataFact1.setText(strDate);

        // SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

    }//GEN-LAST:event_jButtFacturareActionPerformed

    private void jButtSalvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtSalvActionPerformed
        try {
            // TODO add your handling code here:
            jButtFacturare.setEnabled(true);
            jTxtOre.setEnabled(false);
            jTxtManopera_Ora.setEnabled(false);
            jTxtValManopera.setEnabled(false);
            jTxtDataFact1.setEnabled(false);
            em.persist(comanda);
            //    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            Date convertedDate = formatter.parse(jTxtDataFact1.getText());
            comanda.setDataFinalizare(convertedDate);
            comanda.setTimpDeLucru(Integer.parseInt(jTxtOre.getText()));
            comanda.setValoareManopera(Integer.parseInt(jTxtValManopera.getText()));
            comanda.setValoareMateriale(valMateriale);
            comanda.setValoareTotala(valMateriale + Integer.parseInt(jTxtValManopera.getText()));
            em.getTransaction().begin();
            em.getTransaction().commit();
        } catch (ParseException ex) {
            Logger.getLogger(FacturaView.class.getName()).log(Level.SEVERE, null, ex);
        }

        fillTable();
        jTxtDataFact3.setText(formatter.format(comanda.getDataFinalizare()));
        jTxtNrFact.setText("" + comanda.getIdComanda());
        jButtFacturare.setEnabled(false);
        jButtSalv.setEnabled(false);
    }//GEN-LAST:event_jButtSalvActionPerformed

    private void jTxtOreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTxtOreFocusLost
        // TODO add your handling code here:
        int ore = Integer.parseInt(jTxtOre.getText());
        int valManopera = man_ora * ore;
        jTxtValManopera.setText("" + valManopera);
        jTxtManopera_Ora.setText("" + man_ora);

    }//GEN-LAST:event_jTxtOreFocusLost

    public List<Comenzi> findListComenzi(int idCom) {
        List<Comenzi> eee = em.createQuery("SELECT s FROM Comenzi s WHERE s.clienti.idClient = :id").setParameter("id", idCom).getResultList();
        return eee;
    }

    public List<MaterialeComanda> findListMaterialeComanda(int idCom) {
        List<MaterialeComanda> eee = em.createQuery("SELECT s FROM MaterialeComanda s WHERE s.comenzi.idComanda = :id").setParameter("id", idCom).getResultList();
        return eee;
    }

    public List<Materiale> findListMateriale(int idCom) {
        List<Materiale> eee = em.createQuery("SELECT s FROM Materiale s WHERE s.stocMaterial>0 and s.idMaterial = :id").setParameter("id", idCom).getResultList();
        return eee;
    }

    public void fillTable() {
        MaterialeComanda mc;
        int idxComanda = jListComanda.getSelectedIndex();
        comanda = comenziList.get(idxComanda);
        List<MaterialeComanda> materialeComandaList = findListMaterialeComanda(comanda.getIdComanda());
        Iterator it = materialeComandaList.iterator();
        int ii = 0;
        Object[][] obj = new Object[materialeComandaList.size() + 3][4];
        obj[ii][0] = comanda.getNume();
        ii++;
        valMateriale = 0;
        while (it.hasNext()) {
            mc = (MaterialeComanda) it.next();
            List<Materiale> mat = findListMateriale(mc.getMateriale().getIdMaterial());
            obj[ii][0] = mat.get(0).getNume();
            obj[ii][1] = mat.get(0).getPret();
            obj[ii][2] = mc.getCantitate();
            obj[ii][3] = mc.getPretTotal();
            valMateriale = valMateriale + mc.getPretTotal();
            ii++;
        }
        obj[ii][0] = "Manopera";
        obj[ii][1] = man_ora;
        obj[ii][2] = comanda.getTimpDeLucru() + " ore";
        int valM = 0;
        if (comanda.getValoareManopera() == null) {
            valM = 0;
        } else {
            valM = comanda.getValoareManopera();
        }

        obj[ii][3] = valM;
        ii++;

        obj[ii][0] = "TOTAL general:";
        obj[ii][1] = "";
        obj[ii][2] = "";
        int val = valMateriale + valM;
        obj[ii][3] = val;
        ii++;

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                //
                obj,
                new String[]{
                    "Produs", "Pret unitar", "Cantitate", "Valoare Totala"
                }) {

            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Salariati sss = new Salariati();
                sss.setTip("administrator");
                FacturaView dialog = new FacturaView(new javax.swing.JFrame(), true, sss);

                if (dialog.wsal.getTip() == sss.getTip()) {
                    JFrame f = new JFrame("Lansare Factura ");
                    f.setSize(700, 550);
                    f.add(dialog);
                    f.setVisible(true);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.util.List<ent.Clienti> clientiList;
    private javax.persistence.Query clientiQuery;
    private javax.persistence.EntityManager em;
    private javax.swing.JButton jButtFacturare;
    private javax.swing.JButton jButtSalv;
    private javax.swing.JComboBox jCboClient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListComanda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JFormattedTextField jTxtDataFact1;
    private javax.swing.JFormattedTextField jTxtDataFact3;
    private javax.swing.JTextField jTxtManopera_Ora;
    private javax.swing.JTextField jTxtNrFact;
    private javax.swing.JTextField jTxtOre;
    private javax.swing.JTextField jTxtValManopera;
    private java.util.List<ent.MaterialeComanda> materialeComandaList;
    private javax.persistence.Query materialeComandaQuery;
    private java.util.List<ent.Materiale> materialeList;
    private javax.persistence.Query materialeQuery;
    private java.util.List<ent.Salariati> salariatiList;
    private javax.persistence.Query salariatiQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
