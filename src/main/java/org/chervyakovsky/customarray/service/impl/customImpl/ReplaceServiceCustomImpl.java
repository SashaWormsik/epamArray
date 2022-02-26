package org.chervyakovsky.customarray.service.impl.customImpl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.chervyakovsky.customarray.entity.CustomArray;
import org.chervyakovsky.customarray.exception.CustomException;
import org.chervyakovsky.customarray.service.ReplaceService;

public class ReplaceServiceCustomImpl implements ReplaceService {

    Logger logger = LogManager.getLogger();

    @Override
    public void replaceAll(CustomArray customArray, int nValue, int oldValue) throws CustomException {
        logger.info("Method replace elements start");
        if (customArray == null) {
            throw new CustomException("Array can not be NULL");
        }
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = nValue;
            }
        }
        customArray.setArray(array);
        logger.info("elements are replaced");
    }

    @Override
    public void replaceNegativeValue(CustomArray customArray, int nValue) throws CustomException {
        logger.info("Method replace elements start");
        if (customArray == null) {
            throw new CustomException("Array can not be NULL");
        }
        int[] array = customArray.getArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = nValue;
            }
        }
        customArray.setArray(array);
        logger.info("elements are replaced");
    }
}
