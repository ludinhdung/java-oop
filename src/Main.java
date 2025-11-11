public class Main {
    public static void main(String[] args) {
        Xe xedap = new XeDap("mau den", 12);
        XeMay xeMay = new XeMay("Den", 90);
        XeTai xeTai = new XeTai("Trang", 3500);
        XeKhach xeKhach = new XeKhach("vang", 12321);

        XeMay xeMay1 = new XeMay();
        xeMay.setDungTichXiLanh(12);
        xeMay1.showMe();
        xeMay.showMe();

        xeMay.doXang();
        xeKhach.doXang();
        xeTai.doXang();

        xeTai.choHangHoa();
        xeKhach.choKhach();

        xeKhach.setTongHanhKhach(123);
        xeKhach.showMe();
        xedap.showMe();
    }
}