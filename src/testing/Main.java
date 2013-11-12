package testing;

import testing.*;

/** A master controller for all testing classes. The main method runs
 * every testing class' runAll() method, unless commented out. 
 * 
 * @author Nick Holt
 *
 */
public class Main {

    /** Runs all testing class' runAll() method. Comment out
     * class runs as necessary. 
     * 
     * @param args null. 
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MatricesTest matricesTest = new MatricesTest(); matricesTest.printAll();
        BlockTest blockTest = new BlockTest(); blockTest.printAll();
        ShapeTest shapeTest = new ShapeTest(); shapeTest.printAll();
        TetriminoTest tetriminoTest = new TetriminoTest(); tetriminoTest.printAll();

    }

}
