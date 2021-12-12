/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Hospital;

import Business.City.City;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.HospitalStaffRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author shreya.ghate
 */
public class ManageHospitalStaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHospitalStaffJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    EmployeeDirectory employeeDirectory;
    public ManageHospitalStaffJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblManageStaff1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        btnView1 = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtStaffID = new javax.swing.JTextField();
        lblStaffID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        lblManageStaff1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageStaff1.setForeground(new java.awt.Color(204, 204, 204));
        lblManageStaff1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageStaff1.setText("Manage Staff");

        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Staff ID", "Name", "Password"
            }
        ));
        jScrollPane2.setViewportView(tblStaff);

        btnView1.setText("View");

        btnDelete1.setText("Delete");

        jLabel1.setText("UserName");

        jLabel2.setText("Password");

        lblStaffID.setText("Staff ID:");

        lblName.setText("Name:");

        btnUpdate.setText("Update");

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView1)
                .addGap(18, 18, 18)
                .addComponent(btnDelete1)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(lblManageStaff1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStaffID)
                                    .addComponent(lblName)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2))
                                        .addGap(2, 2, 2)))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStaffID)
                                    .addComponent(txtName)
                                    .addComponent(txtUserName)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnUpdate)
                                .addGap(65, 65, 65)
                                .addComponent(btnCreate))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblManageStaff1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView1)
                    .addComponent(btnDelete1))
                .addGap(83, 83, 83)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStaffID)
                    .addComponent(txtStaffID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCreate))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 4, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(txtName.getText());
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        if (enterprise.getUserAccountDirectory().authenticateUser(userName, password) != null) {
            JOptionPane.showMessageDialog(null, "Username Already exists");
            return;
        }

        if (userName.equals("") || password.equals("")) {
            JOptionPane.showMessageDialog(null, "Username and password can not be empty");
            return;
        }
        Role role = new HospitalStaffRole();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);

        populateTable();

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        HospitalAdminJPanel sysAdminwjp = (HospitalAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblManageStaff1;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblStaffID;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

       private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblStaff.getModel();
        dtm.setRowCount(0);

            
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if("Business.Role.HospitalStaffRole".equals(userAccount.getRole().getClass().getName())){
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
