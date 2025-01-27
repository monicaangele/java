package material;

public class Material {

	public static void main(String[] args) {
		String[] array1 = {"apple", "banana", "cherry", "date"};

        System.out.println("The 3rd item in the array is: " + array1[2]);

        array1[1] = "blueberry";
        System.out.println("The new value of the 2nd item is: " + array1[1]);

        System.out.println("The length of the array is: " + array1.length);

        System.out.println("Looping through the array:");
        for (String item : array1) {
            System.out.println(item);
        }

        String[] array2 = {"elephant", "frog", "giraffe", "hippo"};
        String[][] multiArray = {array1, array2};

        System.out.println("Looping through the multidimensional array:");
        for (String[] singleArray : multiArray) {
            for (String element : singleArray) {
                System.out.println(element);
            }
        }
    }
}