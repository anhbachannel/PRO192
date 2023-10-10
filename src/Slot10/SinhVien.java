package Slot10;

import java.util.Objects;

public class SinhVien {
	private String email, chuyenNganh1, chuyenNganh2;

	public SinhVien(String email, String chuyenNganh1, String chuyenNganh2) {
		this.email = email;
		this.chuyenNganh1 = chuyenNganh1;
		this.chuyenNganh2 = chuyenNganh2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getChuyenNganh1() {
		return chuyenNganh1;
	}

	public void setChuyenNganh1(String chuyenNganh1) {
		this.chuyenNganh1 = chuyenNganh1;
	}

	public String getChuyenNganh2() {
		return chuyenNganh2;
	}

	public void setChuyenNganh2(String chuyenNganh2) {
		this.chuyenNganh2 = chuyenNganh2;
	}

	@Override
	public String toString() {
		return "[Email: " + email + ", Chuyên ngành 1: " + chuyenNganh1 + ", Chuyên ngành 2: " + chuyenNganh2 + "]";
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
		return Objects.equals(chuyenNganh1, other.chuyenNganh1) && Objects.equals(chuyenNganh2, other.chuyenNganh2)
				&& Objects.equals(email, other.email);
	}
}
