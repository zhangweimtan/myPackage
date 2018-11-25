package com.myjava03;

import com.myjava02.PermissionsDemo;

/*
    权限修饰符：
        public：
        default
        private
        protected



 */
public class PermissionsDemo4 extends PermissionsDemo{
    public void function(){
      super.publicMethod();
      super.protectedMethod();
    }
    public static void main(String[] args) {
       
    }
}
