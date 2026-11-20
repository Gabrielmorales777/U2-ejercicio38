
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> datos = new ArrayList<>();

        datos.add(5.0);
        datos.add(8.0);
        datos.add(3.0);
        datos.add(10.0);
        datos.add(6.0);

        List<GeneradorGrafico> graficos = new ArrayList<>();

        graficos.add(new GraficoBarras(datos));
        graficos.add(new GraficoCircular(datos));
        graficos.add(new GraficoLineal(datos));

        System.out.println("SISTEMA DE GRAFICOS ESTADISTICOS");

        for (GeneradorGrafico grafico : graficos) {

            System.out.println();

            grafico.renderizarGrafico();
        }
    }
}

