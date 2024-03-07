class Join {
  public static void main(String[] args) {
    String str1 = "I";
    String str2 = "love";
    String str3 = "Java";

    //String joinedStr = String.join(",", str1, str2, str3);

    System.out.println(String.join(",", str1, str2, str3)); // We don't need to always store the resultant string, we can directly print the string. Storing the string helps in reusing it later.
  }
}
