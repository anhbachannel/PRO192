package Slot10;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachGiangVien {
	private ArrayList<GiangVien> danhSachGiangVien;

	public DanhSachGiangVien() {
		danhSachGiangVien = new ArrayList<GiangVien>();
	}

	public DanhSachGiangVien(ArrayList<GiangVien> danhSachGiangVien) {
		this.danhSachGiangVien = danhSachGiangVien;
	}

	// 1. Add teacher in list
	public void themGiangVien(GiangVien gv) {
		danhSachGiangVien.add(gv);
	}

	// 2. Print out monitor
	public void inDanhSach() {
		for (GiangVien gv : danhSachGiangVien) {
			System.out.println(gv);
		}
	}

	// 3. Delete teacher
	public void xoaGiangVienTheoEmail(String email) {
		for (GiangVien gv : danhSachGiangVien) {
			if (gv.getEmail().equals(email)) {
				danhSachGiangVien.remove(gv);
			}
		}
	}

	public void xoaGiangVienTheoMon1(String monHoc1) {
		for (GiangVien gv : danhSachGiangVien) {
			if (gv.getMonHoc1().equals(monHoc1)) {
				danhSachGiangVien.remove(gv);
			}
		}
	}

	public void xoaGiangVienTheoMon2(String monHoc2) {
		for (GiangVien gv : danhSachGiangVien) {
			if (gv.getEmail().equals(monHoc2)) {
				danhSachGiangVien.remove(gv);
			}
		}
	}

	// 4. Repair information of teacher
	Scanner sc = new Scanner(System.in);

	public void suaThongTin() {
		System.out.println("Nhập email của giảng viên cần sửa: ");
		String emailGiangVien = sc.nextLine();

		for (GiangVien gv : danhSachGiangVien) {
			if (gv.getEmail().equals(emailGiangVien)) {
				System.out.println("Bạn muốn thay đổi: ");
				System.out.println("1. Email");
				System.out.println("2. Môn học 1");
				System.out.println("3. Môn học 2");
				int choice = sc.nextInt();
				sc.nextLine();
				if (choice == 1) {
					System.out.println("Nhập email bạn muốn thay đổi: ");
					gv.setEmail(sc.nextLine());
					break;
				} else if (choice == 2) {
					System.out.println("Nhập môn học 1 bạn muốn thay đổi: ");
					gv.setMonHoc1(sc.nextLine());
					break;
				} else if (choice == 3) {
					System.out.println("Nhập môn học 2 bạn muốn thay đổi: ");
					gv.setMonHoc2(sc.nextLine());
					break;
				}
			}
		}
	}
}
