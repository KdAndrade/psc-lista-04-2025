public class NumerosComArray {
    public static void main(String[] args) {
        
        int[] numeros = new int[20];
        
        for (int i = 0; i < 20; i++) {
            numeros[i] = i + 1; 
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);  
        }
        
        System.out.println();
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " "); 
        }
    }
}
