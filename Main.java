import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int[] height = new int[];
    int[] width = new int[];
    int totArea = 0;

    for(int i = 0; i < height.length; i++){
      int totalH = height[i] + height[i+1];
      int area = (totalH * width[i])/2;
      totArea = area + totArea;
      
    }
    
  }
}