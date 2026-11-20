
public class GraficoCircular extends GeneradorGrafico {

    public GraficoCircular(java.util.List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {

        if (!validarDatos()) {
            return;
        }

        double total = 0;

        for (double dato : datos) {

            if (dato < 0) {
                System.out.println("Error: los datos no pueden ser negativos.");
                return;
            }

            total += dato;
        }

        if (total == 0) {
            System.out.println("Error: el total de datos no puede ser cero.");
            return;
        }

        System.out.println("=== GRAFICO CIRCULAR ===");

        for (int i = 0; i < datos.size(); i++) {

            double porcentaje = (datos.get(i) / total) * 100;

            System.out.printf(
                    "Dato %d: %.2f%%%n",
                    i + 1,
                    porcentaje
            );
        }
    }
}
