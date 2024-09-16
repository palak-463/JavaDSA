
    public static void main(String[] args) {
        System.out.println("=======================================");
        System.out.println("      🖥️ Welcome to Java DSA Repo       ");
        System.out.println("=======================================\n");

        // Description
        System.out.println("This repository contains daily solutions for");
        System.out.println("450 DSA questions from the DSA Sheet by Love Babbar.");
        System.out.println("Find the full sheet here: ");
        System.out.println("https://www.geeksforgeeks.org/dsa-sheet-by-love-babbar/\n");

        // Topic-Wise Distribution
        System.out.println("🗂️ Topic-Wise Distribution of 450 Questions:");
        printTopicDistribution();

        // How to Use
        System.out.println("\n## 🛠️ How to Use This Repository\n");
        System.out.println("1. Clone this repository:");
        System.out.println("```bash");
        System.out.println("git clone https://github.com/yourusername/Java-DSA.git");
        System.out.println("```");
        System.out.println("2. Navigate through the topic-wise folders for specific questions and solutions.");
        System.out.println("3. Execute the Java programs for each question and test them with JUnit.");

        // Closing message
        System.out.println("\nGood luck and happy coding! 🚀");
    }

    // Method to print topic-wise distribution in a table-like structure
    public static void printTopicDistribution() {
        String[][] topics = {
            {"📊 Arrays", "36 questions"},
            {"🔢 Matrix", "10 questions"},
            {"🧵 Strings", "43 questions"},
            {"🔍 Searching and Sorting", "36 questions"},
            {"🔗 Linked List", "36 questions"},
            {"🧮 Bit Manipulation", "10 questions"},
            {"💡 Greedy", "35 questions"},
            {"🔄 Backtracking", "19 questions"},
            {"📈 Dynamic Programming", "60 questions"},
            {"🗄️ Stacks and Queues", "38 questions"},
            {"🌳 Binary Trees", "35 questions"},
            {"🌲 Binary Search Trees", "22 questions"},
            {"📉 Graphs", "44 questions"},
            {"🏔️ Heap", "18 questions"},
            {"🔠 Trie", "6 questions"}
        };

        System.out.println("------------------------------------------------");
        System.out.printf("| %-25s | %-10s |\n", "Topic", "Questions");
        System.out.println("------------------------------------------------");
        for (String[] topic : topics) {
            System.out.printf("| %-25s | %-10s |\n", topic[0], topic[1]);
        }
        System.out.println("------------------------------------------------");
    }

