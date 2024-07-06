public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smarttv = new SmartTv();

        System.out.println("SmartTv ligada? " + smarttv.ligada);
        System.out.println("Canal atual: " + smarttv.canal);
        System.out.println("Volume atual: " + smarttv.volume);

        smarttv.ligar();
        System.out.println("SmartTv ligada? " + smarttv.ligada);

        smarttv.desligar();
        System.out.println("SmartTv ligada? " + smarttv.ligada);

        smarttv.aumentarVolume();
        System.out.println("Volume:" + smarttv.volume);

        smarttv.canalNovo(65);
        System.out.println("Canal atual: " + smarttv.canal);

    }
}
