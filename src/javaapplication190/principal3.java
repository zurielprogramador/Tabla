/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication190;

/**
 *
 * @author Zuriel PC
 */
public class principal3 extends javax.swing.JFrame {

    /**
     * Creates new form principal3
     */
    public principal3() {
        initComponents();
          setLocationRelativeTo(null);
    conceptos.addItem("No metales");
    conceptos.addItem("Metales alcalinos");
    conceptos.addItem("Metales de transición");
    conceptos.addItem("Alcalinotérreos");
    conceptos.addItem("Halógenos");
    conceptos.addItem("Gases nobles");
    conceptos.addItem("Otros metales");
    conceptos.addItem("Metaloides");
    conceptos.addItem("Llantanídos");
    conceptos.addItem("Actínidos");
    conceptos.addItem("Número atomico");
    conceptos.addItem("Simbolo quimico");
    conceptos.addItem("Nombre");
    conceptos.addItem("Masa Atómica");
     this.setExtendedState(this.MAXIMIZED_BOTH);
   
   
 
            
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        conceptos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextField1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Regresar a el menu principal");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 0, 0), null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 790, 180, 30));

        jButton2.setText("Ir a la tabla periodica");
        jButton2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 0), null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1650, 790, 160, 30));

        conceptos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                conceptosActionPerformed(evt);
            }
        });
        getContentPane().add(conceptos, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 790, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Aqui estan los conceptos de la tabla periodica :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 570, 90));

        jTextField1.setColumns(20);
        jTextField1.setRows(5);
        jScrollPane1.setViewportView(jTextField1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 700, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          principal abrir=new  principal();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
          principal2 abrir=new  principal2();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void conceptosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_conceptosActionPerformed
        // TODO add your handling code here:
         String concepto=(String)conceptos.getSelectedItem();
        if(concepto.equals("No metales")){
              jTextField1.setText("Los no metales son elementos químicos que no son buenos conductores de la corriente eléctrica y el calor. Son muy débiles,\n"
                    + " por lo que no se pueden ni estirar ni convertir en una lámina");
        }
           if(concepto.equals("Metales alcalinos")){
            jTextField1.setText("Los metales alcalinos son metales brillantes, blandos,\n "
                    + "altamente reactivos a temperatura y presión estándar y \n"
                    + "pierden fácilmente su electrón más externo para formar cationes con carga +1");
        }
              if(concepto.equals("Metales de transición")){
            jTextField1.setText("Los metales de transición son aquellos elementos químicos que están situados\n"
                    + " en la parte central del sistema periódico,"
                    + " en el bloque D, cuya principal característica es la inclusión en su configuración electrónica del orbital d,\n"
                    + " parcialmente lleno de electrones.");
        }
                 if(concepto.equals("Alcalinotérreos")){
            jTextField1.setText("Son metales de baja densidad, coloreados y blandos."
                    + " Reaccionan con facilidad son los halógenos para formar sales iónicas, y con agua,\n"
                    + " aunque no tan rápido como los alcalinos para forma hidróxidos fuertemente básicos.\n "
                    + "Todos tienen sólo dos electrones en su nivel energético más externo, con tendencia a perderlos.");
        }
                    if(concepto.equals("Halógenos")){
            jTextField1.setText("Estos elementos tienen en común ciertos comportamientos químicos,\n"
                    + "como ser que forman sales de sodio que se parecen mucho entre ellas; por esta razón,\n"
                    + " la etimología de su nombre se puede traducir como productores de sales.");
        }
                       if(concepto.equals("Gases nobles")){
            jTextField1.setText("Los gases nobles son un conjunto de elementos químicos\n"
                    + " que comparten un rango determinado de características: son monoatómicos,\n "
                    + "inodoros e incoloros en condiciones normales, tienen puntos de ebullición muy bajos \n"
                    + "y solo pueden licuarse bajo grandes presiones.");


        }
                          if(concepto.equals("Otros metales")){
            jTextField1.setText("tumbes");
        }
                          if(concepto.equals("Metaloides")){
            jTextField1.setText("ciudad de los reyes");
        }
           if(concepto.equals("Llantanídos")){
            jTextField1.setText("ciudad de la amistad");
        }
              if(concepto.equals("Actínidos")){
            jTextField1.setText("Trujiyo");
        }
                 if(concepto.equals("Número atomico")){
            jTextField1.setText("cajamarca");
        }
                    if(concepto.equals("Simbolo quimico")){
            jTextField1.setText("chimbote");
        }
                       if(concepto.equals("Nombre")){
            jTextField1.setText("ciudad de la piura");
        }
                          if(concepto.equals("Masa Atómica")){
            jTextField1.setText("tumbes");
        }
            
    }//GEN-LAST:event_conceptosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> conceptos;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextField1;
    // End of variables declaration//GEN-END:variables
}
