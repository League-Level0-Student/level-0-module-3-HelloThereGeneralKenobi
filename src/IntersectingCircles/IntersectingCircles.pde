void setup() {
  size(600, 500);
}
float x1 = 150;
float x2 = 450;

void draw() {
  background(255,255,255);
  noFill();
  x1 = x1 + 0.5;
  x2 = x2 - 0.5;
  for (int i = 10; i < 215; i = i + 10) {
    ellipse(x1, 250, i, i);
  }
  for (int i = 10; i < 215; i = i + 10) {
    ellipse(x2, 250, i, i);
  }
}
