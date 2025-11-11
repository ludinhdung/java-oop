public class Main {
    public static void main(String[] args) {
        XeDap xedap = new XeDap("mau den", 12);
        XeMay xeMay = new XeMay("Den", 90);
        XeTai xeTai = new XeTai("Trang", 3500);
        XeKhach xeKhach = new XeKhach("vang", 12321);

        xeMay.doXang();
        xeKhach.doXang();
        xeTai.doXang();

        xeTai.choHangHoa();
        xeKhach.choKhach();

    }
}