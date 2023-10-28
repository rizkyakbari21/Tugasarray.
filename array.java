public class array {
    public static void main(String[] args) {

        Object dataArray[] = { 1, 2, 4, 10, 20, "Rizwan", "Iko", "Ikok" };

        StringBuilder arrayNumber = new StringBuilder();
        StringBuilder arrayText = new StringBuilder();

        for (Object item : dataArray) {

            if (item instanceof Integer) {
                arrayNumber.append(item).append(" ");
            }

            else if (item instanceof String) {
                arrayText.append(item).append(" ");
            }
        }

        System.out.println("Array Text adalah : " + arrayText.toString().trim());
        System.out.println("Array Number adalah : " + arrayNumber.toString().trim());
    }
}