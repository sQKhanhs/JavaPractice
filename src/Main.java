public class Main {
    public static void main(String[] args) {
        int[][] triangleArray = new int[5][];
        triangleArray[0] = new int[5];
        triangleArray[0][0] = 1;
        triangleArray[1] = new int[4];
        triangleArray[2] = new int[3];
        triangleArray[3] = new int[2];
        triangleArray[4] = new int[1];
        System.out.println(triangleArray[1][0]);
    }
}
