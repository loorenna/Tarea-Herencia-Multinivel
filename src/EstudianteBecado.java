class EstudianteBecado extends Estudiante {
    private double porcentajeBeca;
    public EstudianteBecado(double porcentajeBeca, String codigo, String nombre, double promedio, double valorMatricula) {
        super(codigo, nombre, promedio, valorMatricula);
        setPorcentajeBeca(porcentajeBeca);
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        if (porcentajeBeca >= 0 && porcentajeBeca <= 100) {
            this.porcentajeBeca = porcentajeBeca;
        } else {
            System.out.println("Porcentaje de beca inválido");
        }
    }

    @Override
    public double calcularPagoFinal() {
        double descuento = getValorMatricula() * porcentajeBeca / 100;
        return getValorMatricula() - descuento;
    }

}