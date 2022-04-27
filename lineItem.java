package com.ng.util;
import java.io.*; 
import java.util.; 
import java.lang.;

class lineItem {
protected int productId;
private int ImageID;
private in qty;
private int Unitprice;

public lineItem(int prodID, int ImageID, int inQty){
productId = prodID;
this.ImageID = ImageID;
qty = inQty;
}
public void setLineItems(Vector lineItem){
LineItems = lineItems;
}
int getLineItems() {
return LineItems;
}
int getImageID(){
return ImageID;
}
int getQuantity(){
return qty;
}
int getUnitPrice(){
return UnitPrice;
}
public void setProductID(int id){
productId = id;
}
public void setImageID(int ID){
ImageID = ID;
}
public void setQty(int qty){
this.qty = qty;
}
public void setUnitPrice(int i){
UnitPrice = i;
}