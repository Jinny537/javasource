package exam;

public class Member {
    private String id;
    private String passward;
    private String name;
    private int age;
    private String job;
    private String grade = "silver"
    private int point;
    
    public Member(String id, String passward, String name) {
        this.id = id;
        this.passward = passward;
        this.name = name;
    }

    public Member(String id, String passward, String name, int age, String job) {
        this.id = id;
        this.passward = passward;
        this.name = name;
        this.age = age;
        this.job = job;
    }
 
    
}
