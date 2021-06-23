package by.epam.taks03.validator;

public class TetrahedronValidator {

    private static final String ELEMENT_DELIMITER = "\\s";
    private static final String NUMBER_REGEX = "\\d+";

    private TetrahedronValidator() {}

    public static boolean isValid(String tetrahedronLine) {
        String[] numbersArray = tetrahedronLine.split(ELEMENT_DELIMITER);
        for (String number : numbersArray) {
            if (!number.matches(NUMBER_REGEX)) {
                return false;
            }
        }
        return true;
    }
}
