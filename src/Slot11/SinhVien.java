package Slot11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SinhVien {
	
	private String hoVaTen, email, monHoc;
	private int namSinh;
	
	public SinhVien(String hoVaTen, String email, String monHoc, int namSinh) {
		this.hoVaTen = hoVaTen;
		this.email = email;
		this.monHoc = monHoc;
		this.namSinh = namSinh;
	}

	public String getHoVaTen() {
		return hoVaTen;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMonHoc() {
		return monHoc;
	}

	public void setMonHoc(String monHoc) {
		this.monHoc = monHoc;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	@Override
	public String toString() {
		return "Sinh viên [Họ và tên: " + hoVaTen + ", Email: " + email + ", Môn học: " + monHoc + ", Năm sinh" + namSinh
				+ "]";
	}
	
	private List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
	
	public SinhVien(List<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(danhSachSinhVien, other.danhSachSinhVien) && Objects.equals(email, other.email)
				&& Objects.equals(hoVaTen, other.hoVaTen) && Objects.equals(monHoc, other.monHoc)
				&& namSinh == other.namSinh;
	}
	
	
	
}
