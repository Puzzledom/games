package com.sssyayayiooo.games.latinsquare;

public class LatinCube {

    int[][][] cube;
    int[][][][] candidates;
    int N; // number of columns/rows. i.e.,4
    int K; // starting integer on square, from 1 to N. i.e.,2
    int M; // number of sub-matrix to split. i.e.,2

    // Constructor
    LatinCube(int N, int K, int M) {
        this.N = N;
        this.K = K;
        this.M = M;
        this.cube = new int[N][N][N];
        this.candidates = new int[M][N][N][N];
    }

    // Generator
    public void generate() {
        // Fill and print
        fill();
        print(cube);

        System.out.println("Now split into " + M + " matrix");

        // Split and print
        split();
        for (int m = 0; m < M; m++) {
            print(candidates[m]);
        }
    }

    private void fill() {
        int first = K; // starting integer on square
        int order = N; //max integer

        for (int row = 0; row < order; row++) { // initialize layer 0
            for (int column = 0; column < order; column++) {
                int latin = (row + column + first - 1) % order + 1;
                cube[row][column][0] = latin;
            }
        }

        for (int layer = 1; layer < order; layer++) { // start from [i][j][1], +/-1 move j
            for (int row = 0; row < order; row++) {
                int shift = (row + layer) % order;
                for (int column = 0; column < order; column++) {
                    cube[row][column][layer] = cube[shift][column][layer - 1];
                }
            }
        }
    }

    private void split() {
        // Randomly split into M matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    // Randomly pick one of M matrix to fill in
                    int m = (int) Math.floor((Math.random() * M)); // [0 - M)
                    candidates[m][i][j][k] = cube[i][j][k];
                }
            }
        }
    }

    // Print
    public void print(int[][][] cube) {
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (cube[i][j][k] != 0) {
                        System.out.print(cube[i][j][k] + " ");
                    } else {
                        System.out.print("-" + " ");
                    }
                }
                System.out.println();
            }
            System.out.println("-------------"); // next layer
        }
        System.out.println("==================="); // next cube
    }

    // Driver code
    public static void main(String[] args) {
        LatinCube square = new LatinCube(4, 1, 3);
        square.generate();
    }
}
