public class HelloWorld {
    //This is my Java comment
    /*
	 * This
	 * is
	 * my
	 * multi-
	 * line
	 * comment
	 * 
	 */
    public static void main(String[] args) {
        // 13.08.17 My first program in Java! Oskar Enmalm
        System.out.println("Hello world!");
        System.out.println("*insert something witty*");

        String name;
        String firstName = "Oskar";
        String lastName = "Enmalm";

        name = firstName + "" + lastName;
        System.out.println(name);

        int universityGrade = 1; //declaring and assigning value in the same line
        System.out.println(universityGrade);
        System.out.println(name + name);

        Name.main(args);
    }

}
