/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.VaccineManufacturer;

import Business.City.City;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.DeliveryManagerRole;
import Business.Role.Role;
import Business.Role.VaccinationCenterStaffRole;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import java.awt.Component;

/**
 *
 * @author pradnyalgandhi
 */
public class ManageDeliveryManagerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManagerJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    public ManageDeliveryManagerJPanel(JPanel userProcessContainer,City city,UserAccount userAccount,Organization organization,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.userAccount=userAccount;
        this.city=city;
        this.organization=organization;
        this.enterprise=enterprise;
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
        tblDeliveryManager = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        lblManageAdmin = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        lblUsername = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtStaffID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        tblDeliveryManager.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Staff ID", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblDeliveryManager);

        btnUpdate.setText("Update");

        lblManageAdmin.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageAdmin.setForeground(new java.awt.Color(204, 204, 204));
        lblManageAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageAdmin.setText("Manage Delivery Manager");

        lblPassword.setText("Password:");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");

        lblUsername.setText("Username:");

        btnView.setText("View");

        lblName.setText("Name:");

        jLabel1.setText("StaffID");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(337, 337, 337)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(18, 18, 18)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPassword)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreate))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lblName))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 370, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblManageAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(81, 81, 81))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(10, 10, 10)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(27, 27, 27)
                .addComponent(lblManageAdmin)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnView)
                        .addComponent(btnDelete))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsername)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnUpdate))
                .addContainerGap(279, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(txtName.getText());
        String userName = txtUsername.getText();
        String password = txtPassword.getText();
        if (enterprise.getUserAccountDirectory().authenticateUser(userName, password) != null) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                    return;
        }

        if (userName.equals("") || password.equals("")) {
               JOptionPane.showMessageDialog(null, "Username and password can not be empty");
                    return;
        }
        Role role = new DeliveryManagerRole();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
                     
       populateTable();
    }//GEN-LAST:event_btnCreateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageOrdersJPanel manageOrderjp = (ManageOrdersJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageAdmin;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblDeliveryManager;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDeliveryManager.getModel();
        dtm.setRowCount(0);

            
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if("Business.Role.DeliveryManagerRole".equals(userAccount.getRole().getClass().getName())){
                    System.out.println(userAccount.getRole());
                    Object[] row = new Object[4];
                    row[0] = userAccount;
                    row[1] = userAccount.getEmployee().getId();
                    row[2] = userAccount.getEmployee().getName();
                    row[3] = userAccount.getPassword();

                    dtm.addRow(row);
                }
                }

    }
}