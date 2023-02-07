package entity;

public class SinhvienTN extends Sinhvien{
	private Double Toan;
	private Double Ly;
	private Double Hoa;
	
	public Double getToan() {
		return Toan;
	}
	public void setToan(Double toan) {
		Toan = toan;
	}
	public Double getLy() {
		return Ly;
	}
	public void setLy(Double ly) {
		Ly = ly;
	}
	public Double getHoa() {
		return Hoa;
	}
	public void setHoa(Double hoa) {
		Hoa = hoa;
	}
	
	public SinhvienTN(String Ten, String Khoa, 
						Double Toan, Double Ly, Double Hoa){
		super(Ten, Khoa);
		this.Toan = Toan;
		this.Ly = Ly;
		this.Hoa = Hoa;
	};
	
	public void output() {
		System.out.println("{ Truong : "+ super.Truong + ", "+
						    " Ten : "+ super.getTen() + ", "+
						    " Khoa : "+ super.getKhoa() + ", "+
						    " Toan : "+ this.getToan() + ", "+
						    " Ly : "+ this.getLy() + ", "+
						    " Toan : "+ this.getHoa() + "}"
				);
	}
	
	
}
