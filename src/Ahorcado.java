import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        //Clase Scanner
        Scanner scanner = new Scanner(System.in);

        //Asignaciones
        String palabraSecreta = "developer";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de control: Iterativa(Bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
            //System.out.print(letrasAdivinadas[i]);
        }
        
        //Estructura de control: Iterativa(Bucle)
        while (!palabraAdivinada && intentos<intentosMaximos) {
            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas) + " (" + palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");

            //Clase Scanner
           //char letra = scanner.next().charAt(0); // tomamos la primera letra que escriba la persona
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("Letra incorrecta , te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta" + palabraSecreta  + "\n");
            }
        }

        if(!palabraAdivinada){
            System.out.println("Te quedaste sin intentos , GAME OVER!!" + "\n");
        }
        scanner.close();

    }
}
