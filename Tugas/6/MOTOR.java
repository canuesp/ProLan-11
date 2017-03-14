import java.util.Scanner;

public class MOTOR {
  public static String NamaToko;
  public static String Alamat;
  public static String Telpon;

  public static Scanner input = new Scanner(System.in);
  public static MOTOR motor = new MOTOR();
  public static Matic merk_1 = new Matic();
  public static Matic merk_2 = new Matic();
  public static Bebek merk_3 = new Bebek();

  MOTOR() {
	//this dengan Konstruktor
    this.NamaToko = "ABADI MOTOR)";
    this.Alamat = "Jalan. Di Bumi";
    this.Telpon = "08123456789";
  }
  
    public static void informasi() { 
   
    System.out.print("Nama Toko    : " + NamaToko + "\n");
    System.out.print("Alamat       : " + Alamat + "\n");
    System.out.print("Telepon      : " + Telpon + "\n");
    System.out.print("\n");
  }
  
	public static void informasiMatic() {
	merk_1.merk = "Yamaha";
    merk_1.nama = "MIO";
    merk_1.harga = 14000000;
 
	
	merk_2.merk = "Honda";
    merk_2.nama = "Beat";
    merk_2.harga = 13500000;

  }
  
	public static void informasiBebek() {
	merk_3.merk = "Honda";
    merk_3.nama = "Supra x 125 fi";
    merk_3.harga = 17000000;

  }
   
  public static void pilihan(){
	
	Scanner scan=new Scanner(System.in);
	System.out.println("-------------------------");
	System.out.println("       ABADI MOTOR       ");
	System.out.println("-------------------------");
	System.out.println("----------MENU-----------");
	System.out.println("1.Informasi Toko");
	System.out.println("2.Informasi Motor Matic");
	System.out.println("3.Informasi Motor Bebek");
	System.out.println("-------------------------");
	System.out.print("Pilih Menu : ");
	char pilih=(char) scan.nextInt();
	
      switch (pilih) {
          case 1:
              informasi(); //pemanggilan konstruktor
              break;
          case 2:
              informasiMatic(); //pemanggilan konstruktor
			  merk_1.informasi_matic();
              merk_2.informasi_matic();
              break;
          case 3:
              informasiBebek(); //pemanggilan konstruktor
			  merk_3.informasi_bebek();
              break;
          default:
              System.out.println("Menu Tidak Ada");
              break;
         }

	

	}
 
  public static void main(String[] args) {
    pilihan();
  }
    
}