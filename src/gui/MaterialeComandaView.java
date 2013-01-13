
package gui;

import drepturiAcces.Acces;
import ent.Clienti;
import ent.Comenzi;
import ent.Materiale;
import ent.MaterialeComanda;
import ent.Salariati;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.TableModel;
import util.MyOwnFocusTraversalPolicy;
import util.SelectionListener;
import util.SetupEnterActionForAllButtons;

public class MaterialeComandaView extends javax.swing.JPanel {

    public Integer idSalariatt;     //id-ul user-ului care apeleaza clasa
    public String tipSalariat;       // tipul userului care apeleaza clasa(admin, aprovizionare, service, etc)
    static MyOwnFocusTraversalPolicy newPolicy;  // clasa care imi va asigura sucesiunea de trecere prin cimpuri
    public static int rowTable;
    public static Materiale wmat;
    public MaterialeComanda c;
    public Integer cantitate = 0;
    private boolean varAdd = false;
    private boolean varMod = false;
    public Salariati wsal;
 

    public MaterialeComandaView(java.awt.Frame parent, boolean modal, Salariati wsal) {
        //super(parent, modal);

        this.idSalariatt = idSalariatt;
        this.tipSalariat = tipSalariat;
        initComponents();
        this.wsal = wsal;
        Acces ac = new Acces(wsal.getTip());

        if (ac.fc_accesMaterialeComandaView(wsal.getTip())) {
            jTableMateriale.setAutoCreateRowSorter(true);
            TableModel tblModel = jTableMateriale.getModel();
            SelectionListener listener = new SelectionListener(jTableMateriale, materialeList);

            jTableMateriale.getSelectionModel().addListSelectionListener(listener);
            jTableMateriale.getColumnModel().getSelectionModel().addListSelectionListener(listener);

            jTableMateriale.getSelectionModel().addListSelectionListener(
                    new ListSelectionListener() {

                        public void valueChanged(ListSelectionEvent event) {
                            int viewRow = jTableMateriale.getSelectedRow();
                            if (viewRow < 0) {
                            } else {
                                int modelRow = jTableMateriale.convertRowIndexToModel(viewRow);
                            }
                        }
                    });

            SetupEnterActionForAllButtons enterButton = new SetupEnterActionForAllButtons();
            enterButton.setupEnter();

            Vector<Component> order = new Vector<Component>(4);
            order.add(jTableMateriale);
            order.add(jtxtCantitateMaterial);
            order.add(jButtSave);
            order.add(jButtAdd);

            newPolicy = new MyOwnFocusTraversalPolicy(order);
        } else {
            JOptionPane.showMessageDialog(this, "Nu aveti drepturi pentru aceasta optiune..");
            // this.dispose();
            System.exit(0);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        comenziQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT c FROM Comenzi c ");
        comenziList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : org.jdesktop.observablecollections.ObservableCollections.observableList(comenziQuery.getResultList());
        clientiQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT c FROM Clienti c");
        clientiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : clientiQuery.getResultList();
        salariatiQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT s FROM Salariati s");
        salariatiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : salariatiQuery.getResultList();
        materialeComandaQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT m FROM MaterialeComanda m");
        materialeComandaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : materialeComandaQuery.getResultList();
        materialeQuery = java.beans.Beans.isDesignTime() ? null : em.createQuery("SELECT m FROM Materiale m where m.stocMaterial>0");
        materialeList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : materialeQuery.getResultList();
        em = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("ComputerServicePUXX").createEntityManager();
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
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtAdd = new javax.swing.JButton();
        jButtSave = new javax.swing.JButton();
        jButtNoSave = new javax.swing.JButton();
        jButtMod = new javax.swing.JButton();
        jButtDel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableMateriale = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListMaterialeComanda = new javax.swing.JList();
        jButtNext1 = new javax.swing.JButton();
        jButtPreview1 = new javax.swing.JButton();
        jtxtIdMaterial = new javax.swing.JTextField();
        jtxtCantitateMaterial = new javax.swing.JTextField();
        jtxtValTotMaterial = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Arabic Typesetting", 0, 48));
        jLabel1.setText("Materiale  Comanda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jtxtIdComanda.setEnabled(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idComanda}"), jtxtIdComanda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtNumeCcomanda.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.nume}"), jtxtNumeCcomanda, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtDataLansare.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.dataLansare}"), jtxtDataLansare, org.jdesktop.beansbinding.BeanProperty.create("value"));
        bindingGroup.addBinding(binding);

        jCboClient.setEnabled(false);

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, clientiList, jCboClient);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.clienti}"), jCboClient, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

        jCboSalariat.setEnabled(false);

        jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, salariatiList, jCboSalariat);
        bindingGroup.addBinding(jComboBoxBinding);
        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.salariati}"), jCboSalariat, org.jdesktop.beansbinding.BeanProperty.create("selectedItem"));
        bindingGroup.addBinding(binding);

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

        jLabel8.setText("Comanda nr.:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jButtNext)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtPreview))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtxtIdComanda, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCboSalariat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCboClient, 0, 201, Short.MAX_VALUE)
                            .addComponent(jtxtDataLansare, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtNumeCcomanda, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(310, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
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
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jCboSalariat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtPreview)
                    .addComponent(jButtNext))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtAdd.setText("Add");
        jButtAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtAddActionPerformed(evt);
            }
        });
        jButtAdd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButtAddKeyPressed(evt);
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
        jButtSave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtSaveFocusGained(evt);
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
        jButtMod.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtModFocusGained(evt);
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
                .addGap(10, 10, 10)
                .addComponent(jButtNoSave, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(553, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButtDel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtMod, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtNoSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtSave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButtAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, materialeList, jTableMateriale, "listddd");
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${nume}"));
        columnBinding.setColumnName("Nume");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pret}"));
        columnBinding.setColumnName("Pret");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${intrariMaterial}"));
        columnBinding.setColumnName("Intrari Material");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${iesiriMaterial}"));
        columnBinding.setColumnName("Iesiri Material");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${stocMaterial}"));
        columnBinding.setColumnName("Stoc Material");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${furnizori}"));
        columnBinding.setColumnName("Furnizori");
        columnBinding.setColumnClass(ent.Furnizori.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTableMateriale.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTableMaterialePropertyChange(evt);
            }
        });
        jScrollPane2.setViewportView(jTableMateriale);

        jListBinding = org.jdesktop.swingbinding.SwingBindings.createJListBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, materialeComandaList, jListMaterialeComanda, "listccc");
        jListBinding.setDetailBinding(org.jdesktop.beansbinding.ELProperty.create("${idMaterialComanda}"));
        bindingGroup.addBinding(jListBinding);

        jListMaterialeComanda.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListMaterialeComandaValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(jListMaterialeComanda);

        jButtNext1.setText(">");
        jButtNext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtNext1ActionPerformed(evt);
            }
        });

        jButtPreview1.setText("<");
        jButtPreview1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtPreview1ActionPerformed(evt);
            }
        });

        jtxtIdMaterial.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterialeComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.idMaterialComanda}"), jtxtIdMaterial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterialeComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.cantitate}"), jtxtCantitateMaterial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jtxtCantitateMaterial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtxtCantitateMaterialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtCantitateMaterialFocusLost(evt);
            }
        });
        jtxtCantitateMaterial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtCantitateMaterialKeyPressed(evt);
            }
        });

        jtxtValTotMaterial.setEnabled(false);

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jListMaterialeComanda, org.jdesktop.beansbinding.ELProperty.create("${selectedElement.pretTotal}"), jtxtValTotMaterial, org.jdesktop.beansbinding.BeanProperty.create("text"));
        bindingGroup.addBinding(binding);

        jLabel9.setText("Id Comanda Material");

        jLabel12.setText("Cantitate");

        jLabel13.setText("Valoare Totala");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButtNext1)
                        .addGap(18, 18, 18)
                        .addComponent(jButtPreview1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jtxtIdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtCantitateMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxtValTotMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(727, 727, 727))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap()))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtNext1)
                    .addComponent(jButtPreview1)
                    .addComponent(jLabel9)
                    .addComponent(jtxtIdMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtCantitateMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxtValTotMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, 0, 846, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bindingGroup.bind();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtAddActionPerformed
        if (jListComanda.getSelectedIndex() != -1) {
            int n = JOptionPane.showConfirmDialog(this, "Adaugati Material ?", "Adaugare material", JOptionPane.YES_NO_OPTION);
            if (n == 0) {
                jButtSave.setEnabled(true);
                jButtDel.setEnabled(false);
                jtxtNumeCcomanda.setEnabled(false);
                jtxtDataLansare.setEnabled(false);
                jCboClient.setEnabled(false);
                jCboSalariat.setEnabled(false);
                jButtNext.setEnabled(false);
                jButtPreview.setEnabled(false);
                jListComanda.setEnabled(false);
                jButtNoSave.setEnabled(true);
                jButtAdd.setEnabled(false);
                jButtMod.setEnabled(false);
                jListMaterialeComanda.setEnabled(false);
                jtxtIdMaterial.setEnabled(false);

                jtxtValTotMaterial.setEnabled(false);
                jtxtCantitateMaterial.setEnabled(true);

                materialeList.clear();
                materialeList.addAll(materialeQuery.getResultList());
                bindingGroup.getBinding("listddd").unbind();
                bindingGroup.getBinding("listddd").bind();
                varAdd = true;
                Comenzi comenziCurent = comenziList.get(jListComanda.getSelectedIndex());
                c = new MaterialeComanda();
                List<MaterialeComanda> xxx = findListMaterialeComanda(comenziCurent.getIdComanda());

                c.setIdMaterialComanda(9999);
                c.setComenzi(comenziCurent);
                xxx.add(c);

                materialeComandaList.clear();
                materialeComandaList.addAll(xxx);
                bindingGroup.getBinding("listccc").unbind();
                bindingGroup.getBinding("listccc").bind();
                jListMaterialeComanda.setSelectedIndex(materialeComandaList.size() - 1);

//               

                this.setFocusTraversalPolicy(newPolicy);


            }
        } else {
            JOptionPane.showMessageDialog(this, "Nu ati selectat o comanda..");
        }
    }//GEN-LAST:event_jButtAddActionPerformed

    private void jButtSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtSaveActionPerformed

        MaterialeComanda comenziCurent = materialeComandaList.get(jListMaterialeComanda.getSelectedIndex());

        int n = JOptionPane.showConfirmDialog(this, "Salvati Material?", "Salvati material", JOptionPane.YES_NO_OPTION);
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

            jListMaterialeComanda.setEnabled(true);
            jtxtIdMaterial.setEnabled(false);

            jtxtValTotMaterial.setEnabled(false);
            jtxtCantitateMaterial.setEnabled(false);

            int nrr = 0;

            varAdd = false;
            varMod = false;
            em.clear();

            if (!em.contains(comenziCurent)) {
                em.getTransaction().begin(); // 2
                em.merge(comenziCurent); // 1
                em.getTransaction().commit();

            } else {
                JOptionPane.showMessageDialog(this, "Inregistrare existenta...");
            }
        }
        refreshMaterialeComanda();
        jButtAdd.requestFocusInWindow();
}//GEN-LAST:event_jButtSaveActionPerformed

    private void jButtDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtDelActionPerformed

        int n = JOptionPane.showConfirmDialog(this, "Stergeti Ccomanda?", "Stergeti comanda", JOptionPane.YES_NO_OPTION);
        if (n == 0) {

            MaterialeComanda matComandaCurent = materialeComandaList.get(jListMaterialeComanda.getSelectedIndex());

            List<Materiale> yyy = findListMateriale(matComandaCurent.getMateriale().getIdMaterial());
            Materiale wmattt = yyy.get(0);
            em.persist(wmattt);//
            int qqq = wmattt.getIesiriMaterial() - matComandaCurent.getCantitate();
            wmattt.setIesiriMaterial(wmattt.getIesiriMaterial() - matComandaCurent.getCantitate());
            wmattt.setStocMaterial(wmattt.getIntrariMaterial() - wmattt.getIesiriMaterial());

            c = materialeComandaList.get(jListMaterialeComanda.getSelectedIndex());

            em.getTransaction().begin(); // 1
            if (em.contains(c)) // 2
            {
                em.remove(c); //2
                materialeComandaList.remove(c); // 3
                em.getTransaction().commit(); // 1
            }
            em.detach(c);

            bindingGroup.getBinding("listccc").unbind();
            bindingGroup.getBinding("listccc").bind();
            //          jListMaterialeComanda.setEnabled(false);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButtSave.setEnabled(false);
        jtxtNumeCcomanda.setEnabled(false);
        jtxtDataLansare.setEnabled(false);
        jCboClient.setEnabled(false);
        jCboSalariat.setEnabled(false);
        jButtNext.setEnabled(true);
        jButtPreview.setEnabled(true);
        jButtNoSave.setEnabled(false);
        jButtMod.setEnabled(true);


        jListMaterialeComanda.setEnabled(true);
        jtxtIdMaterial.setEnabled(false);

        jtxtValTotMaterial.setEnabled(false);
        jtxtCantitateMaterial.setEnabled(false);

        jButtAdd.requestFocusInWindow();
    }//GEN-LAST:event_formWindowOpened

    private void jListComandaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListComandaValueChanged
        Comenzi comenziCurent = comenziList.get(jListComanda.getSelectedIndex());

        MaterialeComanda c = new MaterialeComanda();
        List<MaterialeComanda> xxx = findListMaterialeComanda(comenziCurent.getIdComanda());

        materialeComandaList.clear();
        materialeComandaList.addAll(xxx);

        bindingGroup.getBinding("listccc").unbind();
        bindingGroup.getBinding("listccc").bind();

    }//GEN-LAST:event_jListComandaValueChanged

    private void jButtNoSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtNoSaveActionPerformed
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
        jButtAdd.setEnabled(true);
        jButtDel.setEnabled(true);


        jListComanda.setEnabled(true);
        jListMaterialeComanda.setEnabled(true);
        jtxtIdMaterial.setEnabled(false);

        jtxtValTotMaterial.setEnabled(false);
        jtxtCantitateMaterial.setEnabled(false);
        if (varAdd) {
            materialeComandaList.remove(c);

        }
        bindingGroup.getBinding("listccc").unbind();
        bindingGroup.getBinding("listccc").bind();
    }//GEN-LAST:event_jButtNoSaveActionPerformed

    private void jButtModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtModActionPerformed

        jButtSave.setEnabled(true);
        jButtDel.setEnabled(false);

        jtxtNumeCcomanda.setEnabled(false);
        jtxtDataLansare.setEnabled(false);
        jCboClient.setEnabled(false);
        jCboSalariat.setEnabled(false);

        jButtNext.setEnabled(false);
        jButtPreview.setEnabled(false);
        jListComanda.setEnabled(false);
        jButtNoSave.setEnabled(true);
        jButtAdd.setEnabled(false);
        jButtMod.setEnabled(false);
        jListMaterialeComanda.setEnabled(false);
        jtxtIdMaterial.setEnabled(false);

        jtxtValTotMaterial.setEnabled(false);
        jtxtCantitateMaterial.setEnabled(true);
        materialeList.clear();
        materialeList.addAll(materialeQuery.getResultList());
        bindingGroup.getBinding("listddd").unbind();
        bindingGroup.getBinding("listddd").bind();
        Comenzi comenziCurent = comenziList.get(jListComanda.getSelectedIndex());
        c = materialeComandaList.get(jListMaterialeComanda.getSelectedIndex());
        varMod = true;
        this.setFocusTraversalPolicy(newPolicy);

    }//GEN-LAST:event_jButtModActionPerformed

    private void jButtNext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtNext1ActionPerformed
        int bb = jListMaterialeComanda.getMinSelectionIndex();
        if (bb != -1) {
            jListMaterialeComanda.setSelectedIndex(jListMaterialeComanda.getSelectedIndex() + 1);
            if (jListMaterialeComanda.getSelectedIndex() >= 0)// 1
            {
                jListMaterialeComanda.scrollRectToVisible(jListMaterialeComanda.getCellBounds(jListMaterialeComanda.getSelectedIndex(), jListMaterialeComanda.getSelectedIndex()));//2

            }
        }
    }//GEN-LAST:event_jButtNext1ActionPerformed

    private void jButtPreview1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtPreview1ActionPerformed
        // TODO add your handling code here:
        int bb = jListMaterialeComanda.getMinSelectionIndex();
        if (bb != -1) {
            jListMaterialeComanda.setSelectedIndex(jListMaterialeComanda.getSelectedIndex() - 1);
            if (jListMaterialeComanda.getSelectedIndex() >= 0)// 1
            {
                jListMaterialeComanda.scrollRectToVisible(jListMaterialeComanda.getCellBounds(jListMaterialeComanda.getSelectedIndex(), jListMaterialeComanda.getSelectedIndex()));//2
            }
        }
    }//GEN-LAST:event_jButtPreview1ActionPerformed

    private void jListMaterialeComandaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListMaterialeComandaValueChanged
        int bb = jListMaterialeComanda.getMinSelectionIndex();
        if (bb != -1) {
            int windex = jListMaterialeComanda.getSelectedIndex();
            MaterialeComanda matComandaCurent = materialeComandaList.get(windex);

            Materiale uuu = matComandaCurent.getMateriale(); //.getIdMaterial();
            if (uuu != null) {
                List<Materiale> yyy = findListMateriale(matComandaCurent.getMateriale().getIdMaterial());
                materialeList.clear();
                materialeList.addAll(yyy);
                bindingGroup.getBinding("listddd").unbind();
                bindingGroup.getBinding("listddd").bind();
            }
        }
    }//GEN-LAST:event_jListMaterialeComandaValueChanged

    private void jTableMaterialePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTableMaterialePropertyChange
    }//GEN-LAST:event_jTableMaterialePropertyChange

    private void jButtSaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtSaveFocusGained
        // TODO add your handling code here:
        wmat = materialeList.get(rowTable);
        if (cantitate != 0) {
            em.persist(wmat);
            em.getTransaction().begin(); // 2

            wmat.setIesiriMaterial(wmat.getIesiriMaterial() + cantitate);
            wmat.setStocMaterial(wmat.getIntrariMaterial() - wmat.getIesiriMaterial());
             em.getTransaction().commit();

        }
         em.persist(c);
        c.setMateriale(wmat);
        c.setPretTotal(cantitate * wmat.getPret());
        jtxtValTotMaterial.setText("" + cantitate * wmat.getPret());
        int windex = materialeComandaList.indexOf(c);
    }//GEN-LAST:event_jButtSaveFocusGained

    private void jtxtCantitateMaterialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCantitateMaterialFocusLost

        cantitate = Integer.parseInt(jtxtCantitateMaterial.getText());
    }//GEN-LAST:event_jtxtCantitateMaterialFocusLost

    private void jtxtCantitateMaterialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtCantitateMaterialFocusGained
        cantitate = 0;
    }//GEN-LAST:event_jtxtCantitateMaterialFocusGained

    private void jButtModFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtModFocusGained
        // TODO add your handling code here:
        int windex = jListMaterialeComanda.getSelectedIndex();
        MaterialeComanda matComandaCurent = materialeComandaList.get(windex);
        //Materiale wmat = materialeList.get(rowTable);
        List<Materiale> yyy = findListMateriale(matComandaCurent.getMateriale().getIdMaterial());
        Materiale wmatt = yyy.get(0);
        if (matComandaCurent.getCantitate() != 0) {
            em.persist(wmatt);
            em.getTransaction().begin(); // 2

            wmatt.setIesiriMaterial(wmatt.getIesiriMaterial() - matComandaCurent.getCantitate());
            wmatt.setStocMaterial(wmatt.getIntrariMaterial() - wmatt.getIesiriMaterial());
            em.getTransaction().commit();

        }
    }//GEN-LAST:event_jButtModFocusGained

    private void jtxtCantitateMaterialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCantitateMaterialKeyPressed
        if (evt.getKeyCode() == 10) {
            jButtSave.requestFocusInWindow();
        }
    }//GEN-LAST:event_jtxtCantitateMaterialKeyPressed

    private void jButtAddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButtAddKeyPressed
        if (evt.getKeyCode() == 10) {
            jTableMateriale.requestFocusInWindow();
        }
    }//GEN-LAST:event_jButtAddKeyPressed
    public List<MaterialeComanda> findListMaterialeComanda(int idCom) {
        List<MaterialeComanda> eee = em.createQuery("SELECT s FROM MaterialeComanda s WHERE s.comenzi.idComanda = :id").setParameter("id", idCom).getResultList();
        return eee;
    }

    public List<Materiale> findListMateriale(int idCom) {
        List<Materiale> eee = em.createQuery("SELECT s FROM Materiale s WHERE s.stocMaterial>0 and s.idMaterial = :id").setParameter("id", idCom).getResultList();
        return eee;
    }

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
        Integer idxComandaCurenta = jListComanda.getSelectedIndex();
        Clienti cli = comenziList.get(idxComandaCurenta).getClienti();
        clientiList.clear();
        clientiList.addAll(clientiQuery.getResultList());
        // reselectarea elementului curent la început în lista de navigare principală
        int indCli = clientiList.indexOf(cli);
        if (indCli != -1) {
            jCboClient.setSelectedIndex(idxComandaCurenta);
        } else {
            jCboClient.setSelectedIndex(0);
        }
    }

    private void refreshSalariati() {
        Integer idxComandaCurenta = jListComanda.getSelectedIndex();
        Salariati sal = comenziList.get(idxComandaCurenta).getSalariati();
        salariatiList.clear();
        salariatiList.addAll(salariatiQuery.getResultList());
        int indSal = salariatiList.indexOf(sal);
        if (indSal != -1) {
            jCboSalariat.setSelectedIndex(indSal);
        } else {
            jCboSalariat.setSelectedIndex(0);
        }

    }

    private void refreshMaterialeComanda() {
        Integer idxMatComandaCurenta = jListMaterialeComanda.getSelectedIndex();

        MaterialeComanda mc = materialeComandaList.get(idxMatComandaCurenta);

        Comenzi comenziCurent = comenziList.get(jListComanda.getSelectedIndex());

        MaterialeComanda c = new MaterialeComanda();
        List<MaterialeComanda> xxx = findListMaterialeComanda(comenziCurent.getIdComanda());


        materialeComandaList.clear();
        materialeComandaList.addAll(xxx);

        bindingGroup.getBinding("listccc").unbind();
        bindingGroup.getBinding("listccc").bind();
        int indSal = materialeComandaList.indexOf(mc);
        if (indSal != -1) {

            jListMaterialeComanda.setSelectedIndex(indSal);
        } else {
            jListMaterialeComanda.setSelectedIndex(0);
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Salariati sss = new Salariati();
                sss.setTip("administrator");
                MaterialeComandaView dialog = new MaterialeComandaView(new javax.swing.JFrame(), true, sss);
                if (dialog.wsal.getTip() == sss.getTip()) {
                    JFrame f = new JFrame("Materiale Comanda  ");
                    f.setSize(950, 750);
                    f.add(dialog);

                    //        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    //        });
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
    private javax.swing.JButton jButtNext1;
    private javax.swing.JButton jButtNoSave;
    private javax.swing.JButton jButtPreview;
    private javax.swing.JButton jButtPreview1;
    private javax.swing.JButton jButtSave;
    private javax.swing.JComboBox jCboClient;
    private javax.swing.JComboBox jCboSalariat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jListComanda;
    private javax.swing.JList jListMaterialeComanda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableMateriale;
    private javax.swing.JTextField jtxtCantitateMaterial;
    private javax.swing.JFormattedTextField jtxtDataLansare;
    private javax.swing.JTextField jtxtIdComanda;
    private javax.swing.JTextField jtxtIdMaterial;
    private javax.swing.JTextField jtxtNumeCcomanda;
    private javax.swing.JTextField jtxtValTotMaterial;
    private java.util.List<ent.MaterialeComanda> materialeComandaList;
    private javax.persistence.Query materialeComandaQuery;
    private java.util.List<ent.Materiale> materialeList;
    private javax.persistence.Query materialeQuery;
    private java.util.List<ent.Salariati> salariatiList;
    private javax.persistence.Query salariatiQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
// reţinerea poziţiei curent selectate în lista de navigare

