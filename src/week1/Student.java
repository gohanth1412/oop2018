package week1;

public class Student {

    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }
    public String getId() {
        return this.id;
    }

    public void setId(String ids) {
        this.id = ids;
    }
    public String getGroup() {
        return this.group;
    }

    public void setGroup(String gr) {
        this.group = gr;
    }
    public void setEmail(String em) {
        this.email = em;
    }
    public String getEmail() {
        return this.email;
    }


    Student() {
        this.name = "Student";
        this.id = "000";
        this.group = "INT22041";
        this.email = "uet@vnu.edu.vn";

    }

    Student(String n, String sid, String em) {
        this.name = n;
        this.id = sid;
        this.group = "INT22041";
        this.email = em;

    }

    Student(Student s) {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;

    }

    String getInfo() {
        String TTSV ="Name: "+ name + "\nID: " + id + "\nGroup: " + group + "\nEmail: " + email + "\n";
        return TTSV;
    }
}