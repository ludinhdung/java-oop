import java.io.Serializable;

public abstract class Xe implements Serializable {
    private String mauSon;
    private double trongLuong;

    public Xe() {
    }

    public Xe(String mauSon, double trongLuong) {
        this.mauSon = mauSon;
        this.trongLuong = trongLuong;
    }

    public String getMauSon() {
        return mauSon;
    }

    public void setMauSon(String mauSon) {
        this.mauSon = mauSon;
    }

    public double getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(double trongLuong) {
        this.trongLuong = trongLuong;
    }

    public void chay() {
        System.out.println("dang chay");
    }

    public void dung() {
        System.out.println("da dung");
    }

    public void choNguoi() {
        System.out.println("dang cho nguoi");
    }

    public void showMe() {
        System.out.printf("loai xe :%s, mau son: %s, trong luong: %f",
                this.getClass().getSimpleName(), this.mauSon, this.trongLuong);
    }
}
