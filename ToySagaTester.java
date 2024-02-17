// TODO Add a complete file header here

/**
 * This class implements tester methods to ensure the correctness of the implementation of Furniture
 * and Toy classes in p03 Toy Saga I program.
 */
public class ToySagaTester {

  /**
   * This tester ensures the Furniture constructor which takes a String as input Furniture(String
   * name) correctly constructs a new Furniture object located at the center of the display window,
   * and assigned it a PImage and the name passed as input to the method call.
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   */
  public static boolean testFurnitureConstructor1Getters() {
    // TODO Implement this tester
    // Create at least one new Furniture object by called the constructor Furniture(String). The
    // String passed as input to the constructor call should be either "bed", "box", "nightstand",
    // or "rug".

    // Ensure that the call of getX() on that Furniture object equals Utility.width() / 2
    // Ensure that the call of getY() on that Furniture object equals Utility.height() / 2
    // Ensure that the call of name() on that Furniture object returns the name passed as input to
    // the constructor call
    // Ensure that the value of the image field on that Furniture object returns a NON-null reference.

    // This test should fail if any of the above requirements is NOT satisfied

    return false; // default return statement
  }

  /**
   * This tester ensures the Furniture constructor which takes a String, and two integers as input
   * Furniture(String name, int x, int y) correctly constructs a new Furniture object located at the
   * (x,y) input position, assigned it the name passed as input to the method call, and an image.
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   */
  public static boolean testFurnitureConstructor2Getters() {
    // TODO Implement this tester
    // Create at least one new Furniture object by called the constructor Furniture(String, int,
    // int). The String passed as input to the constructor call should be either "bed", "box",
    // "nightstand", or "rug".

    // Ensure that the call of getX() on that Furniture object equals the input x
    // Ensure that the call of getY() on that Furniture object equals the input y
    // Ensure that the call of name() on that Furniture object returns the name passed as input to
    // the constructor call
    // Ensure that the value of the image field on that Furniture object returns a NON-null reference.

    // This test should fail if any of the above requirements is NOT satisfied

    return false; // default return statement
  }

  /**
   * This tester ensures the Toy constructors, getters and setters of the x and y positions, and the
   * image field.
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   */
  public static boolean testToyConstructorsGettersSetters() {
    // TODO Implement this tester
    // This tester should check for the correctness of BOTH Toy(String) and Toy(String, int, int)
    // constructors, and the following setter and getter methods:
    // getX(), getY()
    // setX(), setY()
    // The image field should contain a NON-null reference
    // isDragging should return false on a new constructed Toy object

    // Note: The String passed as input to the Toy constructor call should be "car" or
    // "teddyBear".

    return false; // default return statement
  }

  /**
   * This tester ensures the correctness of Toy.startDragging() and Toy.stopDragging instance
   * methods
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   */
  public static boolean testToyStartStopDragging() {
    // TODO Implement this tester
    // This tester should construct at least one Toy object and call startDragging() and
    // stopDragging() methods on that object.

    // Ensure the isDragging() method call returns true after every call of the startDragging()
    // method on the Toy object
    // Ensure the isDragging() method call returns false after every call of the stopDragging()
    // method on the Toy object

    return false; // default return statement
  }

  /**
   * This tester ensures the correctness of Toy.move() method
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   */
  public static boolean testToyMove() {
    // TODO Implement this tester
    // This tester should construct at least one Toy object at a given x,y position

    // Every call on move(int dx, int dy) method should add dx and dy to the current x and y
    // position of the Toy object, respectively.

    // Try calling move method with positive and negative dx and dy inputs

    return false; // default return statement
  }

  /**
   * This tester ensures the correctness of Toy.rotate() method.
   * 
   * @author Mouna
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   * 
   */
  public static boolean testToyRotate() {
    // This method's implementation is entirely provided to you
    // Create two Toy objects
    Toy car1 = new Toy("car");
    Toy car2 = new Toy("car");

    // Ensures getRotationsCount() returns zero when called on newly constructed Toy objects
    if (car1.getRotationsCount() != 0) {
      System.out.println(
          "Toy.getRotationsCount() should return zero when called on a new created Toy object.");
      return false;
    }

    if (car2.getRotationsCount() != 0) {
      System.out.println(
          "Toy.getRotationsCount() should return zero when called on a new created Toy object.");
      return false;
    }
    // rotate car1 5 times
    for (int i = 0; i < 5; i++) {
      car1.rotate();
    }
    // Ensure the getRotationsCount returns the expected output
    if (car1.getRotationsCount() != 5) {
      System.out.println(
          "Toy.getRotationsCount() did not return the expected output after calling the rotate() "
              + "method multiple times.");
      return false;
    }
    // rotate car2 3 times
    for (int i = 0; i < 3; i++) {
      car2.rotate();
    }
    // Ensure the getRotationsCount returns the expected output
    if (car2.getRotationsCount() != 3) {
      System.out.println(
          "Toy.getRotationsCount() did not return the expected output after calling the rotate() "
              + "method multiple times.");
      return false;
    }
    return true; // Test passes with no errors
  }

