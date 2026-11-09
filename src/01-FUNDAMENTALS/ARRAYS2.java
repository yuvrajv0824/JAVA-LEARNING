import java.util.Arrays;

public class ARRAYS2 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40, 50};
//enhanced for loop(for each)
        // for( dt var:arr var)
        //for each/enhaced for used as read array elements
        for (int number : num) {
            System.out.println(number);
        }
        // note for each is unoffical name and its offical is enhanced for loop


        //jagged traversal array
        int[][] jagged = {
                {10, 20, 30},
                {40, 50},
                {60, 70, 80, 90}
        };
        /*
        Remember:
- jagged.length = number of rows.
- jagged[i].length = number of elements in the current row.
         */

        //Arrays.equals() =method

        int[] a = {10, 20, 30};
        int[] b = {10, 50, 60};
        int[] c = {10, 20, 30};
        System.out.println(Arrays.equals(a, b));
        //check if both arrays elements are same value or not
        System.out.println(Arrays.equals(a, c));

        //Arrays.fill() method =used to fill out array with same value into all elements
        int marks[] = new int[5];
        System.out.println("before fill method:" + Arrays.toString(marks));
        //int default is zero 0 so
        //Arrays.fill(arr name,value);
        Arrays.fill(marks, 69);
        System.out.println("after fill method:" + Arrays.toString(marks));
        //Arrays.copyof();=used to copy org arr values into 2nd arr and aldo decide size of arr too
        int[] org = new int[3];
        int[] cpy = Arrays.copyOf(org, 4);
        System.out.println("cpy method 1" + Arrays.toString(cpy));
        //Arrays.copyOf(org arr,size of arr)
        // can change 2nd arry size too so
        /*
int[] original = {10, 20, 30};
int[] copy;
copy = Arrays.copyOf(original, 3);    is both same ways to assign copy values
         */
        int[] copy = new int[3];

        copy = Arrays.copyOf(org, 3);
        System.out.println("cpy method 2" + Arrays.toString(copy));


        //What happens? when
        //The old contents of copy are replaced by a reference to the newly created array.
        int[] original = {10, 20, 30};
        int[] copyy = {30, 40, 50};

        copyy = Arrays.copyOf(original, 3);
        //replaced old values with new values
        System.out.print("cpy method 3" + Arrays.toString(copyy));
        System.out.print("traversal");

        // Traditional 1D array traversal
        // int[] num = {10, 20, 30, 40, 50};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

// Normal 2D array traversal
        int[][] matrix = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for (int i = 0; i < matrix.length; i++) //i outer
        {
            for (int j = 0; j < matrix[i].length; j++)//j  inner
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


// Jagged array traversal
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();

        }

        // 1. Reversing a 1D Array (In-Place using Two-Pointers)
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("1D Before Reverse: " + Arrays.toString(arr));
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = temp;
        }
        System.out.println("1D After Reverse: " + Arrays.toString(arr)); // [5, 4, 3, 2, 1]


        // 2. Reversing a 2D Array (Reversing the Rows)
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Rows Before Reverse: " + Arrays.deepToString(matrix2));

        int top = 0, bottom = matrix2.length - 1;
        while (top < bottom) {
            int[] temp = matrix2[top];
            matrix2[top++] = matrix2[bottom];
            matrix2[bottom--] = temp;
        }
        System.out.println("2D Rows After Reverse: " + Arrays.deepToString(matrix2)); // [[7, 8, 9], [4, 5, 6], [1, 2, 3]]


        // 3. Reversing Every Row Inside a 2D Array
        int[][] matrix3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("2D Elements Before Reverse: " + Arrays.deepToString(matrix3));

        for (int i = 0; i < matrix3.length; i++) {
            int rowLeft = 0, rowRight = matrix3[i].length - 1;
            while (rowLeft < rowRight) {
                int temp = matrix3[i][rowLeft];
                matrix3[i][rowLeft++] = matrix3[i][rowRight];
                matrix3[i][rowRight--] = temp;
            }
        }
        System.out.println("2D Elements After Reverse: " + Arrays.deepToString(matrix3)); // [[3, 2, 1], [6, 5, 4], [9, 8, 7]]
    }// fixed rebased issue
}