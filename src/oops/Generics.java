package oops;

import java.lang.reflect.Field;
import java.util.Objects;

public class Generics<T> {
    T t;

    public Generics(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    static class  A{
        int id;
        String name;

        public A(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    static class B{
        int id;
        String name;

        public B(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    static class C {
        int val;
        C left;
        C right;

        public C(int val) {
            this.val = val;
            this.left=null;
            this.right = null;
        }
    }

    static  class D{
        private String oc;
        private boolean flag;

        public String getOc() {
            return oc;
        }

        public void setOc(String oc) {
            this.oc = oc;
        }

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }

        @Override
        public String toString() {
            return "D{" +
                    "oc='" + oc + '\'' +
                    ", flag=" + flag +
                    '}';
        }
    }
    public<T> void diffrentiateClassRunTime(T t) throws IllegalAccessException, NoSuchFieldException {

        Field[] declaredFields = t.getClass().getDeclaredFields();
        int i = (int) t.getClass().getDeclaredField("id").get(t);
        System.out.println(i);
        for (Field declaredField : declaredFields) {
            //System.out.println(declaredField.getName() + " " + declaredField.get(t));
        }
    }
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        Object o = null;
        A a ;
        a=(A)o;
        System.out.println(a);
        C c = new C(5);
        c.left = new C(6);
        c.right = new C(7);
        C r=c;
        r=r.left;
        System.out.println(c.val);
        System.out.println(r.val);
        D d = new D();
        d.setOc("hjf");
        //d.setFlag(true);
        System.out.println(d);
        A a1 = new A(6,"kyo");
    }
}
