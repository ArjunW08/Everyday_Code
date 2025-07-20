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
     * 
     * return can only be one time from the function
     * 
     * Some Math Library Methods: 
     * 1. Math.min
     * 2. Math.max
     * 3. Math.sqrt
     * 4. Math.pow
     * 5. Math.abs
     * 6. Math.random[b/w 0 and 1]
     * 7. Math.floor
     * 8. Math.ceil
     * 9. Math.round
     */
    public static void main(Strings[] args) {
        greet();
        average(23, 27);

        System.out.println(Math.min(2, 3));
        System.out.println(Math.random()*6);
        System.out.println(Math.round(2.34));
    }

    static void greet(){
        System.out.println("Good Morning");
    }

    public static void average(int a, int b){
        System.out.println((a+b)/2);
    }
}
