package ftns;
import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Сергей", "Иванов", 1990);
        DayClient dayClient = new DayClient("Иван", "Петров", 1985);
        FullDayClient fullDayClient = new FullDayClient("Алексей", "Сидоров", 1995);
    }
}
