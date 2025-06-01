package b4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleClassifierTest {
    @Test
    public void testTriangleClassifier0() {
        TriangleClassifier triangle = new TriangleClassifier(2, 2, 2);
        String result = triangle.classifyTriangle();
        Assertions.assertEquals("tam giac deu", result);
    }

    @Test
    public void testTriangleClassifier1() {
        TriangleClassifier triangle = new TriangleClassifier(2, 2, 3);
        String result = triangle.classifyTriangle();
        Assertions.assertEquals("tam giac can", result);
    }

    @Test
    public void testTriangleClassifier2() {
        TriangleClassifier triangle = new TriangleClassifier(3, 4, 5);
        String result = triangle.classifyTriangle();
        Assertions.assertEquals("tam giac thuong", result);
    }

    @Test
    public void testTriangleClassifier3() {
        TriangleClassifier triangle = new TriangleClassifier(8, 2, 3);
        String result = triangle.classifyTriangle();
        Assertions.assertEquals("khong phai la tam giac", result);
    }

    @Test
    public void testTriangleClassifier4() {
        TriangleClassifier triangle = new TriangleClassifier(-1, 2, 1);
        String result = triangle.classifyTriangle();
        Assertions.assertEquals("khong phai la tam giac", result);
    }
    @Test
    public void testTriangleClassifier5() {
        TriangleClassifier triangle = new TriangleClassifier(0,1,1);
        String result = triangle.classifyTriangle();
        Assertions.assertEquals("khong phai la tam giac", result);
    }
}
