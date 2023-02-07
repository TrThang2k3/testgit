package buoi2;

import java.util.ArrayList;

import entity.Sinhvien;
import entity.SinhvienTN;
import entity.SinhvienXH;
import entity.codex;

/**
 * @author Asus
 *
 */
public class main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//them sinh vien TN
		SinhvienTN sv1 = new SinhvienTN("Ho The Anh","Khoa TN",9.5,9.9,8.5);
		SinhvienTN sv2 = new SinhvienTN("Huynh Thanh Liem","Khoa TN",9.3,7.5,8.5);
		SinhvienTN sv3 = new SinhvienTN("Nguyen Binh Thien","Khoa TN",5.3,7.5,6.5);
		//Them SVXH
		SinhvienXH sv4 = new SinhvienXH("Ho Thanh Phong","Khoa XH",10.0,9.5,8.7);
		SinhvienXH sv5 = new SinhvienXH("Ho Phu Phong","Khoa XH",6.3,9.5,8.7);
		//add sinh vien vao danh sach
//		ArrayList<SinhvienTN> DSSVTN = new ArrayList<>();
//		DSSVTN.add(sv1);
//		DSSVTN.add(sv2);
//		DSSVTN.add(sv3);
//		ArrayList<SinhvienXH> DSSVXH = new ArrayList<>();
//		DSSVXH.add(sv4);
//		DSSVXH.add(sv5);
//		for (SinhvienTN e : DSSVTN) {
//			e.output();
//		}
//		for (SinhvienXH e: DSSVXH)
//		{
//			e.output();
//		}
//		//Diem SV theo Khoa
//		System.out.println("So sinh vien tu nhien la: "+DSSVTN.size());
//		System.out.println("So sinh vien xa hoi la: "+DSSVXH.size());
		ArrayList<Sinhvien> listSinhVien = new ArrayList<>();
		listSinhVien.add(sv1);
		listSinhVien.add(sv2);
		listSinhVien.add(sv3);
		listSinhVien.add(sv4);
		listSinhVien.add(sv5);
		for(Sinhvien e: listSinhVien)
		{
			System.out.println(e.getKhoa());
		}
		System.out.println("so Pi: "+codex.soPI.getCode());
	}

}