  /**
   * This tester checks the correctness of Toy.isOver(int, int) method
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   */
  public static boolean testToyIsOverPoint() {
    // TODO Implement this tester
    // This tester should check for the correctness of Toy.isOver(int x, int y) method
    // This tester should construct at least one Toy object at a given (x,y) position
    // At least 4 scenarios should be considered.

    // (1) Calling the isOver(int, int) method on that Toy object passing it a point defined by x
    // and y coordinates defined inside the area of the image of the toy should return true

    // (2) Calling the isOver(int, int) method with a point (x,y) defined outside of the area of the
    // image of the toy should return false.

    // Call the rotate() method one time or an odd number of times on the toy. This should
    // rotate the image of the Toy object PI/2 clockwise so that the width and height of the toy are
    // expected to be switched.

    // (3) Call the isOver(int, int) method with a point (x,y) inside the area of the Toy,
    // considering this change on the width and height dimensions, should return true.

    // (4) Call the isOver(int, int) method with a point (x,y) outside the area of the Toy,
    // considering this change on the width and height dimensions, should return false.

    return false; // default return statement
  }

  /**
   * This tester checks the correctness of Toy.isOver(Furniture) method
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   */
  public static boolean testToyIsOverFurniture() {
    // TODO Implement this tester
    // This tester should check for the correctness of Toy.isOver(Furniture other) method

    // Create a Furniture object at a given (x, y) position.
    // You can then create at least three Toy objects:
    // (1) one intersecting with the Furniture object,
    // (2) one enclosed by it,
    // (3) one not overlapping with the Furniture.
    // Calling the isOver(Furniture) on each of the Toy objects should return the expected output.

    return false; // default return statement
  }

  /**
   * Runs all the tester methods defined in this class
   * 
   * @return true when this test verifies a correct functionality (ALL test scenarios PASS), and
   *         false otherwise
   */
  public static boolean runAllTests() {
    System.out.println("Class Furniture Testers:");
    boolean test1Result = testFurnitureConstructor1Getters();
    System.out.println("testFurnitureConstructor1Getters: " + (test1Result ? "PASS" : "FAIL"));

    boolean test2Result = testFurnitureConstructor2Getters();
    System.out.println("testFurnitureConstructor2Getters: " + (test2Result ? "PASS" : "FAIL"));

    System.out.println();
    System.out.println("Class Toy Testers:");
    boolean test3Result = testToyConstructorsGettersSetters();
    System.out.println("testToyConstructorsGettersSetters: " + (test3Result ? "PASS" : "FAIL"));

    boolean test4Result = testToyStartStopDragging();
    System.out.println("testToyStartStopDragging: " + (test4Result ? "PASS" : "FAIL"));

    boolean testToyMove = testToyMove();
    System.out.println("testToyMove: " + (testToyMove ? "PASS" : "FAIL"));

    boolean testToyRotate = testToyRotate();
    System.out.println("testToyRotate: " + (testToyRotate ? "PASS" : "FAIL"));

    boolean testToyIsOverPoint = testToyIsOverPoint();
    System.out.println("testToyIsOverPoint: " + (testToyIsOverPoint ? "PASS" : "FAIL"));

    boolean testToyIsOverFurniture = testToyIsOverFurniture();
    System.out.println("testToyIsOverFurniture: " + (testToyIsOverFurniture ? "PASS" : "FAIL"));

    return test1Result && test2Result && test3Result && test4Result && testToyMove && testToyRotate
        && testToyIsOverPoint && testToyIsOverFurniture;
  }


  /**
   * Driver method to run all the tests defined in this class
   * 
   * @param args list of command-line input arguments if any.
   */
  public static void main(String[] args) {
    // DO NOT MAKE ANY CHANGES TO THE IMPLEMENTATION OF THIS METHOD
    Utility.runTester();
  }

}
