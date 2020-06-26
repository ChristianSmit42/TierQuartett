package de.neuefische.tierquartett.db;

import de.neuefische.tierquartett.model.Tier;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TierDbMongo extends PagingAndSortingRepository<Tier,String> {
}
