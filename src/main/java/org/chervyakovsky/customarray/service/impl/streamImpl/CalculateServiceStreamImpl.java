package org.chervyakovsky.customarray.service.impl.streamImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.chervyakovsky.customarray.entity.CustomArray;
import org.chervyakovsky.customarray.exception.CustomException;
import org.chervyakovsky.customarray.service.CalculateService;

import java.util.Arrays;

public class CalculateServiceStreamImpl implements CalculateService {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public int sumArrayElements(CustomArray customArray) throws CustomException {
        LOGGER.info("Method to calculate sum of array start");
        if (customArray == null) {
            throw new CustomException("Array can not be NULL");
        }
        int[] array = customArray.getArray();
        return Arrays.stream(array).sum();
    }

    @Override
    public double averageArrayElements(CustomArray customArray) throws CustomException {
        LOGGER.info("Method to calculate average value start");
        if (customArray == null) {
            throw new CustomException("Array can not be NULL");
        }
        int[] array = customArray.getArray();
        return Arrays.stream(array).average().getAsDouble(); // FIXME

    }

    @Override
    public int determineAmountNegDigit(CustomArray customArray) throws CustomException {
        LOGGER.info("Method to count amount of negative elements in array start");
        if (customArray == null) {
            throw new CustomException("Array can not be NULL");
        }
        int[] array = customArray.getArray();
        return (int) Arrays.stream(array).filter(x -> x < 0).count();
    }

    @Override
    public int determineAmountPosDigit(CustomArray customArray) throws CustomException {
        LOGGER.info("Method to count amount of positive elements in array start");
        if (customArray == null) {
            throw new CustomException("Array can not be NULL");
        }
        int[] array = customArray.getArray();
        return (int) Arrays.stream(array).filter(x -> x < 0).count();
    }
}
