public abstract class Xe {
    protected String mauSon;
    protected double trongLuong;

    public Xe(String mauSon, double trongLuong) {
        this.mauSon = mauSon;
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
        System.out.printf("loai xe :%s, mau son: %s, trong luong: %f\n",
                this.getClass().getSimpleName(), this.mauSon, this.trongLuong);
    }
}
