package entity;

public class GaTau {
	private String maGaTau;
	private String tenGaTau;
	private String diaChi;
	public GaTau(String maGaTau, String tenGaTau, String diaChi) {
		super();
		this.maGaTau = maGaTau;
		this.tenGaTau = tenGaTau;
		this.diaChi = diaChi;
	}
	public GaTau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GaTau(String maGaTau) {
		super();
		this.maGaTau = maGaTau;
	}
	public String getMaGaTau() {
		return maGaTau;
	}
	public void setMaGaTau(String maGaTau) {
		this.maGaTau = maGaTau;
	}
	public String getTenGaTau() {
		return tenGaTau;
	}
	public void setTenGaTau(String tenGaTau) {
		this.tenGaTau = tenGaTau;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	@Override
	public String toString() {
		return "GaTau [maGaTau=" + maGaTau + ", tenGaTau=" + tenGaTau + ", diaChi=" + diaChi + "]";
	}
	
}
