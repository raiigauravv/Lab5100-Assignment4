/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Patient;

/**
 *
 * @author gauravvraii
 */
public class formPanel extends javax.swing.JPanel {

    /**
     * Creates new form formPanel
     */
    ImageIcon icon; 
    private final JPanel bottomPanel;
    public formPanel(JPanel inputPanel) {
        initComponents();
        this.bottomPanel = inputPanel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButtonGroup = new javax.swing.ButtonGroup();
        messageTextField = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        imageUploadLabelName = new javax.swing.JLabel();
        ageLabelName = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        ageTextField = new javax.swing.JTextField();
        firstNameTextField = new javax.swing.JTextField();
        genderLabelName = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        lastNameTextField = new javax.swing.JTextField();
        femaleRadioButton = new javax.swing.JRadioButton();
        lastNameLabel = new javax.swing.JLabel();
        otherRadioButton = new javax.swing.JRadioButton();
        emailLabelName = new javax.swing.JLabel();
        messageLabelName1 = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        patientTypeComboBox = new javax.swing.JComboBox<>();
        patientTypeLabelName = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();

        messageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageTextFieldActionPerformed(evt);
            }
        });
        messageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                messageTextFieldKeyReleased(evt);
            }
        });

        firstNameLabel.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        firstNameLabel.setText("First Name:");

        imageUploadLabelName.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        imageUploadLabelName.setText("Image Upload:");

        ageLabelName.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        ageLabelName.setText("Age:");

        uploadButton.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        uploadButton.setText("Browse");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });
        ageTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageTextFieldKeyPressed(evt);
            }
        });

        firstNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextFieldActionPerformed(evt);
            }
        });
        firstNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                firstNameTextFieldKeyReleased(evt);
            }
        });

        genderLabelName.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        genderLabelName.setText("Gender:");

        submitButton.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });
        lastNameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lastNameTextFieldKeyReleased(evt);
            }
        });

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        femaleRadioButton.setText("Female");

        lastNameLabel.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        lastNameLabel.setText("Last Name:");

        genderButtonGroup.add(otherRadioButton);
        otherRadioButton.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        otherRadioButton.setText("Prefer not to say");

        emailLabelName.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        emailLabelName.setText("Email:");

        messageLabelName1.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        messageLabelName1.setText("Message:");

        emailTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextFieldActionPerformed(evt);
            }
        });
        emailTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailTextFieldKeyReleased(evt);
            }
        });

        patientTypeComboBox.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        patientTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "Specific", "Emergency" }));
        patientTypeComboBox.setSelectedIndex(-1);
        patientTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientTypeComboBoxActionPerformed(evt);
            }
        });

        patientTypeLabelName.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        patientTypeLabelName.setText("Patient Type:");

        titleLabel.setBackground(new java.awt.Color(0, 102, 204));
        titleLabel.setFont(new java.awt.Font("Kailasa", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("REGISTRATION FORM");

        maleRadioButton.setFont(new java.awt.Font("Kailasa", 1, 13)); // NOI18N
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lastNameLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(ageLabelName)
                            .addComponent(emailLabelName)
                            .addComponent(genderLabelName)
                            .addComponent(patientTypeLabelName)
                            .addComponent(messageLabelName1)
                            .addComponent(imageUploadLabelName))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(uploadButton, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(firstNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(ageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(emailTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(lastNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(femaleRadioButton)
                            .addComponent(messageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(otherRadioButton)
                            .addComponent(patientTypeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maleRadioButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabelName)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabelName)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(genderLabelName)
                    .addComponent(maleRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(otherRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientTypeLabelName)
                    .addComponent(patientTypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLabelName1))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imageUploadLabelName)
                    .addComponent(uploadButton))
                .addGap(65, 65, 65)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void messageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageTextFieldActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
             JFileChooser fileChooser = new JFileChooser();
             fileChooser.setFileFilter(new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "gif", "bmp"));
             if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            try {
            BufferedImage img = ImageIO.read(fileChooser.getSelectedFile());
            int width = 60;
            int height = 80;
            Image scaledImage = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            if (scaledImage != null) {
                icon = new ImageIcon(scaledImage);
                imageLabel.setIcon(icon); 
            } else {
                throw new Exception("Failed to load the image.");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Failed to load the image.", "Image Error", JOptionPane.ERROR_MESSAGE);
        }
             }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void firstNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        // Setting functionalities for First Name
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String emailField = emailTextField.getText();
        String ageField = ageTextField.getText();
        String genderField = "";
        String patientType = (String) patientTypeComboBox.getSelectedItem();
        String messageField = messageTextField.getText();

        if (maleRadioButton.isSelected()) {
            genderField = maleRadioButton.getActionCommand();
        } else if (femaleRadioButton.isSelected()) {
            genderField = femaleRadioButton.getActionCommand();
        } else if (otherRadioButton.isSelected()) {
            genderField = otherRadioButton.getActionCommand();
        }

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        if (!emailField.matches(emailRegex)) {
            JOptionPane.showMessageDialog(this, "Invalid email address", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
            int ageValue = Integer.parseInt(ageField);
            if (ageValue <= 0) {
                JOptionPane.showMessageDialog(this, "Age must be a positive number", "Validation Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid age format", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

       if (firstName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First name cannot be empty");
        } else if (lastName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last name cannot be empty");
        } else {
            JOptionPane.showMessageDialog(this, "Registration successful!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
       
       
        Patient newPatient = new Patient();
        
        newPatient.setFirstName(firstName);
        newPatient.setLastName(lastName);
        newPatient.setEmail(emailField);
        newPatient.setAge(ageField);
        newPatient.setGender(genderField);
        newPatient.setPatientType(patientType);
        newPatient.setIcon(icon);
        newPatient.setMessage(messageField);
        ViewPanelNew newViewPanel = new ViewPanelNew(newPatient);
        CardLayout layout = (CardLayout) bottomPanel.getLayout();
        bottomPanel.add(newViewPanel);
        layout.next(bottomPanel);

    }//GEN-LAST:event_submitButtonActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void emailTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextFieldActionPerformed

    private void firstNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_firstNameTextFieldKeyReleased
        // TODO add your handling code here:
//        String firstName = firstNameTextField.getText();
//        if (firstName.isEmpty() || !firstName.matches("^[a-zA-Z]+$")) {
//            JOptionPane.showMessageDialog(null, "Enter a first valid name");
//        }
    }//GEN-LAST:event_firstNameTextFieldKeyReleased

    private void lastNameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastNameTextFieldKeyReleased
        // TODO add your handling code here:
//        String lastName = lastNameTextField.getText();
//        if (lastName.isEmpty() || !lastName.matches("^[a-zA-Z]+$")) {
//            JOptionPane.showMessageDialog(null, "Enter a last valid name");
//        }
    }//GEN-LAST:event_lastNameTextFieldKeyReleased

    private void ageTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageTextFieldKeyPressed
        // TODO add your handling code here:
//        String age = ageTextField.getText();
//        if (!age.matches("\\d*")|| age.isEmpty()) { // Check if the input is a digit
//            JOptionPane.showMessageDialog(null, "Please enter a valid age.");
//            ageTextField.setText("");
//        }
    }//GEN-LAST:event_ageTextFieldKeyPressed

    private void emailTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailTextFieldKeyReleased
        // TODO add your handling code here:
//        String email = (String)emailTextField.getText();
//        if (!email.contains("@") || !email.endsWith(".com")) {
//            JOptionPane.showMessageDialog(null, "Enter a valid email address");
//        }
    }//GEN-LAST:event_emailTextFieldKeyReleased

    private void messageTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_messageTextFieldKeyReleased
        // TODO add your handling code here:
//        String message = messageTextField.getText();
//        if (message.isEmpty()){
//            JOptionPane.showMessageDialog(null, "Please enter a message");
//        }
    }//GEN-LAST:event_messageTextFieldKeyReleased

    private void patientTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientTypeComboBoxActionPerformed
        // TODO add your handling code here:
//        String patientType = (String) patientTypeComboBox.getSelectedItem();
//        if (patientType == null || patientType.isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Please select patient type.");
//        } else if (!patientType.equals("General") && !patientType.equals("Specific") && !patientType.equals("Emergency")) {
//            JOptionPane.showMessageDialog(this, "Invalid type selection");
//        }
    }//GEN-LAST:event_patientTypeComboBoxActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabelName;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel emailLabelName;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JLabel genderLabelName;
    private javax.swing.JLabel imageUploadLabelName;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JLabel messageLabelName1;
    private javax.swing.JTextField messageTextField;
    private javax.swing.JRadioButton otherRadioButton;
    private javax.swing.JComboBox<String> patientTypeComboBox;
    private javax.swing.JLabel patientTypeLabelName;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}
