
public class GraficoBarras extends GeneradorGrafico {

    public GraficoBarras(java.util.List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {

        if (!validarDatos()) {
            return;
        }

        System.out.println("=== GRAFICO DE BARRAS ===");

        for (int i = 0; i < datos.size(); i++) {

            System.out.print("Dato " + (i + 1) + ": ");

            for (int j = 0; j < datos.get(i); j++) {
                System.out.print("#");
            }

            System.out.println(" (" + datos.get(i) + ")");
        }
    }
}
