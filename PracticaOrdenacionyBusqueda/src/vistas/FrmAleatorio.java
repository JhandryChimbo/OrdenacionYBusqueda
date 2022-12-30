/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import controlador.CadenaControlador;
import controlador.listas.ListaEnlazada;


import vistas.modelo.ModeloTablaAleatorio;

/**
 *
 * @author DEEPIN
 */
public class FrmAleatorio extends javax.swing.JFrame {
    
    private CadenaControlador cc = new CadenaControlador();
    private ModeloTablaAleatorio mta = new ModeloTablaAleatorio();
    

    /**
     * Creates new form FrmAleatorio
     */
    public FrmAleatorio() {
        initComponents();
        cargarTabla();
        setLocationRelativeTo(null);
    }
    
    public void ordenar(){
        Integer pos = cbxOrdenar.getSelectedIndex();
        if(pos == 0){
            cargarTabla();
        }
        try{
            if(pos == 1){
                mta.setAleatorios(cc.getAleatorios().ordenarShell(null, ListaEnlazada.ASCENDENTE));
            }
            if(pos == 2){
                mta.setAleatorios(cc.getAleatorios().ordenarShell(null, ListaEnlazada.DESCENDENTE));
                
            }
            tblTablaAleatorio.setModel(mta);
            tblTablaAleatorio.updateUI();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    private void cargarTabla() {
        if (cc != null) {
            mta.setAleatorios(cc.getAleatorios());
            tblTablaAleatorio.setModel(mta);
            tblTablaAleatorio.updateUI();
            jScrollPane1.setVisible(true);
        } else {
            jScrollPane1.setVisible(true);
        }
        
    }
    
    private void generarAleatorios() {
        cc.generarStringAleatorio();
        cargarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaAleatorio = new javax.swing.JTable();
        btnGenerarAleatorio = new javax.swing.JButton();
        cbxOrdenar = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblTablaAleatorio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTablaAleatorio);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, 210));

        btnGenerarAleatorio.setText("Generar Aleatorios");
        btnGenerarAleatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarAleatorioActionPerformed(evt);
            }
        });
        jPanel2.add(btnGenerarAleatorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, -1, -1));

        cbxOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NONE", "ASCENDENTE", "DESCENDENTE", " " }));
        cbxOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxOrdenarActionPerformed(evt);
            }
        });
        jPanel2.add(cbxOrdenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Ordenacion:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ORDENACION STRING ALEATORIOS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 550, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarAleatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarAleatorioActionPerformed
        generarAleatorios();
    }//GEN-LAST:event_btnGenerarAleatorioActionPerformed

    private void cbxOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxOrdenarActionPerformed
        ordenar();
    }//GEN-LAST:event_cbxOrdenarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAleatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAleatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarAleatorio;
    private javax.swing.JComboBox<String> cbxOrdenar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaAleatorio;
    // End of variables declaration//GEN-END:variables
}
