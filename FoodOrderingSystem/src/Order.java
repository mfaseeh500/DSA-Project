/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD FASEEH
 */
public class Order{
    private String orderNumber,name,email,p_no,address,total;
     public String getOrderNumber(){
        return orderNumber;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getP_no(){
        return p_no;  
    }
    public String getAddress(){
        return address;
    }
    public String getTotal(){
        return total;
    }
     public void setOrderNumber(String orderNumber){
        this.orderNumber=orderNumber;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setP_no(String p_no){
        this.p_no=p_no;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public void setTotal(String total){
        this.total=total;
    }
}
