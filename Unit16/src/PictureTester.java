/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
//the /** */ is what java looks for if you want to make a javadoc (html file)
//it's a javadoc comment
//explains what the project is about (see index.html in the doc folder)
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("src/images/beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyBlue */
  public static void testKeepOnlyBlue()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyBlue();
	  beach.explore();
  }
  
  /** Method to test keepOnlyRed */
  public static void testKeepOnlyRed()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyRed();
	  beach.explore();
  }
  
  /** Method to test keepOnlyGreen */
  public static void testKeepOnlyGreen()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.keepOnlyGreen();
	  beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.negate();
	  beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testGrayscale()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.grayscale();
	  beach.explore();
  }
  
  /** Method to test fixUnderwater */
  public static void testFixUnderwater()
  {
	  Picture water = new Picture("src/images/water.jpg");
	  water.explore();
	  water.fixUnderwater();
	  water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("src/images/caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorHorizontal */
  public static void testMirrorHorizontal()
  {
	  Picture redM = new Picture("src/images/redMotorcycle.jpg");
	  redM.explore();
	  redM.mirrorHorizontal();
	  redM.explore();
  }
  
  /** Method to test mirrorHorizontalBotToTop */
  public static void testMirrorHorizontalBotToTop()
  {
	  Picture redM = new Picture("src/images/redMotorcycle.jpg");
	  redM.explore();
	  redM.mirrorHorizontalBotToTop();
	  redM.explore();
  }
  
  /** Method to test mirrorDiagonal */
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("src/images/temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
	  //this good enough?
	  Picture snowman = new Picture("src/images/snowman.jpg");
	  snowman.explore();
	  snowman.mirrorArms();
	  snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("src/images/seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("src/images/640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy()
  {
	Picture canvas = new Picture("src/images/640x480.jpg");
	canvas.createModifiedCollage();
	canvas.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture canvas = new Picture("src/images/640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("src/images/swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
	  Picture swan = new Picture("src/images/swan.jpg");
	  swan.explore();
	  swan.edgeDetection2(10);
	  swan.explore();
  }
  public static void testChromakey()
  {
    	Picture mark = new Picture("src/images/blue-mark.jpg");
    	Picture moon = new Picture("src/images/moon-surface.jpg");
    	mark.chromakey(moon);  //replace blue pixels in mark with pixels in moon
   	mark.explore();
  }
 
  public static void testExampleED() {
	  Picture beach = new Picture("src/images/beach.jpg");
	  Picture message  = new Picture("src/images/apple_icon.jpg");
	  beach.exampleEncode(message);
	  beach.explore();
	  beach.exampleDecode().explore();
  }
  public static void testEncodeDecode()
  {
	  Picture beach = new Picture("src/images/beach.jpg");
	  Picture message  = new Picture("src/images/msg.jpg");
	  beach.encode(message);
	  beach.explore();
	  beach.decode().explore();
  }

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  Picture beach = new Picture("src/images/beach.jpg");
	  beach.explore();
	  testExampleED();
	//testEncodeDecode();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testCollage();
    //testCopy();
    //testMyCollage();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}