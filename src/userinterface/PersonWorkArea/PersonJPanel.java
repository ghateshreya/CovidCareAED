/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.PersonWorkArea;

/**
 *
 * @author pradnyalgandhi
 */
public class PersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PersonJPanel
     */
    public PersonJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCitywiseVaccinationStatus = new javax.swing.JButton();
        btnTotalPositiveCases = new javax.swing.JButton();
        btnHospitalWiseAvailableBeds = new javax.swing.JButton();

        btnCitywiseVaccinationStatus.setText("Citywise Vaccination Status");
        btnCitywiseVaccinationStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitywiseVaccinationStatusActionPerformed(evt);
            }
        });

        btnTotalPositiveCases.setText("Total Positive Cases");
        btnTotalPositiveCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTotalPositiveCasesActionPerformed(evt);
            }
        });

        btnHospitalWiseAvailableBeds.setText("Hospital Wise Available Beds");
        btnHospitalWiseAvailableBeds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospitalWiseAvailableBedsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(422, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHospitalWiseAvailableBeds, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTotalPositiveCases, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCitywiseVaccinationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(btnCitywiseVaccinationStatus)
                .addGap(18, 18, 18)
                .addComponent(btnTotalPositiveCases)
                .addGap(18, 18, 18)
                .addComponent(btnHospitalWiseAvailableBeds)
                .addContainerGap(410, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCitywiseVaccinationStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitywiseVaccinationStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCitywiseVaccinationStatusActionPerformed

    private void btnTotalPositiveCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTotalPositiveCasesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTotalPositiveCasesActionPerformed

    private void btnHospitalWiseAvailableBedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospitalWiseAvailableBedsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHospitalWiseAvailableBedsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCitywiseVaccinationStatus;
    private javax.swing.JButton btnHospitalWiseAvailableBeds;
    private javax.swing.JButton btnTotalPositiveCases;
    // End of variables declaration//GEN-END:variables
}