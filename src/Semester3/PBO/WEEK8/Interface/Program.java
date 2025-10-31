package Semester3.PBO.WEEK8.Interface;

public class Program{
    public static void main(String[] args){
        Rektor pakRektor = new Rektor();
        // Mahasiswa mahasiswaBiasa = new Mahasiswa ("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        // pakRektor.beriSertifikatCumlaude (mahasiswaBiasa);
        // Objek dengan Class mahasiswa akan error karena tidak mengimplementasikan Class Icumlaude
        pakRektor.beriSertifikatCumlaude (sarjanaCumlaude);
        pakRektor.beriSertifikatCumlaude (masterCumlaude);
    }
}
