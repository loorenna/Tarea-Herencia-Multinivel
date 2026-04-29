abstract class Estudiante {
    private String codigo;
    private String nombre;
    private double promedio;
    private double valorMatricula;

    public Estudiante(String codigo, String nombre, double promedio, double valorMatricula) {
        setCodigo(codigo);
        setNombre(nombre);
        setPromedio(promedio);
        setValorMatricula(valorMatricula);
    }

    public void setCodigo(String codigo) {
        if (codigo != null && !codigo.isBlank()) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido");
        }
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.isBlank()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre inválido");
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0 && promedio <= 10) {
            this.promedio = promedio;
        } else {
            System.out.println("Promedio inválido");
        }
    }

    public void setValorMatricula(double valorMatricula) {
        if (valorMatricula > 0) {
            this.valorMatricula = valorMatricula;
        } else {
            System.out.println("Valor de matrícula inválido");
        }
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Promedio: " + promedio);
        System.out.println("Matrícula: " + valorMatricula);
    }

    public boolean validarPromedio() {
        return promedio >= 0 && promedio <= 10;
    }

    public abstract double calcularPagoFinal();

    public double calcularPagoFinal(double descuentoExtra) {
        return calcularPagoFinal() - descuentoExtra;
    }

}