package pl.hf.bazaofert.product;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
class SteelGrade {
    @Id
    @GeneratedValue
    private Integer id;
    private String steelGradeName;
    private String manufacturingStandard;
    private String gradeAndStandard = steelGradeName + " " + manufacturingStandard;
    @OneToMany(fetch= FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy="grade")
    List<ProductPipe> productPipes;
}
