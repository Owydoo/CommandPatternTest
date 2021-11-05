package Invoker;

import Command.TextFileOperation;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class TextFileOperationExecutor {
    private final List<TextFileOperation> textFileOperations = new ArrayList<>();

    public String executeOperation(TextFileOperation textFileOperation){
        textFileOperations.add(textFileOperation);
        return textFileOperation.execute();
    }

    public List<TextFileOperation> getTextFileOperations() {
        return textFileOperations;
    }

    @Override
    public String toString() {
        return "TextFileOperationExecutor{" +
                "textFileOperations=" + textFileOperations +
                '}';
    }
}
