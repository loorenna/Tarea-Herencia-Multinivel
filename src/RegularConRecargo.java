class RegularConRecargo extends EstudianteRegular {
    private double recargoPendiente;
    public RegularConRecargo(double recargoPendiente, int numeroMaterias,String codigo, String nombre, double promedio, double valorMatricula) {
        super(numeroMaterias, codigo, nombre, promedio, valorMatricula);
        setRecargoPendiente(recargoPendiente);
    }

    public void setRecargoPendiente(double recargoPendiente) {
        if (recargoPendiente >= 0) {
            this.recargoPendiente = recargoPendiente;
        } else {
            System.out.println("Recargo inválido");
        }
    }

    @Override
    public double calcularPagoFinal() {
        return super.calcularPagoFinal() + recargoPendiente;
    }

}