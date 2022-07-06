public class Square {
    private int length;
    private int width;

    Square(int length,int width){
        this.length=length;
        this.width=width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void square(){
        int square = length * width;
        System.out.println("Square = "+ square);
    }
    public void perimeter(){
        int perimeter= length * 2 + width * 2;
        System.out.println("Perimeter = "+perimeter);
    }



}