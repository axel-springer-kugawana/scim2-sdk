package dev.axelspringerkugawana.scim2.server.service;

import dev.axelspringerkugawana.scim2.schema.data.misc.ListResponse;
import dev.axelspringerkugawana.scim2.schema.data.misc.SearchRequest;
import dev.axelspringerkugawana.scim2.schema.ex.ScimException;

/**
 * author: suvera
 * date: 10/19/2020 12:23 PM
 */
public interface Scim2SearchService {
    
    ListResponse<?> search(SearchRequest request) throws ScimException;
}
