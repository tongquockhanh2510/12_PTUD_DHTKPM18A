use master
drop database QLBVT
--go

--Tạo cơ sở dữ liệu
create database QLBVT
on
(
	name = QLBVT_dat,
	filename = 'E:\HocTap\Ki5\PTUD\Data\QLBVT_dat.mdf'
)
log on
(
	name = QLBVT_log,
	filename = 'E:\HocTap\Ki5\PTUD\Data\QLBVT_log.ldf'
)
go

--use cơ sở dữ liệu
use QLBVT
go

--tạo bảng Ga Tàu
create table GaTau(
	maGaTau varchar(3) primary key,
	tenGaTau nvarchar(30) not null,
	diaChi nvarchar(200) not null
)
go

--tạo bảng Tuyến Tàu
create table TuyenTau(
	maTuyenTau varchar(4) primary key,
	tenTuyenTau nvarchar(100) not null,
	moTa nvarchar(300)
)
go


go

--tạo bảng Chuyến Tàu
create table ChuyenTau(
	maChuyenTau varchar(11) primary key,
	maTuyenTau varchar(4) foreign key references TuyenTau(maTuyenTau),
	soLuongCho int,
	soLuongChoDaDat int,
	soLuongChoDaBan int,
	ngayKhoiHanh DateTime
)
go

--tạo bảng Chi Tiết chuyến tàu
create table ChiTietChuyenTau(
	maChuyenTau varchar(11) foreign key references ChuyenTau(maChuyenTau),
	maGaTau varchar(3) foreign key references GaTau(maGaTau),
	thoiGianDen DateTime not null,
	thoiGianDi DateTime not null,
	soKm float not null,
	primary key (maChuyenTau, maGaTau),
)
go

--tạo bảng Loại toa tàu
create table LoaiToaTau(
	maLoaiToa varchar(3) primary key,
	tenLoaiToa nvarchar(50) not null,
	heSoGia float not null
)
go

--tạo bảng toa tàu
create table ToaTau(
	maToaTau varchar(12) primary key,
	tuTuToa int not null,
	soLuongCho int not null,
	soLuongChoTrong int not null,
	soLuongChoDaDat int not null,
	soLuongChoDaMua int not null,
	maLoaiToa varchar(3) foreign key references LoaiToaTau(maLoaiToa),
	maChuyenTau varchar(11) foreign key references ChuyenTau(maChuyenTau)
)
go

--tạo bảng loại chỗ
create table LoaiCho(
	maLoaiCho varchar(10) primary key,
	tenLoaiCho nvarchar(50) not null,
	doDaiChang float,
	heSoGiaCho float not null,
)

create table Cho(
	maCho varchar(14) primary key,
	maLoaiCho varchar(10)  foreign key references LoaiCho(maLoaiCho),
	soCho int not null,
	maToaTau varchar(12) foreign key references ToaTau(maToaTau)
)
go

go
--tạo bảng loại khách hàng
create table LoaiKhachHang(
	maLoaiKhachHang varchar(2) primary key,
	tenLoaiKhachHang varchar(50) not null,
	phanTramGiamGia float not null
	)

--tao bang khach hang
create table KhachHang(
	maKhachHang varchar(10) primary key,
	CCCD varchar(12) not null,
	tenKhachHang nvarchar(50) not null,
	soDienThoai varchar(10) not null,
	maLoaiKhachHang varchar(2) foreign key references LoaiKhachHang(maLoaiKhachHang)
	)

go

--tao bang TaiKhoan
create table TaiKhoan(
	tenDangNhap varchar(12) primary key,
	matKhau varchar(30) not null,
	ngayTao Datetime
	)
go
--tao bang NhanVien
create table NhanVien(
	maNhanVien varchar(12) primary key,
	CCCD varchar(12) not null,
	tenNhanVien nvarchar(30) not null,
	soDienThoai varchar(10) not null,
	diaChi nvarchar(50) not null,
	tenDangNhap varchar(12) foreign key references TaiKhoan(tenDangNhap),
	trangThaiNhanVien varchar(10) CHECK (trangThaiNhanVien IN ('DANGLAM','BISATHAI','NGHIVIEC')),
	loaiNhanVien varchar(15) CHECK (loaiNhanVien IN ('NHANVIENBANVE','QUANLY')),
	)
