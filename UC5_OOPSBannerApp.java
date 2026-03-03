public class UC5_OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization
        String[] lines = {
            String.join(" ", " ***  ", " ***  ", " ***** ", " ***** "),
            String.join(" ", "*   * ", "*   * ", "*     ", "*     "),
            String.join(" ", "*   * ", "*   * ", "***** ", "***** "),
            String.join(" ", "*   * ", "*   * ", "*     ", "    * "),
            String.join(" ", "*   * ", "*   * ", "*     ", "    * "),
            String.join(" ", "*   * ", "*   * ", "*     ", "*   * "),
            String.join(" ", " ***  ", " ***  ", "*     ", " ***  ")
        };

        // Enhanced for-loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}