class PatrullaPolicia extends Sedan implements Emergencia {
    // Constructor
    public PatrullaPolicia(String nombre, int maxPasajeros, int maxVelocidad) {
        super(nombre, (short) maxPasajeros, maxVelocidad);
    }

    // Métodos de Emergencia
    @Override
    public String sonarSirena() {
        return "Sonando sirena de la patrulla policial.";
    }

    @Override
    public int getVolumen() {
        return VOLUMEN;
    }

    // Este método genera un error porque VOLUMEN es final
    public void setVolumen() {
        // Emergencia.VOLUMEN++; // Comentado porque no se puede modificar una constante.
    }

    // Sobrescribir el método toString
    @Override
    public String toString() {
        return "PatrullaPolicia{" +
               "nombre='" + getNombre() + '\'' +
               ", maxPasajeros=" + getMaxPasajeros() +
