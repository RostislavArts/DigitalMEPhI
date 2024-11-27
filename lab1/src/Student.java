class Student {
    private String name;
    private String group;
    private int course;
    private int[] marks;

    public Student(String name, String group, int course, int[] marks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int[] getMarks() {
        return marks;
    }

    public int countAvgScore() {
        int res = 0;
        for (int i : marks) {
            res += i;
        }

        return res / marks.length;
    }

    public void increaseCourse() {
        course++;
    }
}
