
public abstract class Xe4Banh extends Xe implements CoTheDoXang {

    public Xe4Banh(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    @Override
    public void doXang() {
        System.out.println("do xang");
    }
}
