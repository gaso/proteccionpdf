package co.com.gs.proteccionpdf;

import java.awt.Desktop;
import java.net.URL;
import javax.swing.UIManager;

/**
 *
 * @author Gustavo Salgado O.
 * @version 1.1 - 2021
 */
public class AboutMeUI extends javax.swing.JFrame {

    public AboutMeUI() {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icono3.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconLogo = new javax.swing.JLabel();
        lTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        lMe = new javax.swing.JLabel();
        iconTwitter = new javax.swing.JLabel();
        lLibraries = new javax.swing.JLabel();
        iconLicence = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acerca de Proyecto Protección PDF");
        setAlwaysOnTop(true);
        setResizable(false);

        iconLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono3.png"))); // NOI18N

        lTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lTitulo.setText("Protección PDF - Versión 1.1");

        txtInfo.setEditable(false);
        txtInfo.setColumns(20);
        txtInfo.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtInfo.setLineWrap(true);
        txtInfo.setRows(5);
        txtInfo.setText("Esta aplicación convierte el contenido de un PDF a PDF con imágenes con lo que genera una capa de seguridad que evita que el contenido sea editado directamente. Esto puede llegar a ser útil cuando necesitamos garantizar que la información que enviamos a través de un archivo PDF no sea alterada.");
        txtInfo.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtInfo);

        lMe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lMe.setText("Gustavo Salgado");

        iconTwitter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twitter.png"))); // NOI18N
        iconTwitter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconTwitterMouseClicked(evt);
            }
        });

        lLibraries.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lLibraries.setText("Librería Utilizada: Apache Pdfbox| Imágenes de Iconfinder");

        iconLicence.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        iconLicence.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cc.png"))); // NOI18N
        iconLicence.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconLicenceMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lMe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(iconTwitter)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(iconLogo)
                                .addGap(74, 74, 74)
                                .addComponent(lTitulo)
                                .addGap(0, 207, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lLibraries)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(iconLicence)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconLogo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lTitulo)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMe)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lLibraries))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(iconTwitter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(iconLicence)))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconLicenceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconLicenceMouseClicked
        openWebPage("http://creativecommons.org/licenses/by-sa/4.0/");
    }//GEN-LAST:event_iconLicenceMouseClicked

    private void iconTwitterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconTwitterMouseClicked
        openWebPage("https://twitter.com/edgaso");
    }//GEN-LAST:event_iconTwitterMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("org.netbeans.swing.laf.dark.DarkMetalLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDFimageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AboutMeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconLicence;
    private javax.swing.JLabel iconLogo;
    private javax.swing.JLabel iconTwitter;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lLibraries;
    private javax.swing.JLabel lMe;
    private javax.swing.JLabel lTitulo;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables

    public static void openWebPage(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
