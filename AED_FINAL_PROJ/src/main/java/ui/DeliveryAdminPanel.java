/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;
import model.Community;
import model.CompanyDirectory;
import model.Customer;
import model.CustomerDirectory;
import model.DeliveryBoy;
import model.DeliveryBoyDirectory;
import model.UserAuthentication;
import model.UserAuthenticationDirectory;

/**
 *
 * @author Abhishek
 */
public class DeliveryAdminPanel extends javax.swing.JPanel {

    private JSplitPane splitPane;
    private CustomerDirectory customerDirectory;
    private CompanyDirectory companyDirectory;
    private Community community;
    private UserAuthenticationDirectory userauthenticationdirectory;
    private DeliveryBoyDirectory deliveryBoyDirectory;
    private String qualif;

    /**
     * Creates new form MainCustomerJPanel
     */
    public DeliveryAdminPanel() {
        initComponents();
    }

    public DeliveryAdminPanel(Community community, CustomerDirectory customerDirectory, CompanyDirectory companyDirectory, UserAuthenticationDirectory userauthenticationdirectory, JSplitPane splitPane, DeliveryBoyDirectory deliveryBoyDirectory) {
        initComponents();
        
        ButtonGroup buttonGroup = new ButtonGroup();
        
        buttonGroup.add(radioHighSchool);
        buttonGroup.add(radioUniversity);
        
        this.community = community;
        this.splitPane = splitPane;
        this.customerDirectory = customerDirectory;
        this.companyDirectory = companyDirectory;
        this.userauthenticationdirectory = userauthenticationdirectory;
        this.deliveryBoyDirectory = deliveryBoyDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTextField = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        contactNameTextField = new javax.swing.JTextField();
        usernameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        createLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        yearsOfDeliveryExperienceTextField1 = new javax.swing.JTextField();
        radioHighSchool = new javax.swing.JRadioButton();
        radioUniversity = new javax.swing.JRadioButton();
        btnModify = new javax.swing.JButton();

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        contactNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactNameTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Emergency Contact Name");

        jLabel3.setText("Qualification");

        jLabel4.setText("Username");

        createLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        createLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        createLabel1.setText("Create Delivery Boy");
        createLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel5.setText("Password");

        passwordTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Years of Delivery Experience");

        radioHighSchool.setText("High School");

        radioUniversity.setText("University");

        btnModify.setText("Modify Delivery Boys");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(createLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(317, 317, 317))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(329, 329, 329)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(contactNameTextField)
                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(radioHighSchool)
                                .addGap(18, 18, 18)
                                .addComponent(radioUniversity)
                                .addGap(0, 3, Short.MAX_VALUE))
                            .addComponent(yearsOfDeliveryExperienceTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTextField)
                                    .addComponent(passwordTextField))
                                .addGap(2, 2, 2)))
                        .addGap(263, 263, 263))))
            .addGroup(layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(save)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(66, 66, 66)
                        .addComponent(save)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contactNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioHighSchool)
                            .addComponent(radioUniversity))
                        .addGap(18, 18, 18)
                        .addComponent(yearsOfDeliveryExperienceTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(usernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnModify)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:

        if (nameTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory name field is empty");
            return;
        }

        if (!nameTextField.getText().matches("[a-zA-Z]+")) {
            JOptionPane.showMessageDialog(this, "Name field should only have alphabets");
            return;
        }

        if (contactNameTextField.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory emergency contact name field is empty");
            return;
        }

        if (yearsOfDeliveryExperienceTextField1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Mandatory emergency contact name field is empty");
            return;
        }


        for (int i = 0; i < userauthenticationdirectory.getUserAuthenticationList().size(); i++) {
            UserAuthentication userauthentication = userauthenticationdirectory.getUserAuthenticationList().get(i);

            if (userauthentication.getUserName().equalsIgnoreCase(usernameTextField.getText())
                    && userauthentication.getUserType().equalsIgnoreCase("DeliveryBoy")) {
                JOptionPane.showMessageDialog(this, "Delivery Boy username already exits, please login directly");
                return;
            }
        }
        
        //Radio buttons

        if(radioHighSchool.isSelected() == true) {
            qualif = "High School";
        }
        else if(radioUniversity.isSelected() == true){
            qualif = "University";
        }
        else {
            JOptionPane.showMessageDialog(this, "Please select a city type.");
        }

        DeliveryBoy deliveryBoy = deliveryBoyDirectory.addNewDeliveryBoy();
        deliveryBoy.setDeliveryBoyName(nameTextField.getText());
        deliveryBoy.setEmergencyContactNumber(Integer.parseInt(contactNameTextField.getText()));
        deliveryBoy.setQualificaton(qualif);
        deliveryBoy.setYearOfDeliveryExperience(Integer.parseInt(yearsOfDeliveryExperienceTextField1.getText()));
        deliveryBoy.setAvailability(true); // Setting availability to true by default

        community.setDeliveryBoyDirectory(deliveryBoyDirectory);

        UserAuthentication userauthentication = userauthenticationdirectory.addNewUserAuthentication();
        userauthentication.setUserName(usernameTextField.getText());
        userauthentication.setPassword(passwordTextField.getText());
        userauthentication.setUserType("DeliveryBoy");

        setDefault();
        JOptionPane.showMessageDialog(this, "Delivery Boy has been created");
    }//GEN-LAST:event_saveActionPerformed

    private void setDefault() {
        nameTextField.setText("");
        contactNameTextField.setText("");
        yearsOfDeliveryExperienceTextField1.setText("");
        radioHighSchool.setEnabled(false);
        radioUniversity.setEnabled(false);
        usernameTextField.setText("");
        passwordTextField.setText("");
    }

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void passwordTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextFieldActionPerformed

    private void contactNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactNameTextFieldActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
        
        DeliveryAdminModifyPanel m = new DeliveryAdminModifyPanel(community,deliveryBoyDirectory);
        splitPane.setRightComponent(m);
    }//GEN-LAST:event_btnModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModify;
    private javax.swing.JTextField contactNameTextField;
    private javax.swing.JLabel createLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField passwordTextField;
    private javax.swing.JRadioButton radioHighSchool;
    private javax.swing.JRadioButton radioUniversity;
    private javax.swing.JButton save;
    private javax.swing.JTextField usernameTextField;
    private javax.swing.JTextField yearsOfDeliveryExperienceTextField1;
    // End of variables declaration//GEN-END:variables
}
