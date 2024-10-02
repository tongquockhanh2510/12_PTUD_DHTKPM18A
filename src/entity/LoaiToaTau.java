package entity;

public class LoaiToaTau {
	private String maLoaiToa;
	private String tenLoaiToa;
	private double heSoGia;
	public LoaiToaTau(String maLoaiToa, String tenLoaiToa, double heSoGia) {
		super();
		this.maLoaiToa = maLoaiToa;
		this.tenLoaiToa = tenLoaiToa;
		this.heSoGia = heSoGia;
	}
	public LoaiToaTau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiToaTau(String maLoaiToa) {
		super();
		this.maLoaiToa = maLoaiToa;
	}
	public String getMaLoaiToa() {
		return maLoaiToa;
	}
	public void setMaLoaiToa(String maLoaiToa) {
		this.maLoaiToa = maLoaiToa;
	}
	public String getTenLoaiToa() {
		return tenLoaiToa;
	}
	public void setTenLoaiToa(String tenLoaiToa) {
		this.tenLoaiToa = tenLoaiToa;
	}
	public double getHeSoGia() {
		return heSoGia;
	}
	public void setHeSoGia(double heSoGia) {
		this.heSoGia = heSoGia;
	}
	@Override
	public String toString() {
		return "LoaiToaTau [maLoaiToa=" + maLoaiToa + ", tenLoaiToa=" + tenLoaiToa + ", heSoGia=" + heSoGia + "]";
	}
	
	
}
