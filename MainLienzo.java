public class MainLienzo {
    public static void main(String[] args) {
 
       Shape BordeEstrella = new ColorRelleno(new Estrella());
       Shape RellenoEstrella = new ColorBorde(new Estrella());
       
       System.out.println("\nTu figura tiene los siguientes atributos: ");
       BordeEstrella.draw();
       RellenoEstrella.draw();
       
    }
 }