package Tim;

import java.util.Scanner;

public class Main {
    private static Scanner s  = new Scanner(System.in);
    private static Button btn = new Button("print");

    public static void main(String[] args) {
        class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I have been attached");
            }
            public void Onclick(String title){
                System.out.println(title+"was clicked");
            }
        }
        btn.setOnClickListener(new ClickListener());
    }
    public static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = s.nextInt();
            s.nextLine();
            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btn.OnClick();
            }
        }
    }
}
