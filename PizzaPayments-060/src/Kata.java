public class Kata {
    public static double michaelPays(double cost) {
        if (cost < 5.0) {
            return cost;
        }
        if (cost >= 5.0 && cost <= 10.0) {
            return cost * 0.66;
        }
        return cost;
    }

    public static void main(String[] args) {
        System.out.println(michaelPays(15));
    }
}
