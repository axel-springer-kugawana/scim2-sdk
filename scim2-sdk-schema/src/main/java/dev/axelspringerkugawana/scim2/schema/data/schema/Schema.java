package dev.axelspringerkugawana.scim2.schema.data.schema;

import com.google.common.base.Objects;
import dev.axelspringerkugawana.scim2.schema.data.Attribute;
import dev.axelspringerkugawana.scim2.schema.data.BaseRecord;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * author: suvera
 * date: 10/17/2020 12:26 AM
 */
@Data
public class Schema extends BaseRecord {
    @NotBlank(message = "name cannot be empty")
    protected String name;
    protected String description;
    @NotEmpty(message = "attributes cannot be empty")
    protected Set<Attribute> attributes = new LinkedHashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Schema schema = (Schema) o;
        return Objects.equal(id, schema.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(super.hashCode(), id);
    }
}
