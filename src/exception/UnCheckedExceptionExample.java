package exception;


// example of Un chacked exception with multiple catch block
public class UnCheckedExceptionExample {

    public static void main(String[] args) {

        Integer[] numerators = {10, 200, 30, null, 8};
        Integer[] denominators = {1, 0, null, 4, 9};
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(divide(numerators[i], denominators[i]));
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array Index out of bound :"+e.getLocalizedMessage());

            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        System.out.println("Good Job :");
    }

    public static int divide(Integer a, Integer b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception  :" + e.getLocalizedMessage());
            return -1;
        } catch (NullPointerException e) {
            System.out.println("Null Pointer Exception :" + e.getLocalizedMessage());
            return -1;
        } catch (Exception e) {
            System.out.println("Exception :" + e.getLocalizedMessage());
            return -1;
        }
    }

}
