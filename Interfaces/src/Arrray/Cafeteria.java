package Arrray;
import java.security.SecureRandom;
public class Cafeteria {
    static int generanRespuestas(int n){
        SecureRandom random =new SecureRandom();
        return 1 + random.nextInt(n);
    }

    public static void main(String[] args) {
        final int CANT_ALUMNOS=30;
        int[] calificaciones = new int[6];

        for (int i =0; i< CANT_ALUMNOS;i++){
            calificaciones[generanRespuestas(  5)]+=1;
        }

        System.out.println("Se recibieron "+CANT_ALUMNOS+"respuestas");
        System.out.println("Alunnos"+ "Calificacion"+"Frecuencia");
for (int i =0 ; i < calificaciones.length; i++){
    System.out.println(""+i+calificaciones[i]);
        }
    }

}
