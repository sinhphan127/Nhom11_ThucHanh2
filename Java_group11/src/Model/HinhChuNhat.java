package Model;

public class HinhChuNhat {
	private double rong,dai;

	public HinhChuNhat(double rong, double dai) {
		this.rong = rong;
		this.dai = dai;
	}

	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}
	public double dienTich()
	{
		return dai*rong;
	}
	
	public static void main(String[] args) {
		HinhChuNhat hcn1 = new HinhChuNhat(3, 4);
		System.out.println("Dien Tich Hinh Chu Nhat la :" +hcn1.dienTich());
	}
	
}
