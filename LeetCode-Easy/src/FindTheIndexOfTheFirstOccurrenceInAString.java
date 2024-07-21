public class FindTheIndexOfTheFirstOccurrenceInAString {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad", needle1 = "sad";
        String haystack2 = "leetcode", needle2 = "leeto";
        String haystack3 = "aaa",needle3 = "aaaa";
        String haystack4 = "mississippi", needle4 = "issip";


        System.out.println(findTheIndex(haystack1, needle1));
        System.out.println(findTheIndex(haystack2, needle2));
        System.out.println(findTheIndex(haystack3, needle3));
        System.out.println(findTheIndex(haystack4, needle4));

    }

    public static int findTheIndex(String haystack, String needle) {
        // If needle is empty, return 0 as per the problem definition
        if (needle.length() == 0) {
            return 0;
        }

        // Initialize pointers and index
        int ptr1 = 0;  // points to haystack
        int ptr2 = 0;  // points to needle
        int index = -1;

        while (ptr1 < haystack.length()) {
            char hChar = haystack.charAt(ptr1);
            char nChar = needle.charAt(ptr2);

            if (hChar == nChar) {
                // If this is the start of a potential match
                if (ptr2 == 0) {
                    index = ptr1;
                }
                ptr1++;
                ptr2++;

                // If we have matched the entire needle
                if (ptr2 == needle.length()) {
                    return index;
                }
            } else {
                // Reset the needle pointer
                ptr2 = 0;

                // Move the haystack pointer back to the next character after the initial match attempt
                if (index != -1) {
                    ptr1 = index + 1;
                } else {
                    ptr1++;
                }

                // Reset the index
                index = -1;

                // If haystack pointer reaches the end, return -1
                if (ptr1 == haystack.length()) {
                    return -1;
                }
            }
        }

        return -1;
    }


}
