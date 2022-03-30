import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
  * Called once at the beginning of execution, put your size all in this method
  */
  public void settings() {
  // put your size call here
    size(200, 200);
  }

  /** 
  * Called once at the beginning of execution.  Add initial set up
  * values here i.e background, stroke, fill etc.
  */
  public void setup() {
    background(250, 250, 250);

  
  
  }

  public void draw() {
    
   // Quadrant 1
    stroke(0);
    for(int intLineX = 15; intLineX <= 175; intLineX += 17){
      line(intLineX, 0, intLineX, 170);
    }

    for(int intLineY = 16; intLineY <= 175; intLineY += 17){
      line(0, intLineY, 175, intLineY);
    }

    // Quadrant 2
     for (int intCircleY = height / 20; intCircleY <= height / 2; intCircleY += height / 10) {
      for (int intCircleX = width / 2 + width / 20; intCircleX <= width; intCircleX += width / 10) {
        ellipse(intCircleX, intCircleY, width / 20, height / 20);
          fill(255, 102, 102);
        }
      }

    // Quadrant 3

    for(int intI = 0; intI <= height; intI++){
      stroke(intI, intI, intI);
      line(intI, height/2+1, intI, height);
    }

    // Quadrant 4

    // petals
  for (int intAngle = 0; intAngle <= 360; intAngle += 45) {
      fill(255, 102, 0);
      stroke(0);

      // spacing out the petals
      pushMatrix();
        translate((width/2) + width/4, (height/2) + height/4);
        rotate(radians(intAngle));
        ellipse(0, 0, height / (float) 19.5, height / (float)3.5);
      popMatrix();
        }

     // middle petal of the flower
      fill(255, 204, 51);
      noStroke();
      ellipse((width/2) + width / 4, (height/2) + height / 4, 45, 45);
    }
}