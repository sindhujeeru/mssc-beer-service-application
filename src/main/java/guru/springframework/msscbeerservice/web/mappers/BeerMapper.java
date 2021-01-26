package guru.springframework.msscbeerservice.web.mappers;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.web.model.BeerDto;
import org.springframework.stereotype.Component;

//@Component
@Mapper(uses = {DateMapper.class})
@DecoratedWith(BeerMapperDecorator.class)
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);

    BeerDto BeerToBeerDtoWithInventory(Beer beer);

    Beer BeerDtoToBeer(BeerDto beerDto);
}
