public abstract class Atleta {
    protected String nombre;
    protected int edad;
    protected double horasEntrenamiento;

    public Atleta() {
    }

    public Atleta(String nombre, int edad, double horasEntrenamiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.horasEntrenamiento = horasEntrenamiento;
    }

    public void mostrarInfo(){
        System.out.println("JUGADOR: " + nombre);
        System.out.println("EDAD: " + edad);
        System.out.println("HORAS DE ENTRENAMIENTO: " + horasEntrenamiento);

    }



    public void mostrarDatos (){
    }

    public abstract double calcularRendimiento();
}
