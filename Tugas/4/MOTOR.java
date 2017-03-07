public class MOTOR {
	public static void main (String[] args) {
	System.out.print("-- INFORMASI Motor Matic --\n\n");
	Matic merk_1 = new Matic();
    Matic merk_2 = new Matic();	
	Matic merk_3 = new Matic();
	
	merk_1.merk = "Yamaha";
    merk_1.nama = "MIO";
    merk_1.harga = 14000000;
    merk_1.informasi_matic();
	
	merk_2.merk = "Honda";
    merk_2.nama = "Beat";
    merk_2.harga = 13500000;
    merk_2.informasi_matic();
	
	merk_3.merk = "Honda";
    merk_3.nama = "Scoppy";
    merk_3.harga = 15000000;
    merk_3.informasi_matic();
	
	System.out.print("-- INFORMASI Motor Bebek --\n\n");
	Bebek merk_4 = new Bebek();
	
	merk_4.merk = "Honda";
    merk_4.nama = "Supra";
    merk_4.harga = 17000000;
    merk_4.informasi_bebek();
	}
}