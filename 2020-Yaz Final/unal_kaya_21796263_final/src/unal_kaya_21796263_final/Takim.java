package unal_kaya_21796263_final;

public class Takim implements Comparable{
    private String ad;
    private int averaj;
    private double puan;

    public Takim(String ad, int averaj, double puan) {
        super();
        this.ad = ad;
        this.averaj = averaj;
        this.puan = puan;
    }


    public void setAd(String ad) {
        this.ad = ad;
    }


    public void setAveraj(int averaj) {
        this.averaj = averaj;
    }

    public String getAd() {
        return ad;
    }

    public int getAveraj() {
        return averaj;
    }

    public double getPuan() {
        return puan;
    }

    public void setPuan(double puan) {
        this.puan = puan;
    }

    @Override
    public String toString() {
        return "Puanı:"+ puan + " Averajı:" + averaj + " Takim:" + ad;
    }

    @Override
    public int compareTo(Object o) {
        double compareage =((Takim)o).getPuan();
        return (int) (compareage - this.puan);
    }
}