package Client;

import Command.OpenTextFileOperation;
import Command.SaveTextFileOperation;
import Invoker.TextFileOperationExecutor;
import Receiver.TextFile;

public class Main {
    public static void main(String[] args) {
        TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();

        System.out.println(textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("file1.txt"))));
        System.out.println(textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("file2.txt"))));

        //Using lambda expressions in client
        System.out.println(textFileOperationExecutor.executeOperation(() -> "Opening file file1.txt"));
        System.out.println(textFileOperationExecutor.executeOperation(() -> "Opening file file2.txt"));

        //Using method references
        TextFile textFile = new TextFile("file1.txt");
        System.out.println(textFileOperationExecutor.executeOperation(textFile::open));
        System.out.println(textFileOperationExecutor.executeOperation(textFile::save));
    }
}
