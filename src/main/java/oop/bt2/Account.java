    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package oop.bt2;

    /**
     *
     * @author xuant
     */
    public class Account {
        private String id, name;
        private int balance;
        public Account(){
        id ="";
        name="";
        balance=(int)1.0;
        }
        public  String getId(){
        return id;
        }

        public void getId(String id){
        this.id=id;
        }
        public String getName(){
        return name;
        }
        public void getName(String name){
        this.name=name;
        }
        public int getBalance(){
        return balance;
        }
        public void credit(int amount){
            if (amount>0)
        balance +=amount;
        } 
        public void debit(int amount){
        if (balance>=amount)
        {
            balance -=amount;
            System.out.println("Giao dich thanh toan thanh cong");
        }else{
            System.out.println("Khong du giao dich thanh toan that bai.");
         }
        }
          public void tranferTo(Account other,int amount){
        if (balance>=amount)
        {
            balance -=amount;
            other.balance+=amount;
            System.out.println("Giao dich thanh toan thanh cong");
        }else{
            System.out.println("Khong du giao dich thanh toan that bai.");
         }
        }
    }