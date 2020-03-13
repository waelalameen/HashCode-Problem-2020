package models;

public class Book {

    private int id;

    private int score;

    private int libraryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(int libraryId) {
        this.libraryId = libraryId;
    }

    @Override
    public String toString() {
        return "models.Book{" +
                "id=" + id +
                ", score=" + score +
                ", libraryId=" + libraryId +
                '}';
    }
}
