/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.SystemAdminWorkArea;

/**
 *
 * @author pradnyalgandhi
 */
public class SystemAdminWorkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkJPanel
     */
    public SystemAdminWorkJPanel() {
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

        btnManageHospital = new javax.swing.JButton();
        btnCreateHospital = new javax.swing.JButton();
        btnCreateTestCenter = new javax.swing.JButton();
        btnManageTestCenter = new javax.swing.JButton();
        btnCreatePerson = new javax.swing.JButton();
        btnManagePerson = new javax.swing.JButton();
        btnManageVaccineManufacturer = new javax.swing.JButton();
        btnCreateVaccineManufacturer = new javax.swing.JButton();
        btnManageVaccinationCenter = new javax.swing.JButton();
        btnCreateVaccinationCenter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnManageHospital.setText("Manage Hospital");
        btnManageHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalActionPerformed(evt);
            }
        });

        btnCreateHospital.setText("Create Hospital");
        btnCreateHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateHospitalActionPerformed(evt);
            }
        });

        btnCreateTestCenter.setText("Create Test Center");
        btnCreateTestCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTestCenterActionPerformed(evt);
            }
        });

        btnManageTestCenter.setText("Manage Test Center");
        btnManageTestCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageTestCenterActionPerformed(evt);
            }
        });

        btnCreatePerson.setText("Create Person");
        btnCreatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePersonActionPerformed(evt);
            }
        });

        btnManagePerson.setText("Manage Person");
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });

        btnManageVaccineManufacturer.setText("Manage Vaccine Manufacturer");
        btnManageVaccineManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVaccineManufacturerActionPerformed(evt);
            }
        });

        btnCreateVaccineManufacturer.setText("Create Vaccine Manufacturer");
        btnCreateVaccineManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVaccineManufacturerActionPerformed(evt);
            }
        });

        btnManageVaccinationCenter.setText("Manage Vaccination Center");
        btnManageVaccinationCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageVaccinationCenterActionPerformed(evt);
            }
        });

        btnCreateVaccinationCenter.setText("Create Vaccination Center");
        btnCreateVaccinationCenter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateVaccinationCenterActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome, System Admin ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCreateVaccinationCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageVaccinationCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnCreateVaccineManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageVaccineManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreatePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageHospital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateTestCenter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnManageTestCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(385, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(btnCreatePerson)
                .addGap(18, 18, 18)
                .addComponent(btnManagePerson)
                .addGap(18, 18, 18)
                .addComponent(btnCreateHospital)
                .addGap(18, 18, 18)
                .addComponent(btnManageHospital)
                .addGap(18, 18, 18)
                .addComponent(btnCreateTestCenter)
                .addGap(18, 18, 18)
                .addComponent(btnManageTestCenter)
                .addGap(18, 18, 18)
                .addComponent(btnCreateVaccineManufacturer)
                .addGap(18, 18, 18)
                .addComponent(btnManageVaccineManufacturer)
                .addGap(18, 18, 18)
                .addComponent(btnCreateVaccinationCenter)
                .addGap(18, 18, 18)
                .addComponent(btnManageVaccinationCenter)
                .addContainerGap(273, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageHospitalActionPerformed

    private void btnCreateHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateHospitalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateHospitalActionPerformed

    private void btnCreateTestCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTestCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateTestCenterActionPerformed

    private void btnManageTestCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageTestCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageTestCenterActionPerformed

    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagePersonActionPerformed

    private void btnManageVaccineManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVaccineManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageVaccineManufacturerActionPerformed

    private void btnCreateVaccineManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVaccineManufacturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateVaccineManufacturerActionPerformed

    private void btnCreatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreatePersonActionPerformed

    private void btnManageVaccinationCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageVaccinationCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManageVaccinationCenterActionPerformed

    private void btnCreateVaccinationCenterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateVaccinationCenterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCreateVaccinationCenterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateHospital;
    private javax.swing.JButton btnCreatePerson;
    private javax.swing.JButton btnCreateTestCenter;
    private javax.swing.JButton btnCreateVaccinationCenter;
    private javax.swing.JButton btnCreateVaccineManufacturer;
    private javax.swing.JButton btnManageHospital;
    private javax.swing.JButton btnManagePerson;
    private javax.swing.JButton btnManageTestCenter;
    private javax.swing.JButton btnManageVaccinationCenter;
    private javax.swing.JButton btnManageVaccineManufacturer;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
