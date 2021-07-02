package com.tut.multipledatasourceservice.repository.merchant;

import com.tut.multipledatasourceservice.model.db.merchant.Merchant;
import org.springframework.data.repository.CrudRepository;

public interface MerchantRepository extends CrudRepository<Merchant,Long> {
}
