package co.com.gs.proteccionpdf;

import java.awt.Desktop;
import java.awt.FileDialog;
import java.awt.HeadlessException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.apache.pdfbox.exceptions.COSVisitorException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.edit.PDPageContentStream;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDJpeg;
import org.apache.pdfbox.pdmodel.graphics.xobject.PDXObjectImage;

/**
 *
 * @author Gustavo Salgado O.
 * @version 1.1 - 2015
 */
public class PDFimageUI extends javax.swing.JFrame {

    private String rutaPDF;
    private String nombrePDF;
    private String rutaPDFImprimible;

    public PDFimageUI() {
        initComponents();

        setLocationRelativeTo(null);
        btAbrirPDF.setVisible(false);
        btAbrirUbicacion.setVisible(false);

        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icono3.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btBuscar = new javax.swing.JButton();
        cRutaPDF = new javax.swing.JTextField();
        lMsj = new javax.swing.JLabel();
        btAbrirUbicacion = new javax.swing.JButton();
        btAbrirPDF = new javax.swing.JButton();
        btConvertir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jMenu = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Restringir Edición PDF por Gustavo Salgado");
        setResizable(false);

        btBuscar.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.setToolTipText("Seleccione el archivo PDF al que le desea convertir en PDF con Imagenes");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        cRutaPDF.setEditable(false);
        cRutaPDF.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N

        lMsj.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        lMsj.setText("Esperando");

        btAbrirUbicacion.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        btAbrirUbicacion.setText("Abrir Ubicación PDF");
        btAbrirUbicacion.setToolTipText("Abrir ubicación del archivo en el Explorador del Sistema Operativo");
        btAbrirUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirUbicacionActionPerformed(evt);
            }
        });

        btAbrirPDF.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        btAbrirPDF.setText("Abrir PDF");
        btAbrirPDF.setToolTipText("Abrir PDF en el Visor del Sistema");
        btAbrirPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAbrirPDFActionPerformed(evt);
            }
        });

        btConvertir.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        btConvertir.setText("Convertir");
        btConvertir.setToolTipText("Clic para Iniciar el proceso de conversión.");
        btConvertir.setEnabled(false);
        btConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConvertirActionPerformed(evt);
            }
        });

        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jMenuItem1.setText("Acerca de");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenu.add(jMenu2);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lMsj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btAbrirUbicacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btAbrirPDF))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cRutaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btConvertir, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(cRutaPDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConvertir))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMsj)
                    .addComponent(btAbrirUbicacion)
                    .addComponent(btAbrirPDF))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        buscarArchivoSO();
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConvertirActionPerformed
        //ejecuta hilo para no bloquear UI
        Thread t1 = new Thread(new Runnable() {
            public void run() {
                lMsj.setText("Transformando ...");
                transformarPDF();
            }
        });
        t1.start();

    }//GEN-LAST:event_btConvertirActionPerformed

    private void btAbrirUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirUbicacionActionPerformed
        abrirEnEscritorio(rutaPDF);
    }//GEN-LAST:event_btAbrirUbicacionActionPerformed

    private void btAbrirPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAbrirPDFActionPerformed
        abrirEnEscritorio(rutaPDFImprimible);
    }//GEN-LAST:event_btAbrirPDFActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new AboutMeUI().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel("org.netbeans.swing.laf.dark.DarkMetalLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PDFimageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PDFimageUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAbrirPDF;
    private javax.swing.JButton btAbrirUbicacion;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btConvertir;
    private javax.swing.JTextField cRutaPDF;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lMsj;
    // End of variables declaration//GEN-END:variables

    
    /**
     * Buscar Archivo PDF que se va a convertir
     */
    private void buscarArchivoSO() {
        lMsj.setText("Esperando");
        FileDialog fd = new FileDialog(this, "Seleccione Archivo PDF a convertir", FileDialog.LOAD);
        fd.setDirectory(cRutaPDF.getText());
        fd.setFile("*.pdf;*.PDF");
        fd.setAlwaysOnTop(true);
        fd.setVisible(true);
        if (fd.getFile() != null) {
            rutaPDF = fd.getDirectory();
            nombrePDF = fd.getFile();
            setTitle("Seguridad para PDFs  " + rutaPDF + " - GASO");
            btConvertir.setEnabled(true);
            cRutaPDF.setText(nombrePDF);
        }

    }

    /**
     * En base al archivo PDF seleccionado se realiza conversion analizando
     * cada pagina y convirtiendola en imagen para posterior a ello
     * unificarlo en un archivo PDF
     */
    private void transformarPDF() {
        try {
            //@see http://stackoverflow.com/questions/18189314/convert-a-pdf-file-to-image
            String rutaPDFOriginal = rutaPDF + nombrePDF; // Pdf files are read from this folder
            File pdfOriginal = new File(rutaPDFOriginal);

            if (pdfOriginal.exists()) {
                //System.out.println("Images copied to Folder: " + destinationFile.getName());
                PDDocument document = PDDocument.load(rutaPDFOriginal);

                //Documento Fondo Blanco
                PDDocument documentoCool = new PDDocument();

                List<PDPage> list = document.getDocumentCatalog().getAllPages();
                System.out.println("Total files to be converted -> " + list.size());

                String nombrePDFOriginal = pdfOriginal.getName().replace(".pdf", "");
                int pageNumber = 1;
                for (PDPage page : list) {
                    BufferedImage image = page.convertToImage();

                    pageNumber++;

                    //Crear pagina nueva para el PDF Convertido
                    float width = image.getWidth();
                    float height = image.getHeight();
                    PDPage paginaSinFondo = new PDPage(new PDRectangle(width, height));
                    documentoCool.addPage(paginaSinFondo);
                    PDXObjectImage img = new PDJpeg(documentoCool, image);
                    PDPageContentStream contentStream = new PDPageContentStream(documentoCool, paginaSinFondo);
                    contentStream.drawImage(img, 0, 0);
                    contentStream.close();

                }
                document.close();
                rutaPDFImprimible = rutaPDF + nombrePDFOriginal + "_img.pdf";
                documentoCool.save(rutaPDFImprimible);
                documentoCool.close();

                estadoConversion(true);
            } else {
                JOptionPane.showMessageDialog(this, "No se logró identificar la ruta del archivo, por favor verifique que el archivo si existe o no halla sido movido durante el proceso.", "Ruta de archivo no encontrada", JOptionPane.WARNING_MESSAGE);
            }

        } catch (IOException | COSVisitorException | HeadlessException e) {
            estadoConversion(false);
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error durante el proceso de conversión", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Dado un recurso(carpeta/archivo) lo abre con la config del s.o.
     *
     * @param recurso
     */
    private void abrirEnEscritorio(String recurso) {
        if (!cRutaPDF.getText().isEmpty()) {
            File directorio = new File(recurso);
            if (Desktop.isDesktopSupported()) {
                try {
                    Desktop.getDesktop().open(directorio);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "No se logro encontrar el recurso(" + recurso + "),intente de nuevo realizar la conversión o revise que el archivo cumpla con los requisitos para poder ser transformado en un PDF Imprimible", "Error abriendo recurso", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Para poder abrir el recurso primero debe de seleccionar un archivo que desea transformar y realizar el proceso de conversión.", "Aun no ha seleccionado un archivo", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void estadoConversion(boolean estado) {
        if (estado) {
            lMsj.setText("Conversión Exitosa");
            lMsj.setForeground(new java.awt.Color(0, 102, 0));
        } else {
            lMsj.setText("Error en Conversión");
            lMsj.setForeground(new java.awt.Color(255, 0, 0));
        }
        btAbrirUbicacion.setVisible(estado);
        btAbrirPDF.setVisible(estado);
    }

}
