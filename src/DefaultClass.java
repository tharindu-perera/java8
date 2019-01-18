
import javathecompletereference.JavaTheCompleteReference;




/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Your Name Tharindu Dhanushka
 */
public abstract class DefaultClass {
    public abstract void name();

    int age = 90;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public static void main(String[] args) {
        new JavaTheCompleteReference();
        EnumEx w = EnumEx.a;
        System.out.println(EnumEx.valueOf("a"));
        DefaultClassImpl classImpl = new DefaultClassImpl();
        DefaultClass dc = new DefaultClass() {

            @Override
            public void name() {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            public void sedft() {

            }
        };

        System.out.println(dc.getAge());
    }


}
 
