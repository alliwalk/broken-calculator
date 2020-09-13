/*
 Problem 2: not sure how to change the appearance of my buttons
 
 */
import controlP5.*;

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

void setup() {
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


void draw() {
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









