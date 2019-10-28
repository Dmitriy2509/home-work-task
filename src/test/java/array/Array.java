package array;

public class Array {
    public static void main(String[] args) {
        int [] array = new int [5];
        int [] salary = {1, 3, 5 , 6456, 674, -45 };

        System.out.println("Salary length: "+ salary.length);

        int elementTwo = salary[1];
        System.out.println("elementTwo: " + elementTwo);
        System.out.println("salary: " + salary); //isn't displayed

        array[2]= 2;
        int elementThree = array [2];
        System.out.println("ElementThree " + elementThree);



    }
}
