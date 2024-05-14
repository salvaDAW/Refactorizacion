
/**
 *
 * @author Salvador Campoy Ramos
 * @version 1.0
 * @since 14-05-2024
 */
public class PracticaRefactorizacion {

    public static void calculate(int a, int b) {
        final int suma = a + b;
        System.out.println("Suma of a and b: " + suma);
        final int diferencia = a - b;
        System.out.println("Diferencia of a and b: " + diferencia);
        final int producto = a * b;
        System.out.println("Producto of a and b: " + producto);
        final int cociente = a / b;
        System.out.println("Cociente of a and b: " + cociente);
    }
    
        static final int magicNumber = 10;

    public static void main(String[] args) {
        int[] nums = new int[magicNumber];
        
        for (int i = 0; i < magicNumber; i++) {
            nums[i] = (int) (Math.random() * 100) + 1;
        }
        int sum = 0;
        for (int i = 0; i < magicNumber; i++) {
            if (nums[i] % 2 == 0) {
                sum += nums[i] * 3;
            } else {
                sum += nums[i] * 2;
            }
        }
        System.out.println("Suma de los números pares e impares multiplicados "
                + "por 3 y 2 respectivamente: " + sum);

    }
}
