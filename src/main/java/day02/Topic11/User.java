package day02.Topic11;

public class User {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer score;
    private String address;

    public User() {
    }

    public User(Integer id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public User(Integer id, String name, Integer gender, Integer score, String address) {
        this(id,name);
        this.gender = gender;
        this.score = score;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", score=" + score +
                ", address='" + address + '\'' +
                '}';
    }
}
