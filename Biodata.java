public class Biodata{
    public String nama;
    public String nim;
    public String jurusan;
    public String fakultas;

  Biodata(String nm, String stb, String Jurusan, String Fakultas){
       nama = nm;
       nim = stb;
	jurusan = Jurusan;
	fakultas = Fakultas;
    }

    public static void main(String[] args) {
        Biodata mahasiswa = new Biodata("Gayatri", "13020180076", "teknik informatika", "FIKOM");
        System.out.println(mahasiswa.nama);
        System.out.println(mahasiswa.nim);
	System.out.println(mahasiswa.jurusan);
	System.out.println(mahasiswa.fakultas);
    }
}
