import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Excel {
    private static String file = "src/main/java/XLS/CompanyIndicators.xlsx";



    public static void main(String[] args) throws IOException {
        ArrayList<Company> companies = new ArrayList<Company>();

        Workbook workbook = WorkbookFactory.create(new File(file));
        Sheet sheetBook = workbook.getSheet("JavaBooks");


        Iterator<Row> rowIterator = sheetBook.rowIterator();
        while (rowIterator.hasNext()){
            Row row = rowIterator.next();
            //System.out.println(row);
            Iterator<Cell> cellIterator = row.cellIterator();
            int i = 0;
            while(cellIterator.hasNext()){
                CellRangeAddress region = sheetBook.getMergedRegion(i);
                for (int j = region.getFirstRow(); j <region.getLastRow() ; j++) {
                    Row row1 = rowIterator.next();
                    Cell cell1 = row1.getCell(0);
                    if (cell1.toString() != "") {
                        companies.add(new Company(cell1.toString()));
                    }
                    Cell cell2 = row1.getCell(1);
                    Cell cell3 = row1.getCell(2);
                    Cell cell4 = row1.getCell(3);
                    companies.get(companies.size()-1).getSubsidiaryCompany().add(new SubsidiaryCompany(cell2.toString(),cell3.getNumericCellValue(),cell4.getNumericCellValue()));
//                            System.out.println(cell1);
//                    System.out.print(cell2 + " \t"+ cell3 + "\t "+cell4 );
                    }

                }
            }
            showCompanyName(companies);
        }
        public static void showCompanyName(ArrayList<Company> companies){
            for (Company x:companies) {
                System.out.println(x);
            }
        }
}






