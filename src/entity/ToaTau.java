package entity;

public class ToaTau {
	private String maToaTau;
	private int thuTuToa;
	private int soLuongCho;
	private int soLuongChoTrong;
	private int soLuongChoDaDat;
	private int soLuongChoDaMua;
	private LoaiToaTau loaiToaTau;
	private ChuyenTau chuyenTau;
	public ToaTau() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ToaTau(String maToaTau, int thuTuToa, int soLuongCho, int soLuongChoTrong, int soLuongChoDaDat,
			int soLuongChoDaMua, LoaiToaTau loaiToaTau, ChuyenTau chuyenTau) {
		super();
		this.maToaTau = maToaTau;
		this.thuTuToa = thuTuToa;
		this.soLuongCho = soLuongCho;
		this.soLuongChoTrong = soLuongChoTrong;
		this.soLuongChoDaDat = soLuongChoDaDat;
		this.soLuongChoDaMua = soLuongChoDaMua;
		this.loaiToaTau = loaiToaTau;
		this.chuyenTau = chuyenTau;
	}
	public ToaTau(String maToaTau) {
		super();
		this.maToaTau = maToaTau;
	}
	public String getMaToaTau() {
		return maToaTau;
	}
	public void setMaToaTau(String maToaTau) {
		this.maToaTau = maToaTau;
	}
	public int getThuTuToa() {
		return thuTuToa;
	}
	public void setThuTuToa(int thuTuToa) {
		this.thuTuToa = thuTuToa;
	}
	public int getSoLuongCho() {
		return soLuongCho;
	}
	public void setSoLuongCho(int soLuongCho) {
		this.soLuongCho = soLuongCho;
	}
	public int getSoLuongChoTrong() {
		return soLuongChoTrong;
	}
	public void setSoLuongChoTrong(int soLuongChoTrong) {
		this.soLuongChoTrong = soLuongChoTrong;
	}
	public int getSoLuongChoDaDat() {
		return soLuongChoDaDat;
	}
	public void setSoLuongChoDaDat(int soLuongChoDaDat) {
		this.soLuongChoDaDat = soLuongChoDaDat;
	}
	public int getSoLuongChoDaMua() {
		return soLuongChoDaMua;
	}
	public void setSoLuongChoDaMua(int soLuongChoDaMua) {
		this.soLuongChoDaMua = soLuongChoDaMua;
	}
	public LoaiToaTau getLoaiToaTau() {
		return loaiToaTau;
	}
	public void setLoaiToaTau(LoaiToaTau loaiToaTau) {
		this.loaiToaTau = loaiToaTau;
	}
	public ChuyenTau getChuyenTau() {
		return chuyenTau;
	}
	public void setChuyenTau(ChuyenTau chuyenTau) {
		this.chuyenTau = chuyenTau;
	}
	
}
