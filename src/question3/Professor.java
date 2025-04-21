package question3;

public class Professor extends Staff{
    public Professor(String name, String address, String school, double pay) {
        super(name, address, school, pay);
    }

    @Override
    public String displayInfo() {
        return "Professor [" + super.displayInfo() + "]";
    }
}
