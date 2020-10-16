int ellipseLocationX = mouseX + ((int) random(-20, 20));
int ellipseLocationY = mouseY + ((int) random(-20, 20));
int ellipseWidth = 10;
int ellipseHeight = 10;

int rectLocationX = (int) random(0, 500);
int rectLocationY = (int) random(0, 500);
int rectWidth = (int) random(10, 300);
int rectHeight = (int) random(10, 300);


int r = (int) random(0,255);
int g = (int) random(0,255);
int b = (int) random(0,255);

int rectR = (int) random(0,255);
int rectG = (int) random(0,255);
int rectB = (int) random(0,255);

void setup() {
	size(500, 500);
  rectMode(CENTER);
  ellipseMode(CENTER);
  background(255);
}

void draw() {
  r = (int) random(0, 255);
  g = (int) random(0, 255);
  b = (int) random(0, 255);
  
  ellipseLocationX = mouseX + ((int) random(-40, 40));
  ellipseLocationY = mouseY + ((int) random(-40, 40));
  
  fill(rectR, rectB, rectG);
  rect(rectLocationX, rectLocationY, rectWidth, rectHeight);
  fill(r, g, b);
  ellipse(ellipseLocationX, ellipseLocationY, ellipseWidth, ellipseHeight);
  stroke(0);
  

}

void mousePressed(){
  background(255);
  rectR = (int) random(0,255);
  rectG = (int) random(0,255);
  rectB = (int) random(0,255);

  fill(rectR, rectG, rectB);
  rectLocationX = (int) random(0, 500);
  rectLocationY = (int) random(0, 500);
  rectWidth = (int) random(10, 300);
  rectHeight = (int) random(10, 300);
  
}