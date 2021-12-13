package userinterface.TestingCenter;


import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Person.Person;
import Business.WorkQueue.TestPatient;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author pradnyalgandhi
 */
public class ManageScheduledTestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageScheduledTestsJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system; 
    Enterprise enterprise;
    public ManageScheduledTestsJPanel(JPanel userProcessContainer,EcoSystem system, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.enterprise = enterprise;
        populateScheduledTests();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreate = new javax.swing.JButton();
        lblCreateTestReport = new javax.swing.JLabel();
        comboReport = new javax.swing.JComboBox<>();
        lblReport = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        scheduledPatientTable = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnView = new javax.swing.JButton();

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        lblCreateTestReport.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lblCreateTestReport.setForeground(new java.awt.Color(204, 204, 204));
        lblCreateTestReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTestReport.setText("SCHEDULED TEST");

        comboReport.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Detected", "Non-detected" }));

        lblReport.setText("Report:");

        lblDate.setText("Date:");

        lblID.setText("ID:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        scheduledPatientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Name"
            }
        ));
        jScrollPane1.setViewportView(scheduledPatientTable);

        lblName.setText("Name:");

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCreateTestReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblReport)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnCreate))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboReport, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblID)
                        .addGap(18, 18, 18)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDate)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblName)
                            .addGap(18, 18, 18)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnView)
                .addGap(79, 79, 79))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCreateTestReport)
                    .addComponent(btnBack))
                .addGap(73, 73, 73)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDate)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblReport)
                    .addComponent(comboReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCreate)
                .addContainerGap(212, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String personID = txtID.getText();
        String personName = txtName.getText();
        String date = txtDate.getText();
//        System.out.println(date);
        Boolean result = false;
        if(comboReport.getSelectedItem().toString().equals("Detected")){
            result = true;
        }
        else{
            result = false;
        }

        for(Person person: system.getPersonDirectory().getPersonList()){
            if(personName.equals(person.getName())){
                person.getTestHistory().newTestReport(date,result);
                //                System.out.println(date);

                //                System.out.println( person.getTestHistory().getTestReportList().get(0));
            }
        }

    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        TestingLabAdminJPanel sysAdminwjp = (TestingLabAdminJPanel) component;
        //        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = scheduledPatientTable.getSelectedRow();
        
        if(selectedRow<0){
            JOptionPane.showMessageDialog(this, "Please select a row");
        }
        else{
            DefaultTableModel dtm = (DefaultTableModel)scheduledPatientTable.getModel();
            int patientID = (int) dtm.getValueAt(selectedRow, 0);
            String patientName = (String) dtm.getValueAt(selectedRow, 1);
            
            txtID.setText(String .valueOf(patientID));
            txtName.setText(patientName);
            
        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> comboReport;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCreateTestReport;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblReport;
    private javax.swing.JTable scheduledPatientTable;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables

    private void populateScheduledTests() {
        DefaultTableModel dtm = (DefaultTableModel) scheduledPatientTable.getModel();
        dtm.setRowCount(0);
                
        for(WorkRequest wr: enterprise.getWorkQueue().getWorkRequestList()){
            TestPatient tp = (TestPatient)wr;
            System.out.println(tp);
            
            Object[] row = new Object[2];
            row[0] = tp.getPatientID();
            row[1] = tp.getPatientName();
            dtm.addRow(row);
            
        }
        
    }
}
