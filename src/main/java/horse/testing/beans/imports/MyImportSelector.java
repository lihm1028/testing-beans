package horse.testing.beans.imports;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author li.hongming
 * @date 2023/4/12
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{Cat.class.getName(), "horse.testing.beans.imports.Dog"};
    }
}
