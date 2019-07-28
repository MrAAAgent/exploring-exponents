//Name: Evan Luo
//Date: July 23
//Title: MainPage
//Purpose: to create the main/home screen for the lesson that connects to all lessons/quiz

package TutorialApp;

//import the JDialog library to use its methods for better functioning of the application (eg. not having the whole application close when one window is closed)
import javax.swing.JDialog; 

public class MainPage extends javax.swing.JFrame {
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainPage().setVisible(true);
            }
        });
    }
    
    //create a function to display non-main screen forms satisfying the predicament stated below
    //there was an issue of using JFrame for non-main pages, for closing non-main screen windows would close the entire application including the main page
    //after researching for a solution: create a panel for non-main pages, and display dialog (modal) by adding associated panel GUI into dialog instance
    //idea was retrieved from: https://stackoverflow.com/questions/1481405/how-to-make-a-jframe-modal-in-swing-java
    private void callForm(String strFormName) //declare string variable strFormName for the titles of the files that will be called
    {   
        //define and create a dialog instance with the title of the file as the input
        JDialog dialogPanel = new JDialog(this, strFormName, true);
        
        //use a switch statement using strFormName string variable passed as the input parameter
        switch (strFormName) {
            //case for calling zero/one rule lesson
            case "Zero/One Rule":
                //create panel instance for lesson 1 (instance = object)
                Lesson1ZeroOne frmLessonPage1 = new Lesson1ZeroOne();
                //add the GUI panel into dialog panel so that it can be modified as an object 
                //getContentPane() is the method responsible for making a panel modifiable
                //add(frmLessonPage1) adds the quiz form into the content pane
                dialogPanel.getContentPane().add(frmLessonPage1);
                break; 
            //case for calling negative exponents lesson
            case "Negative Exponent Rule":
                //create panel instance for lesson 2 (instance = object)
                Lesson2Negative frmLessonPage2 = new Lesson2Negative();
                //add the GUI panel into dialog panel so that it can be modified as an object 
                //getContentPane() is the method responsible for making a panel modifiable
                //add(frmLessonPage2) adds the quiz form into the content pane
                dialogPanel.getContentPane().add(frmLessonPage2);
                break;
            //case for calling multiplication/division lesson
            case "Multiplication/Division Rule":
                //create panel instance for lesson 3 (instance = object)
                Lesson3MultiplicationAndDivision frmLessonPage3 = new Lesson3MultiplicationAndDivision();
                //add the GUI panel into dialog panel so that it can be modified as an object 
                //getContentPane() is the method responsible for making a panel modifiable
                //add(frmLessonPage3) adds the quiz form into the content pane
                dialogPanel.getContentPane().add(frmLessonPage3);
                break;
            //case for calling power rule lesson
            case "Power Rule":
                //create panel instance for lesson 4 (instance = object)
                Lesson4PowerRules frmLessonPage4 = new Lesson4PowerRules();
                //add the GUI panel into dialog panel so that it can be modified as an object 
                //getContentPane() is the method responsible for making a panel modifiable
                //add(frmLessonPage4) adds the quiz form into the content pane
                dialogPanel.getContentPane().add(frmLessonPage4);
                break;
             //Quiz
            case "Quiz":
                //create panel instance for quiz (instance = object)
                QuizPanel frmQuiz = new QuizPanel();
                //add the GUI panel into dialog panel so that it can be modified as an object 
                //getContentPane() is the method responsible for making a panel modifiable
                //add(frmQuiz) adds the quiz form into the content pane
                dialogPanel.getContentPane().add(frmQuiz);
                 break;
            //do nothing in the case that the form name is not one of the ones above
            default: 
                break;
         }
        dialogPanel.pack();  //pack() ensures all components are at or above preferred sizes
        dialogPanel.setResizable(false);  //prevent user from resizing the dialog panels so that format does not get messed up
        dialogPanel.setLocationRelativeTo(null); //setting location of the panels to be the center of the screen (already referenced in Main.java)
        dialogPanel.setVisible(true); //setVisible(true) displays the form
    }
    
    public MainPage() {
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

        lblProgramTitle = new javax.swing.JLabel();
        lblLessonTitle = new javax.swing.JLabel();
        lblQuizTitle = new javax.swing.JLabel();
        btnZeroOne = new javax.swing.JButton();
        btnNegativeExponent = new javax.swing.JButton();
        btnMultiplicationDivision = new javax.swing.JButton();
        btnPower = new javax.swing.JButton();
        btnQuiz1 = new javax.swing.JButton();
        lblMainImage = new javax.swing.JLabel();
        lblIntro1 = new javax.swing.JLabel();
        lblIntro2 = new javax.swing.JLabel();
        lblIntro3 = new javax.swing.JLabel();
        lblIntro4 = new javax.swing.JLabel();
        lblIntro5 = new javax.swing.JLabel();
        lblIntro6 = new javax.swing.JLabel();
        lblIntro7 = new javax.swing.JLabel();
        lblIntro8 = new javax.swing.JLabel();
        lblIntro9 = new javax.swing.JLabel();
        mnuBarMain = new javax.swing.JMenuBar();
        mnuLesson = new javax.swing.JMenu();
        mnuItemZeroOne = new javax.swing.JMenuItem();
        mnuItemNegativeExponent = new javax.swing.JMenuItem();
        mnuItemMultiplicationDivision = new javax.swing.JMenuItem();
        mnuItemPower = new javax.swing.JMenuItem();
        mnuQuiz = new javax.swing.JMenu();
        mnuItemQuiz = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Exploring Exponents");

        lblProgramTitle.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        lblProgramTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblProgramTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProgramTitle.setText("Exploring Exponents");

        lblLessonTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLessonTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblLessonTitle.setText("Choose a lesson below to learn and do practice questions");

        lblQuizTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblQuizTitle.setForeground(new java.awt.Color(0, 0, 204));
        lblQuizTitle.setText("Test your knowledge with the 10 question quiz down below");

        btnZeroOne.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnZeroOne.setText("1. Zero/One ");
        btnZeroOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroOneActionPerformed(evt);
            }
        });

        btnNegativeExponent.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnNegativeExponent.setText("2. Negative");
        btnNegativeExponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegativeExponentActionPerformed(evt);
            }
        });

        btnMultiplicationDivision.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnMultiplicationDivision.setText("3. Multiply/Divide");
        btnMultiplicationDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicationDivisionActionPerformed(evt);
            }
        });

        btnPower.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnPower.setText("4. Power Rules");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        btnQuiz1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnQuiz1.setText("Quiz ");
        btnQuiz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuiz1ActionPerformed(evt);
            }
        });

        lblMainImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TutorialApp/exponentImage.PNG"))); // NOI18N

        lblIntro1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblIntro1.setText("This application will be discussing the various laws associated ");

        lblIntro2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblIntro2.setText("with exponents.");

        lblIntro3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblIntro3.setText("For clarification purposes, ");

        lblIntro4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblIntro4.setText("exponents behave like multiplying the base by itself however many times");

        lblIntro5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblIntro5.setText("equal to the value of the exponent.");

        lblIntro6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblIntro6.setText("<html>eg. 3<sup>4</sup> = 3 X 3 X 3 X 3</html>");

        lblIntro7.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblIntro7.setText("<html>3 is the base, 4 is the exponent, and 3<sup>4 </sup>is called the power.</html>");

        lblIntro8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblIntro8.setForeground(new java.awt.Color(153, 0, 0));
        lblIntro8.setText("NOTE: You will not be able to navigate more than one lesson/quiz at a time.");

        lblIntro9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblIntro9.setForeground(new java.awt.Color(153, 0, 0));
        lblIntro9.setText("You must close the previous window and choose a different lesson/quiz from this screen.");

        mnuBarMain.setPreferredSize(new java.awt.Dimension(56, 28));

        mnuLesson.setText("Lesson");
        mnuLesson.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        mnuItemZeroOne.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mnuItemZeroOne.setText("Zero/One Laws");
        mnuItemZeroOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemZeroOneActionPerformed(evt);
            }
        });
        mnuLesson.add(mnuItemZeroOne);

        mnuItemNegativeExponent.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mnuItemNegativeExponent.setText("Negative Exponents");
        mnuItemNegativeExponent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemNegativeExponentActionPerformed(evt);
            }
        });
        mnuLesson.add(mnuItemNegativeExponent);

        mnuItemMultiplicationDivision.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mnuItemMultiplicationDivision.setText("Multiplication/Division Laws");
        mnuItemMultiplicationDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemMultiplicationDivisionActionPerformed(evt);
            }
        });
        mnuLesson.add(mnuItemMultiplicationDivision);

        mnuItemPower.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mnuItemPower.setText("Power Rules");
        mnuItemPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemPowerActionPerformed(evt);
            }
        });
        mnuLesson.add(mnuItemPower);

        mnuBarMain.add(mnuLesson);

        mnuQuiz.setText("Quiz");
        mnuQuiz.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        mnuItemQuiz.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        mnuItemQuiz.setText("Quiz");
        mnuItemQuiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuItemQuizActionPerformed(evt);
            }
        });
        mnuQuiz.add(mnuItemQuiz);

        mnuBarMain.add(mnuQuiz);

        setJMenuBar(mnuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(lblProgramTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIntro9)
                            .addComponent(lblIntro8)
                            .addComponent(btnQuiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIntro1)
                            .addComponent(lblIntro2)
                            .addComponent(lblIntro3)
                            .addComponent(lblQuizTitle))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIntro6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIntro7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblLessonTitle)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnMultiplicationDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnZeroOne, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)
                                        .addComponent(btnNegativeExponent, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblIntro5)
                            .addComponent(lblIntro4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(lblMainImage)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblProgramTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblIntro1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIntro2)
                .addGap(18, 18, 18)
                .addComponent(lblIntro3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIntro4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIntro5)
                        .addGap(31, 31, 31)
                        .addComponent(lblIntro6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIntro7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(lblLessonTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnZeroOne, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNegativeExponent, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMultiplicationDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPower, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblMainImage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lblQuizTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQuiz1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(lblIntro8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblIntro9)
                .addGap(14, 14, 14))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //event that menu item under Lesson called Multiplication/Division Laws is clicked
    private void mnuItemMultiplicationDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemMultiplicationDivisionActionPerformed
        //call self-created function to display form in dialog for Lesson 3, pass key "Multiplication/Division Rule" as input string
        callForm("Multiplication/Division Rule");
    }//GEN-LAST:event_mnuItemMultiplicationDivisionActionPerformed
    
    //event that menu item under Lesson called Zero/One Laws is clicked
    private void mnuItemZeroOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemZeroOneActionPerformed
        //call self-created function to display form in dialog for Lesson 1, pass key "Zero/One Rule" as input string
        callForm("Zero/One Rule");
    }//GEN-LAST:event_mnuItemZeroOneActionPerformed
    
    //event that button for lesson 1 is clicked
    private void btnZeroOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroOneActionPerformed
        //call self-created function to display form in dialog for Lesson 1, pass key "Zero/One Rule" as input string
        callForm("Zero/One Rule");
    }//GEN-LAST:event_btnZeroOneActionPerformed
    
    //event that button for lesson 2 is clicked
    private void btnNegativeExponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegativeExponentActionPerformed
        //call self-created function to display form in dialog for Lesson 2, pass key "Negative Exponent Rule" as input string
        callForm("Negative Exponent Rule");
    }//GEN-LAST:event_btnNegativeExponentActionPerformed
    
    //event that button for lesson 3 is clicked
    private void btnMultiplicationDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicationDivisionActionPerformed
        //call self-created function to display form in dialog for Lesson 3, pass key "Multiplication/Division Rule" as input string
        callForm("Multiplication/Division Rule");
    }//GEN-LAST:event_btnMultiplicationDivisionActionPerformed
    
    //event that button for lesson 4 is clicked
    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        //call function to display form in dialog for Lesson 4, pass key "Power Rule" as input string
        callForm("Power Rule");
    }//GEN-LAST:event_btnPowerActionPerformed
    
    //event that button for quiz is clicked
    private void btnQuiz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuiz1ActionPerformed
        //call function to display form in dialog for quiz, pass key "Quiz" as input string
        callForm("Quiz");
    }//GEN-LAST:event_btnQuiz1ActionPerformed
    
    //event that menu item under Lesson called Negative Exponents is clicked
    private void mnuItemNegativeExponentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemNegativeExponentActionPerformed
        //call function to display form in dialog for Lesson 2, pass key "Negative Exponent Rule" as input string
        callForm("Negative Exponent Rule");
    }//GEN-LAST:event_mnuItemNegativeExponentActionPerformed
    
    //event that menu item under Lesson called Power Rules is clicked
    private void mnuItemPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemPowerActionPerformed
        //call function to display form in dialog for Lesson 4, pass key "Power Rule" as input string
        callForm("Power Rule");
    }//GEN-LAST:event_mnuItemPowerActionPerformed

    //event that menu item under Quiz called Quiz is clicked
    private void mnuItemQuizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuItemQuizActionPerformed
        //call function to display form in dialog for quiz, pass key "Quiz" as input string
        callForm("Quiz");
    }//GEN-LAST:event_mnuItemQuizActionPerformed

    //this section is the autogenerated variable declaration of the GUI components
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMultiplicationDivision;
    private javax.swing.JButton btnNegativeExponent;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnQuiz1;
    private javax.swing.JButton btnZeroOne;
    private javax.swing.JLabel lblIntro1;
    private javax.swing.JLabel lblIntro2;
    private javax.swing.JLabel lblIntro3;
    private javax.swing.JLabel lblIntro4;
    private javax.swing.JLabel lblIntro5;
    private javax.swing.JLabel lblIntro6;
    private javax.swing.JLabel lblIntro7;
    private javax.swing.JLabel lblIntro8;
    private javax.swing.JLabel lblIntro9;
    private javax.swing.JLabel lblLessonTitle;
    private javax.swing.JLabel lblMainImage;
    private javax.swing.JLabel lblProgramTitle;
    private javax.swing.JLabel lblQuizTitle;
    private javax.swing.JMenuBar mnuBarMain;
    private javax.swing.JMenuItem mnuItemMultiplicationDivision;
    private javax.swing.JMenuItem mnuItemNegativeExponent;
    private javax.swing.JMenuItem mnuItemPower;
    private javax.swing.JMenuItem mnuItemQuiz;
    private javax.swing.JMenuItem mnuItemZeroOne;
    private javax.swing.JMenu mnuLesson;
    private javax.swing.JMenu mnuQuiz;
    // End of variables declaration//GEN-END:variables
}

/*
*Bibliography:
*How to make a JFrame Modal in Swing java. (n.d.). Retrieved July 22, 2018, from https://stackoverflow.com/questions/1481405/how-to-make-a-jframe-modal-in-swing-java
*/