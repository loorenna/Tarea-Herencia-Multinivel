import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Estudiante> lista = new ArrayList<>();

        System.out.println("Ingrese código:");
        String codigo = sc.nextLine();

        System.out.println("Ingrese nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese promedio:");
        double promedio = sc.nextDouble();

        System.out.println("Ingrese valor matrícula:");
        double valor = sc.nextDouble();

        System.out.println("Ingrese porcentaje beca:");
        double porcentaje = sc.nextDouble();

        System.out.println("Ingrese número materias:");
        int numMat = sc.nextInt();

        System.out.println("Ingrese recargo:");
        double recargo = sc.nextDouble();

        Estudiante e1 = new BecadoExcelencia(50, porcentaje, codigo, nombre, promedio, valor);
        Estudiante e2 = new RegularConRecargo(recargo, numMat, codigo, nombre, promedio, valor);

        lista.add(e1);
        lista.add(e2);

        for (Estudiante e : lista) {
            e.mostrarDatos();
            System.out.println("Pago final: " + e.calcularPagoFinal());
            System.out.println("---------------------");
        }
    }
}