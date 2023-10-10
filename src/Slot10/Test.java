package Slot10;

import java.util.Scanner;

public class Test {
	public static void menu1() {
		System.out.println("Vui lòng chọn chức năng: ");
		System.out.println("1. Thêm giảng viên.");
		System.out.println("2. In danh sách giảng viên.");
		System.out.println("3. Xóa giảng viên.");
		System.out.println("4. Sửa thông tin giảng viên.");
		System.out.println("0. Thoát.");
	}

	public static void menu2() {
		System.out.println("Vui lòng chọn chức năng: ");
		System.out.println("1. Thêm sinh viên.");
		System.out.println("2. In danh sách sinh viên.");
		System.out.println("3. Xóa sinh viên.");
		System.out.println("4. Sửa thông tin sinh viên.");
		System.out.println("0. Thoát.");
	}

	public static void menu() {
		System.out.println("MENU");
		System.out.println("--------");
		System.out.println("Vui lòng chọn chức năng: ");
		System.out.println("1. Quản lý giảng viên.");
		System.out.println("2. Quản lý sinh viên.");
		System.out.println("0. Thoát khỏi chương trình.");
	}

	public static void main(String[] args) {
		DanhSachGiangVien dsgv = new DanhSachGiangVien();
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		Scanner sc = new Scanner(System.in);
		int choice, flag = 1, a = 1, b = 1;
		while (flag == 1) {
			menu();
			choice = sc.nextInt();
			if (choice == 1) {
				while (a == 1) {
					menu1();
					choice = sc.nextInt();
					sc.nextLine();

					switch (choice) {
					case 1: {
						System.out.println("Nhập email giảng viên: ");
						String email = sc.nextLine();
						System.out.println("Nhập môn học 1: ");
						String monHoc1 = sc.nextLine();
						System.out.println("Nhập môn học 2: ");
						String monHoc2 = sc.nextLine();

						GiangVien gv = new GiangVien(email, monHoc1, monHoc2);
						dsgv.themGiangVien(gv);
						break;
					}
					case 2: {
						dsgv.inDanhSach();
						break;
					}
					case 3: {
						System.out.println("Bạn muốn xóa giảng viên dựa vào: ");
						System.out.println("1. Email\n2. Môn học 1\n3. Môn học 2");
						int choice1 = sc.nextInt();

						if (choice1 == 1) {
							System.out.println("Nhập email của giảng viên cần xóa: ");
							sc.nextLine();
							String email = sc.nextLine();
							// GiangVien gv = new GiangVien(email, email, email);
							System.out.println("Xóa giảng viên khỏi danh sách.");
							dsgv.xoaGiangVienTheoEmail(email);
						} else if (choice1 == 2) {
							System.out.println("Nhập môn học 1 của giảng viên cần xóa: ");
							sc.nextLine();
							String monHoc1 = sc.nextLine();
							// GiangVien gv = new GiangVien(monHoc1, monHoc1, monHoc1);
							System.out.println("Xóa giảng viên khỏi danh sách.");
							dsgv.xoaGiangVienTheoMon1(monHoc1);
						} else if (choice1 == 3) {
							System.out.println("Nhập môn học 2 của giảng viên cần xóa: ");
							sc.nextLine();
							String monHoc2 = sc.nextLine();
							// GiangVien gv = new GiangVien(monHoc2, monHoc2, monHoc2);
							System.out.println("Xóa giảng viên khỏi danh sách.");
							dsgv.xoaGiangVienTheoMon2(monHoc2);
						}
						break;
					}
					case 4: {
						dsgv.suaThongTin();
						break;
					}
					default: {
						a = 0;
					}
					}
				}
			} else if (choice == 2) {
				while (b == 1) {
					menu2();
					choice = sc.nextInt();
					sc.nextLine();

					switch (choice) {
					case 1: {
						System.out.println("Nhập email sinh viên: ");
						String email = sc.nextLine();
						System.out.println("Nhập chuyên ngành 1: ");
						String monHoc1 = sc.nextLine();
						System.out.println("Nhập chuyên ngành 2: ");
						String monHoc2 = sc.nextLine();

						SinhVien sv = new SinhVien(email, monHoc1, monHoc2);
						dssv.themSinhVien(sv);
						break;
					}
					case 2: {
						dssv.inDanhSach();
						break;
					}
					case 3: {
						System.out.println("Bạn muốn xóa sinh viên dựa vào: ");
						System.out.println("1. Email\n2. Môn học 1\n3. Môn học 2");
						int choice1 = sc.nextInt();

						if (choice1 == 1) {
							System.out.println("Nhập email của sinh viên cần xóa: ");
							sc.nextLine();
							String email = sc.nextLine();
							
							System.out.println("Xóa sinh viên khỏi danh sách.");
							dssv.xoaTheoEmail(email);
						} else if (choice1 == 2) {
							System.out.println("Nhập môn học 1 của sinh viên cần xóa: ");
							sc.nextLine();
							String chuyenNganh1 = sc.nextLine();
							
							System.out.println("Xóa sinh viên khỏi danh sách.");
							dssv.xoaTheoChuyenNganh1(chuyenNganh1);
						} else if (choice1 == 3) {
							System.out.println("Nhập môn học 2 của sinh viên cần xóa: ");
							sc.nextLine();
							String chuyenNganh2 = sc.nextLine();
							
							System.out.println("Xóa sinh viên khỏi danh sách.");
							dssv.xoaTheoChuyenNganh2(chuyenNganh2);
						}
						break;
					}
					case 4: {
						dssv.suaThongTin();
						break;
					}
					default: {
						b = 0;
					}
					}
				}
			} else {
				System.out.println("Cảm ơn bạn đã sử dụng dịch vụ!");
				flag = 0;
			}
		}

	}
}