go

go
--tao bang hoa don
create table HoaDon(
	maHoaDon varchar(11) primary key,
	thoiGianLap Datetime,
	tongTien float,
	tongTienDaDatCoc float,
	loaiHoaDon VARCHAR(10) CHECK (loaiHoaDon IN ('HOADONDAT', 'HOADONBAN')),
	maNhanVien varchar(12)  foreign key references NhanVien(maNhanVien),
	maKhachhang varchar(10) foreign key references KhachHang(maKhachHang)
	)
go

--tao bang ve
create table Ve(
	maVe varchar(11) primary key,
	tongGiaVe float not null,
	maHoaDon varchar(11) foreign key references HoaDon(maHoaDon),
	maChuyenTauDi VARCHAR(11),
    maGaTauDi VARCHAR(3),
    maChuyenTauDen VARCHAR(11),
    maGaTauDen VARCHAR(3),
    FOREIGN KEY (maChuyenTauDi, maGaTauDi) REFERENCES ChiTietChuyenTau(maChuyenTau, maGaTau),
    FOREIGN KEY (maChuyenTauDen, maGaTauDen) REFERENCES ChiTietChuyenTau(maChuyenTau, maGaTau)
	)

	go


--tạo bảng Chi tiết vé
create table ChiTietVe(
	maVe varchar(11) foreign key references Ve(maVe),
	maKhachHang varchar(10) foreign key references KhachHang(maKhachHang),
	maCho varchar(14) foreign key references Cho(maCho),
	giaCho float not null
	)
	go

	--tạo bảng phiếu đạt vé
create table PhieuDatVe(
	maPhieuDatVe varchar(11) primary key,
	tongGiaVeDaDat float,
	tongTienDatCoc float,
	maHoaDon varchar(11) foreign key references HoaDon(maHoaDon),
	maChuyenTauDi VARCHAR(11),
    maGaTauDi VARCHAR(3),
    maChuyenTauDen VARCHAR(11),
    maGaTauDen VARCHAR(3),
    FOREIGN KEY (maChuyenTauDi, maGaTauDi) REFERENCES ChiTietChuyenTau(maChuyenTau, maGaTau),
    FOREIGN KEY (maChuyenTauDen, maGaTauDen) REFERENCES ChiTietChuyenTau(maChuyenTau, maGaTau),
	ngayLayVe Datetime,
	trangThaiPhieuDatVe varchar(20) CHECK (trangThaiPhieuDatVe IN ('CHOLAYVE', 'DALAYVE','DAHUY','DAHUYDOQUAHAN')),
	loaiPhieuDatVe varchar(20) CHECK (loaiPhieuDatVe IN ('PHIEUDATTAPTHE','PHIEUDATCANHAN'))
	)
	go

	--tạo bảng chi tiết phiếu đạt vé
create table ChiTietPhieuDatVe(
	maCho varchar(14) foreign key references Cho(maCho),
	maPhieuDatVe varchar(11) foreign key references PhieuDatVe(maPhieuDatVe),
	maKhachHang varchar(10) foreign key references KhachHang(maKhachHang),
	giaCho float not null,
	)

go
--tao bang LichSuHuy
create table LichSuHuy(
	maLichSuHuy varchar(11) primary key,
	thoiGianHuy Datetime ,
	lePhi float,
	soTienHoanTra float,
	maVe varchar(11) foreign key references Ve(maVe),
	maPhieuDatVe varchar(11) foreign key references PhieuDatVe(maPhieuDatVe),
	loaiLichSuHuy varchar(10) CHECK (loaiLichSuHuy IN ('HUYVE','HUYDATVE'))
	)
go

--tạo bảng lịch sử đổi
create table LichSuDoi(
	maLichSuDoi varchar(11) primary key,
	thoiGianDoi Datetime ,
	lePhi float,
	soTienThu float,
	veCu varchar(11) foreign key references Ve(maVe),
	veMoi varchar(11) foreign key references Ve(maVe)
	)
go




