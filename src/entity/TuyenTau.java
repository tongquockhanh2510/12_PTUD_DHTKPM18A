package entity;

public class TuyenTau {
	private String maTuyenTau;
	private String tenTuyenTau;
	private String moTa;
	public TuyenTau(String maTuyenTau, String tenTuyenTau, String moTa) {
		super();
		this.maTuyenTau = maTuyenTau;
		this.tenTuyenTau = tenTuyenTau;
		this.moTa = moTa;
	}
	public TuyenTau() {
		super();
	}
	public TuyenTau(String maTuyenTau) {
		super();
		this.maTuyenTau = maTuyenTau;
	}
	public String getMaTuyenTau() {
		return maTuyenTau;
	}
	public void setMaTuyenTau(String maTuyenTau) {
		this.maTuyenTau = maTuyenTau;
	}
	public String getTenTuyenTau() {
		return tenTuyenTau;
	}
	public void setTenTuyenTau(String tenTuyenTau) {
		this.tenTuyenTau = tenTuyenTau;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	@Override
	public String toString() {
		return "TuyenTau [maTuyenTau=" + maTuyenTau + ", tenTuyenTau=" + tenTuyenTau + ", moTa=" + moTa + "]";
	}
	
	
}
