package ObjectsAndClasses;

import java.util.Objects;

public class Author {
    private final String authorName;
    private final String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }

    public String getAuthorName() {
        return this.authorName;
    }

    public String getAuthorSurname() {
        return this.authorSurname;
    }

    //написала вручную
    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }
    //написала вручную
    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return authorName.equals(c2.authorName) && authorSurname.equals(c2.authorSurname);
    }
    //сгенерировала
    @Override
    public int hashCode() {
        int result = getAuthorName().hashCode();
        result = 31 * result + getAuthorSurname().hashCode();
        return result;
    }
}
