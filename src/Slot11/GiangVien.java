package Slot11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GiangVien {
	
	private String hoVaTen, email;
	private int namSinh;
	
	public GiangVien(String hoVaTen, String email, int namSinh) {
		this.hoVaTen = hoVaTen;
		this.email = email;
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

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}


	@Override
	public String toString() {
		return "Giảng viên {Họ và tên: " + hoVaTen + ", Email: " + email + ", Năm sinh: " + namSinh + "]";
	}
	
	private List<GiangVien> danhSachGiangVien = new ArrayList<GiangVien>();
	
	public GiangVien(List<GiangVien> danhSachGiangVien) {
		this.danhSachGiangVien = danhSachGiangVien;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GiangVien other = (GiangVien) obj;
		return Objects.equals(danhSachGiangVien, other.danhSachGiangVien) && Objects.equals(email, other.email)
				&& Objects.equals(hoVaTen, other.hoVaTen) && namSinh == other.namSinh;
	}

}
