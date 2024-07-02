public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        if (ligada == false) {
            ligada = true;
            System.out.println("Ligando...");
            System.out.println("Sua SmartTV está ligada! ");
        }
    }


    public void desligar() {
        if(ligada == true) {
            ligada = false;
            System.out.println("DESLIGANDO...");
        }        
    }

    public void aumentarVolume () {
        if (volume < 100) {
            volume++;
        } else {
            System.out.println("Volume máximo atingido!\nVolume: " + volume);
        }
        
    }

    public void diminuirVolume () {
        if(volume > 0) {
            volume--;
        } else {
            System.out.println("Volume mínimo atingido! \nVolume: " + volume);
        }

    }

    public void canalMais(){
        canal++;
    }

    public void canalMenos(){
        if (canal > 0) {
            canal--;
        }
    }

    public void canalNovo(int novoCanal){
        if (novoCanal > 0) {
            canal = novoCanal;
        }
    }

}
