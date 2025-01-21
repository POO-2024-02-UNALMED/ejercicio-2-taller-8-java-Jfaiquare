class Aerodeslizador implements VehiculoTierra, VehiculoAgua {
    private String nombre;
    private int maxPasajeros;
    private int maxVelocidad;
    private int numeroRuedas;

    // Constructor por defecto
    public Aerodeslizador() {
        this("Aerodeslizador Genérico", 4, 80);
    }

    // Constructor con parámetros
    public Aerodeslizador(String nombre, int maxPasajeros, int maxVelocidad) {
        this.nombre = nombre;
        this.maxPasajeros = maxPasajeros;
        this.maxVelocidad = maxVelocidad;
        this.numeroRuedas = 0;
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

    // Métodos de VehiculoTierra
    @Override
    public int getNumeroRuedas() {
        return this.numeroRuedas;
    }

    @Override
    public void agregarRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    @Override
    public String conducir() {
        return "El aerodeslizador está siendo conducido en tierra.";
    }

    // Métodos de VehiculoAgua
    @Override
    public String soltarAmarras() {
        return "Amarras del aerodeslizador soltadas.";
    }
}
