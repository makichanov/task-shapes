package by.epam.taks03.reader;

import by.epam.taks03.exception.ShapeException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TetrahedronReader {

    private static final Logger LOG = LogManager.getLogger(TetrahedronReader.class);

    public List<String> read(File file) throws ShapeException {
        try(BufferedReader reader = new BufferedReader(new FileReader(file))) {
            List<String> lines = reader
                    .lines()
                    .collect(Collectors.toList());
            LOG.info(String.format("Read %d lines from file %s", lines.size(), file.getName()));
            return lines;
        } catch (FileNotFoundException e) {
            throw new ShapeException("Cannot read data from file: no such file");
        } catch (IOException e) {
            throw new ShapeException("Cannot read data from file");
        }
    }

}
