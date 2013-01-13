package gui;

import ent.Salariati;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.UIManager;

import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeSelectionModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;


import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JOptionPane;

public class PaginaPrincipala extends JPanel implements TreeSelectionListener {

    private JTree tree;
    private static boolean DEBUG = false;
    static JFrame frame;
    JScrollPane treeView;
    JSplitPane splitPane;
    JScrollPane appView;
    JScrollPane infoView;
    JSplitPane vpane;
    private static boolean playWithLineStyle = false;
    private static String lineStyle = "Horizontal";
    // setez the look and feel.
    private static boolean useSystemLookAndFeel = true;
    public static Salariati sal_logat;

    public PaginaPrincipala(Salariati sal_logat) {
        super(new GridLayout(1, 0));
        this.sal_logat = sal_logat;
        //Creez nodul radacina.
        DefaultMutableTreeNode top =
                new DefaultMutableTreeNode("Aplicatie Management Societate");
        createNodes(top);

        //Create a tree that allows one selection at a time.
        tree = new JTree(top);
        tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);

        //Adaug Listen pentru  sectiunea ce se schimba.
        tree.addTreeSelectionListener(this);

        if (playWithLineStyle) {
            System.out.println("line style = " + lineStyle);
            tree.putClientProperty("JTree.lineStyle", lineStyle);
        }

        //Creez scroll pane si adaug tree-ul in acesta.
        treeView = new JScrollPane(tree);
        JPanel pan1 = new InfoPanel(sal_logat);
        vpane = new JSplitPane(JSplitPane.VERTICAL_SPLIT, treeView, pan1);
        vpane.setDividerLocation(470);
        vpane.setOneTouchExpandable(true);
        split(new JPanel());

    }

    public void split(JPanel jpanel) {
        removeAll();
        appView = new JScrollPane(jpanel);
        splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        JSplitPane splitPane1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane.setTopComponent(vpane);
        splitPane.setBottomComponent(appView);

        Dimension minimumSize = new Dimension(100, 70);
        appView.setMinimumSize(minimumSize);
        treeView.setMinimumSize(minimumSize);
        splitPane.setDividerLocation(200);
        splitPane.setPreferredSize(new Dimension(1000, 700));

        add(splitPane);
    }

    /** selectez nodul ce este selectat in tree. */
    public void valueChanged(TreeSelectionEvent e) {
        DefaultMutableTreeNode node = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();

        if (node == null) {
            return;
        }

        Object nodeInfo = node.getUserObject();
        if (node.isLeaf()) {
            NodInfo book = (NodInfo) nodeInfo;
            executNod(book.numeAplicatie);

        } else {
            executNod("help");
        }
        if (DEBUG) {
            System.out.println(nodeInfo.toString());
        }
    }

    private class NodInfo {

        public String numeOptiune;
        public String numeAplicatie;

        public NodInfo(String numeOptiune, String numeAplicatie) {
            this.numeOptiune = numeOptiune;
            this.numeAplicatie = numeAplicatie;

        }

        public String toString() {
            return numeOptiune;
        }
    }

    private void initHelp() {
    }

    private void executNod(String aplicatie) {
        if (aplicatie.trim() == "SalariatiView") {
            split(new SalariatiView(frame, true, sal_logat));
            frame.pack();
            frame.setVisible(true);
        } else {
            if (aplicatie.trim() == "ClientView") {
                split(new ClientView(frame, true, sal_logat));
                frame.pack();
                frame.setVisible(true);
            } else {

                if (aplicatie.trim() == "ReceptiiMaterialeView") {
                    split(new ReceptiiMaterialeView(frame, true, sal_logat));
                    frame.pack();
                    frame.setVisible(true);
                } else {
                    if (aplicatie.trim() == "LansareComandaView") {
                        split(new LansareComandaView(frame, true, sal_logat));
                        frame.pack();
                        frame.setVisible(true);
                    } else {
                        if (aplicatie.trim() == "FurnizoriView") {
                            split(new FurnizoriView(frame, true, sal_logat));
                            frame.pack();
                            frame.setVisible(true);
                        } else {
                            if (aplicatie.trim() == "MaterialeView") {
                                split(new MaterialeView(frame, true, sal_logat));
                                frame.pack();
                                frame.setVisible(true);
                            } else {
                                if (aplicatie.trim() == "FacturaView") {
                                    split(new FacturaView(frame, true, sal_logat));
                                    frame.pack();
                                    frame.setVisible(true);
                                } else {
                                    if (aplicatie.trim() == "MaterialeComandaView") {
                                        split(new MaterialeComandaView(frame, true, sal_logat));
                                        frame.pack();
                                        frame.setVisible(true);
                                    } else {
                                        split(new JPanel());
                                        frame.pack();
                                        frame.setVisible(true);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void createNodes(DefaultMutableTreeNode top) {
        DefaultMutableTreeNode category = null;
        DefaultMutableTreeNode book = null;

        category = new DefaultMutableTreeNode("Lansare comanda clienti");
        top.add(category);


        book = new DefaultMutableTreeNode(new NodInfo("Clienti",
                "ClientView"));
        category.add(book);


        book = new DefaultMutableTreeNode(new NodInfo("Lansare Comenzi ",
                "LansareComandaView"));
        category.add(book);


        category = new DefaultMutableTreeNode("Receptii Materiale");
        top.add(category);

        book = new DefaultMutableTreeNode(new NodInfo("Receptii Materiale",
                "ReceptiiMaterialeView"));
        category.add(book);

        book = new DefaultMutableTreeNode(new NodInfo("Furnizori",
                "FurnizoriView"));
        category.add(book);

        book = new DefaultMutableTreeNode(new NodInfo("Materiale",
                "MaterialeView"));
        category.add(book);


        category = new DefaultMutableTreeNode("Facturare");
        top.add(category);

        book = new DefaultMutableTreeNode(new NodInfo("Facturare",
                "FacturaView"));
        category.add(book);

        category = new DefaultMutableTreeNode("Administrare");
        top.add(category);



        book = new DefaultMutableTreeNode(new NodInfo("Drepturi acces salariati",
                "SalariatiView"));
        category.add(book);

        category = new DefaultMutableTreeNode("Productie");
        top.add(category);

        book = new DefaultMutableTreeNode(new NodInfo("Consumuri Materiale Comenzi",
                "MaterialeComandaView"));
        category.add(book);





    }

    public static void createAndShowGUI() {
        if (sal_logat != null) {
            if (useSystemLookAndFeel) {
                try {
                    UIManager.setLookAndFeel(
                            UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    System.err.println("Nu gasesc look and feel -ul sistemului.");
                }
            }

            //Create and set up the window.
            frame = new JFrame("Aplicatie Management Societate");

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Add content to the window.
            frame.add(new PaginaPrincipala(sal_logat));

            //Display the window.
            frame.pack();
            frame.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(frame, "Mod de conectare gresit.. reveniti");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            public void run() {
                createAndShowGUI();
                int ii = 0;
            }
        });
    }
}
