/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewReportDialog.java
 *
 * Created on Aug 17, 2010, 9:21:36 PM
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
public class NewReportDialog extends javax.swing.JDialog {

    private JPanel panel = new JPanel();

    /** Creates new form NewReportDialog */
    public NewReportDialog(java.awt.Frame parent, boolean modal, 
            JasperPrint jp, String title) {
        super(parent, modal);
        initComponents();
        this.setTitle(title);
        panel.removeAll();
        BorderLayout layout = new BorderLayout();
        jDesktopPane1.setLayout(layout);
        BorderLayout layout1 = new BorderLayout();
        panel.setLayout(layout1);
        jDesktopPane1.add(panel, BorderLayout.CENTER);
        panel.setBounds(1, 2, 660, 500);
        JRViewer jrviewer = new JRViewer(jp);
        panel.add(jrviewer, BorderLayout.CENTER);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setName("Form"); // NOI18N

        jDesktopPane1.setName("jDesktopPane1"); // NOI18N
        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                NewReportDialog dialog = new NewReportDialog(new javax.swing.JFrame(), true, null, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
