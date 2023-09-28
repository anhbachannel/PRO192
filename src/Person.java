
public class Person {

	private String email;
	private String hoVaTen;
	private int namSinh;
	private String gioiTinh;
	private String soDienThoai;
	private String diaChi;

	public Person(String email, String hoVaTen, int namSinh, String gioiTinh, String soDienThoai, String diaChi) {
		this.email = email;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.gioiTinh = gioiTinh;
		this.soDienThoai = soDienThoai;
		this.diaChi = diaChi;
	}

	public void hienThiThongTin() {
		System.out.println("Email: " + email);
		System.out.println("Họ và tên: " + hoVaTen);
		System.out.println("Năm sinh: " + namSinh);
		System.out.println("Giới tính: " + gioiTinh);
		System.out.println("Số điện thoại: " + soDienThoai);
		System.out.println("Địa chỉ: " + diaChi);
	}

	public void thayDoiSoDienThoai(String soDienThoaiMoi) {
		this.soDienThoai = soDienThoaiMoi;
	}

	public void thayDoiDiaChi(String diaChiMoi) {
		this.diaChi = diaChiMoi;
	}
}
