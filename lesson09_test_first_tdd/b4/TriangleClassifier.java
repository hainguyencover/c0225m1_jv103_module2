package b4;

public class TriangleClassifier {
    private final int sideA;
    private final int sideB;
    private final int sideC;


    public TriangleClassifier(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public String classifyTriangle() {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            return "khong phai la tam giac";
        }

        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            return "khong phai la tam giac";
        }

        if (sideA == sideB && sideB == sideC) {
            return "tam giac deu";
        }

        if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return "tam giac can";
        }

        return "tam giac thuong";
    }
}
