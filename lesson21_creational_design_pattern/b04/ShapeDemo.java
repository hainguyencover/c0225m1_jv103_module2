public class ShapeDemo {
    public static void main(String[] args) {
        FactoryShape factoryShape = new FactoryShape();

        Shape hinhTron = factoryShape.draw("hinhTron");
        System.out.println("Day la " + hinhTron.draw());

        Shape hinhVuong = factoryShape.draw("hinhVuong");
        System.out.println("Day la " + hinhVuong.draw());

        Shape hinhChuNhat = factoryShape.draw("hinhChuNhat");
        System.out.println("Day la " + hinhChuNhat.draw());
    }

}
