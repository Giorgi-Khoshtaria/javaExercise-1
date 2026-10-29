package org.example;

public class exerciseFive {
  static void main() {
    String string = "ფნუყბფუჰბფოისბიიიიდეედკაბირკანაოწნად";
    String vowels = "აეიოუ";

//1
    int count = 0;

    for (int i = 0; i < string.length(); i++) {
      for (int j = 0; j < vowels.length(); j++) {
        if (string.charAt(i) == vowels.charAt(j)) {
          count++;
        }
      }
    }

    System.out.println("ხმოვნების რაოდენობა:  " + count);

    //2

    System.out.println("სტრინგის სიგრძე:  " + string.length());

    //3
    if (string.length() % 2 == 0) {
      System.out.println("ლუწი");
    } else {
      System.out.println("კენტი");
    }
  }
}
