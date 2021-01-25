package guru.springframework.msscbeerservice.repository;

import guru.springframework.msscbeerservice.domain.Beer;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Component;


import java.util.UUID;


public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {
}
