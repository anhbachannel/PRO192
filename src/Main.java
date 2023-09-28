
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Person sinhvien = new Person("hovaten_mssv@fpt.edu.vn", "Họ và tên", 2004, "Giới tính", "Số điện thoại",
				"Địa chỉ");

		GiangVien gv = new GiangVien("namvovan@fpt.edu.vn", "Võ Văn Nam", 1996, "Nam", "0555222333", "Quy Nhơn");

		SinhVien sv = new SinhVien("duonghmqe180057@fpt.edu.vn", "Hoàng Minh Dương", 2004, "Nam", "0868839083",
				"Hoài Nhơn - Bình Định");

		int choice, flag = 1;

		while (flag == 1) {
			System.out.println("MENU");
			System.out.println("----------");
			System.out.println("1. Hiển thị thông tin.");
			System.out.println("2. Thay đổi số điện thoại.");
			System.out.println("3. Thay đổi địa chỉ.");
			System.out.println("4. Hiển thị các môn và thêm môn sẽ dạy.");
			System.out.println("5. Hiển thị các môn học theo chuyên ngành.");
			System.out.println("0. Kết thúc chương trình.");
			System.out.println("----------");
			System.out.println("Nhập lựa chọn của bạn: ");
			choice = sc.nextInt();
			switch (choice) {

			case 1:

				sinhvien.hienThiThongTin();
				System.out.println();
				break;

			case 2:

				sinhvien.thayDoiSoDienThoai("0868839083");
				System.out.println("\nSau khi cập nhật số điện thoại:\n ");
				sinhvien.hienThiThongTin();
				System.out.println();
				break;
			case 3:

				sinhvien.thayDoiDiaChi("Quy Nhơn");
				System.out.println("\nSau khi cập nhật địa chỉ:\n ");
				sinhvien.hienThiThongTin();
				System.out.println();
				break;

			case 4:

				gv.hienThiCacMonHoc();
				System.out.println();
				gv.themMonHoc();
				System.out.println();
				break;

			case 5:

				sc.nextLine();
				List<String> cn1 = Arrays.asList("CEA", "CSI", "MAE", "PRF", "SSL");
				sv.themChuyenNganh(1, cn1);

				List<String> cn2 = Arrays.asList("OSG", "SSG", "MAD", "PRO", "NWC");
				sv.themChuyenNganh(2, cn2);

				sv.hienThiDanhSachMonHocTheoChuyenNganh();
				break;
			default:
				flag = 0;
			}
		}
	}
}
