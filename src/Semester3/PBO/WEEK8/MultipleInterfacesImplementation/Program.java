package Semester3.PBO.WEEK8.MultipleInterfacesImplementation;

public class Program{
    public static void main(String[] args){
        Rektor pakRektor = new Rektor();
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        PascaSarjana masterCumlaude = new PascaSarjana("Elok");
        
        // pakRektor.beriSertifikatMawapres(sarj    anaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);
    }
}
