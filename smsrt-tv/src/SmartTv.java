public class SmartTv {
    
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada = true; 
    }
    public void desligar(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    public void procurarCanalEmCima(){
        canal++;
    }
    public void procurarCanalEmBaixo(){
        canal--;
    }

    public void trocarCanal(int numeroCanal){
        canal = numeroCanal;
    }

}
