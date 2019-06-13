
public class HavaDurumu {

	private double sicaklik;
	private double nem;
	private String tarih;
	public HavaDurumu(double sicaklik,double nem,String tarih) {
	super();
	this.sicaklik=sicaklik;
	this.nem=nem;
	this.tarih=tarih;
	}
	@Override
	public String toString() {
		return "HavaDurumu [sicaklik=" + sicaklik + ", nem=" + nem + ", tarih=" + tarih + "]";
	}
	public double getSicaklik() {
		return sicaklik;
	}
	public void setSicaklik(double sicaklik) {
		this.sicaklik = sicaklik;
	}
	public double getNem() {
		return nem;
	}
	public void setNem(double nem) {
		this.nem = nem;
	}
	public String getTarih() {
		return tarih;
	}
	public void setTarih(String tarih) {
		this.tarih = tarih;
	}
}
