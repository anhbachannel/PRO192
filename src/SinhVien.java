import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SinhVien extends Person {

	private Map<Integer, List<String>> danhSachChuyenNganh;

	public SinhVien(String email, String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
		super(email, hoVaTen, namSinh, gioiTinh, soDienThoai, diaChi);

		danhSachChuyenNganh = new HashMap<Integer, List<String>>();
	}

	public void themChuyenNganh(Integer chuyenNganh, List<String> danhSachMonHoc) {
		this.danhSachChuyenNganh.put(chuyenNganh, danhSachMonHoc);
	}

	public void hienThiDanhSachMonHocTheoChuyenNganh() {
		for (Map.Entry<Integer, List<String>> entry : danhSachChuyenNganh.entrySet()) {
			System.out.println("Chuyên ngành: " + entry.getKey());
			System.out.println("Danh sách môn học: ");
			for (String monHoc : entry.getValue()) {
				System.out.println(monHoc);
			}
			System.out.println();
		}

	}

}
