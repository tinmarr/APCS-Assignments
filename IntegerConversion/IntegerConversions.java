package IntegerConversion;

public class IntegerConversions {

  public static void main(String[] args) {

    /*
		 * Test cases for Hex.  Note the prefix “Ox” means that the number is a hexadecimal number
		 * 256 --> 0x100
		 * 921 --> 0x399
		 * 188 --> 0xBC
		 * 100 --> 0x64
		 * 590 --> 0x24E
		 * 11259375  --> 0xABCDEF
		 */

    System.out.println(toBinaryString(43)); // prints 101011
    System.out.println(toHexString(256)); // prints OxABCDEF

  }

  public static String toBinaryString(int n) {
    String[] conversionValues = new String[] { "0", "1" };
    int degree = 0;
    int tempNum = n;
    String finalNum = "";
    for (int i = degree; (Math.pow(2, i)) <= n; i++) {
      degree = i;
    }
    for (int i = degree; i >= 0; i--) {
      String charToAdd = "";
      for (int j = 0; tempNum - (j * Math.pow(2, i)) >= 0; j++) {
        charToAdd = conversionValues[j];
        if (tempNum - ((j+1) * Math.pow(2, i)) < 0){
          tempNum -= j*Math.pow(2,i);
        }
      }
      finalNum += charToAdd;
    }
    return finalNum;
  }

  public static String toHexString(int n) {
    String[] conversionValues = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D","E", "F" };
    int degree = 0;
    int tempNum = n;
    String finalNum = "0x";
    for (int i = degree; (Math.pow(16, i)) <= n; i++) {
      degree = i;
    }
    for (int i = degree; i >= 0; i--) {
      String charToAdd = "";
      for (int j = 0; tempNum - (j * Math.pow(16, i)) >= 0; j++) {
        charToAdd = conversionValues[j];
        if (tempNum - ((j+1) * Math.pow(16, i)) < 0){
          tempNum -= j*Math.pow(16,i);
        }
      }
      finalNum += charToAdd;
    }
    return finalNum;
  }

  public static String toBaseString(int n, int base){
    String[] conversionValues = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D","E", "F" };
    int degree = 0;
    int tempNum = n;
    String finalNum = "0x";
    for (int i = degree; (Math.pow(base, i)) <= n; i++) {
      degree = i;
    }
    for (int i = degree; i >= 0; i--) {
      String charToAdd = "";
      for (int j = 0; tempNum - (j * Math.pow(base, i)) >= 0; j++) {
        charToAdd = conversionValues[j];
        if (tempNum - ((j+1) * Math.pow(base, i)) < 0){
          tempNum -= j*Math.pow(base,i);
        }
      }
      finalNum += charToAdd;
    }
    return finalNum;
  }
}