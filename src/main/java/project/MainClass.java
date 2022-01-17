package project;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        try {
            Path path = FileSystems.getDefault().getPath("Code");
            List<String> list = Files.readAllLines(path, StandardCharsets.UTF_8);
            StringBuilder code = new StringBuilder();
            for (String codes : list) {
                code.append(codes + "\n");
            }

            String codeStr = String.valueOf(code);

            File file = new File("C:\\Users\\Andrey\\IdeaProjects\\Task10C2\\Code2.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(codeStr.replaceAll("public", "private"));
            printWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
