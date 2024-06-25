public class Adivinador {
    private int numeroRandom;

    public Adivinador(){
        generarNum();
    }

    public void generarNum(){
        this.numeroRandom = (int) (Math.random() * 100) + 1;
    }

    public int getNumeroRandom() {
        return numeroRandom;
    }

    public int verificar(String numeroStr){
        int numero;
        try{
            numero = Integer.parseInt(numeroStr);
        } catch(Exception e){
            throw new NumberFormatException();
        }
        if (numero > numeroRandom){
            return 1;
        } else if (numero == numeroRandom){
            return 0;
        } else {
            return -1;
        }
    }
}
