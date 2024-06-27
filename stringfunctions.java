public class stringfunctions {

    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. length()
        System.out.println("1. Length of the string: " + str.length());

        // 2. charAt()
        System.out.println("2. Character at index 4: " + str.charAt(4));

        // 3. substring()
        System.out.println("3. Substring from index 7: " + str.substring(7));

        // 4. substring() with start and end index
        System.out.println("4. Substring from index 1 to 6: " + str.substring(1, 6));

        // 5. concat()
        System.out.println("5. Concatenated string: " + str.concat(" Goodbye!"));

        // 6. toUpperCase()
        System.out.println("6. Uppercase: " + str.toUpperCase());

        // 7. toLowerCase()
        System.out.println("7. Lowercase: " + str.toLowerCase());

        // 8. indexOf()
        System.out.println("8. Index of 'o': " + str.indexOf('o'));

        // 9. lastIndexOf()
        System.out.println("9. Last index of 'o': " + str.lastIndexOf('o'));

        // 10. startsWith()
        System.out.println("10. Starts with 'He': " + str.startsWith("He"));

        // 11. endsWith()
        System.out.println("11. Ends with 'ld!': " + str.endsWith("ld!"));

        // 12. replace()
        System.out.println("12. Replace 'o' with 'x': " + str.replace('o', 'x'));

        // 13. trim()
        String strWithSpaces = "   Spaces before and after   ";
        System.out.println("13. Trimmed string: " + strWithSpaces.trim());

        // 14. split()
        String[] splitArray = str.split(",");
        System.out.println("14. Split string:");
        for (String s : splitArray) {
            System.out.println("\t" + s);
        }

        // 15. equals()
        String str2 = "Hello, World!";
        System.out.println("15. Equality check with 'Hello, World!': " + str.equals(str2));

        // 16. equalsIgnoreCase()
        System.out.println("16. Equality check (ignore case) with 'hello, WORLD!': " + str.equalsIgnoreCase("hello, WORLD!"));

        // 17. compareTo()
        String str3 = "ABC";
        String str4 = "DEF";
        System.out.println("17. Comparison with 'DEF': " + str3.compareTo(str4));

        // 18. compareToIgnoreCase()
        System.out.println("18. Comparison (ignore case) with 'def': " + str3.compareToIgnoreCase("def"));

        // 19. contains()
        System.out.println("19. Contains 'World': " + str.contains("World"));

        // 20. isEmpty()
        System.out.println("20. Is the string empty? " + str.isEmpty());

        // 21. toCharArray()
        char[] charArray = str.toCharArray();
        System.out.println("21. Char array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 22. valueOf()
        int num = 12345;
        String numStr = String.valueOf(num);
        System.out.println("22. String value of integer: " + numStr);

        // 23. getBytes()
        byte[] byteArray = str.getBytes();
        System.out.println("23. Byte array:");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 24. intern()
        String str5 = new String("Hello, World!");
        String str6 = str5.intern();
        System.out.println("24. Interned string: " + (str == str6)); // Should be true

        // 25. join()
        String[] words = {"Hello", "World", "!"};
        String joinedString = String.join(" ", words);
        System.out.println("25. Joined string: " + joinedString);

        // 26. repeat()
        System.out.println("26. Repeated string: " + "Java ".repeat(3));

        // 27. strip()
        String strWithWhitespace = "  Hello, World!  ";
        System.out.println("27. Stripped string: " + strWithWhitespace.strip());

        // 28. lines()
        String multiLineString = "Line 1\nLine 2\nLine 3";
        System.out.println("28. Lines:");
        multiLineString.lines().forEach(System.out::println);

        // 29. format()
        String formattedString = String.format("Name: %s, Age: %d", "John", 30);
        System.out.println("29. Formatted string: " + formattedString);

        // 30. replaceAll()
        String stringWithNumbers = "12345";
        System.out.println("30. Replaced string: " + stringWithNumbers.replaceAll("\\d", "X"));
    }
}
