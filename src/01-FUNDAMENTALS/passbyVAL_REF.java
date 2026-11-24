public class passbyVAL_REF {
    public static void main(String[] args) {
                /*
                 * CORE RULE:
                 * Java is always pass-by-value.
                 * It never gives a method direct control over the caller's variable.
                 *
                 * The only question is: what value is copied?
                 * 1. Primitive (int, double, char, boolean): the actual data is copied.
                 * 2. Array/Object: the reference value is copied.
                 *
                 * A reference is like an address that lets a variable find an object or array.
                 */

                // ================================================================
                // 1. PRIMITIVE: Java copies the number itself.
                // ================================================================
                int number = 10;
                // number contains 10.

                changePrimitive(number);
                // A new local variable named value received a copy: value = 10.
                // Changing value cannot change number.

        // in pass by value inside val of method cant be used outside,so it print 10 which outside value
                System.out.println("Original primitive: " + number); // 10

                // ================================================================
                // 2. ARRAY CONTENT: Java copies the reference value.
                // ================================================================
                int[] numbers = {10, 20, 30};
                // numbers holds a reference that points to this one array in memory.

                changeArrayContent(numbers);
                // The parameter array received a COPY of the reference.
                // Both numbers and array point to the SAME array.
                // Therefore array[0] = 99 changes the shared array.

                System.out.println("Array after content change: " + numbers[0]); // 99

                // ================================================================
                // 3. ARRAY REASSIGNMENT: changing the local reference only.
                // ================================================================
                replaceArray(numbers);
                // The parameter array was redirected to a new array {1, 2, 3}.
                // numbers was NOT redirected; it still points to the old array.

                System.out.println("Array after reference reassignment: " + numbers[0]); // 99
            }
    // Method 1 changes the original array because it does not create a new array.
// Method 2 creates a new array, but only its local parameter accesses it.
// The original numbers array is unchanged by Method 2, so numbers[0] remains 99.

            // value is a formal parameter. It receives a COPY of actual argument number.
            public static void changePrimitive(int value) {
                value = 50;
                // Only local value changes from 10 to 50.
                System.out.println("Inside method primitive: " + value); // 50
            }

            // array is a formal parameter. It receives a COPY of the reference in numbers.
            public static void changeArrayContent(int[] array) {
                // array and numbers both reach the same array, so this changes its content.
                array[0] = 99;
            }

            // array receives a COPY of the reference in numbers.
            public static void replaceArray(int[] array) {
                // This changes only local array, making it point to a NEW array.
                // It does not change the caller variable numbers.
                array = new int[]{1, 2, 3};
                System.out.println("Inside method new array: " + array[0]); // 1

                // In array/object reference passing, the method receives a copy of the reference.
// Both the original variable and method parameter access the same array.
// So changing an array element inside the method changes the original array too.
// Therefore, numbers[0] prints 99 because array[0] was changed to 99 inside the method.
    }
        }
