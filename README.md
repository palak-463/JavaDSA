public class ReadMe {

    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      🖥️ Java DSA       ");
        System.out.println("=======================================\n");

        // Description
        System.out.println("This repository contains daily solutions for");
        System.out.println("450 DSA questions from the DSA Sheet by Love Babbar.");
        System.out.println("Find the full sheet here: ");
        System.out.println("https://www.geeksforgeeks.org/dsa-sheet-by-love-babbar/\n");

        // Topic-Wise Distribution
        System.out.println("🗂️ Topic-Wise Distribution of 450 Questions:");
        printTopicDistribution();
    }

    // Method to print topic-wise distribution in a table-like structure
    public static void printTopicDistribution() {
        String[] topics = {
            {"📊 Arrays"},
            {"🔢 Matrix"},
            {"🧵 Strings"},
            {"🔍 Searching and Sorting"},
            {"🔗 Linked List"},
            {"🧮 Bit Manipulation"},
            {"💡 Greedy"},
            {"🔄 Backtracking"},
            {"📈 Dynamic Programming"},
            {"🗄️ Stacks and Queues"},
            {"🌳 Binary Trees"},
            {"🌲 Binary Search Trees"},
            {"📉 Graphs"},
            {"🏔️ Heap"},
            {"🔠 Trie"}
        };

        System.out.println("------------------------------------------------");
        System.out.printf("| %-25s | %-10s |\n", "Topic", "Questions");
        System.out.println("------------------------------------------------");
        for (String[] topic : topics) {
            System.out.printf("| %-25s | %-10s |\n", topic[0], topic[1]);
        }
        System.out.println("------------------------------------------------");
    }

}
