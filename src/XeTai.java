public class XeTai extends Xe4Banh {

    private double taiTrongToiDa;

    public XeTai() {
    }

    public XeTai(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    public double getTaiTrongToiDa() {
        return taiTrongToiDa;
    }

    public void setTaiTrongToiDa(double taiTrongToiDa) {
        this.taiTrongToiDa = taiTrongToiDa;
    }

    public void choHangHoa() {
        System.out.println("cho hang hoa...");
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.printf(" .Tai trong toi da: %f\n", this.taiTrongToiDa);
    }
}
