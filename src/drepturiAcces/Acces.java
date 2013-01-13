/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package drepturiAcces;

import java.lang.String;


public class Acces {

    public String tipAcces;
    public String[] accesSalariatiView;
    public String[] accesRecepriiMaterialeView ;
    public String[] accesMaterialeView ;
    public String[] accesMaterialeComandaView ;
    public String[] accesLansareComandaView ;
    public String[] accesFurnizoriView ;
    public String[] accesFacturaView ;

    public Acces(String tipAcces) {
        this.tipAcces = tipAcces;
    }

    public boolean fc_accesSalariatiView(String st) {
        accesSalariatiView = new String[1];
        accesSalariatiView[0] = "administrator";
        boolean var = false;
        for (int i = 0; i < accesSalariatiView.length; i++) {
            if (accesSalariatiView[i].trim().equals(st.trim())) {
                var = true;
            }
        }
        return var;
    }

    public boolean fc_accesRecepriiMaterialeView(String st) {
        accesRecepriiMaterialeView = new String[3];
        accesRecepriiMaterialeView[0] = "administrator";
        accesRecepriiMaterialeView[1] = "administrator";
        accesRecepriiMaterialeView[2] = "administrator";

        boolean var = false;
        for (int i = 0; i < accesRecepriiMaterialeView.length; i++) {
            if (accesRecepriiMaterialeView[i].trim().equals(st.trim())) {
                var = true;
            }
        }
        return var;
    }
    public boolean fc_accesMaterialeView(String st) {
        accesMaterialeView = new String[3];
        accesMaterialeView[0] = "administrator";
        accesMaterialeView[1] = "administrator";
        accesMaterialeView[2] = "administrator";

        boolean var = false;
        for (int i = 0; i < accesMaterialeView.length; i++) {
            if (accesMaterialeView[i].trim().equals(st.trim())) {
                var = true;
            }
        }
        return var;
    }
    public boolean fc_accesMaterialeComandaView(String st) {
        accesMaterialeComandaView = new String[3];
        accesMaterialeComandaView[0] = "administrator";
        accesMaterialeComandaView[1] = "administrator";
        accesMaterialeComandaView[2] = "administrator";

        boolean var = false;
        for (int i = 0; i < accesMaterialeComandaView.length; i++) {
            if (accesMaterialeComandaView[i].trim().equals(st.trim())) {
                var = true;
            }
        }
        return var;
    }
    public boolean fc_accesLansareComandaView(String st) {
        accesLansareComandaView = new String[3];

        accesLansareComandaView[0] = "administrator";
        accesLansareComandaView[1] = "administrator";
        accesLansareComandaView[2] = "administrator";

        boolean var = false;
        for (int i = 0; i < accesLansareComandaView.length; i++) {
            if (accesLansareComandaView[i].trim().equals(st.trim())) {
                var = true;
            }
        }
        return var;
    }
    public boolean fc_accesFurnizoriView(String st) {
        accesFurnizoriView = new String[3];

        accesFurnizoriView[0] = "administrator";
        accesFurnizoriView[1] = "administrator";
        accesFurnizoriView[2] = "administrator";

        boolean var = false;
        for (int i = 0; i < accesFurnizoriView.length; i++) {
            if (accesFurnizoriView[i].trim().equals(st.trim())) {
                var = true;
            }
        }
        return var;
    }
    public boolean fc_accesFacturaView(String st) {
        accesFacturaView = new String[3];

        accesFacturaView[0] = "administrator";
        accesFacturaView[1] = "administrator";
        accesFacturaView[2] = "administrator";

        boolean var = false;
        for (int i = 0; i < accesFacturaView.length; i++) {
            if (accesFacturaView[i].trim().equals(st.trim())) {
                var = true;
            }
        }
        return var;
    }

}
