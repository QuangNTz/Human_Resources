public class Employee extends Staff {

    private int soGioLamThem;

    public Employee(String maNV, String tenNV, int tuoiNV, int hsoLuong, int ngayVaoLam, Department boPhanLV,
            int soNgayNghiPhep, int soGioLamThem) {
        super(maNV, tenNV, tuoiNV, hsoLuong, ngayVaoLam, boPhanLV, soNgayNghiPhep);
        this.soGioLamThem = soGioLamThem;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public void displayInformation() {
        System.out.println("Ma nhan vien : " + super.maNV);
        System.out.print("Ten : " + super.tenNV + ", ");
        System.out.println("Tuoi : " + super.tuoiNV);
        System.out.println("He so luong : " + super.hsoLuong);
        System.out.println("Ngay vao lam viec : " + super.ngayVaoLam);
        System.out.println("Bo phan lam viec : " + super.boPhanLV.getTenBoPhan());
        System.out.println("So ngay nghi phep : " + super.soNgayNghiPhep);
        System.out.println("So gio lam them : " + this.soGioLamThem);
        System.out.println("Muc luong hien tai : " + this.caculateSalary() / 1000000.0 + " trieu ");

    }

    @Override
    public int caculateSalary() {

        return (hsoLuong * 3000000 + this.soGioLamThem * 200000);
    }

}
