int width = 500;
int height = 500;
int movement = 0;

void setup() {
	size(width, height);
  rectMode(CENTER);
  ellipseMode(CENTER)
}

void draw() {
// Step 1: Write code that draws the following screenshots 
// with hard-coded values. (Feel free to use colors 
// instead of grayscale.)

// Step 2: Replace all of the hard-coded numbers with 
// variables.

// Step 3: Write assignment operations in draw() that 
// change the value of the variables.
// For example, “variable1 = variable1 + 2;”. 

// Step 4: Make it so when the program runs the ball slides off the screen exiting at the point (500, 500)

  background(255);
  stroke(0);

  fill(120);
  rect(width / 3, height / 3, width / 2, height / 2);

  fill(255);
  ellipse((width / 3) + movement, (height / 3) + movement, width / 6, height / 6);
  movement++;
  

}