package ftns;

import java.time.LocalTime;
import java.util.ArrayList;

public class FitnessRegistrator {
    final LocalTime openTime = LocalTime.of(8, 0);
    final LocalTime closeDayClientTime = LocalTime.of(16, 0);
    final LocalTime closeTime = LocalTime.of(22, 0);
    private ArrayList<Human> inGYM = new ArrayList<>();
    private ArrayList<Human> inPool = new ArrayList<>();
    private ArrayList<Human> Group = new ArrayList();
}

