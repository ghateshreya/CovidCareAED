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
import Business.Enterprise.Hospital;
import Business.Enterprise.VaccineManufacturer;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Patient.PatientDirectory;
import Business.Person.Person;
import Business.Role.HospitalStaffRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author shreya.ghate
 */
public class ManagePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    Organization organization;
    Enterprise enterprise;
    City city;
    EmployeeDirectory employeeDirectory;
    PatientDirectory patientDir;
    Hospital hospitalEnterprise =(Hospital)enterprise;

    public ManagePatientJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
            Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.system=system;  
        this.userAccount=userAccount;
        this.enterprise=enterprise;
        this.city=city;
        this.organization=organization;
//        this.patientDir=patientDir;
        populatePersonTable();
        populateComboBox();
        populatePatientTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnViewPerson = new javax.swing.JButton();
        btnDeletePatient = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        lblManagePatient = new javax.swing.JLabel();
        lblQuarantine = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        cboxQuarantineLocation = new javax.swing.JComboBox<>();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnCreatePatient = new javax.swing.JButton();
        cboxVaccinationStatus = new javax.swing.JComboBox<>();
        cboxDoctor = new javax.swing.JComboBox<>();
        lblEnterprise = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPerson = new javax.swing.JTable();

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient ID", "Vaccination Status", "Quarantine", "Doctor"
            }
        ));
        jScrollPane1.setViewportView(tblPatients);

        btnViewPerson.setText("View Person");
        btnViewPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPersonActionPerformed(evt);
            }
        });

        btnDeletePatient.setText("Delete Patient");
        btnDeletePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePatientActionPerformed(evt);
            }
        });

        lblStatus.setText("Vaccination Status:");

        lblManagePatient.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblManagePatient.setForeground(new java.awt.Color(204, 204, 204));
        lblManagePatient.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblManagePatient.setText("Manage Patient Admission");

        lblQuarantine.setText("Quarantine:");

        lblSearch.setText("Person Name:");

        cboxQuarantineLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hospital Quarantine", "Home Quarantine" }));

        lblPassword.setText("Password:");

        lblUsername.setText("Username:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnCreatePatient.setText("Admit Patient");
        btnCreatePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePatientActionPerformed(evt);
            }
        });

        cboxVaccinationStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Partially Vaccinated", "Non-vaccinated", "Fully Vaccinated" }));

        cboxDoctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboxDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxDoctorActionPerformed(evt);
            }
        });

        lblEnterprise.setText("Assign Doctor:");

        lblName.setText("Patient Name:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblPerson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Person Name", "ID", "Age", "Community"
            }
        ));
        jScrollPane2.setViewportView(tblPerson);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblManagePatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblSearch)
                                .addGap(18, 18, 18)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch)
                                .addGap(294, 294, 294))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblName)
                                    .addGap(18, 18, 18))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblUsername)
                                    .addGap(30, 30, 30)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPassword)
                            .addComponent(txtUsername)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEnterprise)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblStatus)
                                    .addComponent(lblQuarantine))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboxQuarantineLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboxVaccinationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreatePatient)
                        .addGap(380, 380, 380)
                        .addComponent(btnDeletePatient))
                    .addComponent(btnViewPerson))
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblManagePatient)
                    .addComponent(btnBack))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSearch)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(206, 206, 206)
                .addComponent(btnViewPerson)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblUsername)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStatus)
                            .addComponent(cboxVaccinationStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQuarantine)
                            .addComponent(cboxQuarantineLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEnterprise))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDeletePatient, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCreatePatient))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(167, 167, 167)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(489, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnCreatePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePatientActionPerformed
        // TODO add your handling code here:
        
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
        
        String VaccinationStatus = "Unassigned";

        if (cboxVaccinationStatus.getSelectedItem() != null) 
        {
            VaccinationStatus = cboxVaccinationStatus.getSelectedItem().toString();
        } else {
            JOptionPane.showMessageDialog(this, "Please select your Vaccination Status");
        }
        String QuarantineLocation = "Unassigned";
        if (cboxQuarantineLocation.getSelectedItem() != null) 
        {
            QuarantineLocation = cboxQuarantineLocation.getSelectedItem().toString();
        } else {
            JOptionPane.showMessageDialog(this, "Please select where is the Quarantine");
        }
        String DoctorName = "unassigned";
        if (cboxDoctor.getSelectedItem() != null) 
        {
            DoctorName = cboxDoctor.getSelectedItem().toString();
            
        } else {
            JOptionPane.showMessageDialog(this, "Please assign a Doctor to this patient");
        }
            Hospital hospitalEnterprise =(Hospital)enterprise;       
        String patientName = txtName.getText();
        int flag=0;
        for(Patient p1:hospitalEnterprise.getPatientDirectory().getPatientDir()){
            if(p1.getName().equals(patientName)){
                flag=1;
            }
        }
        if(flag==0){
            for (Person p:system.getPersonDirectory().getPersonList()){
                if(p.getName().equals(patientName)){ 
            hospitalEnterprise.getPatientDirectory().addPatientDir(p.personID, p.getName(), p.getStreet(), p.getZipcode(), p.getAge(), p.getCommunity(), p.getPhoneNo(), p.getEmail(), DoctorName, QuarantineLocation, VaccinationStatus);
            Role role = new PatientRole();
            UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
            JOptionPane.showMessageDialog(null, "Patient Admitted");
            break;
            } 
        }
        }
        else {
            JOptionPane.showMessageDialog(null, "Patient already exists"); 
            }
        //Patient addPatient = hospitalEnterprise.getPatientDirectory().addPatientDir(DoctorName, QuarantineLocation, VaccinationStatus);
        populatePersonTable();
        populatePatientTable();
        txtUsername.setText("");
        txtName.setText("");
        txtPassword.setText("");
//        System.out.println(ecosystem.getPersonDirectory().getPersonList());
    }//GEN-LAST:event_btnCreatePatientActionPerformed

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        populatePersonTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cboxDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxDoctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboxDoctorActionPerformed

    private void btnViewPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPersonActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPerson.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Person");
        } else {
            DefaultTableModel model = (DefaultTableModel) tblPerson.getModel();
//            UserAccount selectedUser = (UserAccount) model.getValueAt(selectedRow, 0);
            Person selectedPerson = (Person) model.getValueAt(selectedRow, 0);
            txtName.setText(selectedPerson.getName());
        }
    }//GEN-LAST:event_btnViewPersonActionPerformed

    private void btnDeletePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePatientActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Patient");
        } else {
           Hospital e =(Hospital)enterprise;
         String patientname= (String) tblPatients.getValueAt(selectedRow, 0);
            
            txtName.setText(patientname);
        for(Patient p: e.getPatientDirectory().getPatientDir()){
            System.out.println(patientname);
            
            if(p.getName().equals(patientname)){
                //System.out.println(p);
                e.getPatientDirectory().deletePatient(p);
                JOptionPane.showMessageDialog(this, "Patient deleted successfully");
                populatePatientTable();
            }
        }
            
        }
        
    }//GEN-LAST:event_btnDeletePatientActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePatient;
    private javax.swing.JButton btnDeletePatient;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewPerson;
    private javax.swing.JComboBox<String> cboxDoctor;
    private javax.swing.JComboBox<String> cboxQuarantineLocation;
    private javax.swing.JComboBox<String> cboxVaccinationStatus;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblManagePatient;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblQuarantine;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTable tblPatients;
    private javax.swing.JTable tblPerson;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
            cboxDoctor.removeAllItems();
        for(City city : system.getCityList()){
            for(Enterprise e: city.getEnterpriseDirectory().getEnterpriseList()){
                for (UserAccount account: e.getUserAccountDirectory().getUserAccountList()) {
                if("Business.Role.DoctorRole" == account.getRole().toString()){
                    System.out.println("username"+account.getUsername());
                cboxDoctor.addItem(account.getUsername());
            }
            }
            }
            
    }
    }
    private void populatePersonTable() {
        String PersonName="";

        DefaultTableModel dtm = (DefaultTableModel) tblPerson.getModel();
        dtm.setRowCount(0);
 
                Hospital hospitalEnterprise =(Hospital)enterprise;
                for (Person p:system.getPersonDirectory().getPersonList()) {
                    if (!txtSearch.getText().isEmpty()) {
                        PersonName = txtSearch.getText();
                    }
               
                    if (p.getName().equals(PersonName)) {
                    Object[] row = new Object[4];
                    row[0] = p;
                    row[1] = p.getPersonID();
                    row[2] = p.getAge();
                    row[3] = p.getCommunity();

                    dtm.addRow(row);
                
                } 
    }
                
    }
    
        private void populatePatientTable() {

        DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
        dtm.setRowCount(0);
                 Hospital hospitalEnterprise =(Hospital)enterprise;

               //for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()){
                    //System.out.println("useracc"+userAccount);
                        //if("Business.Role.PatientRole" == userAccount.getRole().toString()){
//                            System.out.println("useracc"+userAccount.getRole().toString());
                       for (Patient p : hospitalEnterprise.getPatientDirectory().getPatientDir()) {
                    //if("Business.Role.PatientRole" == userAccount.getRole().toString()){
                    Object[] row = new Object[5];
                    row[0] = p.getName();
                    row[1] = p.getPatientID();
                    row[2] = p.getVaccinationStatus();
                    row[3] = p.getQuarantineStatus();
                    row[4] = p.getDoctorName();

                    dtm.addRow(row);
                }
                       }
              //  }                
                //} 
    
}
