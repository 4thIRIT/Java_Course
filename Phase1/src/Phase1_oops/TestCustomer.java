package Phase1_oops;

public class TestCustomer {
    public static void main(String[] args) {
        //Customer c1 = new Customer();
        //c1.email ="nanabrownsnr@gmail.com";
        //c1.name = "NanaBrown";
        //System.out.println(c1.name.toUpperCase());

        Customer c2 = new Customer();
        c2.initialize("nana.brown@vodafone.com","Nana Brown");
        //System.out.println(c2.name);
        //System.out.println(c2.email);

        System.out.println(c2.displayName());
        System.out.println(c2.displayEmail());

    }
}
