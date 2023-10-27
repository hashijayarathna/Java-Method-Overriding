class School {

    public void learning() {
        System.out.println("grade 10 students");
    }
}
class highSchool extends School {

    @Override
    public void learning() {
        System.out.println("grade 12 students");
    }
}
class Run {
    public static void main(String[] args) {
        highSchool hs = new highSchool();
        hs.learning();
    }
}
