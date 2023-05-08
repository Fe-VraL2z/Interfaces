package Arrray;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] Zoo  = new String[3];
        Scanner sc = new Scanner(System.in);


for (int i = 0; i<3; i++){
            System.out.println("Ingresa un animal de la jaula" +i);
Zoo[i] = sc.nextLine();
        }

        System.out.println("Estos son los animales del zoo: ");
for (int i = 0;i <Zoo.length;i++){
    System.out.println(Zoo[i]);
}

for (int i = 0;i<Zoo.length;i++) {
    if (Zoo[i].equals("Domkey")) {
        System.out.println("Hay un Domkey en el Zoo");
    }

}
}
}
