public class DaftarBarang {
    String nama;
    int harga;
    public DaftarBarang() {}
    public DaftarBarang(String nama, int harga) {
        super();
        this.nama = nama;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }
    
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        String result = "Nama : " + this.nama + " harga : " + this.harga; 
        return result;
    }
}
