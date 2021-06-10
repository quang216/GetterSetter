package advance.dev;

public class Student {
	String ten;
	int tuoi;
	String Diachi;
	String sdt;
	double dtb;
	
	
	public Student(String ten, int tuoi, String diachi, String sdt, double dtb) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		Diachi = diachi;
		this.sdt = sdt;
		this.dtb = dtb;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getTuoi() {
		return tuoi;
	}
	public void setTuoi(int tuoi) {
		if (tuoi > 0) {
			this.tuoi = tuoi;
		}
	
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public double getDtb() {
		return dtb;
	}
	public void setDtb(double dtb) {
		if (dtb > 0)
		this.dtb = dtb;
	}
	
}
