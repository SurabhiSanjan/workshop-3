package com.bridgelabz.workshop;

abstract class Animals {
    abstract void eat();
}
    class Lion <t> extends Animals{
    t obj;
    Lion(t obj){
       this.obj=obj;
    }
        public static void main(String[] args) {
            Lion a= new Lion("deer");
            a.eat();
            
        }
        @Override
        void eat() {
            System.out.println("lion eats " + obj+ " flesh");
        }
    }


