public class IPValidation {
    public static void main(String[] args) {
        String[] tests = {"192.168.1.1", "256.100.50.25", "10.0.0.256"};

        String regex = "^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$";

        for (String ip : tests) {
            if (ip.matches(regex)) {
                System.out.println(ip + " → Valid");
            } else {
                System.out.println(ip + " → Invalid");
            }
        }
    }
}
