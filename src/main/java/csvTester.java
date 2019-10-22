import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class csvTester {

    public static void main(String[] args) throws IOException {

        String fileName = ("C:\\Users\\Student.DESKTOP-VNR47RU\\Desktop\\openCSVdemo\\src\\main\\resources\\cars.csv");

        try(Reader reader = Files.newBufferedReader(Paths.get(fileName))){

            ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
            strategy.setType(Car.class);
            String [] memberFieldsBindTwo = {"id", "Name","price"};
            strategy.setColumnMapping(memberFieldsBindTwo);

            CsvToBean <Car> csvToBean = new CsvToBeanBuilder(reader)
                    .withMappingStrategy(strategy)
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build()
                    ;

            Iterator<Car> carIterator = csvToBean.iterator();

            while (carIterator.hasNext()){
                Car car = carIterator.next();
                System.out.println(car);
            }

        }

    }

}
