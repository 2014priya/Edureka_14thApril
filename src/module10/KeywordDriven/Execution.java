package module10.KeywordDriven;

import java.io.IOException;

public class Execution {

	public static void main(String[] args) throws InterruptedException, IOException {

    String path ="E:\\Programs\\Edureka_14thApril\\src\\module10\\TestData\\MyTestDataEngine.xlsx";

    ExcelUtility.SetExcel(path, 0);
    
    for(int i =0 ;i<=3; i++)
    	
    {
    	String Keyword = ExcelUtility.getData(i, 3);
    			if(Keyword.equals("openbrowser")) {
    				
    				ActionKeyword.openbrowser();
    				}
    			else if (Keyword.equals("navigate")) {
    				
    				ActionKeyword.navigate();
    
    		}
    			else if (Keyword.equals("click_Gmail")) {
    				
    				ActionKeyword.click_Gmail();
    				
    			}
    }
    
    
    
    
    
	}

}
