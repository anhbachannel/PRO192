package Slot10;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
private ArrayList<SinhVien> danhSachSinhVien;
	
	public DanhSachSinhVien(){
		danhSachSinhVien = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}

	public ArrayList<SinhVien> getDanhSachSinhVien() {
		return danhSachSinhVien;
	}

	public void setDanhSachSinhVien(ArrayList<SinhVien> danhSachSinhVien) {
		this.danhSachSinhVien = danhSachSinhVien;
	}
	
	// 1. Thêm sinh viên
	public void themSinhVien(SinhVien sv) {
		this.danhSachSinhVien.add(sv);
	}
	
	
	// 2. In danh sách sinh viên
	public void inDanhSach() {
		for(SinhVien sv : danhSachSinhVien) {
			System.out.println(sv);
		}
	}
	
	// 3. Xóa sinh viên
	public void xoaTheoEmail(String email) {
		for(SinhVien sv : danhSachSinhVien) {
			if(sv.getEmail().equals(email)) {
				danhSachSinhVien.remove(sv);
			}
		}
	}
	
	public void xoaTheoChuyenNganh1(String chuyenNganh1) {
		for(SinhVien sv : danhSachSinhVien) {
			if(sv.getChuyenNganh1().equals(chuyenNganh1)) {
				danhSachSinhVien.remove(sv);
			}
		}
	}
	
	public void xoaTheoChuyenNganh2(String chuyenNganh2) {
		for(SinhVien sv : danhSachSinhVien) {
			if(sv.getChuyenNganh1().equals(chuyenNganh2)) {
				danhSachSinhVien.remove(sv);
			}
		}
	}
	
	// 4. Sửa thông tin sinh viên
	Scanner sc = new Scanner(System.in);

	public void suaThongTin() {
		System.out.println("Nhập email của sinh viên cần sửa: ");
		String emailSinhVien = sc.nextLine();

		for (SinhVien sv : danhSachSinhVien) {
			if (sv.getEmail().equals(emailSinhVien)) {
				System.out.println("Bạn muốn thay đổi: ");
				System.out.println("1. Email");
				System.out.println("2. Chuyên ngành 1");
				System.out.println("3. Chuyên ngành 2");
				int choice = sc.nextInt();
				sc.nextLine();
				if (choice == 1) {
					System.out.println("Nhập email bạn muốn thay đổi: ");
					sv.setEmail(sc.nextLine());
					break;
				} else if (choice == 2) {
					System.out.println("Nhập chuyên ngành 1 bạn muốn thay đổi: ");
					sv.setChuyenNganh1(sc.nextLine());
					break;
				} else if (choice == 3) {
					System.out.println("Nhập chuyên ngành 2 bạn muốn thay đổi: ");
					sv.setChuyenNganh2(sc.nextLine());
					break;
				}
			}
		}
	}
}
