package guru.springframework.msscbeerservice.web.mappers;

import org.mapstruct.Mapper;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.web.model.BeerDto;

@Mapper
public interface BeerMapper {

    BeerDto BeerToBeerDto(Beer beer);
    Beer BeerDtoToBeer(BeerDto beerDto);
}
