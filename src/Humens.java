public abstract class  Humens  {
    private  String firstName;
    private  String lastName ;
    private  String familystatus;
    private  int age ;

    public Humens() {
    }

    public Humens(String firstName, String lastName, String familystatus, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.familystatus = familystatus;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFamilystatus() {
        return familystatus;
    }

    public void setFamilystatus(String familystatus) {
        this.familystatus = familystatus;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Humens{" +
                "firstName=" + firstName +
                " lastName=" + lastName +
                " familystatus='" + familystatus +
                " age=" + age +
                super.toString();
    }
}
