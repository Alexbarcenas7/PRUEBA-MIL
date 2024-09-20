import java.util.Scanner;

class DistanciaYAngulo{


        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Solicitar coordenadas del primer punto
                System.out.print("Ingresa la coordenada x del primer punto:2 ");
                double x1 = scanner.nextDouble();
                System.out.print("Ingresa la coordenada y del primer punto:3 ");
                double y1 = scanner.nextDouble();

                // Solicitar coordenadas del segundo punto
                System.out.print("Ingresa la coordenada x del segundo punto:5 ");
                double x2 = scanner.nextDouble();
                System.out.print("Ingresa la coordenada y del segundo punto:7 ");
                double y2 = scanner.nextDouble();

                // Calcular la distancia
                double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

                // Calcular el ángulo en radianes
                double anguloRadianes = Math.atan2(y2 - y1, x2 - x1);

                // Convertir el ángulo a grados
                double anguloGrados = Math.toDegrees(anguloRadianes);

                // Mostrar los resultados
                System.out.println("La distancia entre los puntos es: " + distancia);
                System.out.println("El ángulo entre la línea y el eje x (en radianes) es: " + anguloRadianes);
                System.out.println("El ángulo entre la línea y el eje x (en grados) es: " + anguloGrados);

                
                scanner.close();
        }
}
