public class ToDoPrint {
    public static void main(String... args){

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText applying indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        StringBuilder todoText = new StringBuilder(" - Buy milk\n");
        todoText.insert(0,"My todo:\n");
        todoText.append(" - Download games\n    -Diablo");



        System.out.println(todoText);
    }
}
