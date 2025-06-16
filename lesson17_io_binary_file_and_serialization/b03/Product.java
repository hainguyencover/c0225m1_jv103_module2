import java.io.Serializable;

public class Product implements Serializable {
    private String maSP, tenSP;
    private double giaSP;
    private String hangSanXuat;
    private String moTaSP;

    public Product() {
    }

    public Product(String maSP, String tenSP, double giaSP, String hangSanXuat, String moTaSP) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.hangSanXuat = hangSanXuat;
        this.moTaSP = moTaSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public String getMoTaSP() {
        return moTaSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public void setMoTaSP(String moTaSP) {
        this.moTaSP = moTaSP;
    }

    @Override
    public String toString() {
        return "Product [maSP=" + maSP + ", tenSP=" + tenSP + ", giaSP=" + giaSP + ", hangSanXuat=" + hangSanXuat
                + ", moTaSP=" + moTaSP + "]";
    }

}
