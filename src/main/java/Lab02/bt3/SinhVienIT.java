/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.bt3;

/**
 *
 * @author xuant
 */
public class SinhVienIT {
    public double diemJava;

    /**
     *
     */
    public double diemCss;
    public double diemHtml;

    public SinhVienIT(String hoten, double diemJava, double diemCss, double diemHtml) {
        super(hoten, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }

    SinhVienIT(String hoten, double java, double css, double html) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public double getDiem() {
        return (diemJava * 2 + diemHtml + diemCss) / 4;
    }
}
