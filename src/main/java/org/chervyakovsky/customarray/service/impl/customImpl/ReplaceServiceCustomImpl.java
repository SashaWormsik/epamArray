package org.chervyakovsky.customarray.service.impl.customImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.chervyakovsky.customarray.entity.CustomArray;
import org.chervyakovsky.customarray.exception.CustomException;
import org.chervyakovsky.customarray.service.ReplaceService;

public class ReplaceServiceCustomImpl implements ReplaceService {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void replaceAll(CustomArray customArray, int newValue, int oldValue) throws CustomException {
        LOGGER.info("Method replace elements start");
        if (customArray == null) {
            throw new CustomException("Array can not be NULL");
        }
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        customArray.setArray(array);
    }

    @Override
    public void replaceNegativeValue(CustomArray customArray, int newValue) throws CustomException {
        LOGGER.info("Method replace elements start");
        if (customArray == null) {
            throw new CustomException("Array can not be NULL");
        }
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = newValue;
            }
        }
        customArray.setArray(array);
    }
}