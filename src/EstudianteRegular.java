class EstudianteRegular extends Estudiante {
    private int numeroMaterias;
    public EstudianteRegular(int numeroMaterias, String codigo, String nombre, double promedio, double valorMatricula) {
        super(codigo, nombre, promedio, valorMatricula);
        setNumeroMaterias(numeroMaterias);
    }

    public void setNumeroMaterias(int numeroMaterias) {
        if (numeroMaterias > 0) {
            this.numeroMaterias = numeroMaterias;
        } else {
            System.out.println("Número de materias inválido");
        }
    }

    @Override
    public double calcularPagoFinal() {
        return getValorMatricula() + (numeroMaterias * 10);
    }

}