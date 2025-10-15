import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
    private final String filePath;
    private int lineCount;
    private int wordCount;
    private int charCount;


    public WordCounter(String filePath)
    {
        this.filePath = filePath;
        reset();
    }

    public void count()
    {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while((line = reader.readLine()) != null)
            {
                lineCount++;
                charCount += line.length();
                if(!line.trim().isEmpty())
                {
                    String[] words = line.trim().split("\\s+");
                    wordCount += words.length;
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + e.getMessage());
        }
        catch (IOException e)
        {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    public void printCounts()
    {
        System.out.println("Lines: " + lineCount);
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);

    }

    public void reset()
    {
        this.lineCount = 0;
        this.wordCount = 0;
        this.charCount = 0;
    }


}
