public class DigiSchool {
    public static void main(String[] args) {

        int[] array = {6, 6, 8, -7, -8, 0, 88, -15, 20, 33, 95};

        boolean isActive = true;
        int countOfNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                countOfNegative++;
            } else if (array[i] == 0) {
                System.out.println("zero");
                isActive = false;
            }
        }

        if (isActive) System.out.println(countOfNegative % 2 == 0);
        System.out.println("************************************");

        int[][] arr = {
                {10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19},
                {20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29},
                {30, 31, 32, 33, 34},
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j < arr.length && i <= j)
                    System.out.print(arr[i][j] + " ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j < arr.length && i >= j)
                    System.out.print(arr[i][j] + " ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j >= arr.length - 1 && i >= j)
                    System.out.print(arr[i][j] + " ");
                else System.out.print("   ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i + j >= arr.length - 1 && i <= j)
                    System.out.print(arr[i][j] + " ");
                else System.out.print("   ");
            }
            System.out.println();
        }

    }
}