/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VaccineManufacturer;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.VaccineManufacturer;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.Vaccine.VaccineDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pradnyalgandhi
 */
public class ManageInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageInventoryJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    //VaccineManufacturer e =(VaccineManufacturer)enterprise;
    public ManageInventoryJPanel(JPanel userProcessContainer,City city,UserAccount userAccount,Organization organization,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
        //VaccineManufacturer e =(VaccineManufacturer)enterprise;
        populateTable();
    }
    //VaccineManufacturer e =(VaccineManufacturer)enterprise;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblManageInventory = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        txtAvailability = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVaccineInventory = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblBatch = new javax.swing.JLabel();
        txtBatchNo = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        lblQuantity = new javax.swing.JLabel();
        txtStatus = new javax.swing.JTextField();
        lblStatus = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        lblManageInventory.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageInventory.setForeground(new java.awt.Color(204, 204, 204));
        lblManageInventory.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageInventory.setText("Manage Vaccine Inventory");

        lblAvailability.setText("Available Vaccine Stock:");

        txtAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailabilityActionPerformed(evt);
            }
        });

        tblVaccineInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Batch Number", "Quantity", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblVaccineInventory);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblBatch.setText("Batch No:");

        lblQuantity.setText("Quantity:");

        lblStatus.setText("Status:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(339, 339, 339)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuantity)
                                .addGap(18, 18, 18)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblStatus)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnUpdate)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAdd))
                                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lblBatch))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBatchNo, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtName))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblManageInventory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView)
                        .addGap(347, 347, 347)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 166, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAvailability)
                                .addGap(18, 18, 18)
                                .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(403, 403, 403))
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(lblManageInventory)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailability)
                    .addComponent(txtAvailability, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBatch)
                    .addComponent(txtBatchNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblQuantity)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStatus)
                    .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(178, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        
         int qty;
         int batchId;
         String status;
         String name;
         qty = Integer.parseInt(txtQuantity.getText());
         batchId = Integer.parseInt(txtBatchNo.getText());
         status = txtStatus.getText();
         name = txtName.getText();
         VaccineManufacturer e =(VaccineManufacturer)enterprise;
         System.out.println(e.getVaccineDirectory().getVaccDir());
         Vaccine v = e.getVaccineDirectory().addVaccDir(qty, batchId, status, name);
         /*v.setBatchId(batchId);
         v.setName(name);
         v.setQty(qty);
         v.setStatus(status);*/
         populateTable();
         
         
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VaccineManufacturer e =(VaccineManufacturer)enterprise;
        int count = 0;
        for(Vaccine vaccine: e.getVaccineDirectory().getVaccDir()){
          count = count+vaccine.getQty();
        }
        txtAvailability.setText(String.valueOf(count));
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailabilityActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectRow = tblVaccineInventory.getSelectedRow();
        //VaccineManufacturer e =(VaccineManufacturer)enterprise;
        if(selectRow>=0){
            String name= (String) tblVaccineInventory.getValueAt(selectRow, 0);
            int BatchID= (int) tblVaccineInventory.getValueAt(selectRow, 1);
            int Quantity = (int) tblVaccineInventory.getValueAt(selectRow, 2);
            String status= (String) tblVaccineInventory.getValueAt(selectRow, 3);
            
            txtName.setText(name);
            txtBatchNo.setText(String.valueOf(BatchID));
            txtQuantity.setText(String.valueOf(Quantity));
            txtStatus.setText(status);
        }
        else {
            JOptionPane.showMessageDialog(null,"Please select a row");
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        VaccineManufacturer e =(VaccineManufacturer)enterprise;
        int qty=Integer.parseInt(txtQuantity.getText());
        int batchId=Integer.parseInt(txtBatchNo.getText());
        String status=txtStatus.getText();
        String name=txtName.getText();
        
        for(Vaccine v: e.getVaccineDirectory().getVaccDir()){
            if(v.getBatchId()==batchId){
                v.setName(name);
                v.setQty(qty);
                v.setStatus(status);
            }
        }
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        VaccineManufacturer e =(VaccineManufacturer)enterprise;
        int batchId=Integer.parseInt(txtBatchNo.getText());
        for(Vaccine v: e.getVaccineDirectory().getVaccDir()){
            if(v.getBatchId()==batchId){
                e.getVaccineDirectory().getVaccDir().remove(v);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageOrdersJPanel manageOrderjp = (ManageOrdersJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblBatch;
    private javax.swing.JLabel lblManageInventory;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTable tblVaccineInventory;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtBatchNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtStatus;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
         DefaultTableModel dtm = (DefaultTableModel) tblVaccineInventory.getModel();
        dtm.setRowCount(0);

                VaccineManufacturer vm =(VaccineManufacturer)enterprise;
                for (Vaccine vaccine : vm.getVaccineDirectory().getVaccDir()) {
                    
                    Object[] row = new Object[4];
                    row[0] = vaccine.getName();
                    row[1] = vaccine.getBatchId();
                    row[2] = vaccine.getQty();
                    row[3] = vaccine.getStatus();
                   
                   

                    dtm.addRow(row);
                
                } //To change body of generated methods, choose Tools | Templates.
    }
}
