import java.time.LocalDate;

class InvalidDateException extends Exception {
    InvalidDateException(String message) {
        super(message);
    }
}

public class DateTestCustomException {
    static void checkDate(int year, int month, int day) throws InvalidDateException {
        try {
            LocalDate.of(year, month, day);
        } catch (Exception e) {
            throw new InvalidDateException("Invalid date: " + year + "-" + month + "-" + day);
        }
    }

    public static void main(String[] args) {
        try {
            checkDate(2024, 2, 30);
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
