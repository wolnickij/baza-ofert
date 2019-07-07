package pl.hf.bazaofert.Product;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class SteelGrade {
    @Id
    @GeneratedValue
    private Integer id;
    private String steelGradeName;
    private String manufacturingStandard;
    private String gradeAndStandard = steelGradeName + " " + manufacturingStandard;
}
