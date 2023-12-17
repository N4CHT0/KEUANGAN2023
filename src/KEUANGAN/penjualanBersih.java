package KEUANGAN;

public class penjualanBersih extends Pendapatan{
    private int penjualan;
    private int potonganPenjualan;
    private int returPenjualan;
    private int penjualanBersih;

    public penjualanBersih() {
        this.penjualan = 0;
        this.potonganPenjualan = 0;
        this.returPenjualan = 0;
    }

    @Override
    public double hitungPenjualanBersih() {
        return (penjualan - potonganPenjualan - returPenjualan);
    }

    // Getter dan setter untuk variabel penjualan
    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    // Getter dan setter untuk variabel potonganPenjualan
    public int getPotonganPenjualan() {
        return potonganPenjualan;
    }

    public void setPotonganPenjualan(int potonganPenjualan) {
        this.potonganPenjualan = potonganPenjualan;
    }

    // Getter dan setter untuk variabel returPenjualan
    public int getReturPenjualan() {
        return returPenjualan;
    }

    public void setReturPenjualan(int returPenjualan) {
        this.returPenjualan = returPenjualan;
    }
    
    public void  setPenjualanBersih(int PenjualanBersih){
        this.penjualanBersih = PenjualanBersih;
    }
    
    public int getPenjualanBersih(){
        return  penjualanBersih;
    }
}
