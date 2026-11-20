
public class GraficoLineal extends GeneradorGrafico {

    public GraficoLineal(java.util.List<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {

        if (!validarDatos()) {
            return;
        }

        System.out.println("=== GRAFICO LINEAL ===");

        for (int i = 0; i < datos.size(); i++) {

            System.out.print("Dato " + (i + 1) + ": ");

            int valor = (int) Math.round(datos.get(i));

            for (int j = 0; j < valor; j++) {
                System.out.print("-");
            }

            System.out.println("* (" + datos.get(i) + ")");
        }
    }
}
