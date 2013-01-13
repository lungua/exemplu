package gui;

import drepturiAcces.Acces;
import ent.Clienti;
import ent.Comenzi;
import ent.Salariati;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import util.MyOwnFocusTraversalPolicy;
import util.SetupEnterActionForAllButtons;

public class LansareComandaView extends javax.swing.JPanel {

    static MyOwnFocusTraversalPolicy newPolicy;
    public Salariati wsal;

    public LansareComandaView(java.awt.Frame parent, boolean modal, Salariati wsal) {
        // super(parent, modal);
        this.wsal = wsal;
        initComponents();

        Acces ac = new Acces(wsal.getTip());

        if (ac.fc_accesLansareComandaView(wsal.getTip())) {
            Vector<Component> order = new Vector<Component>(6);
            order.add(jtxtNumeCcomanda);
            order.add(jtxtDataLansare);
            order.add(jCboClient);
            order.add(jCboSalariat);
            order.add(jButtSave);
            order.add(jButtAdd);
            SetupEnterActionForAllButtons enterButton = new SetupEnterActionForAllButtons();
            enterButton.setupEnter();
            newPolicy = new MyOwnFocusTraversalPolicy(order);
        } else {
            JOptionPane.showMessageDialog(this, "Nu aveti drepturi pentru aceasta optiune..");
            this.disable();
            // System.exit(0);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        em = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ComputerServicePU").createEntityManager();
        comenziQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT c FROM Comenzi c");
        comenziList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(comenziQuery.getResultList());
        clientiQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT c FROM Clienti c");
        clientiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientiQuery.getResultList();
        salariatiQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT s FROM Salariati s");
        salariatiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : salariatiQuery.getResultList();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jtxtIdComanda = new javax.swing.JTextField();
        jtxtNumeCcomanda = new javax.swing.JTextField();
        jtxtDataLansare = new javax.swing.JFormattedTextField(new SimpleDateFormat("dd.MM.yyyy"));
        jCboClient = new javax.swing.JComboBox();
        jCboSalariat = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtNext = new javax.swing.JButton();
        jButtPreview = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListComanda = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jtxtNrComenziInLucruSalariat = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtAdd = new javax.swing.JButton();
        jButtSave = new javax.swing.JButton();
        jButtNoSave = new javax.swing.JButton();
        jButtMod = new javax.swing.JButton();
        jButtDel = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 0, 48));
        jLabel1.setText("Lansare Comanda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtxtIdComanda.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idComanda}"), jtxtIdComanda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtNumeCcomanda.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nume}"), jtxtNumeCcomanda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtNumeCcomanda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNumeCcomandaKeyPressed(evt);
            }
        });

        jtxtDataLansare.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataLansare}"), jtxtDataLansare, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jtxtDataLansare.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtDataLansareKeyPressed(evt);
            }
        });

        jCboClient.setEnabled(false);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientiList, jCboClient, "bindclient");
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.clienti}"), jCboClient, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jCboClient.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCboClientKeyPressed(evt);
            }
        });

        jCboSalariat.setEnabled(false);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, salariatiList, jCboSalariat, "bindsalariati");
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.salariati}"), jCboSalariat, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jCboSalariat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCboSalariatItemStateChanged(evt);
            }
        });
        jCboSalariat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jCboSalariatFocusLost(evt);
            }
        });
        jCboSalariat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jCboSalariatKeyPressed(evt);
            }
        });

        jLabel2.setText("IdComanda");

        jLabel3.setText("Nume Comanda");

        jLabel4.setText("Client");

        jLabel5.setText("DataComanda");

        jButtNext.setText(">");
        jButtNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtNextActionPerformed(evt);
            }
        });

        jButtPreview.setText("<");
        jButtPreview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtPreviewActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JListBinding jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, comenziList, jListComanda, "bindComenzi");
        jListBinding.setDetailBinding(org.jdesktop.beansbinding.ELProperty.create("${idComanda}"));
        bindingGroup.addBinding(jListBinding);

        jListComanda.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListComandaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListComanda);

        jLabel6.setText("Salariat");

        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Add");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel7.setText("Comenzi in lucru salariat");

        jtxtNrComenziInLucruSalariat.setEnabled(false);

        jLabel8.setText("Comanda nr.:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jButtNext)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtPreview))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtIdComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jCboSalariat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jCboClient, 0, 201, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton7)
                                            .addComponent(jButton6)))
                                    .addComponent(jtxtDataLansare, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtNumeCcomanda)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jtxtNrComenziInLucruSalariat, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtNext)
                            .addComponent(jButtPreview)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtIdComanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtNumeCcomanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jtxtDataLansare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCboClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton7)
                                .addComponent(jLabel6))
                            .addComponent(jCboSalariat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtNrComenziInLucruSalariat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtAdd.setText("Add");
        jButtAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtAddActionPerformed(evt);
            }
        });

        jButtSave.setText("Save");
        jButtSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtSave.setEnabled(false);
        jButtSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtSaveActionPerformed(evt);
            }
        });

        jButtNoSave.setText("NoSave");
        jButtNoSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtNoSave.setEnabled(false);
        jButtNoSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtNoSaveActionPerformed(evt);
            }
        });

        jButtMod.setText("Modify");
        jButtMod.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtModActionPerformed(evt);
            }
        });

        jButtDel.setText("Del");
        jButtDel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtDelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtNoSave, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(303, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtNoSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtAddActionPerformed
        // TODO add your handling code here:
        int n = JOptionPane.showConfirmDialog(this, "Adaugati Ccomanda?", "Adaugare comanda", JOptionPane.YES_NO_OPTION);
        if (n == 0) {
            jButtSave.setEnabled(true);
            jButtDel.setEnabled(false);
            jtxtNumeCcomanda.setEnabled(true);
            jtxtDataLansare.setEnabled(true);
            jCboClient.setEnabled(true);
            jCboSalariat.setEnabled(true);
            jButtNext.setEnabled(false);
            jButtPreview.setEnabled(false);
            jListComanda.setEnabled(false);
            jButtNoSave.setEnabled(true);
            jButtAdd.setEnabled(false);
            jButtMod.setEnabled(false);


            Comenzi c = new Comenzi();
            comenziList.add(c);
            c.setIdComanda(9999);
            bindingGroup.getBinding("bindComenzi").unbind();
            bindingGroup.getBinding("bindComenzi").bind();

            int windex = comenziList.indexOf(c);
            jListComanda.setSelectedIndex(comenziList.indexOf(c));
            em.persist(c);

            this.setFocusTraversalPolicy(newPolicy);

            Calendar currentDate = Calendar.getInstance();
            SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
            c.setDataLansare((currentDate.getTime()));
            jtxtDataLansare.setText(formatter.format(currentDate.getTime()));
        }
    }//GEN-LAST:event_jButtAddActionPerformed

    private void jButtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtSaveActionPerformed

        Comenzi comenziCurent = comenziList.get(jListComanda.getSelectedIndex());

        Clienti cliCurent1 = comenziCurent.getClienti();
        Salariati salCurent = comenziCurent.getSalariati();
        int idsal = salCurent.getIdSalariat();

        if (salCurent != null && cliCurent1 != null) {
            int n = JOptionPane.showConfirmDialog(this, "Salvati Comanda?", "Salvati comanda", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                jButtAdd.setEnabled(true);
                jButtSave.setEnabled(false);
                jButtDel.setEnabled(true);
                jtxtNumeCcomanda.setEnabled(false);
                jtxtDataLansare.setEnabled(false);
                jCboClient.setEnabled(false);
                jCboSalariat.setEnabled(false);
                jButtNext.setEnabled(true);
                jButtPreview.setEnabled(true);
                jListComanda.setEnabled(true);
                jButtNoSave.setEnabled(false);
                jButtMod.setEnabled(true);

                int nrr = 0;
                nrr = salCurent.getNrLucrariInExecutie() + 1;
                int id = salCurent.getIdSalariat();
                em.clear();

                if (!em.contains(comenziCurent)) {
                    em.getTransaction().begin(); // 2
                    em.merge(comenziCurent); // 1
                    Salariati wsal = em.find(Salariati.class, idsal);
                    if (salCurent != null) {
                        salCurent.setNrLucrariInExecutie(salCurent.getNrLucrariInExecutie() + 1);
                        wsal.setNrLucrariInExecutie(wsal.getNrLucrariInExecutie() + 1);
                    }
                    em.getTransaction().commit();
                    jtxtNrComenziInLucruSalariat.setText("" + nrr);
                } else {
                    JOptionPane.showMessageDialog(this, "Inregistrare existenta...");
                }

            }
            refreshComanda();
        } else {
            JOptionPane.showMessageDialog(this, "Introduceti clientul sau salariatul...");
            jButtSave.setEnabled(true);
            jButtDel.setEnabled(false);
            jtxtNumeCcomanda.setEnabled(true);
            jtxtDataLansare.setEnabled(true);
            jCboClient.setEnabled(true);
            jCboSalariat.setEnabled(true);
            jButtNext.setEnabled(false);
            jButtPreview.setEnabled(false);
            jListComanda.setEnabled(true);
            jButtNoSave.setEnabled(true);
            jButtAdd.setEnabled(false);
            jButtMod.setEnabled(false);
        }
        jButtAdd.requestFocusInWindow();
}//GEN-LAST:event_jButtSaveActionPerformed

    private void jButtDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtDelActionPerformed
        int n = JOptionPane.showConfirmDialog(this, "Stergeti Ccomanda?", "Stergeti comanda", JOptionPane.YES_NO_OPTION);
        if (n == 0) {

            Comenzi comenziCurent = comenziList.get(jListComanda.getSelectedIndex());
            Salariati salCurent = comenziCurent.getSalariati();
            int idsal = salCurent.getIdSalariat();

            em.getTransaction().begin(); // 1
            if (em.contains(comenziCurent)) // 2
            {
                Salariati wsal = em.find(Salariati.class, idsal);
                if (salCurent != null && wsal.getNrLucrariInExecutie() > 0) {
                    salCurent.setNrLucrariInExecutie(salCurent.getNrLucrariInExecutie() - 1);
                    wsal.setNrLucrariInExecutie(wsal.getNrLucrariInExecutie() - 1);
                }
                em.remove(comenziCurent); //2
                clientiList.remove(comenziCurent); // 3
                em.getTransaction().commit(); // 1
            }

            refreshComanda();
            jButtAdd.requestFocusInWindow();
        }
    }//GEN-LAST:event_jButtDelActionPerformed

    private void jButtNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtNextActionPerformed

        int bb = jListComanda.getMinSelectionIndex();
        if (bb != -1) {
            jListComanda.setSelectedIndex(jListComanda.getSelectedIndex() + 1);
            if (jListComanda.getSelectedIndex() >= 0)// 1
            {
                jListComanda.scrollRectToVisible(jListComanda.getCellBounds(jListComanda.getSelectedIndex(), jListComanda.getSelectedIndex()));//2
            }
        }
}//GEN-LAST:event_jButtNextActionPerformed

    private void jButtPreviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtPreviewActionPerformed
        int bb = jListComanda.getMinSelectionIndex();
        if (bb != -1) {
            jListComanda.setSelectedIndex(jListComanda.getSelectedIndex() - 1);
            if (jListComanda.getSelectedIndex() >= 0)// 1
            {
                jListComanda.scrollRectToVisible(jListComanda.getCellBounds(jListComanda.getSelectedIndex(), jListComanda.getSelectedIndex()));//2
            }
        }
}//GEN-LAST:event_jButtPreviewActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        ClientView dialog1 = new ClientView(new javax.swing.JFrame(), true, wsal);
        JFrame f = new JFrame("Clienti");
        f.setSize(700, 550);
        f.add(dialog1);
        f.setVisible(true);
        dialog1.setVisible(true);
        refreshClienti();
        bindingGroup.getBinding("bindComenzi").unbind();
        bindingGroup.getBinding("bindComenzi").bind();
        bindingGroup.getBinding("bindclient").unbind();
        bindingGroup.getBinding("bindclient").bind();


    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCboSalariatItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCboSalariatItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            int indexSal = jCboSalariat.getSelectedIndex();
            int nrLucrari = salariatiList.get(indexSal).getNrLucrariInExecutie();
            jtxtNrComenziInLucruSalariat.setText("" + nrLucrari);
        } else if (evt.getStateChange() == ItemEvent.DESELECTED) {
        }


    }//GEN-LAST:event_jCboSalariatItemStateChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        SalariatiView dialog = new SalariatiView(new javax.swing.JFrame(), true, wsal);
        JFrame f = new JFrame("Salariati");
        f.setSize(700, 550);
        f.add(dialog);
        f.setVisible(true);
        dialog.setVisible(true);
        refreshSalariati();
        bindingGroup.getBinding("bindsalariati").unbind();
        bindingGroup.getBinding("bindsalariati").bind();
        bindingGroup.getBinding("bindComenzi").unbind();
        bindingGroup.getBinding("bindComenzi").bind();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jButtSave.setEnabled(false);
        jtxtNumeCcomanda.setEnabled(false);
        jtxtDataLansare.setEnabled(false);
        jCboClient.setEnabled(false);
        jCboSalariat.setEnabled(false);
        jButtNext.setEnabled(true);
        jButtPreview.setEnabled(true);
        jButtNoSave.setEnabled(false);
        jButtMod.setEnabled(true);
        jButtAdd.requestFocusInWindow();
        // this.transferFocus();
    }//GEN-LAST:event_formWindowOpened

    private void jCboSalariatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jCboSalariatFocusLost
    }//GEN-LAST:event_jCboSalariatFocusLost

    private void jListComandaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListComandaValueChanged
    }//GEN-LAST:event_jListComandaValueChanged

    private void jButtNoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtNoSaveActionPerformed
        refreshComanda();
        jButtSave.setEnabled(false);
        jtxtNumeCcomanda.setEnabled(false);
        jtxtDataLansare.setEnabled(false);
        jCboClient.setEnabled(false);
        jCboSalariat.setEnabled(false);
        jButtNext.setEnabled(true);
        jButtPreview.setEnabled(true);
        jButtNoSave.setEnabled(false);
        jListComanda.setEnabled(true);
        jButtAdd.setEnabled(true);
        jButtMod.setEnabled(true);
        this.setFocusTraversalPolicy(newPolicy);
        jButtAdd.requestFocusInWindow();
    }//GEN-LAST:event_jButtNoSaveActionPerformed

    private void jButtModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtModActionPerformed
        jButtSave.setEnabled(true);
        jButtDel.setEnabled(false);
        jtxtNumeCcomanda.setEnabled(true);
        jtxtDataLansare.setEnabled(true);
        jCboClient.setEnabled(true);
        jCboSalariat.setEnabled(true);
        jButtNext.setEnabled(false);
        jButtPreview.setEnabled(false);
        jListComanda.setEnabled(false);
        jButtNoSave.setEnabled(true);
        jButtAdd.setEnabled(false);
        jButtMod.setEnabled(false);
    }//GEN-LAST:event_jButtModActionPerformed

    private void jtxtNumeCcomandaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNumeCcomandaKeyPressed
        if (evt.getKeyCode() == 10) {
            jtxtDataLansare.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtNumeCcomandaKeyPressed

    private void jtxtDataLansareKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtDataLansareKeyPressed
        if (evt.getKeyCode() == 10) {
            jCboClient.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtDataLansareKeyPressed

    private void jCboClientKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCboClientKeyPressed
        if (evt.getKeyCode() == 10) {
            jCboSalariat.requestFocusInWindow();
        }
    }//GEN-LAST:event_jCboClientKeyPressed

    private void jCboSalariatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCboSalariatKeyPressed
        if (evt.getKeyCode() == 10) {
            jButtSave.requestFocusInWindow();
        }
    }//GEN-LAST:event_jCboSalariatKeyPressed
    private void refreshComanda() {
        Integer idxComandaCurenta = jListComanda.getSelectedIndex();
        comenziList.clear();
        em.clear();
        comenziList.addAll(comenziQuery.getResultList());
        if (idxComandaCurenta >= 0) {
            jListComanda.setSelectedIndex(idxComandaCurenta);
        } else {
            jListComanda.setSelectedIndex(0);
        }
    }

    private void refreshClienti() {
        clientiList.clear();
        clientiList.addAll(clientiQuery.getResultList());
        jCboClient.setSelectedIndex(0);
    }

    private void refreshSalariati() {
        Integer idxComandaCurenta = jListComanda.getSelectedIndex();
        Salariati sal;
        if (idxComandaCurenta != -1) {
            sal = comenziList.get(idxComandaCurenta).getSalariati();
        } else {
            sal = comenziList.get(0).getSalariati();

        }
        salariatiList.clear();
        salariatiList.addAll(salariatiQuery.getResultList());
        int indSal = salariatiList.indexOf(sal);
        if (indSal != -1) {

            jCboSalariat.setSelectedIndex(indSal);
        } else {
            jCboSalariat.setSelectedIndex(0);
        }

    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Salariati sss = new Salariati();
                sss.setTip("administrator");
                LansareComandaView dialog = new LansareComandaView(new javax.swing.JFrame(), true, sss);
                if (dialog.wsal.getTip() == sss.getTip()) {
                    JFrame f = new JFrame("Lansare Comanda ");
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
    private java.util.List<ent.Comenzi> comenziList;
    private javax.persistence.Query comenziQuery;
    private javax.persistence.EntityManager em;
    private javax.swing.JButton jButtAdd;
    private javax.swing.JButton jButtDel;
    private javax.swing.JButton jButtMod;
    private javax.swing.JButton jButtNext;
    private javax.swing.JButton jButtNoSave;
    private javax.swing.JButton jButtPreview;
    private javax.swing.JButton jButtSave;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox jCboClient;
    private javax.swing.JComboBox jCboSalariat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList jListComanda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField jtxtDataLansare;
    private javax.swing.JTextField jtxtIdComanda;
    private javax.swing.JTextField jtxtNrComenziInLucruSalariat;
    private javax.swing.JTextField jtxtNumeCcomanda;
    private java.util.List<ent.Salariati> salariatiList;
    private javax.persistence.Query salariatiQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
// reţinerea poziţiei curent selectate în lista de navigare

