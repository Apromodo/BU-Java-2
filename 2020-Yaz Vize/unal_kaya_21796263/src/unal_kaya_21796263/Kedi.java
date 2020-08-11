package unal_kaya_21796263;

public class Kedi extends Hayvan{

    private boolean kisirMi;

    public Kedi(boolean kisirMi){
        super();
        this.kisirMi = kisirMi;
    }

    @Override
    public String sinifAdiYaz() {
        return "Ben Kedi Sınıfıyım";
    }

    @Override
    public String asiliMi(){
        return "Evet, aşılarım var.";
    }

    @Override
    public String dogumTarihi(){
        return "Doğum Tarihim : 17/08/2012";
    }

    public Boolean kisirMi(){
        return kisirMi;
    }
}
