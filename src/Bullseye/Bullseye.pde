void setup() {
  size(800, 600);
}

void draw() {
  noFill();
  for (int i = 10; i < 115; i = i + 10) {
    ellipse(100, 100, i, i);
  }
}
