package chetan.encapsulation;

public class InventoryItem
{
    private String itemName;
    private double pricePerUnit;
    private int quantityInStock;
    
    public InventoryItem(String itemName,double pricePerUnit,int quantityInStock)
    {
    	this.itemName=itemName;
    	this.pricePerUnit=pricePerUnit;
    	this.quantityInStock=quantityInStock;
    }
    
    public String getItemName()
    {
    	return this.itemName;
    }
    
    public void setItemNAme(String itemName)
    {
    	this.itemName=itemName;
    }
    
    public double getPricePerUnit()
    {
    	return this.pricePerUnit;
    }
    
    
    public void setPricePerUnit(double pricePerUnit)
    
    {
    	this.pricePerUnit=pricePerUnit;
    }
    
    public int getQuantityInStock()
    {
    	return this.quantityInStock;
    }
    
    public void setQuantityInStock(int quantityInStock)
    
    {
    	this.quantityInStock=quantityInStock;
    }
    
    
    public double calculateTotalValue()
    {
    	return pricePerUnit*quantityInStock;
    }
}
