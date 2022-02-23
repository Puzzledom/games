package com.sssyayayiooo.games.latinsquare;

/**
 * A Latin Square is a n x n grid filled by n distinct numbers
 * each appearing exactly once in each row and column.
 * <p>
 * Given an input n, we have to print a n x n matrix consisting of numbers
 * from 1 to n each appearing exactly once in each row and each column.
 * <p>
 * Input: 4, 2
 * Output:
 * 2 3 4 1
 * 3 4 1 2
 * 4 1 2 3
 * 1 2 3 4
 */
public class LatinSquare {

    int[][] mat;
    int[][][] candidates;
    int N; // number of columns/rows. i.e.,4
    int K; // starting integer on square. i.e.,2
    int M; // number of sub-matrix to split. i.e.,2

    // Constructor
    LatinSquare(int N, int K, int M) {
        this.N = N;
        this.K = K;
        this.M = M;
        this.mat = new int[N][N];
        this.candidates = new int[M][N][N];
    }

    // Generator
    public void generate() {
        // Fill and print
        fill();
        print(mat);

        System.out.println("Now split into " + M + " matrix");

        // Split and print
        split();
        for (int k = 0; k < M; k++) {
            print(candidates[k]);
        }
    }

    private void fill() {
        int first = K; // starting integer on square
        int order = N; //max integer

        for (int row = 0; row < order; row++) {
            for (int column = 0; column < order; column++) {
                int latin = (row + column + first - 1) % order + 1;
                mat[row][column] = latin;
            }

        }
    }

    private void split() {
        // Randomly split into M matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Randomly pick one of M matrix to fill in
                int k = (int) Math.floor((Math.random() * M)); // [0 - M)
                candidates[k][i][j] = mat[i][j];
            }
        }
    }

    // Print
    public void print(int[][] mat) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (mat[i][j] != 0) {
                    System.out.print(mat[i][j] + " ");
                } else {
                    System.out.print("-" + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        LatinSquare square = new LatinSquare(8, 2, 3);
        square.generate();
    }
}
