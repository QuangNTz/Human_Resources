public class Manager extends Staff {
    private String chucDanh;
    private int luongTrachNhiem;

    public Manager(String maNV, String tenNV, int tuoiNV, int hsoLuong, int ngayVaoLam, Department boPhanLV,
            int soNgayNghiPhep, String chucDanh, int luongTrachNhiem) {

        super(maNV, tenNV, tuoiNV, hsoLuong, ngayVaoLam, boPhanLV, soNgayNghiPhep);
        this.chucDanh = chucDanh;
        this.luongTrachNhiem = luongTrachNhiem;
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public int getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(int luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
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
        System.out.println("Chuc danh : " + this.chucDanh);
        System.out.println("Muc luong hien tai : " + this.caculateSalary() / 1000000.0 + " trieu ");
    }

    @Override
    public int caculateSalary() {

        return (hsoLuong * 5000000 + this.luongTrachNhiem);
    }

}
