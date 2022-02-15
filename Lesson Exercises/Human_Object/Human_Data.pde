
class humanData {

  float humanHeight;
  float humanWeight;
  boolean humanGender;
  String humanEye;
  String humanHair;

  Human(float tempHeight, float tempWeight, boolean tempGender, String tempEye, String tempHair) {
    humanHeight = tempHeight;
    humanWeight = tempWeight;
    humanGender = tempGender;
    humanEye = tempEye;
    humanHair = tempHair;
  }

  void display() {
    
    if (boolean(0)) {
      println("Woman");
    } else if (boolean(1)) {
      println("Man");
    }
    
    if (boolean(0)) {
      println("Awake");
    } else if (boolean(1)) {
      println("sleep");
    }

    if (boolean(0)) {
      println("Has Eaten");
    } else if (boolean(1)) {
      println("Hasn't Eaten");
    }

    println(travelMode);
  }
}
