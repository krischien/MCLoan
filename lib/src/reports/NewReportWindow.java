/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewReportWindow.java
 *
 * Created on Aug 18, 2010, 12:44:35 PM
 */
package reports;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author eric
 */
public class NewReportWindow extends javax.swing.JInternalFrame {
    private JPanel panel;
    /** Creates new form NewReportWindow */
    public NewReportWindow(JasperPrint jp) {
        initComponents();
        BorderLayout layout = new BorderLayout();
        jDesktopPane1.setLayout(layout);
        BorderLayout layout1 = new BorderLayout();
        JRViewer jrviewer = new JRViewer(jp);
        jDesktopPane1.add(jrviewer, BorderLayout.CENTER);
        jrviewer.setPreferredSize(new Dimension(600, 451));
        jrviewer.setAutoscrolls(true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();

        setName("Form"); // NOI18N

        jDesktopPane1.setName("jDesktopPane1"); // NOI18N
        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
