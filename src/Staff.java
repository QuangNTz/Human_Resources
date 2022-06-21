public abstract class Staff implements ICalculatorInterface {
    protected String maNV;
    protected String tenNV;
    protected int tuoiNV;
    protected int hsoLuong;
    protected int ngayVaoLam;
    protected Department boPhanLV;
    protected int soNgayNghiPhep;

    public Staff(String maNV, String tenNV, int tuoiNV, int hsoLuong, int ngayVaoLam, Department boPhanLV,
            int soNgayNghiPhep) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.tuoiNV = tuoiNV;
        this.hsoLuong = hsoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhanLV = boPhanLV;

        int n = boPhanLV.getSoLuongNVHT();
        n++;
        boPhanLV.setSoLuongNVHT(n);

        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public String getMaNV() {
        return this.maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return this.tenNV;
    }

    public void setTenNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public int getTuoiNV() {
        return this.tuoiNV;
    }

    public void setTuoiNV(int tuoiNV) {
        this.tuoiNV = tuoiNV;
    }

    public int gethsoLuong() {
        return this.hsoLuong;
    }

    public void sethsoLuong(int hsoLuong) {
        this.hsoLuong = hsoLuong;
    }

    public int getNgayVaoLam() {
        return this.ngayVaoLam;
    }

    public void setNgayVaoLam(int ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public Department getBoPhanLV() {
        return this.boPhanLV;
    }

    public void setBoPhanLV(Department boPhanLV) {
        this.boPhanLV = boPhanLV;
    }

    public int getSoNgayNghiPhep() {
        return this.soNgayNghiPhep;
    }

    public void setSoNgayNghiPhep(int soNgayNghiPhep) {
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public abstract void displayInformation();

}
