//Name: Evan Luo
//Date: July 23
//Title: Main
//Purpose: to call the main menu screen form from the main file

package TutorialApp;

public class Main {

    public static void main(String[] args) {
       MainPage frmMainPage = new MainPage();  //create new form object for 'MainPage' named frmMainPage
       frmMainPage.setVisible(true);  //this line of code displays the form using setVisible(true)
       frmMainPage.setLocationRelativeTo(null);  //this set form location to be the center of the screen
       frmMainPage.setResizable(false); //to prevent the main screen from being resized and mess up the formatting
       //retrieved method to set location to center of screen from: https://coderanch.com/t/343686/java/setLocationRelativeTo
    }
    
}

/*
*Bibliography
*What is this for: SetLocationRelativeTo()  . (n.d.). Retrieved July 22, 2018, from https://coderanch.com/t/343686/java/setLocationRelativeTo
*/