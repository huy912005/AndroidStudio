package com.example.myapplication;

public class MyModel {

    private String tenSanPham;
    private String hinhAnh;          // lưu resource ảnh (R.drawable.xxx)
    private double giaGoc;
    private double giaKhuyenMai;
    private int soLuong;

    // Constructor đầy đủ
    public MyModel(String tenSanPham, String hinhAnh, double giaGoc, double giaKhuyenMai, int soLuong) {
        this.tenSanPham = tenSanPham;
        this.hinhAnh = hinhAnh;
        this.giaGoc = giaGoc;
        this.giaKhuyenMai = giaKhuyenMai;
        this.soLuong = soLuong;
    }

    // Getters & Setters
    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(String hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    public double getGiaGoc() {
        return giaGoc;
    }

    public void setGiaGoc(double giaGoc) {
        this.giaGoc = giaGoc;
    }

    public double getGiaKhuyenMai() {
        return giaKhuyenMai;
    }

    public void setGiaKhuyenMai(double giaKhuyenMai) {
        this.giaKhuyenMai = giaKhuyenMai;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    // Tính tổng tiền (theo giá khuyến mãi)
    public double getTongTien() {
        return giaKhuyenMai * soLuong;
    }
}
