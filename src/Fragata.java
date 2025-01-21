class Fragata implements VehiculoAgua {
    private String nombre;
    private int maxPasajeros;
    private int maxVelocidad;

    // Constructor por defecto
    public Fragata() {
        this("Fragata Genérica", 50, 30);
    }

    // Constructor con parámetros
    public Fragata(String nombre, int maxPasajeros, int maxVelocidad) {
        this.nombre = nombre;
        this.maxPasajeros = maxPasajeros;
        this.maxVelocidad = maxVelocidad;
    }

    // Métodos de Vehiculo
    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getMaxPasajeros() {
        return this.maxPasajeros;
    }

    @Override
    public int getMaxVelocidad() {
        return this.maxVelocidad;
    }

    // Métodos de VehiculoAgua
    @Override
    public String soltarAmarras() {
        return "Amarras de la fragata soltadas.";
    }
}
