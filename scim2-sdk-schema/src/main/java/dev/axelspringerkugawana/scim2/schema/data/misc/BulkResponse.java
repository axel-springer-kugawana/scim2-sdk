package dev.axelspringerkugawana.scim2.schema.data.misc;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import dev.axelspringerkugawana.scim2.schema.ScimConstant;
import dev.axelspringerkugawana.scim2.schema.data.meta.MetaRecord;
import lombok.Data;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * author: suvera
 * date: 10/17/2020 12:06 PM
 */
@SuppressWarnings("unused")
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class BulkResponse {
    private Set<String> schemas;
    private String id;
    private MetaRecord meta;

    private Integer failOnErrors;
    @JsonProperty("Operations")
    private List<BulkOperation> operations;

}
