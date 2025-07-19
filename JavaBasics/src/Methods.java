public class Methods {

    /*
     * Method is a block of code or collection of statements or a set 
     * of code grouped together to perform a certain task or
     * operation. It is used to achieve the reusability of code.
     * 
     * public : Access Modifiers
     * static 
     * void : retrun type
     * main : method name
     * String[] args : parameter list
     * 
     * Method called within the main method should also be static method.
     * 
     * Method Parameters : A method parameter is a value accepted
     * by the method. As mentioned earlier, a method can also have 
     * any number of parameters.
     */
    public static void main(String[] args) {
        greet();
        average(23, 27);
    }

    static void greet(){
        System.out.println("Good Morning");
    }

    public static void average(int a, int b){
        System.out.println((a+b)/2);
    }
}
