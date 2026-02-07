void main(){
    IO.print("Masukkan nama anda : ");
    
    // nama variabel di Java biasanya menggunakan camelCase, diawali dengan huruf kecil.
    String namaPengguna; // deklarasi: membuat variabel dengan tipe data String
    // pada titik ini, variabel nama belum ada isinya alias null.

    namaPengguna = IO.readln();
    // variabel nama terisi data sesuai inputan user

    IO.println("Halo " + namaPengguna);

    String waktu = "pagi"; // deklarasi sekaligus inisialisasi
    IO.println("Selamat " + waktu);
}