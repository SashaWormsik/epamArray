package org.chervyakovsky.customarray.reader;

import org.chervyakovsky.customarray.exception.CustomException;

import java.util.List;

public interface CustomerReader {

    public List<String> readAllFile(String fileName) throws CustomException;
}