/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import ent.Materiale;
import gui.MaterialeComandaView;
import java.util.List;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SelectionListener implements ListSelectionListener {

    JTable table;
    public int roww;
    List<Materiale> matList;

   
    public SelectionListener(JTable table, List<Materiale> matList) {
        this.table = table;
        this.matList = matList;
    }

    public int Roww() {
        return roww;
    }

    public void valueChanged(ListSelectionEvent e) {
        // If cell selection is enabled, both row and column change events are fired
        if (e.getSource() == table.getSelectionModel()
                && table.getRowSelectionAllowed()) {
            // Column selection changed
            int first = e.getFirstIndex();
            int last = e.getLastIndex();
            roww = table.getSelectedRow();
            MaterialeComandaView.rowTable = table.getSelectedRow();
            if (roww != -1) {
                MaterialeComandaView.wmat = matList.get(roww);
            }

           
        } else if (e.getSource() == table.getColumnModel().getSelectionModel()
                && table.getColumnSelectionAllowed()) {
             int first = e.getFirstIndex();
            int last = e.getLastIndex();


        }

        if (e.getValueIsAdjusting()) {
           
        }
    }



}
