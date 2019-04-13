package fitness;

@AccessMode
public class DayClient extends Human {

    private String endOfReg;
    private Access group = new Access(8, 16, FitnessServiceEnumeration.GROUP);
    private Access gym = new Access(8, 16, FitnessServiceEnumeration.GYM);
    //TODO: реализовать невозможность посещения бассейна

    public void setGym(Access gym) {
        this.gym = gym;
    }

    public DayClient(String name, String surname, int bYear, String regDate) {
        super(name, surname, bYear, regDate);
    }

    private Access pool = null;

    public DayClient(String name, String surname, int bYear) {
        super(name, surname, bYear);
        //TODO: подсчет даты окончания регистрации отдельным методом
        this.endOfReg = "12.04.2019";
    }

    public DayClient(String name, String surname, int bYear, Access gym, String endOfReg) {
        super(name, surname, bYear, gym);
        //TODO: подсчет даты окончания регистрации отдельным методом
        this.endOfReg = endOfReg;
    }

    public Access getGroup() {
        return group;
    }

    public void setGroup(Access group) {
        this.group = group;
    }

    public Access getGym() {
        return gym;
    }

}
