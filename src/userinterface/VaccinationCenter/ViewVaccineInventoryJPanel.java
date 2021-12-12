/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VaccinationCenter;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.VaccineManufacturer;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Order;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ayushgupta
 */
public class ViewVaccineInventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageVaccineInventory
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public ViewVaccineInventoryJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system){
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Vaccine Name", "Batch ID", "Qty"
            }
        ));
        jScrollPane1.setViewportView(tblInventory);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel1.setText("INVENTORY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRefresh)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(410, 410, 410))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnRefresh)
                .addContainerGap(424, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        populateTable();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblInventory.getModel();
        dtm.setRowCount(0);
         
       
         for(City c : system.getCityList()){
             
           for(Enterprise e : c.getEnterpriseDirectory().getEnterpriseList()){
               
               if(e.getClass().getName().equals("Business.Enterprise.VaccineManufacturer")){
                   //System.out.println(e);
                    for(UserAccount user:enterprise.getUserAccountDirectory().getUserAccountList()){
                        
                        for(WorkRequest wr:e.getWorkQueue().getWorkRequestList()){
                           Order order = (Order)wr;
                           //System.out.println(order.getSender()==user);
                           if(order.getSender()==user && order.getStatus().equals("Delivered")){
                               //System.out.println(order);
                               Object[] row = new Object[3];
                                row[0] = order;
                                row[1] = order.getId();
                                row[2] = order.getQuantity();
                            dtm.addRow(row);
                           }
                       }
                   }
               }
           }
       }
    }
}