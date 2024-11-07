package chetan.encapsulation;

public class InventoryItemDemo
{

	public static void main(String[] args)
	{
           InventoryItem item=new InventoryItem("Apple",-5,15);
           double totalValue=item.calculateTotalValue();
           if(item.getPricePerUnit()>0&&item.getQuantityInStock()>0)
           {
        	   System.out.println("Item name:"+item.getItemName());
        	   System.out.println("Price Per Unit:"+item.getPricePerUnit());
        	   System.out.println("Quantity in Stock:"+item.getQuantityInStock());
        	   System.out.println("Total Values of "+item.getItemName()+" in Stock:"+totalValue);
           }
           else
           {
        	   System.err.println("Invalid Price or quantity");
           }
           
	}

}
