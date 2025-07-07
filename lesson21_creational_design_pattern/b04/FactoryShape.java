public class FactoryShape {
    public Shape draw(String type) {
        if ("hinhTron".equals(type)) {
            return new Circle();
        } else if ("hinhVuong".equals(type)) {
            return new Square();
        } else {
            return new Rectangle();
        }
    }
}
