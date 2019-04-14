package ftns;

import java.time.LocalDate;

public class DayClient extends Human{
    LocalDate expRegDate;

    public DayClient(String name, String surname, int bYear, LocalDate regDate, LocalDate expRegDate) {
        super(name, surname, bYear, regDate);
        this.expRegDate = LocalDate.now().plusYears(1);
    }
}
//До 16:00, GYM и Pool
