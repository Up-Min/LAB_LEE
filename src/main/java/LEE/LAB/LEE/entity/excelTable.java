package LEE.LAB.LEE.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.annotation.Id;

@Entity
@Slf4j
@Table (name = "exceltable")
public class excelTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String col1;

    private String col2;

    private String col3;

    private String col4;

    public static excelTable createExcelTable(String col1, String col2, String col3, String col4 ){
        excelTable table = new excelTable();

        table.col1 = col1;
        table.col2 = col2;
        table.col3 = col3;
        table.col4 = col4;

        return table;
    }

}
