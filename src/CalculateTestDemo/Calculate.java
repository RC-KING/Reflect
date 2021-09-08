package CalculateTestDemo;

public class Calculate {
    @Check
    public int add(){
        return 1+1;
    }
    @Check
    public int sub(){
        return 2-1;
    }
    @Check
    public int mtl(){
        return 2*2;
    }
    @Check
    public int div(){
        return 1/0;
    }
    @Check
    public int div1(){
        return 1/0;
    }

    public void xxx(){
        System.out.println("飘过~~~~");
    }
}
