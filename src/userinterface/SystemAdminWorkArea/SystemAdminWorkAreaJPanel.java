/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.City.City;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;

import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
//import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

import org.jfree.chart.ChartFactory; 
import org.jfree.chart.JFreeChart; 
import org.jfree.chart.plot.PiePlot3D; 
import org.jfree.data.general.DefaultPieDataset; 
import org.jfree.chart.ChartUtils;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount userAccount;
    City city;
    Organization organization;
    Enterprise enterprise;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, City city, UserAccount userAccount, Organization organization, 
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
    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {                                   
        
    }          
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnManageCity = new javax.swing.JButton();
        btnManageEnterprise = new javax.swing.JButton();
        btnManagePerson = new javax.swing.JButton();
        btnManageEnterpriseAdmins = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnVaccStatus = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnManageCity.setText("Manage City");
        btnManageCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageCityActionPerformed(evt);
            }
        });

        btnManageEnterprise.setText("Manage Enterprises");
        btnManageEnterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseActionPerformed(evt);
            }
        });

        btnManagePerson.setText("Manage Person");
        btnManagePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePersonActionPerformed(evt);
            }
        });

        btnManageEnterpriseAdmins.setText("Manage Enterprise Admins");
        btnManageEnterpriseAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEnterpriseAdminsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome, System Admin");

        btnVaccStatus.setText("Vaccination Status");
        btnVaccStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaccStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 988, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnManageEnterpriseAdmins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManagePerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManageEnterprise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaccStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(379, 379, 379))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(btnManagePerson)
                .addGap(18, 18, 18)
                .addComponent(btnManageCity)
                .addGap(18, 18, 18)
                .addComponent(btnManageEnterprise)
                .addGap(18, 18, 18)
                .addComponent(btnManageEnterpriseAdmins)
                .addGap(18, 18, 18)
                .addComponent(btnVaccStatus)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnManagePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePersonActionPerformed
        ManagePersonJPanel managePerson = new ManagePersonJPanel(userProcessContainer, system);
        userProcessContainer.add("managePerson", managePerson);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnManagePersonActionPerformed

    private void btnManageEnterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseActionPerformed
        ManageEnterprisesJPanel manageTestCenterJPanel = new ManageEnterprisesJPanel(userProcessContainer, system);
        userProcessContainer.add("manageTestCenterJPanel", manageTestCenterJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseActionPerformed

    private void btnManageCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageCityActionPerformed
        ManageCityJPanel manageHospitalJPanel = new ManageCityJPanel(userProcessContainer, system);
        userProcessContainer.add("manageHospitalJPanel", manageHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageCityActionPerformed

    private void btnManageEnterpriseAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEnterpriseAdminsActionPerformed
       ManageEnterpriseAdminsJPanel manageVaccinationCenterJPanel = new ManageEnterpriseAdminsJPanel(userProcessContainer, system);
       userProcessContainer.add("manageVaccinationCenterJPanel", manageVaccinationCenterJPanel);
       CardLayout layout = (CardLayout) userProcessContainer.getLayout();
       layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageEnterpriseAdminsActionPerformed

    private void btnVaccStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaccStatusActionPerformed
//        try {
            // TODO add your handling code here:
            createChart();
//        } catch (IOException ex) {
//            Logger.getLogger(SystemAdminWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_btnVaccStatusActionPerformed

    private void createChart() 
    {
        final String fait = "FAIT";              
      final String audi = "AUDI";              
      final String ford = "FORD";              
      final String speed = "Speed";              
      final String popular = "Popular";              
      final String mailage = "Mailage";              
      final String userrating = "User Rating";              
      final String safety = "safety";
        DefaultCategoryDataset dataset=new DefaultCategoryDataset();
//              DefaultPieDataset Dataset = new DefaultPieDataset( );             
//        int selectedRow = viewPatientsJTable.getSelectedRow();
//        Person person = (Person) viewPatientsJTable.getValueAt(selectedRow, 0);
//        
//        Patient patient= person.getPatient();
//        if(patient==null)
//        {
//            JOptionPane.showMessageDialog(this, "Patient not created, Please create Patient first.", "Error", JOptionPane.ERROR_MESSAGE);
//            return;
//        }

        ArrayList<Person> personList = system.getPersonDirectory().getPersonList();
        int positive=0;
        int negative = 0;
        //int vaccinated = 0;
       // int partially = 0;
        //int nonvaccinated = 0;
//        for(Person p:personList){
//            System.out.println(p.getTestHistory().getTestReportList().get(0).isResult()==true);
//            if(p.getTestHistory().getTestReportList().get(0).isResult()==true){
//            ++positive;
//            }
//            if(p.getTestHistory().getTestReportList().get(0).isResult()==false){
//            ++negative;
//            }
//            
//        }
        /*At least 2 vital sign records needed to show chart */
        if (personList.isEmpty() || personList.size() == 1) {
            JOptionPane.showMessageDialog(this, "No Data Found", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
//        for (Person p:personList) {
//            Dataset.addV("Positive", new Double( 20 ));
//            Dataset.setValue("Negative", new Double( 40 ));
//        Dataset.addValue(vitalSign.getRespiratoryRate(),"RR", vitalSign.getTimestamp());
//            Dataset.addValue(vitalSign.getHeartRate(),"HR", vitalSign.getTimestamp());
//            Dataset.addValue(vitalSign.getBloodPressure(),"BP", vitalSign.getTimestamp());
//            Dataset.addValue(vitalSign.getWeight(),"WT", vitalSign.getTimestamp());
        dataset.addValue( 1.0 , fait , speed );              
      dataset.addValue( 4.0 , fait , popular );              
      dataset.addValue( 3.0 , fait , userrating );              
      dataset.addValue( 5.0 , fait , mailage );              
      dataset.addValue( 5.0 , fait , safety );              
      
      dataset.addValue( 5.0 , audi , speed );              
      dataset.addValue( 7.0 , audi , popular );              
      dataset.addValue( 6.0 , audi , userrating );              
      dataset.addValue( 10.0 , audi , mailage );              
      dataset.addValue( 4.0 , audi , safety ); 
      
      dataset.addValue( 4.0 , ford , speed );              
      dataset.addValue( 3.0 , ford , popular );              
      dataset.addValue( 2.0 , ford , userrating );              
      dataset.addValue( 3.0 , ford , mailage );              
      dataset.addValue( 6.0 , ford , safety );            
//        }
//JFreeChart chart = ChartFactory.createPieChart3D( 
//         "Covid Cases in City" ,  // chart title                   
//         Dataset ,         // data 
//         true ,            // include legend                   
//         true, 
//         false);
//        final PiePlot3D plot = ( PiePlot3D ) chart.getPlot( );             
//      plot.setStartAngle( 270 );             
//      plot.setForegroundAlpha( 0.60f );             
//      plot.setInteriorGap( 0.02 );             
//      int width = 640;   /* Width of the image */             
//      int height = 480;  /* Height of the image */                             
//      File pieChart3D = new File( "pie_Chart3D.jpeg" );                           
//      ChartUtils.saveChartAsJPEG( pieChart3D , chart , width , height );   
      
        JFreeChart vitalSignChart= ChartFactory.createBarChart("Covid Cases Chart", "Time Stamp", "Rate", dataset, PlotOrientation.VERTICAL, true, false, false);
        vitalSignChart.setBackgroundPaint(Color.white);
        CategoryPlot vitalSignChartPlot = vitalSignChart.getCategoryPlot();
        vitalSignChartPlot.setBackgroundPaint(Color.lightGray);    
        
        CategoryAxis vitalSignDomainAxis = vitalSignChartPlot.getDomainAxis();
        vitalSignDomainAxis.setCategoryLabelPositions(
            CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 6.0)
        );
        
        NumberAxis vitalSignRangeAxis = (NumberAxis) vitalSignChartPlot.getRangeAxis();
        vitalSignRangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        
        ChartFrame chartFrame = new ChartFrame("Chart", vitalSignChart);
        chartFrame.setVisible(true);
        chartFrame.setSize(500, 500);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageCity;
    private javax.swing.JButton btnManageEnterprise;
    private javax.swing.JButton btnManageEnterpriseAdmins;
    private javax.swing.JButton btnManagePerson;
    private javax.swing.JButton btnVaccStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
