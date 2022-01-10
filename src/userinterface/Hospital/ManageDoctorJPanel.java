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
import Business.Person.Person;
import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
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
public class ManageDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    UserAccountDirectory userAccountDir;
    Organization organization;
    Enterprise enterprise;
    City city;
    EmployeeDirectory employeeDirectory;
    public ManageDoctorJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
        this.userAccountDir=userAccountDir;
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

        lblManageManufacturer = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDoctor = new javax.swing.JTable();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(167, 199, 231));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblManageManufacturer.setBackground(new java.awt.Color(0, 0, 0));
        lblManageManufacturer.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManageManufacturer.setForeground(new java.awt.Color(0, 0, 0));
        lblManageManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManageManufacturer.setText("MANAGE DOCTORS");
        add(lblManageManufacturer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 870, -1));

        jScrollPane1.setBackground(new java.awt.Color(214, 229, 244));

        tblDoctor.setBackground(new java.awt.Color(214, 229, 244));
        tblDoctor.setForeground(new java.awt.Color(0, 0, 0));
        tblDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Doctor ID", "Name", "Password"
            }
        ));
        jScrollPane1.setViewportView(tblDoctor);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 960, 183));

        txtName.setBackground(new java.awt.Color(214, 229, 244));
        add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 212, -1));

        lblName.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name:");
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 560, -1, -1));

        btnCreate.setBackground(new java.awt.Color(0, 0, 0));
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 680, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Username:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 610, -1, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 650, -1, -1));

        txtUserName.setBackground(new java.awt.Color(214, 229, 244));
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 600, 212, -1));

        txtPassword.setBackground(new java.awt.Color(214, 229, 244));
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 640, 212, -1));

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(txtName.getText());
        String userName = txtName.getText();
        String password = txtPassword.getText();
        if (enterprise.getUserAccountDirectory().authenticateUser(userName, password) != null) {
                JOptionPane.showMessageDialog(null, "Username Already exists");
                    return;
        }

        if (userName.equals("") || password.equals("")) {
               JOptionPane.showMessageDialog(null, "Username and password can not be empty");
                    return;
        }
        Role role = new DoctorRole();
        UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        System.out.println(employee);
        populateTable();
        txtUserName.setText("");
        txtName.setText("");
        txtPassword.setText("");
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblManageManufacturer;
    private javax.swing.JLabel lblName;
    private javax.swing.JTable tblDoctor;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

          private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblDoctor.getModel();
        dtm.setRowCount(0);

            
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if("Business.Role.DoctorRole" == userAccount.getRole().toString()){
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
