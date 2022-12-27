package case_study.bai_1.model;

import java.util.Date;

public abstract class Facility {
    private String tenDichVu;
    private double dienTichSuDung;
    private double chiPhiThue;
    private int soLuongNguoiToiDa;
    private Date kieuThue;

    public Facility() {
    }

    public Facility(String tenDichVu, double dienTichSuDung, double chiPhiThue, int soLuongNguoiToiDa, Date kieuThue) {
        this.tenDichVu = tenDichVu;
        this.dienTichSuDung = dienTichSuDung;
        this.chiPhiThue = chiPhiThue;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.kieuThue = kieuThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Double getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(Double dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public int getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(int soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public Date getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(Date kieuThue) {
        this.kieuThue = kieuThue;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", chiPhiThue=" + chiPhiThue +
                ", soLuongNguoiToiDa=" + soLuongNguoiToiDa +
                ", kieuThue=" + kieuThue +
                '}';
    }
}
