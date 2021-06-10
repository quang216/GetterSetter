package advance.dev;

import java.util.Scanner;

public class MainApp {
	static void input(Student[] std) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("Nhap mang sinh vien: ");
			String ten = sc.next();
			int tuoi = sc.nextInt();
			String diaChi = sc.next();
			String sdt = sc.next();
			double dtb = sc.nextDouble();
			Student stdent = new Student(ten,tuoi,diaChi,sdt,dtb);
			std[i] = stdent;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] std = new Student[10];
		input(std);
		
	}

}
