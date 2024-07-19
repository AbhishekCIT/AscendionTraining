package labEx5;

public class LearningModule {
    private AgeValidator ageValidator;

    public LearningModule() {
        this.ageValidator = new AgeValidator();
    }

    public String getLearningCode(String name, int age) throws WrongInputException {
        try {
            String ageCode = ageValidator.getAgeCode(age);
            return name +" "+ ageCode;
        } catch (InvalidAgeException e) {
            throw new WrongInputException("Invalid age input: " + e.getMessage(), e);
        }
    }
}
