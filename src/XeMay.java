public class XeMay extends Xe2Banh implements CoTheDoXang {
    public XeMay(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    @Override
    public void doXang() {
        System.out.println("dang do xang");
    }
}