public class XeDap extends Xe2Banh {
    private boolean coGio;

    public XeDap() {
    }

    public XeDap(String mauSon, double trongLuong) {
        super(mauSon, trongLuong);
    }

    public boolean isCoGio() {
        return coGio;
    }

    public void setCoGio(boolean coGio) {
        this.coGio = coGio;
    }

    @Override
    public void showMe() {
        super.showMe();
        System.out.printf(" .Co gio: %b\n", this.coGio);
    }
}
