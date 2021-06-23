package by.epam.taks03.factory;

import by.epam.taks03.entity.Shape;
import by.epam.taks03.exception.ShapeException;

public abstract class ShapeFactory {
    public abstract Shape crete(String name, double ... coordinates);
}
