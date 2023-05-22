package exercise;

// BEGIN
interface Home {
    double getArea();

    default int compareTo(Home anotherHome) {
        return Double.compare(getArea(), anotherHome.getArea());
    }
}
// END
