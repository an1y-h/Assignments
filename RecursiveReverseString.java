public class RecursiveReverseString {
    private String text;

    public RecursiveReverseString(String aText){
        this.text = aText;
    }

    /**
     Reverses this sentence in recursion.
        */
    private String reverse = "";
    private String copy = "      ";
    private int index = copy.length() - 1;
    
    public void reverse(){
        //** Put your code here.
        copy = text;
        if (index < 0) {
            text = reverse;
            return;
        }

        reverse = reverse + copy.charAt(index);
        index--;
        reverse();
    }
    
    public String getText(){
        return text;
    }
    public static void main(String[] args)
    {
        RecursiveReverseString greeting = new RecursiveReverseString("Hello!");
        greeting.reverse();
        System.out.println("The output is:" + greeting.getText());
        System.out.println("Expected: !olleH");
    }
}