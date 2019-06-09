package com.kodilla.patterns.prototype.Library;

import com.kodilla.patterns.Prototype.Library.Book;
import com.kodilla.patterns.Prototype.Library.Library;
import org.junit.Assert;
import org.junit.Test;
import java.util.stream.IntStream;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //given
        Library library = new Library("Library One");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n ->library.getBooks()
                        .add(new Book("Title " + n, "Author " + n, LocalDate.of(2000, n,1))));

        //making a shallow copy
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Library Two (shallow copy)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project Three (deep copy)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(10, library.getBooks().size());
        Assert.assertEquals(10, clonedLibrary.getBooks().size());
        Assert.assertEquals(10, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(clonedLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
