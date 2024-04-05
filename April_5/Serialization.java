import java.util.Arrays;

public class Serialization {
    public static String serializeStrings(String[] A) {
        StringBuilder serializedString = new StringBuilder();
        for (String str : A) {
            int length = str.length();
            serializedString.append(str).append(length).append("~");
        }
        return serializedString.toString();
    }

    public static void main(String[] args) {
        String[] A1 = { "scaler", "academy" };
        String[] A2 = { "interviewbit" };

        System.out.println(serializeStrings(A1)); // Output: scaler6~academy7~
        System.out.println(serializeStrings(A2)); // Output: interviewbit12~
    }
}
