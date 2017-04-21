package com.sowmya.codetest;

import java.util.ArrayList;
import java.util.List;

public class TableDataStructure {

	private List<TableRow> tableData = null; 
	
	public TableDataStructure(){
		 
		 tableData = new ArrayList<>();
		 
		 tableData.add(new TableRow(1, "Oracle", "2323345789", "CA"));
		 tableData.add(new TableRow(2, "Verizon", "4545454547", "LA"));
		 tableData.add(new TableRow(3, "HCL", "8888888888", "NJ"));
		 tableData.add(new TableRow(4, "Deloitte", "9098765321", "MA"));
	}
	
	public List<TableRow> getData(){
		return tableData;
	}
 	
	public static void main(String[] args) {
		
		TableDataStructure table = new TableDataStructure();
		List<TableRow> data = table.getData();
		
		System.out.println("The data from the table is "+ data);

	}

}
