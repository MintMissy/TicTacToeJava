class ArrayOperations {
    public static void printCorners(int[][] twoDimArray) {
        int firstCorner = twoDimArray[0][0];
        int secondCorner = twoDimArray[0][twoDimArray[0].length - 1];
        int thirdCorner = twoDimArray[twoDimArray.length - 1][0];
        int fourthCorner = twoDimArray[twoDimArray.length - 1][twoDimArray[0].length - 1];

        System.out.println(firstCorner + " " + secondCorner);
        System.out.println(thirdCorner + " " + fourthCorner);
    }
}