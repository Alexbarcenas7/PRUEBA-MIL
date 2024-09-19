import java.util.ArrayList;
import java.util.List;
import java.util.Random;



    // Método para generar una lista de números aleatorios
    public static List<Double> generarLista(int n, double minVal, double maxVal) {
        List<Double> lista = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            double numero = minVal + (maxVal - minVal) * random.nextDouble();
            lista.add(numero);
        }
        return lista;
    }

    // Método para calcular la raíz cuadrada de cada número en la lista
    public static List<Double> calcularRaizCuadrada(List<Double> lista) {
        List<Double> raicesCuadradas = new ArrayList<>();
        for (Double numero : lista) {
            raicesCuadradas.add(Math.sqrt(numero));
        }
        return raicesCuadradas;
    }

    // Método para elevar cada número al cuadrado
    public static List<Double> elevarAlCuadrado(List<Double> lista) {
        List<Double> cuadrados = new ArrayList<>();
        for (Double numero : lista) {
            cuadrados.add(Math.pow(numero, 2));
        }
        return cuadrados;
    }

    // Método para calcular la media de la lista
    public static double calcularMedia(List<Double> lista) {
        double suma = 0;
        for (Double numero : lista) {
            suma += numero;
        }
        return suma / lista.size();
    }

    // Método para calcular la desviación estándar de la lista
    public static double calcularDesviacionEstandar(List<Double> lista, double media) {
        double sumaCuadrados = 0;
        for (Double numero : lista) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }
        double varianza = sumaCuadrados / lista.size();
        return Math.sqrt(varianza);
    }

    public static void main(String[] args) {
        // Configuración
        int cantidadNumeros = 10;
        double valorMinimo = 1.0;
        double valorMaximo = 100.0;

        // Generación de la lista de números aleatorios
        List<Double> numeros = generarLista(cantidadNumeros, valorMinimo, valorMaximo);

        // Cálculos
        List<Double> raicesCuadradas = calcularRaizCuadrada(numeros);
        List<Double> numerosAlCuadrado = elevarAlCuadrado(numeros);
        double media = calcularMedia(numeros);
        double desviacionEstandar = calcularDesviacionEstandar(numeros, media);

        // Mostrar resultados
        System.out.println("Lista original de números:");
        System.out.println(numeros);
        System.out.println("\nRaíces cuadradas de los números:");
        System.out.println(raicesCuadradas);
        System.out.println("\nNúmeros elevados al cuadrado:");
        System.out.println(numerosAlCuadrado);
        System.out.println("\nMedia de la lista:");
        System.out.println(media);
        System.out.println("\nDesviación estándar de la lista:");
        System.out.println(desviacionEstandar);
    }
}
