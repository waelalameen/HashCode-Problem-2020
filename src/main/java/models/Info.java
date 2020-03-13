package models;

public class Info {

    private int numberOfBooks;

    private int numberOfLibraries;

    private int numberOfDays;

    private String inputFileName;

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public int getNumberOfLibraries() {
        return numberOfLibraries;
    }

    public void setNumberOfLibraries(int numberOfLibraries) {
        this.numberOfLibraries = numberOfLibraries;
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getInputFileName() {
        return inputFileName;
    }

    public void setInputFileName(String inputFileName) {
        this.inputFileName = inputFileName;
    }

    @Override
    public String toString() {
        return "models.Info{" +
                "numberOfBooks=" + numberOfBooks +
                ", numberOfLibraries=" + numberOfLibraries +
                ", numberOfDays=" + numberOfDays +
                '}';
    }
}
