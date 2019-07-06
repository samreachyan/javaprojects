/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritanceExample;

/**
 *
 * @author Sabay Play
 */
class Operation2{  
 int data=50;  
  
 void change(Operation2 op){  
    
     // data = data + 100 // this not work for referrence
     
    op.data=op.data+100;//changes will be in the instance variable  
 }  
     
    
 public static void main(String args[]){  
   Operation2 op=new Operation2();  
  
   System.out.println("before change "+op.data);  
   op.change(op);//passing object  
   System.out.println("after change "+op.data);  
  
 }  
}  