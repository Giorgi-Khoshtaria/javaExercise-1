package org.example;

public class exerciseTree {
  static void main() {
    int[] testResults = {1, 0, 1, 1, 0};
    int passedCount=0;
    int failedCount=0;

    for (int i=0; i<testResults.length;i++){
      if (testResults[i]==1){
        passedCount++;
      }else {
        failedCount++;
      }
        }
    System.out.println("Passed: " + passedCount);
    System.out.println("Failed: " + failedCount);

  }
}
