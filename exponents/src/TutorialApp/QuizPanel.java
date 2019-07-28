//Name: Evan Luo
//Date: July 23
//Title: QuizPanel
//Purpose: to create an interactive quiz for the lesson

package TutorialApp;

//import java script classes to use evaluation engine
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class QuizPanel extends javax.swing.JPanel {

    //globally define and initialize array for storing the 10 quiz questions
    public String[] aryQuestions=new String[10];
    //globally define and initialize array for storing system results for questions; index must be matched between aryQuestions and arySystemAnswers
    public String[] arySystemAnswers=new String[10];  
     //globally define and initialize array for storing user's answers for questions; index must be matched between aryQuestions and aryUserAnswerResults
    public String[] aryUserAnswerResults=new String[10];
    //globally declare and initialize integer index to store current question index
    public int intCurrentListIndex=-1;  //initalize to -1 because zero is an already valid value, do not want to initialize to something with a value

    public QuizPanel() {
        initComponents();
        
        //define a string to store all questions for later use in array
        //html format is used to wrap the text and enable usage of <sup> (stands for superscript) which enables the numbers to be exponents
        //retrieved from: https://www.w3schools.com/tags/tag_sup.asp
        String strQuestions;
        //append first question; separated with ";"
        strQuestions="<html>(2<sup>3</sup> * 3<sup>4</sup>) / 6<sup>3</sup></html>;";
         //append second question; separated with ";"
        strQuestions +="<html>7<sup>8</sup> * 7<sup>-7</sup> + 7 <sup>1</sup></html>;";
         //append third question; separated with ";"
        strQuestions +="<html>2<sup>0</sup> + 3<sup>2</sup> - 3<sup>1</sup></html>;";
         //append forth question; separated with ";"
        strQuestions +="<html>(5<sup>1000</sup> * 3<sup>2</sup>) / 25<sup>499</sup></html>;";
         //append fifth question; separated with ";"
        strQuestions +="<html>(2<sup>3</sup> * 2<sup>-2</sup>)<sup>-1</sup></html>;";
         //append sixth question; separated with ";"
        strQuestions +="<html>(4<sup>2</sup>) / (2<sup>2</sup>)<sup>3</sup></html>;"; 
         //append seventh question; separated with ";"
        strQuestions +="<html>(3<sup>2</sup> * 3<sup>12</sup>) / 9<sup>6</sup></html>;"; 
         //append eighth question; separated with ";"
        strQuestions +="<html>(2/3)<sup>2</sup> * (3/5)<sup>2</sup></html>;"; 
         //append nineth question; separated with ";"
        strQuestions +="<html>(5<sup>-2</sup>)<sup>-1</sup></html>;";  
         //append tenth question; separated with ";"
        strQuestions +="<html>((2<sup>3</sup>) * (2<sup>4</sup>) / 8<sup>2</sup>) * ( 4<sup>2</sup> / 4<sup>-1</sup> ) </html>";  
        
        //split above questions string into array of strings
        String[] aryItems=strQuestions.split(";");
        //loop into and assign each question into the global question array
        //declare object i that will act as the index 
        for (int i = 0; i <aryItems.length; i++) //.length is the attribute of the array
            aryQuestions[i]=aryItems[i];
     
        //define and assign a string to store all answers; index must matched between questions array and answers array
        String strSystemAnswers="3;14;7;225;0.5;0.25;9;0.16;25;128";
        //split above system correct answer strings into array of strings
        String[] aryParts=strSystemAnswers.split(";");
        //for loop that will assign each answer into global system answer array
        //declare objext i that will act as the index 
        for (int i = 0; i <aryParts.length; i++) //.length is the attribute of the array
           arySystemAnswers[i]=aryParts[i];
        
        //declare and initialize an empty string for each of the user's answers; index must matched between questions array and user answers array
        for (int i = 0; i <aryUserAnswerResults.length; i++) //.length is the attribute of the array     
            aryUserAnswerResults[i]=""; //initialization to be empty
        
        //set current index to be zero, because arrays start from zero
        intCurrentListIndex=0;
        //call function to display the first question of the quiz
        displayQuiz(intCurrentListIndex);
    }

    //define function that will evaluate math expressions in string format
    //for example, for an answer of 0.5, if user enters "1/2" they should be correct as well
    //reference for converting a string to an expression: https://coderanch.com/t/427393/java/Convert-String-expression
    //refernece for 'instanceof': https://stackoverflow.com/questions/3661413/how-to-cast-an-object-to-an-int
    private Double evalulateExpressioninString(String strAnswer)
    {
        //declare double variable called dblResult and initialize it with value 0.0
        Double dblResult=0.0;
         //get JavaScript engine through following code
        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
        
        //try is to define block to check cases where answer is correct even through it does not directly match string answer
        //engine evaluator must be in a try block otherwise there will be a compiling error
        try {
            //evalulate string expression with the JavaScript engine
            Object objResult = engine.eval(strAnswer);
            //check if the result can be a double if converted
            if (objResult instanceof Double ) {
                //cast double onto the objResult variable and assign to dblResult
                dblResult = (Double) objResult;
            }
            //check if the result can be an integer if converted
            if (objResult instanceof Integer){
                //cast integer onto objResult and multiply the integer by 1.0 because the return must be variable dblResult which is a double 
                dblResult = (Integer)objResult * 1.0;
            }
        }
        //in the case that the input is actually incorrect and not a variation of the correct answer
        catch (ScriptException e) {
            //prints error trace
            e.printStackTrace();
        }
        //return result out of function      
        return dblResult;
    }
    
    //define function to display question with current question index
    //input parameter is current question index of questions array
    //name function displayQuiz()
    private void displayQuiz(int intQuestionIndex)
    {
        //get array element for current question
        //declare and initialize string variable strQuestion
        String strQuestion = aryQuestions[intQuestionIndex];
        //assign text to the question label using setText()
        lblQuestion.setText(strQuestion);
        //reset the user answer to be empty through setText()
        txtUserAnswer.setText("");
        
    }
    
    //define a method to check the user's ansser
    //method requires two inputs: an array index for the question (data type is integer) and user's answer as String type
    //method will return answer string
    //name method checkAnswer()
    private String checkAnswer(int intQuestionIndex, String strUserAnswer)
    {
        //declare and assign statement to the string variable strCorrectMessage
        String strCorrectMessage="Great! You got the correct answer!";
        //declare and assign statement to the string variable strWrongMessage
        String strWrongMessage ="Wrong answer. Please try again!";
        //declare and set a default message (wrong message) for the strAnswer string variable 
        String strAnswer=strWrongMessage;
        //declare a temporary double variable used inside this function
        Double dblValue;
        //update value for corresponding user answer with index
        //"no" element value means incorrect answer
        aryUserAnswerResults[intQuestionIndex]="No";
        
        //check if user has answered the question (checking for empty string)
        if (strUserAnswer.length()>0) //usage of length() method will determine whether user has input or not input an answer
        {
            //in the case that there is a value, check if the user's answer matches the syctem answer with the same index, case not sensitive
            if (arySystemAnswers[intQuestionIndex].equalsIgnoreCase(strUserAnswer))  //equalsIgnoreCase() satisfies the case not sensitive portion of this code
            {
                //assign the answer string variable to be the message for a correct answer
                strAnswer=strCorrectMessage;
                //also update the element value ("yes" means correct answer) for current user's answer result, used for summary button later on
                aryUserAnswerResults[intQuestionIndex]="Yes";
            }
            else{
                //if the strings don't match, call evalulateExpressioninString to evalulate expression in string
                dblValue=evalulateExpressioninString(strUserAnswer);
                //compare doubles to see whether the evalulated number if it is the same as the system answer
                if (dblValue == Double.parseDouble(arySystemAnswers[intQuestionIndex]))  //Double.parseDouble() converts the array integer to a double value
                {
                    //assign the answer string variable to be the message for a correct answer
                    strAnswer=strCorrectMessage;
                    //also update the element value ("yes" means correct answer) for current user's answer result, used for summary button later on
                    aryUserAnswerResults[intQuestionIndex]="Yes";
                }
            }
        }
        else
        {
            //update the element value ("" means unanswered question) for current user's answer result, used for summary button later on
            aryUserAnswerResults[intQuestionIndex]="";
        }
        //return string answer out of method
        return strAnswer;
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblQuizTitle = new javax.swing.JLabel();
        lblEnterAnswer = new javax.swing.JLabel();
        lblQuestionLabel = new javax.swing.JLabel();
        txtUserAnswer = new javax.swing.JTextField();
        lblSystemAnswer = new javax.swing.JLabel();
        btnAnswer = new javax.swing.JButton();
        lblQuizImage = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblQuestion = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        lblInstruction1 = new javax.swing.JLabel();
        lblInstruction2 = new javax.swing.JLabel();
        lblInstruction3 = new javax.swing.JLabel();
        btnSummary = new javax.swing.JButton();
        lblSummary = new javax.swing.JLabel();

        lblQuizTitle.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        lblQuizTitle.setForeground(new java.awt.Color(204, 51, 0));
        lblQuizTitle.setText("QUIZ ");

        lblEnterAnswer.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblEnterAnswer.setText("Enter your answer: ");

        lblQuestionLabel.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblQuestionLabel.setText("Question: ");

        txtUserAnswer.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblSystemAnswer.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblSystemAnswer.setForeground(new java.awt.Color(204, 51, 0));

        btnAnswer.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnAnswer.setText("Save Answer");
        btnAnswer.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(153, 153, 153)));
        btnAnswer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnswerActionPerformed(evt);
            }
        });

        lblQuizImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TutorialApp/quizImage.png"))); // NOI18N

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TutorialApp/left32Image.png"))); // NOI18N
        btnPrevious.setPreferredSize(new java.awt.Dimension(57, 41));
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TutorialApp/right32Image.png"))); // NOI18N
        btnNext.setPreferredSize(new java.awt.Dimension(57, 41));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblQuestion.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TutorialApp/first32Image.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TutorialApp/last32Image.png"))); // NOI18N
        btnLast.setPreferredSize(new java.awt.Dimension(57, 41));
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        lblInstruction1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblInstruction1.setText("For the purposes of this quiz, do not use ^ for exponents, ");

        lblInstruction2.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblInstruction2.setText("but calculate the integer/decimal value itself. For example, do not input ");

        lblInstruction3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblInstruction3.setText("2^3 as your answer, but input 8. However, you can put fractions.");

        btnSummary.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnSummary.setText("Summary");
        btnSummary.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 153, 255), new java.awt.Color(153, 153, 153)));
        btnSummary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummaryActionPerformed(evt);
            }
        });

        lblSummary.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblSummary.setForeground(new java.awt.Color(51, 0, 204));
        lblSummary.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblQuizTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInstruction3)
                            .addComponent(lblInstruction1)
                            .addComponent(lblInstruction2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblQuestionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(lblQuizImage)
                        .addGap(75, 75, 75))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEnterAnswer)
                                    .addComponent(btnAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSystemAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblQuizTitle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblInstruction1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInstruction2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInstruction3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblQuizImage))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEnterAnswer)
                    .addComponent(txtUserAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblSystemAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSummary, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //event that save answer button is clicked
    private void btnAnswerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnswerActionPerformed
        //call "checkAnswer" function to return system result with the intCurrentListIndex and user input string as the input 
        String strAnswer=checkAnswer(intCurrentListIndex, txtUserAnswer.getText());
        //display system answer on label using setText()
        lblSystemAnswer.setText(strAnswer);
    }//GEN-LAST:event_btnAnswerActionPerformed
    
    //event that previous action button is clicked
    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        //decrease index by one; 
        int intPreviousListIndex =intCurrentListIndex-1;
        //if index is greater or equal to zero (array starts with zero), move to previous question; otherwise stay on current question since it is the first question
        if (intPreviousListIndex >=0)
        {
           //update global value for current index; used for record navigation
           intCurrentListIndex=intPreviousListIndex;
           //display previous record using displayQuiz() method
           displayQuiz(intCurrentListIndex);
        }
         
    }//GEN-LAST:event_btnPreviousActionPerformed
   
    //event that next action button is clicked
    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        //increase index by one; 
        int intNextListIndex =intCurrentListIndex +1;
        //create and get last index of question
        int intLastListIndex = aryQuestions.length-1;
        //if index is less or equal to the last element index, move to next question; otherwise stay on current question since it is already the last question
        if (intNextListIndex <=intLastListIndex)
        {
           //update global value for current index; used for record navigation
           intCurrentListIndex=intNextListIndex;
           //display next record using displayQuiz() method
           displayQuiz(intCurrentListIndex);
        }
    }//GEN-LAST:event_btnNextActionPerformed
    
    //event that first action button is clicked
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
         //check if current quesiton index is NOT for the first question
         if (intCurrentListIndex !=0) //!= means not equal to 
         {   
             //update global value for current index; used for record navigation
            intCurrentListIndex=0;
            //display the first record using displayQuiz() method
            displayQuiz(intCurrentListIndex);
         }
    }//GEN-LAST:event_btnFirstActionPerformed
    
    //event that last action button is clicked
    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        //check if current question index is NOT for last question
        
        //declare integer variable to check whether user is on last question and subtract one from the array's length
        int intLastListIndex = aryQuestions.length-1;
        
        //check if the current question index is NOT for the last question
        if (intCurrentListIndex !=intLastListIndex)
        {
             //update global value for current index; used for record navigation
              intCurrentListIndex=intLastListIndex;
              //display the last record using the displayQuiz() method
              displayQuiz(intCurrentListIndex);
        }
    }//GEN-LAST:event_btnLastActionPerformed

     //event that the summary button is clicked
    private void btnSummaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummaryActionPerformed
        //declare and initialize integer variable that holds number of correct answers, acts like a counter
        int intCorrectNumber=0;
        //declare and initialize integer variable that holds number of wrong answers, acts like a counter
        int intWrongNumber=0;
        //declare and initialize integer variable that holds number of unanswered questions. acts like a counter
        int intUnanswerNumber=0;
        
        //declare and initialize summary result string variable
        String strSummary="";
        
        //create a for loop through aryUserAnswerResults, since user's answers are stored in this array
        //declare object i that will be the indicator for how many questions have been inspected by the for loop
        //for loop will stop when all the questions have been checked because the length() method will indicate 10 
        for (int i = 0; i <aryUserAnswerResults.length; i++)
        {
            //the following if - else statement will be performed for every time this loop repeats 
            //if the user has not input an answer
            //equalsIgnoreCase("") represents that the position in the array is empty
            if (aryUserAnswerResults[i].equalsIgnoreCase(""))
            {
                //increase "intUnanswerNumber" by one
                intUnanswerNumber++;
            }
            //else represents the case that the user has input an answer
            else
            {
                //check if it is "yes", meaning the user's answer is correct
                if (aryUserAnswerResults[i].equalsIgnoreCase("Yes"))
                {
                    //increase "intCorrectNumber" by one
                    intCorrectNumber++;
                }
                //check if it is "no", meaning the user's answer is wrong
                else
                {
                    //only left for "no", means user's wrong answer
                    intWrongNumber++;
                }
            }
        }
        //generate the summary report by creating a string literal and assigning it to the summary string variable
        //<html> ... </html> causes the text to wrap and puts it into html format
        //Integer.toString() converts the integer variable's data into a string so that it will display in the wrapped text
        //<br> is the html equivalent of \n which causes the text to move to a new line
        strSummary="<html>Your result summary: <br>Number of correct answers: "+ Integer.toString(intCorrectNumber)+"<br>Number of wrong answers: "+ Integer.toString(intWrongNumber)+"<br>Number of unanswered questions: "+ Integer.toString(intUnanswerNumber)+"</htm>";
        
        //display the summary report into the summary label using the setText() method
        this.lblSummary.setText(strSummary);
    }//GEN-LAST:event_btnSummaryActionPerformed

    //this section is the autogenerated variable declaration of the GUI components
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnswer;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSummary;
    private javax.swing.JLabel lblEnterAnswer;
    private javax.swing.JLabel lblInstruction1;
    private javax.swing.JLabel lblInstruction2;
    private javax.swing.JLabel lblInstruction3;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel lblQuestionLabel;
    private javax.swing.JLabel lblQuizImage;
    private javax.swing.JLabel lblQuizTitle;
    private javax.swing.JLabel lblSummary;
    private javax.swing.JLabel lblSystemAnswer;
    private javax.swing.JTextField txtUserAnswer;
    // End of variables declaration//GEN-END:variables
}

/*
*Bibliographies:
*Convert String into an expression.  . (n.d.). Retrieved July 22, 2018, from https://coderanch.com/t/427393/java/Convert-String-expression
*How to cast an Object to an int. (n.d.). Retrieved July 22, 2018, from https://stackoverflow.com/questions/3661413/how-to-cast-an-object-to-an-int
*HTML Tag. (n.d.). Retrieved July 22, 2018, from https://www.w3schools.com/tags/tag_sup.asp
*/