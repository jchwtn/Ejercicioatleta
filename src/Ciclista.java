public class Ciclista extends Atleta implements Evaluable{

    private double kilometrosRecorridos;
    private double tiempoHoras;

    public Ciclista() {
    }


    public Ciclista(String nombre, int edad, double horasEntrenamiento, double kilometrosRecorridos, double tiempoHoras) {
        super(nombre, edad, horasEntrenamiento);
        this.kilometrosRecorridos = kilometrosRecorridos;
        this.tiempoHoras = tiempoHoras;
    }

    public double getKilometrosRecorridos() {
        return kilometrosRecorridos;
    }

    public void setKilometrosRecorridos(double kilometrosRecorridos) {
        this.kilometrosRecorridos = kilometrosRecorridos;
    }

    public double getTiempoHoras() {
        return tiempoHoras;
    }

    public void setTiempoHoras(double tiempoHoras) {
        this.tiempoHoras = tiempoHoras;
    }

    @Override
    public String toString() {
        return "Ciclista{" +
                "kilometrosRecorridos=" + kilometrosRecorridos +
                ", tiempoHoras=" + tiempoHoras +
                '}';
    }

    @Override
    public double calcularRendimiento() {
        double rendimiento = kilometrosRecorridos/tiempoHoras;
        return rendimiento;
    }

    @Override
    public String clasificarNivel() {
        if (rendimiento < 30){
            String clasificacion = "Básico";
        } else if (30 < rendimiento < 70) {
            clasificacion = "Competente";
        } else if (rendimiento > 70) {
            clasificacion = "Elite";
        }
        return clasificacion;


    }

    @Override
    public void calcularBono() {

    }


}
