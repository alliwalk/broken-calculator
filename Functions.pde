//the button function, with the value of the button
void button(int theValue) {
} 


//The following happens at every switch case whenever a button is pressed
void check(ControlEvent theEvent){ 
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
void happy(){
  int i = (int)random(happy.length); //select a random spot from the array 
  myTextfield.setText(happy[i]);  //display the last spot in the array
}

void sad(){
  int i = (int)random(sad.length);
  myTextfield.setText(sad[i]);  //display the last spot in the array
}

void lonely(){
  int i = (int)random(lonely.length);
  myTextfield.setText(lonely[i]);  //display the last spot in the array
}

void fortune(){
  int i = (int)random(fortune.length);
  myTextfield.setText(fortune[i]);  //display the last spot in the array
}

void dollar(){
  int i = (int)random(dollar.length);
  myTextfield.setText(dollar[i]);
}

void at(){
  int i = (int)random(at.length);
  myTextfield.setText(at[i]);
}

void and(){
  int i = (int)random(and.length);
  myTextfield.setText(and[i]);
}

void number(){
  int i = (int)random(number.length);
  myTextfield.setText(number[i]);
}

void division(){
  int i = (int)random(division.length);
  myTextfield.setText(division[i]);
}

