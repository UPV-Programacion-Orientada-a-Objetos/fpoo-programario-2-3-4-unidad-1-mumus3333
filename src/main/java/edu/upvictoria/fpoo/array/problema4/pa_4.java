package edu.upvictoria.fpoo.array.problema4;

public class pa_4 {

    public static int[] calculateInventory(int[] A, int[] B) {
        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            if (B[i] == A[i]) {
                C[i] = A[i];
            } else if (B[i] > A[i]) {
                C[i] = A[i] + 2 * (B[i] - A[i]);
            } else {
                C[i] = B[i];
            }
        }

        return C;
    }

    public void PA_4(){
        int[] A = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int[] B = {5, 25, 35, 20, 60, 70, 80, 90, 95, 110};

        int[] C = new int[10];

        for (int i = 0; i < A.length; i++) {
            if (B[i] == A[i]) {
                C[i] = A[i];
            } else if (B[i] > A[i]) {
                C[i] = A[i] + 2 * (B[i] - A[i]);
            } else {
                C[i] = B[i];
            }
        }

        System.out.println("Vector C (lo que se requiere comprar para mantener el stock de inventario):");
        for (int i = 0; i < C.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + C[i]);
        }
    }
}
