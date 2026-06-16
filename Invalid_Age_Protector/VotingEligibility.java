package Invalid_Age_Protector;

public class VotingEligibility {

    public static void checkEligibility(int age)
            throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException(
                    "You must be at least 18 years old.");
        }

        System.out.println("Eligible for voting.");
    }

    public static void main(String[] args) {

        int age = 16;

        try {
            checkEligibility(age);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
