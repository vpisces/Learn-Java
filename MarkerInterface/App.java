package MarkerInterface;

public class App {
    public static void main(String[] args) {
        DiscountUtils discountUtils = new DiscountUtils();
        boolean returnValStudent = discountUtils.isDiscountEligible(new Student());
        System.out.println(returnValStudent);

        boolean returnValEmployee = discountUtils.isDiscountEligible(new Employee());
        System.out.println(returnValEmployee);
    }
}
