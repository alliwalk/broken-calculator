import processing.core.*; 
import processing.xml.*; 

import controlP5.*; 

import java.applet.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.awt.event.*; 
import java.io.*; 
import java.net.*; 
import java.text.*; 
import java.util.*; 
import java.util.zip.*; 
import java.util.regex.*; 

public class Calc_Later_new extends PApplet {

/*
 Problem 2: not sure how to change the appearance of my buttons
 
 */


ControlP5 controlP5; //Call the P5 objects(?)
Textfield myTextfield; // create a new textfield class
boolean newNum = false; //set a boolean variable that is used in the '+' switch case to track when to add a new number
//int setColorBackground(125); //= color(0,0,0); // Not sure what this does
int myColorBackground = color(0,0,0);
float num1, num2; //set variables for adding the numbers together
//int buttonValue = 1; // 

// variables for position of most of the buttons
int rW = 40;
int posX = 180;
int move = 50;
int posY1 = 270;
int posY2 = 320;
int posY3 = 370;
int posY4 = 420;

//int k; // k will be the integer returned
boolean even = false;
int mode; // determines what type of operator was pressed

public void setup() {
  //newNum=false;
  size(500,500);

  // Calculator base

  controlP5 = new ControlP5(this);

  // the buttons go here because if they're in Draw you repeatedly get the checking.
  myTextfield = controlP5.addTextfield("",115,68,270,65); // this is the text box where the numbers appear
  // myTextfield.setColorForeground(0xffff000); // not sure what this is for

  //The button keys
  fill(255);
  rect(posX-move,posY1,rW,rW);

  controlP5.addButton(" CLEAR",31,posX+move*3,posY1-move*2,rW,rW).setId(31);

  controlP5.addButton("   *",22,posX+move*3,posY1-move,rW,rW).setId(22);
  controlP5.addButton("   /",23,posX+move*2,posY1-move,rW,rW).setId(23);

  controlP5.addButton("   $",33,posX-move,posY1,rW,rW).setId(33);
  controlP5.addButton("   1",1,posX,posY1,rW,rW).setId(1);
  controlP5.addButton("   2",2,posX+move,posY1,rW,rW).setId(2);
  controlP5.addButton("   3",3,posX+move*2,posY1,rW,rW).setId(3);

  controlP5.addButton("   @",34,posX-move,posY2,rW,rW).setId(34);
  controlP5.addButton("   4",4,posX,posY2,rW,rW).setId(4);
  controlP5.addButton("   5",5,posX+move,posY2,rW,rW).setId(5);
  controlP5.addButton("   6",6,posX+move*2,posY2,rW,rW).setId(6);

  controlP5.addButton("   +",20,posX+move*3,posY1,rW,rW).setId(20);
  controlP5.addButton("   -",21,posX+move*3,posY2,rW,rW).setId(21);

  controlP5.addButton("   &",35,posX-move,posY3,rW,rW).setId(35);
  controlP5.addButton("   7",7,posX,posY3,rW,rW).setId(7);
  controlP5.addButton("   8",8,posX+move,posY3,rW,rW).setId(8);
  controlP5.addButton("   9",9,posX+move*2,posY3,rW,rW).setId(9);  

  controlP5.addButton("   #",36,posX-move,posY4,rW,rW).setId(36);
  controlP5.addButton("   ?",30,posX,posY4,rW,rW).setId(30);
  controlP5.addButton("   Q",0,posX+move,posY4,rW,rW).setId(32);
  controlP5.addButton("   0",0,posX+move*2,posY4,rW,rW).setId(0);

  controlP5.addButton("   =", 100, 330,370,40,90).setId(100);
}


public void draw() {
  //Calculator base
  stroke(124);
  fill(227);
  rect(100,50,300,430);

  //White Border
  fill(255);
  //stroke(0);
  noStroke();
  rect(posX-6,posY1-4,rW+112,rW+157); // square

  // Orange border

  fill(255,140,0); 
  rect(posX-38,posY4-3,rW+92,rW+6);//horizontal bottom
  rect(posX-move-2,posY1-4,rW+5,rW+157); // vertical left
  rect(posX+move*3-3,posY1-4,rW+5,rW+58); // vertical right
  rect(posX+move*2-3, posY1-move-3, rW+55, rW+9); //horizontal top
  //rect(posX+move*3-3,posY2-3,rW+5,rW+5);  

  //Calculator top
  noStroke();
  fill(42,42,42);
  rect(100,50,300,100);

  // fill(255);
  // rect(posX-move,posY1,rW,rW);

}









/* 

  + is 20         mode == 0
  - is 21         mode == 1 
  * is 22         mode == 8
  / is 23         mode == 9
  
  c is 30         no mode
  ? is 31         mode == 2
  Q is 32         mode == 3
  $ is 33 dollar  mode == 4
  @ is 34 at      mode == 5
  & is 35 and     mode == 6
  # is 36 num     mode == 7
  
  = is  100

*/
//the button function, with the value of the button
public void button(int theValue) {
} 


//The following happens at every switch case whenever a button is pressed
public void check(ControlEvent theEvent){ 
  if (newNum == false) {  
    myTextfield.setText(myTextfield.getText() + str(theEvent.controller().id())); 
    //if newNum equals false, add the number entered to the previous number so that there are now two numbers entered
  }
  else { //at button press...
    newNum = false; //...the boolean value for newNum is false, so...
    myTextfield.setText(str(theEvent.controller().id()));
  } // take the controller ID turns it to a String and puts it in the textfield 
}




//Functions to call the strings
public void happy(){
  int i = (int)random(happy.length); //select a random spot from the array 
  myTextfield.setText(happy[i]);  //display the last spot in the array
}

public void sad(){
  int i = (int)random(sad.length);
  myTextfield.setText(sad[i]);  //display the last spot in the array
}

public void lonely(){
  int i = (int)random(lonely.length);
  myTextfield.setText(lonely[i]);  //display the last spot in the array
}

public void fortune(){
  int i = (int)random(fortune.length);
  myTextfield.setText(fortune[i]);  //display the last spot in the array
}

public void dollar(){
  int i = (int)random(dollar.length);
  myTextfield.setText(dollar[i]);
}

public void at(){
  int i = (int)random(at.length);
  myTextfield.setText(at[i]);
}

public void and(){
  int i = (int)random(and.length);
  myTextfield.setText(and[i]);
}

public void number(){
  int i = (int)random(number.length);
  myTextfield.setText(number[i]);
}

public void division(){
  int i = (int)random(division.length);
  myTextfield.setText(division[i]);
}

String[] happy = { // +
  "Sounds like a good idea.",
  "I've been thinking of you.",
  "I'd be happy to.",
  "It's nice to see you again.",
  "Somebody, somewhere is thinking of you.",
  "Love is on its way.",
  "I enjoy your company.",
};

String[] sad = { // M
  "I'm busy. Try again...never.",
  "Time with you is like nails on a chalkboard.",
  "I don't think so.",
  "Rarely...especially in your case.",
  "OMG! Are you done yet?",
  "Oops... this answer is not for you.",
  "Next time, keep that to yourself.",
  "It's tough to be fascinating. You're not."
};

String[] lonely = { // - 
  "I'm so lonely.",
  "All my friends left me for an abacus.",
  "One is the loneliest number.",
  "It's so dark in here...",
  "Tom is my only friend.",
  "Nothing makes us so lonely as our secrets",
  "I'm crying right now."
};

String[] fortune = { // ?
 "The dream is within you.",
 "Believing is doing.",
 "In time, even an egg will walk.",
 "Life is a verb.",
 "Take it easy",
 "Pick a path with heart.",
 "He who seeks will find.",
 "Love is blind; friendship closes its eyes.",
};
//loadStrings("http://www.fortunecookiemessage.com/archive.php");
// http://www.fortunecookiemessage.com/feeds.xml
// get between the description tags


String[] dollar = { // $
 "Broke is a state of mind.",
 "Good clothes open many doors. Go shopping.",
 "You will inherit a large sum of money.",
 "Make all you can, save all you can, give all you can.",
 "Don't just spend time, invest it.",
 "Perhaps you've been focusing too much on spending.",
 "Endless money forms the sinews of war."
};


String [] at = { // @
 "Compassion is a way of being.",
 "Open your arms to change, but don't let go of your values.",
 "Be kind whenever possible. It is always possible.",
 "Spend some time alone every day.",
 "If ignorance is our master, true peace is impossible.",
 "In the practice of tolerance, one's enemy is the best teacher.",
 "Love and compassion are necessities, not luxuries.",
};
//http://thinkexist.com/quotes/top/nationality/tibetan/2.html

String [] and = { //&
"A smiling face is half the meal.",
//"The way one eats is the way one works.",
"There is no such thing as a little garlic.",
"Jam tomorrow and jam yesterday, but never jam today.",
//"Laughter is brightest where food is best",
"'Tis an ill cook that cannot lick his own fingers",
//"Tell me what you eat, And I will tell you what you are.",
"All things require skill but an appetite",
};


String [] number = { //#
"The fault, dear Brutus, is not in our stars.",
"Et tu, Brute?",
"All the world's a stage,",
"And all the men and women merely players;",
"They have their exits and their entrances",
"And one man in his time plays many parts,",
"His acts being seven ages."
};

String[] division = { // '/'
"Glue... very powerful stuff.",
"I am NOT the Messiah!",
"Whoa, did somebody step on a duck?",
"Who's you decorator? Bennihana?",
"Do you stand for 'goodness', or - for 'badness'?",
"Come say hello to my little friend.",
//"My name is Inigo Montoya. You killed my father. Prepare to die."
};
// a check to see which button was pressed
public void controlEvent(ControlEvent theEvent) {
  int num = theEvent.controller().id(); 
  switch(num){ // these are all checks to set the integer value of num
  case 0: // "0"
    check(theEvent);
    break;
  case 1: //"1"
    check(theEvent);    
    break;
  case 2: //"2"
    check(theEvent);    
    break;
  case 3: //"3"
    check(theEvent);    
    break;
  case 4: //"4"
    check(theEvent);    
    break;
  case 5: //"5"
    check(theEvent);    
    break;
  case 6: //"6"
    check(theEvent);    
    break;
  case 7: //"7"
    check(theEvent);    
    break;
  case 8: //"8"
    check(theEvent);    
    break;
  case 9: //"9"
    check(theEvent);    
    break;

  case 20: // "+" key
    mode = 0;
    newNum = true; //if key pressed is the '+' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 21: // "-" key
    mode = 1;
    newNum = true; //if key pressed is the '-' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 22: // "*" key
    mode = 8;
    newNum = true; //if key pressed is the '*' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 23: // "/" key
    mode = 9;
    newNum = true; //if key pressed is the '/' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 30: // "?" key
    mode = 2;
    newNum = true; //if key pressed is the '-' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 31: // "C" key
    myTextfield.setText(""); //sets the text field to " "
    break;
  case 32: // "Q"
    mode = 3;
    newNum = true; //if key pressed is the '-' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 33: // "$"
    mode = 4;
    newNum = true; //if key pressed is the '-' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 34: // "@"
    mode = 5;
    newNum = true; //if key pressed is the '-' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 35: // "&"
    mode = 6;
    newNum = true; //if key pressed is the '-' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;
  case 36: // "#"
    mode = 7;
    newNum = true; //if key pressed is the '-' key, set 'boolean = newNum' to 'true'
    num1 = Float.parseFloat(myTextfield.getText()); //assigns num1 the String-to-integer value from textfield
    break;

  case 100: // "=" key
    //println("the number is positive " + num2 ); //prints the ID of the button pressed 
    switch(mode){
    case 0: // addition
      num2 = num1 + Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield 

      if (num2%2 == 0){ //If the number is even, the boolean value of 'even' is true..
        even = true; 
        happy();  // and calls the happy function for happy/even strings 
      } 
      else {   //the value is odd
        lonely();  //calls the function for sad/odd strings
      } 
      break;
     case 1: // subtraction
      num2 = num1 - Float.parseFloat(myTextfield.getText()); 
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield 

      if (num2%2 == 0) { //If the number is even, the boolean value of 'even' is true..
        even = true; 
        happy(); // and calls the happy function for happy/even string
      }
      else {   //the value is odd
        lonely(); 
      }//calls the function for sad/odd strings  
      break;
     case 2: // Did user click '?'
      num2 = num1 + Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield 
      if (num2%2 == 0){ //If the number is even, the boolean value of 'even' is true..
        even = true; 
        fortune();  
      } // and calls the happy function for happy/even strings 
      else {   //the value is odd
        fortune();  
      } //calls the function for sad/odd strings
      break;
     case 3: // Did user click 'Q'
      num2 = num1 + Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield  
      if (num2%2 == 0){ //If the number is even, the boolean value of 'even' is true..
        even = true; 
        sad();  
      } // and calls the happy function for negative 
      else {   //the value is odd
        sad();  
      } //calls the function for negative
      break; 
     case 4: // Did user click '$'
      num2 = num1 + Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield  
      if (num2%2 == 0){ //If the number is even, the boolean value of 'even' is true..
        even = true; 
        dollar();  
      } // and calls the happy function for dollar
      else {   //the value is odd
        dollar();  
      } //calls the function for dollar
      break; 

    case 5: // Did user click '@'
      num2 = num1 + Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield  
      if (num2%2 == 0){ //If the number is even, the boolean value of 'even' is true..
        even = true; 
        at();  
      } // and calls the at function for @
      else {   //the value is odd
        at();  
      } //calls the function for @

    case 6: // Did user click '&'
      num2 = num1 + Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield  
      if (num2%2 == 0){ //If the number is even, the boolean value of 'even' is true..
        even = true; 
        and();  
      } // and calls the at function for &
      else {   //the value is odd
        and();  
      } //calls the function for &

    case 7: // Did user click '#'
      num2 = num1 + Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield  
      if (num2%2 == 0){ //If the number is even, the boolean value of 'even' is true..
        even = true; 
        number();  
      } // and calls the at function for #
      else {   //the value is odd
        number();  
      } //calls the function for #
      break; 

    case 8: // Did user click '*'
      num2 = num1 * Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield  
      break; 

    case 9: // Did user click '/'
      num2 = num1 / Float.parseFloat(myTextfield.getText()); //assigns the value of num1 + the next string-to-integer entered into text field into
      myTextfield.setText(str(num2));  //turns the value of num2 into a String, then puts it back into the textfield  
     // if (num2%2 == 0){ //If the number is even, the boolean value of 'even' is true..
     //   even = true; 
        division();  
        break;
     /* } // and calls the at function for /
      else {   //the value is odd
        division();  
      } //calls the function for /
      */
    }// end of switch
  }
  println(theEvent.controller().id()); //prints the ID of the button pressed
}

  static public void main(String args[]) {
    PApplet.main(new String[] { "--bgcolor=#FFFFFF", "Calc_Later_new" });
  }
}
