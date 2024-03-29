//Name: Evan Luo
//Date: July 23
//Title: Lesson3MultiplicationAndDivision
//Purpose: to create a lesson panel with practice questions for lesson 3
// *** COMMENTING FOR THIS FILE AS WELL AS Lesson1ZeroOne, Lesson2Negative, and Lesson4PowerRules IS THE SAME; ONLY NEED TO READ ONE ***

package TutorialApp;

public class Lesson3MultiplicationAndDivision extends javax.swing.JPanel {

    //create constants for the multiple choice section of the lesson
    public static final String CORRECT_MESSAGE = "Great! You got the correct answer!";  //define correct answer constant and assign message for correct answer 
    public static final String WRONG_MESSAGE = "Wrong answer. Please try again!";  //define wrong answer constant and assign message for wrong answer
    public static final String NOSELECT_MESSAGE = "You didn't select an answer!";  //define no answer constant and assigning message for no answer selected
    public static final String MULTIPLESELECT_MESSAGE = "Multiple answers selected, please select only one!";  //define multiple selection constant and assign message for multiple answers selected
    
    public Lesson3MultiplicationAndDivision() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        lblLesson3Practice = new javax.swing.JLabel();
        lblMultiplicationRule = new javax.swing.JLabel();
        lblQuestion1 = new javax.swing.JLabel();
        chkChoice11 = new javax.swing.JCheckBox();
        chkChoice12 = new javax.swing.JCheckBox();
        chkChoice13 = new javax.swing.JCheckBox();
        btnAnswer1 = new javax.swing.JButton();
        lblSystemAnswer1 = new javax.swing.JLabel();
        lblQuestion2 = new javax.swing.JLabel();
        chkChoice21 = new javax.swing.JCheckBox();
        chkChoice22 = new javax.swing.JCheckBox();
        chkChoice23 = new javax.swing.JCheckBox();
        lblSystemAnswer2 = new javax.swing.JLabel();
        lblLesson3Content = new javax.swing.JLabel();
        lblMultipleDesc1 = new javax.swing.JLabel();
        lblMultipleDesc2 = new javax.swing.JLabel();
        lblMultipleDesc3 = new javax.swing.JLabel();
        lblDivisionRule = new javax.swing.JLabel();
        lblDivsionDesc1 = new javax.swing.JLabel();
        lblLesson3Title = new javax.swing.JLabel();
        btnQuestion1 = new javax.swing.JButton();
        lblMultipleDesc4 = new javax.swing.JLabel();
        lblDivisionDesc2 = new javax.swing.JLabel();
        lblDivisionDesc3 = new javax.swing.JLabel();
        lblDivisionDesc4 = new javax.swing.JLabel();
        lblLesson3Image = new javax.swing.JLabel();

        lblLesson3Practice.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblLesson3Practice.setForeground(new java.awt.Color(0, 0, 204));
        lblLesson3Practice.setText("PRACTICE");

        lblMultiplicationRule.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblMultiplicationRule.setText("Multiplication Rule");

        lblQuestion1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblQuestion1.setText("<html>1. What is the answer to (2<sup>9</sup> / 2<sup>2</sup>) * (2<sup>4</sup>/3<sup>0</sup>)?</html>");

        chkChoice11.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkChoice11.setText("<html>&nbsp 2<sup>11</sup></html>");
        chkChoice11.setActionCommand("zxdgfsdsdgsssssssssssssssssssssssssssssssssssssssssss");

        chkChoice12.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkChoice12.setText("  2048/3");

        chkChoice13.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkChoice13.setText("<html>&nbsp 2<sup>7</sup></html>");

