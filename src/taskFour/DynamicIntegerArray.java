package taskFour;

public class DynamicIntegerArray {
    int[] array = new int[6];

    public static void remove(int value) {
        int[] array = {5, 8, 24, 91, 69};
        int numbersOfValues = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                numbersOfValues++;
            }
        }
        int[] arr = new int[array.length - numbersOfValues];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != value) {
                arr[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeAt(int indexOfElement) {
        int[] array1 = {15, 48, 94, 69, 5};
        int[] array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
            if (i != indexOfElement) {
                array2[i] = array2[i + 1];
            } else
                return array2[indexOfElement];
        }
        return array1[indexOfElement];

    }

    public static void addInt(int element) {
        int[] array1 = {21, 82, 94, 24, 7, 6};
        int[] array2 = new int[array1.length + 1];
        for (int i = 0; i < array1.length; i++) {
            array2 = array1;
        }
        array2[array2.length - 1] = element;
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
    }

    public static void addAt(int index, int value) {
        int[] array = {1, 8, 35, 96, 4};
        int[] arr = new int[array.length + 1];
        if (index > arr.length) {
            System.out.println("it is error");
        } else {
            for (int i = 0; i < index; i++) {
                arr[i] = array[i];
            }
            arr[index] = value;
            for (int i = 0; i < array.length; i++) {
                arr[i + 1] = array[i];
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}
