public class Instructor {
    private String province;
    private String lesson;
    private String name;
    private String surname;
    private String lessonDay;

    public Instructor(String province, String lesson, String name, String surname, String lessonDay) {
        this.province = province;
        this.lesson = lesson;
        this.name = name;
        this.surname = surname;
        this.lessonDay = lessonDay;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLessonDay() {
        return lessonDay;
    }

    public void setLessonDay(String lessonDay) {
        this.lessonDay = lessonDay;
    }
}
