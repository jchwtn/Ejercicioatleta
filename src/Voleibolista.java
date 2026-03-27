public class Voleibolista extends Atleta implements Evaluable{

    private int saquesEfectivos;
    private int bloqueos;

    public Voleibolista() {
    }

    public Voleibolista(String nombre, int edad, double horasEntrenamiento, int saquesEfectivos, int bloqueos) {
        super(nombre, edad, horasEntrenamiento);
        this.saquesEfectivos = saquesEfectivos;
        this.bloqueos = bloqueos;
    }

    public int getSaquesEfectivos() {
        return saquesEfectivos;
    }

    public void setSaquesEfectivos(int saquesEfectivos) {
        this.saquesEfectivos = saquesEfectivos;
    }

    public int getBloqueos() {
        return bloqueos;
    }

    public void setBloqueos(int bloqueos) {
        this.bloqueos = bloqueos;
    }

    @Override
    public String toString() {
        return "Voleibolista{" +
                "saquesEfectivos=" + saquesEfectivos +
                ", bloqueos=" + bloqueos +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        double rendimiento = (saquesEfectivos * 2) + (bloqueos * 3);
        return rendimiento;
    }

    @Override
    public String clasificarNivel() {

    }

    @Override
    public void calcularBono() {

    }
}
