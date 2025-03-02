package String;
public class PrintWordHavingMoreThanOneFreq {

    public static void main(String[] args) {
        String str = "Sagar Patil Vinay Parshubhan sagar vinay sagar  patil";
        PrintWordHavingMoreThanOneFreq obj = new PrintWordHavingMoreThanOneFreq();
        obj.CheckFreqWord(str);
    }

    void CheckFreqWord(String str) {
        String strLower = str.toLowerCase(); // Convert to lowercase for case-insensitivity
        String[] arr = strLower.split(" ");
        int length = arr.length;
        boolean[] counted = new boolean[length]; // To track counted words

        for (int i = 0; i < length; i++) {
            if (counted[i]) {
                break; // Skip if already counted
            }
            int count = 1; // Start count for the current word

            for (int j = i + 1; j < length; j++) {
                if (arr[i].equals(arr[j])) {
                    count++;
                    counted[j] = true; // Mark this word as counted
                }
            }

            if (count > 1) {
                System.out.println(arr[i] + " Frequency is " + count);
            }
        }
    }
}
