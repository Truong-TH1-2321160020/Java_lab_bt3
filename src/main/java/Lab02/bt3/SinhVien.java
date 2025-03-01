/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.bt3;

/**
 *
 * @author xuant
 */
abstract class SinhVien {
       public String hoten;
    public String nganh;

    public SinhVien(String hoten, String nganh) {
        this.hoten = hoten;
        this.nganh = nganh;
    }

    abstract public double getDiem();

    public String getHocLuc() {
        String kq = "";
        double dtb = getDiem();
        if (dtb < 5) {
            kq = "Yeu";
        } else if (dtb < 6.5) {
            kq = "Trung Binh";
        } else if (dtb < 7.5) {
            kq = "Kha";
        } else if (dtb < 9) {
            kq = "Gioi";
        } else {
            kq = "Xuat Sac";
        }
        return kq;
    }

    public void xuat() {
        System.out.println("SinhVien{Hotem:" + hoten + ", nganh:" + nganh + ", DTB:" + getDiem() + ", Hoc luc:" + getHocLuc());
    }
}
