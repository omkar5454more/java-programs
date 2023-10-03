public class StringCypher02 {

            public static void main(String[] args) {
                String input = "a2b3c1";
                String output = solveCipher(input);
                System.out.println("Output: " + output);
            }

            public static String solveCipher(String input) {
                StringBuilder output = new StringBuilder();

                for (int i = 0; i < input.length(); i += 2) {
                    char letter = input.charAt(i + 1);
                    int count = Character.getNumericValue(input.charAt(i));

                    for (int j = 0; j < count; j++) {
                        output.append(letter);
                    }
                }

                return output.toString();
            }
        }



