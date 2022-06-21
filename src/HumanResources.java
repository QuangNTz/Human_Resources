import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HumanResources {
    private static ArrayList<Staff> list = new ArrayList<>();

    private static Department phongKD = new Department("KD", "Phong kinh Doanh");
    private static Department phongDA = new Department("DA", "Phong Du An");
    private static Department phongKT = new Department("KT", "Phong Ky Thuat");
    // Luong trach nhiem cua truong phong
    private static int luongTPKinhDoanh = 8000000;
    private static int luongTPDuAn = 5000000;
    private static int luongTPKyThuat = 6000000;
    // Tao lop Scanner de nhap du lieu
    private static Scanner ip = new Scanner(System.in);

    // todo Ham main chay chuong trinh
    public static void main(String[] args) {

        // *--------------------------------------------------------------*//
        // ! Tạo dữ liệu ban đầu
        list.add(new Employee("e01", "Nguyen Van A", 30, 3, 2015, phongKD, 12, 5));
        list.add(new Employee("e02", "Nguyen Van B", 22, 3, 2017, phongKD, 12, 10));
        list.add(new Employee("e03", "Nguyen Van C", 20, 3, 2010, phongKD, 12, 13));
        list.add(new Employee("e04", "Nguyen Van D", 19, 3, 2019, phongKD, 12, 16));
        list.add(new Employee("e05", "Nguyen Van E", 28, 3, 2020, phongDA, 12, 8));
        list.add(new Employee("e06", "Nguyen Van F", 33, 3, 2021, phongDA, 12, 7));
        list.add(new Employee("e07", "Nguyen Van G", 39, 3, 2013, phongDA, 12, 3));
        list.add(new Employee("e08", "Nguyen Van H", 32, 3, 2009, phongKT, 12, 20));
        list.add(new Employee("e09", "Nguyen Van I", 35, 3, 2016, phongKT, 12, 5));
        list.add(new Employee("e10", "Nguyen Van K", 31, 3, 2008, phongKT, 12, 7));

        list.add(new Manager("m01", "Nguyen Thi L", 40, 4, 2015, phongKD, 15, "Truong phong Kinh Doanh",
                luongTPKinhDoanh));
        list.add(new Manager("m02", "Nguyen Thi M", 43, 5, 2016, phongDA, 15, "Truong phong Du An", luongTPDuAn));
        list.add(new Manager("m03", "Nguyen Thi N", 50, 5, 2017, phongKT, 15, "Truong phong Ky Thuat", luongTPKyThuat));
        // *--------------------------------------------------------------*//

        int n;
        do {
            // Hien thi menu chuong trinh
            System.out.println();
            System.out.print("-----------------------------------------------------------------------\n"
                    + "Assignment 3 - Human Resources\n"
                    + "-----------------------------------------------------------------------\n"
                    + "1. --> hien thi danh sach nhan vien\n"
                    + "2. --> hien thi cac bo phan trong cong ty\n"
                    + "3. --> hien thi cac nhan vien theo tung bo phan\n"
                    + "4. --> them nhan vien moi\n"
                    + "5. --> tim kiem thong tin nhan vien theo ten hay ma nhan vien\n"
                    + "6. --> hien thi bang luong cua nhan vien toan cong ty\n"
                    + "7. --> hien thi bang luong cua nhan vien theo thu tu tang dan\n"
                    + "8. --> hien thi bang luong cua nhan vien theo thu tu giam dan\n"
                    + "9. --> hien thi nhan vien theo thoi gian lam viec\n"
                    + "0. --> ket thuc chuong trinh\n"
                    + "Moi ban nhap vao mot so interger de tiep tuc ( 0-7 ) : ");

            n = ip.nextInt();

            switch (n) {
                case 1:
                    System.out.println();
                    System.out.println("Ban da chon hien thi danh sach nhan vien toan cong ty");
                    hienThiDSNV(list);
                    break;
                case 2:
                    System.out.println();
                    System.out.println("Ban da chon hien thi danh sach cac bo phan trong cong ty");
                    hienThiCacBPCty();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Ban da chon hien thi danh sach nhan vien toan cong ty theo tung bo phan");
                    hienThiNVTheoBP();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Ban da chon chuc nang them du lieu nhan vien moi");
                    themNVMoi();
                    break;
                case 5:
                    System.out.println();
                    System.out.println("Ban da chon tim kiem nhan vien theo ten hay ma nhan vien");
                    timNVTheoTenHayMaNV();
                    break;
                case 6:
                    System.out.println();
                    System.out.println("Ban da chon hien thi bang luong nhan vien toan cong ty");
                    hienThiBangLuongToanCty(list);
                    break;
                case 7:
                    System.out.println();
                    System.out.println("Ban da chon hien thi bang luong nhan vien toan cong ty theo thu tu tang dan");
                    hienThiBangLuongTangDanToanCty();
                    break;
                case 8:
                    System.out.println();
                    System.out.println("Ban da chon hien thi bang luong nhan vien toan cong ty theo thu tu giam dan");
                    hienThiBangLuongGiamDanToanCty();
                    break;
                case 9:
                    System.out.println();
                    System.out.println("Ban da chon hien thi danh sach nhan vien theo thoi gian cong tac tai cong ty");
                    hienThiNVTheoThoiGianLamViecTaiCty();
                    break;
            }

        } while (n != 0);
    }

    // ! 1.Hien thi danh sach nhan vien
    public static void hienThiDSNV(ArrayList<Staff> list) {
        System.out.println("----->");
        System.out.println("Danh sach nhan vien hien tai trong cong ty ABC");
        // In du lieu nhan vien tu ArrayList list
        list.forEach(nv -> {
            nv.displayInformation();
            System.out.println("---");
        });
    }

    // ! 2.Hien thi cac bo phan trong Cty
    public static void hienThiCacBPCty() {
        System.out.println("----->");
        System.out.println("Phong ban hien tai cua cong ty :");
        System.out.println("Tong so nhan vien hien tai toan cong ty : " + list.size() + " nguoi");
        System.out.println();

        System.out.println(phongKD);
        System.out.println(phongDA);
        System.out.println(phongKT);
    }

    // ! 3.Hien thi nhan vien theo bo phan
    public static void renderBP(Department bp) {
        System.out.println("Nhan vien " + bp.getTenBoPhan() + " :\n"
                + "Ma nv       Ten nv");
        list.forEach(nv -> {
            if (nv.boPhanLV.getMaBoPhan() == bp.getMaBoPhan()) {
                System.out.println(" " + nv.maNV + "     " + nv.tenNV);
            }
        });
    }

    public static void hienThiNVTheoBP() {
        System.out.println("----->");
        renderBP(phongKD);

        System.out.println();
        renderBP(phongDA);

        System.out.println();
        renderBP(phongKT);
    }

    // ! 4.Them nhan vien moi
    public static void themNVMoi() {
        String nhap;
        do {
            System.out.println("----->");
            System.out.print("Ban muon nhap nhan vien thong thuong hay cap quan ly (0-nhan vien, 1-quanly)(int) : ");
            nhap = ip.next();
            if (nhap.equals("0")) {
                // Bat dau nhap du lieu cho nhan vien moi
                System.out.print("Ma nhan vien : ");
                String maNV = ip.next();
                ip.nextLine();

                System.out.print("Ten nhan vien : ");
                String tenNV = ip.nextLine();

                System.out.print("Tuoi cua nhan vien (int) : ");
                int tuoiNV = ip.nextInt();

                System.out.print("He so luong (3-5)(int) : ");
                int hsoLuong = ip.nextInt();

                System.out.print("Ngay vao lam viec (nam)(int) : ");
                int ngayVaoLam = ip.nextInt();

                System.out.print("Bo phan lam viec (1.phongKD, 2.phongDA, 3.phongKT) (1-3)(int) : ");
                int bp = ip.nextInt();
                Department boPhanLV = null;
                switch (bp) {
                    case 1:
                        boPhanLV = phongKD;
                        break;
                    case 2:
                        boPhanLV = phongDA;
                        break;
                    case 3:
                        boPhanLV = phongKT;
                        break;
                }

                System.out.print("So ngay nghi phep (12-15)(int) : ");
                int soNgayNghiPhep = ip.nextInt();

                int soGioLamThem = 0;
                // todo Them du lieu nhan vien moi vao ArrayList list
                list.add(new Employee(maNV, tenNV, tuoiNV, hsoLuong, ngayVaoLam, boPhanLV, soNgayNghiPhep,
                        soGioLamThem));

            } else if (nhap.equals("1")) {
                // Bat dau nhap du lieu cho nv quan ly moi
                System.out.print("Ma nhan vien : ");
                String maNV = ip.next();
                ip.nextLine();

                System.out.print("Ten nhan vien : ");
                String tenNV = ip.nextLine();

                System.out.print("Tuoi cua nhan vien (int) : ");
                int tuoiNV = ip.nextInt();

                System.out.print("He so luong (4-6)(int) : ");
                int hsoLuong = ip.nextInt();

                System.out.print("Ngay vao lam viec (nam)(int) : ");
                int ngayVaoLam = ip.nextInt();

                System.out.print("Bo phan lam viec (1.phongKD, 2.phongDA, 3.phongKT) (1-3)(int) : ");
                int bp = ip.nextInt();
                Department boPhanLV = null;
                switch (bp) {
                    case 1:
                        boPhanLV = phongKD;
                        break;
                    case 2:
                        boPhanLV = phongDA;
                        break;
                    case 3:
                        boPhanLV = phongKT;
                        break;
                }

                ip.nextLine();
                System.out.print("Chuc danh : ");
                String chucDanh = ip.nextLine();

                System.out.print("Luong trach nhiem (int) : ");
                int luongTrachNhiem = ip.nextInt();

                System.out.print("So ngay nghi phep (12-18)(int) : ");
                int soNgayNghiPhep = ip.nextInt();

                // todo Them du lieu nv quan ly moi vao ArrayList list
                list.add(new Manager(maNV, tenNV, tuoiNV, hsoLuong, ngayVaoLam, boPhanLV, soNgayNghiPhep, chucDanh,
                        luongTrachNhiem));
            }

            System.out.print("Ban co muon tiep tuc nhap du lieu nhan vien y/n : ");
            nhap = ip.next();
        } while (nhap.toLowerCase().contains("y"));
    }

    // ! 5.Tim nhan vien theo ten hay ma mhan vien
    public static void timNVTheoTenHayMaNV() {
        System.out.println("----->");
        System.out.print("Moi ban nhap vao ten hay ma nhan vien can tim : ");
        String nhap = ip.next();
        // In du lieu tim thay ra console
        System.out.println();
        System.out.println("Ma nv    Ten nv");
        list.forEach(nv -> {
            // Thuc hien so sanh du kien nhap vao so voi data trong ArrayList list, ko phan
            // biet chu hoa chu thuong
            if (nv.maNV.toLowerCase().contains(nhap.toLowerCase())
                    || nv.tenNV.toLowerCase().contains(nhap.toLowerCase())) {
                System.out.println(nv.maNV + "     " + nv.tenNV);
            }
        });
    }

    // ! 6.Hien thij bang luong toan Cty
    public static void hienThiBangLuongToanCty(ArrayList<Staff> list) {
        System.out.println("----->");
        System.out.println("Ma nv    Ten nv         Muc Luong");
        list.forEach(nv -> {
            // In du lieu ra console voi don vi la trieu duoc lam tron den hang tram ngan
            System.out.println(nv.maNV + "     " + nv.tenNV + "       " + nv.caculateSalary() / 1000000.0 + " trieu");
        });
    }

    // ! 7.Hien thi bang luong tang dan
    public static void hienThiBangLuongTangDanToanCty() {
        // Tao 1 copy list de sap xep theo muc luong tang dan
        ArrayList<Staff> list_temp = (ArrayList<Staff>) list.clone();
        // Sap xep list_temp theo thu tu luong tang dan dua tren ham tinh luong
        // caculateSalary()
        Collections.sort(list_temp, new Comparator<Staff>() {
            @Override
            public int compare(Staff nv1, Staff nv2) {
                return nv1.caculateSalary() - nv2.caculateSalary();
            }
        });

        hienThiBangLuongToanCty(list_temp);
    }

    // ! 8.Hien thi bang luong giam dan
    public static void hienThiBangLuongGiamDanToanCty() {
        // Tao 1 copy list de sap xep theo muc luong tang dan
        ArrayList<Staff> list_temp = (ArrayList<Staff>) list.clone();
        // Sap xep list_temp theo thu tu luong tang dan dua tren ham tinh luong
        // caculateSalary()
        Collections.sort(list_temp, new Comparator<Staff>() {
            @Override
            public int compare(Staff nv1, Staff nv2) {
                return nv2.caculateSalary() - nv1.caculateSalary();
            }
        });

        hienThiBangLuongToanCty(list_temp);
    }

    // ! 9.Hien thi nhan vien theo thoi gian cong tac tai Cty
    public static void hienThiNVTheoThoiGianLamViecTaiCty() {
        // Tao 1 copy list de sap xep theo muc luong tang dan
        ArrayList<Staff> list_temp = (ArrayList<Staff>) list.clone();
        // Sap xep list_temp theo thu tu luong tang dan dua tren ham tinh luong
        // caculateSalary()
        Collections.sort(list_temp, new Comparator<Staff>() {
            @Override
            public int compare(Staff nv1, Staff nv2) {
                return nv1.ngayVaoLam - nv2.ngayVaoLam;
            }
        });

        hienThiDSNV(list_temp);
    }
}