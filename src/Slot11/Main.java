package Slot11;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;


public class Main {
	public static void main(String[] args) {
		// Đọc nội dung từ file
		// 1.
		File f1 = new File("D:\\CHUYÊN NGÀNH 2\\PRO192\\Ex\\GiangVien.txt");
		try {
			List<String> allTest = Files.readAllLines(f1.toPath(), StandardCharsets.UTF_8);
			for (String line : allTest) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println();
		
		// 2.
		File f2 = new File("D:\\CHUYÊN NGÀNH 2\\PRO192\\Ex\\SinhVien.txt");
		try {
			List<String> allTest1 = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
			for (String line : allTest1) {
				System.out.println(line);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		// Viết nội dung vào file
		// 1.
		try {
			PrintWriter pw = new PrintWriter(f1);
			pw.println("Sau đây sẽ đưa nội dung code vào file GiangVien.");
			List<GiangVien> danhSachGiangVien = new ArrayList<GiangVien>();
			// Thêm giảng viên
			pw.println("Danh sách giảng viên: ");
			danhSachGiangVien.add(new GiangVien("Trần Quốc Dũng", "dungtranquoc@fpt.edu.vn", 1997));
			danhSachGiangVien.add(new GiangVien("Võ Văn Nam", "namvovan@fpt.edu.vn", 1996));
			// In danh sách giảng viên
			for(GiangVien giangVien : danhSachGiangVien) {
				pw.println(giangVien);
			}
			
			// Tìm kiếm giảng viên
			
	        for (GiangVien giangVien : danhSachGiangVien) { 	
	            if (giangVien.getHoVaTen().contentEquals("Võ Văn Nam")) {
	            	pw.println("Đã tìm thấy giảng viên trong danh sách: ");
	                pw.println(giangVien);
	            }
	        }
			pw.flush();
			pw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		// 2. 
		try {
			PrintWriter pw1 = new PrintWriter(f2);
			pw1.println("Sau đây sẽ đưa nội dung code vào file SinhVien.");
			List<SinhVien> danhSachSinhVien = new ArrayList<SinhVien>();
			// Thêm sinh viên
			pw1.println("Danh sách sinh viên: ");
			danhSachSinhVien.add(new SinhVien("Hoàng Minh Dương", "duonghmqe180057@fpt.edu.vn", "MAD - PRO", 2004));
			danhSachSinhVien.add(new SinhVien("Lê Nhật Huy", "huylenhat@fpt.edu.vn", "MAD - PRO", 2004));
			// In danh sách sinh viên
			for(SinhVien sinhVien : danhSachSinhVien) {
				pw1.println(sinhVien);
			}
			
			// Tìm kiếm sinh viên
			for(SinhVien sinhVien : danhSachSinhVien) {
				if(sinhVien.getHoVaTen().contentEquals("Hoàng Minh Dương")) {
					pw1.println("Đã tìm thấy được sinh viên trong danh sách: ");
					pw1.println(sinhVien);
				}
			}
			pw1.flush();
			pw1.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
