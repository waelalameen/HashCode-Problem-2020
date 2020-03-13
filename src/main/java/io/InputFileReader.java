package io;

import models.Book;
import models.Info;
import models.InputDataSet;
import models.Library;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class InputFileReader {

    public static InputDataSet readFile() {
        try {
            File inputFile = new File("./b_read_on.txt");
            List<String> lines = Files.readAllLines(inputFile.toPath());

            String firstLine = lines.get(0);
            String[] firstLineValues = firstLine.split(" ");

            Info info = new Info();
            info.setNumberOfBooks(Utils.parseNumber(firstLineValues[0]));
            info.setNumberOfLibraries(Utils.parseNumber(firstLineValues[1]));
            info.setNumberOfDays(Utils.parseNumber(firstLineValues[2]));
            info.setInputFileName(inputFile.getName().substring(0, inputFile.getName().lastIndexOf('.')));

            String[] scores = new String[info.getNumberOfBooks()];
            List<Book> books = new ArrayList<>(0);
            Map<Integer, Book> booksMap = new HashMap<>();
            List<Library> libraries = new ArrayList<>(0);

            int libraryId = 0;

            for (int i = 1; i < lines.size(); i++) {
                String singleLine = lines.get(i);
                String lineWithoutSpaces = lines.get(i).replaceAll(" ", "");

                if (singleLine.isEmpty()) {
                    continue;
                }

                String[] values = singleLine.split(" ");

                if (i == 1) {
                    scores = singleLine.split(" ");
                    continue;
                }

                Library lb = new Library();
                lb.setId(libraryId);
                lb.setBooksCount(Utils.parseNumber(values[0]));
                lb.setSignUpDays(Utils.parseNumber(values[1]));
                lb.setShipDays(Utils.parseNumber(values[2]));
                libraries.add(lb);
                libraryId++;

                for (Library library : libraries) {
                    if (!lineWithoutSpaces.isEmpty()) {
                        String[] ids = singleLine.substring(5).split(" ");

                        for (String id : ids) {
                            Book book = new Book();

                            if (!id.isEmpty()) {
                                book.setId(Utils.parseNumber(id));
                            } else {
                                book.setId(-1);
                            }

                            for (String value : scores) {
                                book.setLibraryId(library.getId());
                                book.setScore(Utils.parseNumber(value));
                            }
                            booksMap.put(book.getId(), book);
                        }
                    }
                }
            }

            booksMap.forEach((key, value) -> books.add(value));

            return new InputDataSet(info, libraries, books);
        } catch (IOException e) {
            return new InputDataSet();
        }
    }
}
