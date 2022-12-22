package case_study.bai_1.model;

import java.util.Date;

public class Villa extends Facility {
    private String tieuChuanPhong;
    private double dienTichHoboi;
    private int soTang;

    public Villa() {
    }

    public Villa(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, Date kieuThue, String tieuChuanPhong, double dienTichHoboi, int soTang) {
        super(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoiToiDa, kieuThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.dienTichHoboi = dienTichHoboi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public double getDienTichHoboi() {
        return dienTichHoboi;
    }

    public void setDienTichHoboi(double dienTichHoboi) {
        this.dienTichHoboi = dienTichHoboi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", dienTichHoboi=" + dienTichHoboi +
                ", soTang=" + soTang +
                '}';
    }
}
