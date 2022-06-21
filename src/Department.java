public class Department {
    private String maBoPhan, tenBoPhan;
    private int soLuongNVHT;

    public Department(String maBoPhan, String tenBoPhan) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        // this.soLuongNVHT++;
    }

    public String getMaBoPhan() {
        return this.maBoPhan;
    }

    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return this.tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoLuongNVHT() {
        return this.soLuongNVHT;
    }

    public void setSoLuongNVHT(int soLuongNVHT) {
        this.soLuongNVHT = soLuongNVHT;
    }

    @Override
    public String toString() {
        return "{" +
                "+ Ten bo phan '" + getTenBoPhan() + "'\n" +
                "    Ma bo phan '" + getMaBoPhan() + "'" +
                ", So luong nhan vien hien tai : " + getSoLuongNVHT() + " }";
    }

}
