package hedieuhanh;

public class TienTrinh {
	private String tienTrinh;
	private int dungLuong;
	
	public TienTrinh() {
		// TODO Auto-generated constructor stub
	}

	public TienTrinh(String tienTrinh, int dungLuong) {
		super();
		this.tienTrinh = tienTrinh;
		this.dungLuong = dungLuong;
	}

	public String getTienTrinh() {
		return tienTrinh;
	}

	public void setTienTrinh(String tienTrinh) {
		this.tienTrinh = tienTrinh;
	}

	public int getDungLuong() {
		return dungLuong;
	}

	public void setDungLuong(int dungLuong) {
		this.dungLuong = dungLuong;
	}
	
	

}
