class demoEx extends RuntimeException{
    public String toString(){
        return "Checked Exception";
    }
}
public class Throws_demo {
    public void c(){
        try{
            d();
        }
        catch(demoEx e){
            System.out.println(e);
        }
    }
    public void d() throws demoEx{
throw new demoEx();
    }
    public static void main(String[]args){
        Throws_demo obj=new Throws_demo();
        obj.c();
    }
}
