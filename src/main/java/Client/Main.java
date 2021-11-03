package Client;

import Command.OpenTextFileOperation;
import Command.SaveTextFileOperation;
import Invoker.TextFileOperationExecutor;
import Receiver.TextFile;

public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
        textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt")));
        textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt")));
    }
}
