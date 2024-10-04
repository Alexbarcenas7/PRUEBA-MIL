public class Main {
    public static void main(String[] args) {
        // Entrada
        String cadena = "Correo: juan.perez@empresa.com\nFecha de ascenso: 2023-04-15\nSalario: 50000.75";

        // Extracción de datos
        String correo = cadena.substring(cadena.indexOf("Correo: ") + 8, cadena.indexOf("\nFecha de ascenso:"));
        String fechaAscenso = cadena.substring(cadena.indexOf("Fecha de ascenso: ") + 18, cadena.indexOf("\nSalario:"));
        String salario = cadena.substring(cadena.indexOf("Salario: ") + 9);

        // Invertir el nombre de usuario del correo
        int indiceArroba = correo.indexOf("@");
        String usuarioInvertido = new StringBuilder(correo.substring(0, indiceArroba)).reverse().toString();
        String correoCifrado = usuarioInvertido + correo.substring(indiceArroba);

        // Sumar componentes de la fecha
        String[] partesFecha = fechaAscenso.split("-");
        int sumaFecha = Integer.parseInt(partesFecha[0]) + Integer.parseInt(partesFecha[1]) + Integer.parseInt(partesFecha[2]);

        // Proceso del salario
        String[] partesSalario = salario.split("\\.");
        int diferencia = Math.abs(Integer.parseInt(partesSalario[0]) - Integer.parseInt(partesSalario[1]));
        double salarioCifrado = diferencia * 2.0;

        // Salida
        System.out.println(correoCifrado + "|" + sumaFecha + "|" + salarioCifrado);
    }
}
