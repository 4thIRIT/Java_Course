package Phase1_oops;

public class Customer {
    private String name;
    private String email;

    void initialize(String em, String nm)
    {
        if (em.contains("@"))
            email = em;
        else
            email = "Provide a valid Email Address";

        name = nm;
    }

    String displayName()
    {
        return "Welcome "+ name;
    }

    String displayEmail()
    {
        return email;
    }
}
