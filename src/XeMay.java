public class XeMay extends Xe2Banh {
    private int dungTichXiLanh;

    public XeMay() {
    }

    public XeMay(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    public int getDungTichXiLanh() {
        return dungTichXiLanh;
    }

    public void setDungTichXiLanh(int dungTichXiLanh) {
        this.dungTichXiLanh = dungTichXiLanh;
    }

    public void doXang() {
        System.out.println("do xang");
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.printf(" .Dung tich xi lanh: %d\n", this.dungTichXiLanh);
    }
}
