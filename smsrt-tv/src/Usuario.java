
public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarttv = new SmartTv();

        System.out.println("Tv ligada? " + smarttv.ligada);
        System.out.println("Canal atual: " + smarttv.canal);
        System.out.println("Volume atual: " + smarttv.volume);

        System.out.println();

        smarttv.ligar();
        smarttv.trocarCanal(9);
        smarttv.aumentarVolume();

        System.out.println("Tv ligada? " + smarttv.ligada);
        System.out.println("Canal atual: " + smarttv.canal);
        System.out.println("Volume atual: " + smarttv.volume);

        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();

        System.out.println();
        System.out.println("Volume atual: " + smarttv.volume);

    }
}
