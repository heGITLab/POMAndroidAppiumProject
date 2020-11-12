package pomappiumautomation.datareader;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pomappiumautomation.base.TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reader extends TestBase {

    public XSSFWorkbook workBook;
    public XSSFSheet workSheet;
    public XSSFCell cell;
    public int columnSize;
    public int rowSize;
    public CellType type;
    public Object[][] obArr = null;

    public Object[][] getData() {

        try {

            FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/pomappiumautomation/data/conduit.xlsx");
            workBook = new XSSFWorkbook(file);
            workSheet = workBook.getSheet("Sheet1");

            rowSize = workSheet.getLastRowNum();
            columnSize = workSheet.getRow(1).getPhysicalNumberOfCells();
            obArr = new Object[rowSize][columnSize];

            for (int i = 1; i <= rowSize; i++) {
                for (int k = 0; k < columnSize; k++) {

                    cell = workSheet.getRow(i).getCell(k);

                    if (cell != null) {

                        type = cell.getCellType();

                        switch (type) {
                            case NUMERIC:

                                if (DateUtil.isCellDateFormatted(cell)) {

                                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                                    obArr[i - 1][k] = df.format(new Date());

                                } else {

                                    obArr[i - 1][k] = String.format("%d", (long) cell.getNumericCellValue());

                                }
                                break;

                            case STRING:

                                obArr[i - 1][k] = cell.getStringCellValue();
                                break;

                            default:

                                obArr[i - 1][k] = "";
                                break;

                        }
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

        return obArr;
    }

}
