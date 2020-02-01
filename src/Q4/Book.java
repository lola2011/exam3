package Q4;

import java.util.Objects;

public class Book {
    Integer year;
    Character code;
    Integer price;

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Character getCode() {
        return code;
    }

    public void setCode(Character code) {
        this.code = code;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Book(Integer year, Character code, Integer price) {
        this.year = year;
        this.code = code;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "year=" + year +
                ", code=" + code +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(year, book.year) &&
                Objects.equals(code, book.code) &&
                Objects.equals(price, book.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, code, price);
    }
}
