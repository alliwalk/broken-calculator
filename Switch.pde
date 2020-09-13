// a check to see which button was pressed
void controlEvent(ControlEvent theEvent) {
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

break;
