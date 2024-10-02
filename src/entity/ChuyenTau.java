package entity;

import java.util.Date;

public class ChuyenTau {
	private String maChuyenTau;
	private ChuyenTau chuyenTau;
	private int soLuongCho;
	private int soLuongChoDaDat;
	private int soLuongChoDaBan;
	private Date ngayKhoiHanh;
	public ChuyenTau(String maChuyenTau, ChuyenTau chuyenTau, int soLuongCho, int soLuongChoDaDat, int soLuongChoDaBan,
			Date ngayKhoiHanh) {
		super();
		this.maChuyenTau = maChuyenTau;
		this.chuyenTau = chuyenTau;
		this.soLuongCho = soLuongCho;
		this.soLuongChoDaDat = soLuongChoDaDat;
		this.soLuongChoDaBan = soLuongChoDaBan;
		this.ngayKhoiHanh = ngayKhoiHanh;
	}
	public ChuyenTau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChuyenTau(String maChuyenTau) {
		super();
		this.maChuyenTau = maChuyenTau;
	}
	public String getMaChuyenTau() {
		return maChuyenTau;
	}
	public void setMaChuyenTau(String maChuyenTau) {
		this.maChuyenTau = maChuyenTau;
	}
	public ChuyenTau getChuyenTau() {
		return chuyenTau;
	}
	public void setChuyenTau(ChuyenTau chuyenTau) {
		this.chuyenTau = chuyenTau;
	}
	public int getSoLuongCho() {
		return soLuongCho;
	}
	public void setSoLuongCho(int soLuongCho) {
		this.soLuongCho = soLuongCho;
	}
	public int getSoLuongChoDaDat() {
		return soLuongChoDaDat;
	}
	public void setSoLuongChoDaDat(int soLuongChoDaDat) {
		this.soLuongChoDaDat = soLuongChoDaDat;
	}
	public int getSoLuongChoDaBan() {
		return soLuongChoDaBan;
	}
	public void setSoLuongChoDaBan(int soLuongChoDaBan) {
		this.soLuongChoDaBan = soLuongChoDaBan;
	}
	public Date getNgayKhoiHanh() {
		return ngayKhoiHanh;
	}
	public void setNgayKhoiHanh(Date ngayKhoiHanh) {
		this.ngayKhoiHanh = ngayKhoiHanh;
	}
	@Override
	public String toString() {
		return "ChuyenTau [maChuyenTau=" + maChuyenTau + ", chuyenTau=" + chuyenTau + ", soLuongCho=" + soLuongCho
				+ ", soLuongChoDaDat=" + soLuongChoDaDat + ", soLuongChoDaBan=" + soLuongChoDaBan + ", ngayKhoiHanh="
				+ ngayKhoiHanh + "]";
	} 
	
}