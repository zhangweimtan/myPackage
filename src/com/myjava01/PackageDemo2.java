package com.myjava01;
/*
    不同包之间的互相访问
        使用类的全名；
        使用关键字，import将类导入，通配符*，

    注意：*代表通配符，代表导入这个包下所有类，并没有导入子包下的类

    类的全名：包名.类名



 */
public class PackageDemo2 {
    public static void main(String[] args) {
//        相同包下的类，可以直接访问，不需要做其他安排
        PackageDemo pd = new PackageDemo();
    }
}