        btnAnswer1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnAnswer1.setText("Submit");
        btnAnswer1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(153, 153, 153)));
        btnAnswer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnswer1ActionPerformed(evt);
            }
        });

        lblSystemAnswer1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSystemAnswer1.setForeground(new java.awt.Color(204, 51, 0));

        lblQuestion2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblQuestion2.setText("<html>2. What is 3<sup>3</sup> * 2<sup>2 </sup>* 3<sup>2</sup>/3<sup>4</sup>?</html>");

        chkChoice21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkChoice21.setText("  3");
        chkChoice21.setActionCommand("zxdgfsdsdgsssssssssssssssssssssssssssssssssssssssssss");

        chkChoice22.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkChoice22.setText("  36");

        chkChoice23.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        chkChoice23.setText("  12");

        lblSystemAnswer2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSystemAnswer2.setForeground(new java.awt.Color(204, 51, 0));

        lblLesson3Content.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        lblLesson3Content.setForeground(new java.awt.Color(0, 0, 204));
        lblLesson3Content.setText("CONTENT");

        lblMultipleDesc1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMultipleDesc1.setText("When multiplying numbers with the same base, add the exponents.");

        lblMultipleDesc2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMultipleDesc2.setText("A common mess-up is that people add even with different bases.");

        lblMultipleDesc3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMultipleDesc3.setText("<html>As an example, one would add the exponents for 2<sup>2</sup>*2<sup>7 </sup>= 2<sup>9</sup></html>");

        lblDivisionRule.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblDivisionRule.setText("Division Rule");

        lblDivsionDesc1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDivsionDesc1.setText("When dividing numbers with the same base, subtract the numerator's");

        lblLesson3Title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblLesson3Title.setForeground(new java.awt.Color(204, 51, 0));
        lblLesson3Title.setText("LESSON 3");

        btnQuestion1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnQuestion1.setText("Submit");
        btnQuestion1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(153, 153, 153)));
        btnQuestion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuestion1ActionPerformed(evt);
            }
        });

        lblMultipleDesc4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblMultipleDesc4.setText("<html>However, 2<sup>3</sup> * 3<sup>4</sup> is not (2*3)<sup>7</sup>, it is simply 8 * 81 = 648. </html>");

        lblDivisionDesc2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDivisionDesc2.setText("exponent by the denominator's exponent number. ");

        lblDivisionDesc3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDivisionDesc3.setText("Like the multiplication rule, having the same base is essential.");

        lblDivisionDesc4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblDivisionDesc4.setText("<html>To demonstrate this rule, 3<sup>7</sup> / 3<sup>3 </sup>= 3<sup>4</sup>.</html>");

        lblLesson3Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TutorialApp/multipleordivisionImage.jpg"))); // NOI18N

        javax.swing.GroupLayout pnlContentLayout = new javax.swing.GroupLayout(pnlContent);
        pnlContent.setLayout(pnlContentLayout);
        pnlContentLayout.setHorizontalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMultipleDesc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlContentLayout.createSequentialGroup()
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLesson3Content)
                                    .addComponent(lblLesson3Title)
                                    .addComponent(lblMultiplicationRule)
                                    .addComponent(lblMultipleDesc1)
                                    .addComponent(lblMultipleDesc2)
                                    .addComponent(lblMultipleDesc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDivisionRule)
                                    .addComponent(lblDivsionDesc1)
                                    .addComponent(lblDivisionDesc2)
                                    .addComponent(lblDivisionDesc3)
                                    .addComponent(lblDivisionDesc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(chkChoice11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkChoice12)
                                    .addComponent(chkChoice13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addComponent(btnAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSystemAnswer1))
                                    .addComponent(chkChoice21)
                                    .addComponent(chkChoice22)
                                    .addComponent(chkChoice23)
                                    .addComponent(lblQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnlContentLayout.createSequentialGroup()
                                        .addComponent(btnQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblSystemAnswer2))
                                    .addComponent(lblLesson3Practice)
                                    .addComponent(lblQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(lblLesson3Image)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        pnlContentLayout.setVerticalGroup(
            pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLayout.createSequentialGroup()
                .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(lblQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(chkChoice11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkChoice12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkChoice13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAnswer1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSystemAnswer1))
                        .addGap(57, 57, 57)
                        .addComponent(lblQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(chkChoice21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkChoice22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkChoice23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSystemAnswer2)))
                    .addGroup(pnlContentLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnlContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLesson3Title)
                            .addComponent(lblLesson3Practice))
                        .addGap(18, 18, 18)
                        .addComponent(lblLesson3Content)
                        .addGap(18, 18, 18)
                        .addComponent(lblMultiplicationRule)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMultipleDesc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMultipleDesc2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMultipleDesc3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMultipleDesc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(lblDivisionRule)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDivsionDesc1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDivisionDesc2)
                        .addGap(12, 12, 12)
                        .addComponent(lblDivisionDesc3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDivisionDesc4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lblLesson3Image)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //in the event that the first question's button has been clicked
    private void btnAnswer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnswer1ActionPerformed
        //declare string variable that will hold the final verdict of the user's answer and assign a blank message for now
        String strSystemAnswer="";
        
        //check if the user has checked off the first box (CORRECT ANSWER)
        if (chkChoice11.isSelected()) //isSelected() method to determining whether a checkbox is checked or not is retrieved from: https://stackoverflow.com/questions/3599908/how-to-check-that-a-jcheckbox-is-checked
        {
            //append result corresponding to first checkbox to the system answer string variable
            strSystemAnswer += ";"+ CORRECT_MESSAGE; //using ; as separator that will indicated whether there is more than one answer
            //constant will show the corresponding message
        }
        //check if the user has ticked the second choice/box (WRONG ANSWER)
        if (chkChoice12.isSelected())
        {
            //append result of second checkbox into system result string variable
            strSystemAnswer += ";"+ WRONG_MESSAGE;  //constant will show the corresponding message
        }
        //check whether the third check box has been selected (WRONG ANSWER)
        if (chkChoice13.isSelected())
        {
            //append verdict of third checkbox's answer into system result variable 
            strSystemAnswer += ";"+ WRONG_MESSAGE;  //constant will show the corresponding message
        }
        //check if user has selected an answer
        if (strSystemAnswer.length() >0)  //length() method verifies that the answer is not blank
        {
            //use substring() method to trim out the first separator ";"
            strSystemAnswer= strSystemAnswer.substring(1, strSystemAnswer.length());
        }
        //if no checkbox has been selected
        if (strSystemAnswer == "") //making a string comparision with == to see if the data stored within the string variable is blank
        {
            //display message that no choice has been selected
            strSystemAnswer= NOSELECT_MESSAGE; //constant will show the corresponding message
        }
        //if user has checked off more than one box
        if (strSystemAnswer.indexOf(";")>=0) //checks for the position of a ; as there will be a non-trimmed out one if there are two answers selected
        {
            //display message that multiple choices have been selected
            strSystemAnswer= MULTIPLESELECT_MESSAGE;  //constant will show the corresponding message
        }
        
        //display corresponding message to user through the label by the setText() method
        lblSystemAnswer1.setText(strSystemAnswer);
    }//GEN-LAST:event_btnAnswer1ActionPerformed
    
    //in the event that the second question's button has been clicked
    private void btnQuestion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuestion1ActionPerformed
        //declare string variable that will hold the final verdict of the user's answer and assign a blank message for now
        String strSystemAnswer="";
        
        //check if the user has checked off the first box (WRONG ANSWER)
        if (chkChoice21.isSelected()) //isSelected() method to determining whether a checkbox is checked or not is retrieved from: https://stackoverflow.com/questions/3599908/how-to-check-that-a-jcheckbox-is-checked
        {
            //append result corresponding to first checkbox to the system answer string variable
            strSystemAnswer += ";"+ WRONG_MESSAGE; //using ; as separator that will indicated whether there is more than one answer in a later if statement
            //constant will show the corresponding message
        }
        //check if the user has ticked the second choice/box (WRONG ANSWER)
        if (chkChoice22.isSelected())
        {
            //append result of second checkbox into system result string variable
            strSystemAnswer += ";"+ WRONG_MESSAGE;  //using ; as separator that will indicated whether there is more than one answer in a later if statement
            //constant will show the corresponding message
        }
        //check whether the third check box has been selected (CORRECT ANSWER)
        if (chkChoice23.isSelected())
        {
            //append verdict of third checkbox's answer into system result variable 
            strSystemAnswer += ";"+ CORRECT_MESSAGE;  //using ; as separator that will indicate whether there is more than one answer in a later if statement
            //constant will show the corresponding message
        }
        //check if user has selected an answer
        if (strSystemAnswer.length() >0)  //length() method verifies that the answer is not blank
        {
            //use substring() method to trim out the first separator ";"
            strSystemAnswer= strSystemAnswer.substring(1, strSystemAnswer.length());
        }
        //if no checkbox has been selected
        if (strSystemAnswer == "") //making a string comparision with == to see if the data stored within the string variable is blank
        {
            //display message that no choice has been selected
            strSystemAnswer= NOSELECT_MESSAGE; //constant will show the corresponding message
        }
        //if user has checked off more than one box
        if (strSystemAnswer.indexOf(";")>=0) //checks for the position of a ; with indexOf() as there will be a non-trimmed out one if there are two answers selected
        {
            //display message that multiple choices have been selected
            strSystemAnswer= MULTIPLESELECT_MESSAGE;  //constant will show the corresponding message
        }
        
        //display corresponding message to user through the label by the setText() method
        lblSystemAnswer2.setText(strSystemAnswer);
    }//GEN-LAST:event_btnQuestion1ActionPerformed

    //this section is the autogenerated variable declaration of the GUI components
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnswer1;
    private javax.swing.JButton btnQuestion1;
    private javax.swing.JCheckBox chkChoice11;
    private javax.swing.JCheckBox chkChoice12;
    private javax.swing.JCheckBox chkChoice13;
    private javax.swing.JCheckBox chkChoice21;
    private javax.swing.JCheckBox chkChoice22;
    private javax.swing.JCheckBox chkChoice23;
    private javax.swing.JLabel lblDivisionDesc2;
    private javax.swing.JLabel lblDivisionDesc3;
    private javax.swing.JLabel lblDivisionDesc4;
    private javax.swing.JLabel lblDivisionRule;
    private javax.swing.JLabel lblDivsionDesc1;
    private javax.swing.JLabel lblLesson3Content;
    private javax.swing.JLabel lblLesson3Image;
    private javax.swing.JLabel lblLesson3Practice;
    private javax.swing.JLabel lblLesson3Title;
    private javax.swing.JLabel lblMultipleDesc1;
    private javax.swing.JLabel lblMultipleDesc2;
    private javax.swing.JLabel lblMultipleDesc3;
    private javax.swing.JLabel lblMultipleDesc4;
    private javax.swing.JLabel lblMultiplicationRule;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblSystemAnswer1;
    private javax.swing.JLabel lblSystemAnswer2;
    private javax.swing.JPanel pnlContent;
    // End of variables declaration//GEN-END:variables
}

/*
*Bibliography:
*How to check that a JCheckBox is checked? (n.d.). Retrieved July 22, 2018, from https://stackoverflow.com/questions/3599908/how-to-check-that-a-jcheckbox-is-checked
*/