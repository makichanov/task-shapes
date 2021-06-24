package by.epam.taks03.parser;

import by.epam.taks03.exception.ShapeException;
import by.epam.taks03.validator.TetrahedronValidator;

public class TetrahedronParser {

    private final String ELEMENT_DELIMITER = "\\s+";
    private static final String NUMBER_REGEX = "\\d+";

    public double[] parseTetrahedron(String tetrahedronLine) throws ShapeException {
        if (!TetrahedronValidator.isValid(tetrahedronLine)) {
            throw new ShapeException("Passed line is not valid");
        }
        String[] numbersArray = tetrahedronLine.split(ELEMENT_DELIMITER);
        double[] params = new double[numbersArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            params[i] = Double.parseDouble(numbersArray[i]);
        }
        return params;
    }
}
