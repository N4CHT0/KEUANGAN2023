package KEUANGAN;

public class LABA_KOTOR extends penjualanBersih {
    private int HPP;
    private int Labakotor;

    public LABA_KOTOR() {
        this.HPP = 0;
    }

    public double hitungLabaKotor() {
        double hasil = hitungPenjualanBersih();
        return (hasil - HPP);
    }

    public double tampilLaba() {
        return hitungLabaKotor();
    }

    // Getter dan setter untuk variabel HPP
    public int getHPP() {
        return HPP;
    }

    public void setHPP(int HPP) {
        this.HPP = HPP;
    }
    
    public void setLaba(int LabaKotor){
        this.Labakotor = LabaKotor;
    }
    
    public  int getLaba(){
        return Labakotor;
    }
}
