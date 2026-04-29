class BecadoExcelencia extends EstudianteBecado {
    private double bonoExcelencia;
    public BecadoExcelencia(double bonoExcelencia, double porcentajeBeca, String codigo, String nombre, double promedio, double valorMatricula) {
        super(porcentajeBeca, codigo, nombre, promedio, valorMatricula);
        setBonoExcelencia(bonoExcelencia);
    }

    public void setBonoExcelencia(double bonoExcelencia) {
        if (bonoExcelencia > 0) {
            this.bonoExcelencia = bonoExcelencia;
        } else {
            System.out.println("Bono inválido");
        }
    }

    @Override
    public double calcularPagoFinal() {
        double pago = super.calcularPagoFinal() - bonoExcelencia;
        if (pago < 0) {
            pago = 0;
        }
        return pago;
    }

}