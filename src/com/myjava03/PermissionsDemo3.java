package com.myjava03;

import com.myjava02.PermissionsDemo;

/*
    权限修饰符：
        public：
        default
        private
        protected



 */
public class PermissionsDemo3 {

    public static void main(String[] args) {
        PermissionsDemo pd = new PermissionsDemo();
        pd.publicMethod();
//        pd.defaultMethod();
//        pd.privateMethod();
//        pd.protectedMethod();
    }
}
