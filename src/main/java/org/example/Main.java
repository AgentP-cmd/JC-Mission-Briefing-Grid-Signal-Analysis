package org.example;

public class Main {
    public static void main(String[] args) {

        // Mission Data: The Scrambled Communications Grid
        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

        //Phase 2: The Standard Maneuver (Nested for loop)
        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop();

        //Phase 3: The Advanced Sweep (Nested for-each loop with Hash Code Analysis)
        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop();

        //Phase 4: The Hybrid Approach (Combined for-each and for loop)
        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop();


    }

    public static class GridSignalAnalyzer{
        char[][] scrambledGrid = {
                {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
                {'A', 'L', 'P', 'H', 'A'},
                {'T', 'A', 'N', 'G', 'O', '7'},
                {'B', 'R', 'A', 'V', 'O'}
        };
        public void analyzeWithForLoop(){
            for (int i = 0; i < scrambledGrid.length; i++) {
                char[] row = scrambledGrid[i];
                for (int j = 0; j < row.length; j++) {
                    char col = row[j];
                    System.out.print(" " + col);
                }
                System.out.println();
            }
        }

        public void analyzeWithForEachLoop(){
            for(char[] rowArray : scrambledGrid ){
                System.out.println("Processing Row with Hash: " + rowArray);
                for (char colArray : rowArray ){
                    System.out.println("-> " + colArray);
                }
            }
        }

        public void analyzeWithHybridLoop(){
            for (char[] outterArray : scrambledGrid){
                for (int i = 0; i < outterArray.length; i++) {
                    char innerArray = outterArray[i];
                    System.out.print(innerArray + " ");
                }
                System.out.println();
            }
        }
    }
}