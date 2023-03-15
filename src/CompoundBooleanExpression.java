public class CompoundBooleanExpression {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;

        if((a || b) && !(a && b)) // ( T )
            System.out.println("true");
        else
            System.out.println("false");
    }
}
