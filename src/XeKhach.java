public class XeKhach extends Xe4Banh {

    private int tongHanhKhach;

    public XeKhach() {
    }

    public XeKhach(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    public int getTongHanhKhach() {
        return tongHanhKhach;
    }

    public void setTongHanhKhach(int tongHanhKhach) {
        this.tongHanhKhach = tongHanhKhach;
    }

    public void choKhach() {
        System.out.println("cho khach");
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.printf(" .Tong hanh khach: %d\n", this.tongHanhKhach);
    }
}
