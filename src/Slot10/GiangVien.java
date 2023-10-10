package Slot10;

import java.util.Objects;

public class GiangVien {
	private String email, monHoc1, monHoc2;

		public GiangVien(String email, String monHoc1, String monHoc2) {
			this.email = email;
			this.monHoc1 = monHoc1;
			this.monHoc2 = monHoc2;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMonHoc1() {
			return monHoc1;
		}

		public void setMonHoc1(String monHoc1) {
			this.monHoc1 = monHoc1;
		}

		public String getMonHoc2() {
			return monHoc2;
		}

		public void setMonHoc2(String monHoc2) {
			this.monHoc2 = monHoc2;
		}

		@Override
		public String toString() {
			return "[Email: " + email + ", Môn học 1: " + monHoc1 + ", Môn học 2: " + monHoc2 + "]";
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
			return Objects.equals(email, other.email) && Objects.equals(monHoc1, other.monHoc1)
					&& Objects.equals(monHoc2, other.monHoc2);
		}
}
