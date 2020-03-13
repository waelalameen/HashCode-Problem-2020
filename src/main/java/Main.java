import io.InputFileReader;
import io.OutputFileWriter;
import models.Book;
import models.Info;
import models.InputDataSet;
import models.Library;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static int currentIndex = -1;

    public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder();

        InputDataSet inputDataSet = InputFileReader.readFile();

        List<Book> books = inputDataSet.getBooks();
        List<Library> libraries = inputDataSet.getLibraries();

        for (int i = 0; i < libraries.size(); i++) {
            currentIndex = i;

            if (i == 0) {
                stringBuilder.append(libraries.size());
                stringBuilder.append("\n");
            }

            stringBuilder.append(String.format("\n%d %d \n", i, libraries.get(i).getBooksCount()));

            List<Book> filteredBooks = books.stream()
                    .filter(book -> book.getId() != -1)
                    .filter(book -> book.getLibraryId() == currentIndex)
                    .collect(Collectors.toList());

            int shipDays = libraries.get(currentIndex).getShipDays();

            for (int j = 0; j < filteredBooks.size(); j++) {
                if (j % shipDays == 0) {
                    System.out.println();
                    stringBuilder.append("\n");
                }

                stringBuilder.append(filteredBooks.get(j).getId()).append(" ");
            }

            stringBuilder.append("\n");
        }

        //System.out.println(stringBuilder.toString().trim());

        Info info = inputDataSet.getInfo();
        OutputFileWriter.WriteToFile(info.getInputFileName(), stringBuilder.toString().trim());
    }
}
