package ex_01_javabasics;
                            //enum enumarator is  a type of non-predifined typevariable
public class lab26 {
    public static void main(String[] args){
        enum colour{red,blue,green,black,white}
        colour cl=colour.black;
        switch (cl)
        {
            case red -> System.out.println("the color is red");
            case blue -> System.out.println("the color is blue");
            case green -> System.out.println("the color is green");
            case black -> System.out.println("the color is black");
            case white -> System.out.println("the color is whiteet");
        }
    }
}
