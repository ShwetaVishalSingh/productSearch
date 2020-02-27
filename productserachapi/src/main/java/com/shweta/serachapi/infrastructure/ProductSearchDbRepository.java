package com.shweta.serachapi.infrastructure;

import org.springframework.data.repository.CrudRepository;

public interface ProductSearchDbRepository  extends CrudRepository<ProductSearchDatabase, String> {
}
