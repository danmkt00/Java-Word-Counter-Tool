import java.io.File;

/*
2. 📖 Word Counter Tool
Concepts: FileReader, BufferedReader, Exception Handling

Read a text file (article.txt) and count:

Total lines
Total words
Total characters
Display the statistics in the console.

Handle missing file scenarios using FileNotFoundException.
 */
public class Main {
    public static void main(String[] args) {
        String filePath = "resources" + File.separator + "article.txt";
        WordCounter wordCounter = new WordCounter(filePath);

        wordCounter.count();
        wordCounter.printCounts();
        wordCounter.reset();
    }
}