public class IterationReverseString {
    /**
     A sentence that can be reversed in iteration.
     */

    private String text;

    public IterationReverseString(String aText){
        text = aText;
        //System.out.println("In this program, a recursion-based is used to reverse the string: "+ text);
    }

    /**
     Reverses this sentence in iteration.
     */
    public void reverse(){
        //** Put your code here.
        String reverse = "";

        for(int i = text.length()-1; i >= 0; i--){
            reverse += text.charAt(i);
        }
        text = reverse;
    }

    public String getText(){
        return text;
    }


    public static void main(String[] args){
        IterationReverseString greeting = new IterationReverseString("Hello!");
        greeting.reverse();
        System.out.println("The output is: " + greeting.getText());
        System.out.println("Expected: !olleH");
    }
}
