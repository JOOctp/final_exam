package finalexam;

public class Books {
 private String Id_books;
 private String Nama_buku;
 private int Harga;


 public Books(String Id_books, String Nama_buku, int Harga){
     this.Id_books = Id_books;
     this.Nama_buku = Nama_buku;
     this.Harga = Harga;
 }

 public String getId_books() {
  return Id_books;
 }

 public String getNama_buku() {
  return Nama_buku;
 }

 public int getHarga() {
  return Harga;
 }

 // Setter Methods 

 public void setId_books(String Id_books) {
  this.Id_books = Id_books;
 }

 public void setNama_buku(String Nama_buku) {
  this.Nama_buku = Nama_buku;
 }

 public void setHarga(int Harga) {
  this.Harga = Harga;
 }
}
