                                                              SYMMETRIC OR NOT
  
class matrixx {
    public static void main(String args[]) {
        int ar[][] = {{ 6 , 1 , 2 }, {5 , 0 , 9 }, { 2 , 9 , 3 }};
        int i, j, flag = 1;
        int tr[][] = new int[3][3];
        System.out.println("printing matrix before transpose:");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                System.out.print(ar[i][j] + "");
            }
            System.out.println();


        }
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                tr[i][j] = ar[j][i];
            }
        }
        System.out.println("printing matrix after transpose:");
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {
                System.out.print(tr[i][j] + "");
            }
            System.out.println();
        }
        for (i = 0; i < 3; i++) {

            for (j = 0; j < 3; j++) {
                if (ar[i][j] != tr[i][j]) {
                    flag = 0;
                    break;
                }
            }
        }
        if (flag == 0) {
            System.out.println("Matrix is not symmetric");

        } else {
            System.out.println("matrix is symmetric");
        }
    }
}

OUTPUT

mlm@mlm-desktop:~/Desktop/Rojin/java$ javac matrixx.java
mlm@mlm-desktop:~/Desktop/Rojin/java$ java matrixx
printing matrix before transpose:
612
509
293
printing matrix after transpose:
652
109
293
Matrix is not symmetric