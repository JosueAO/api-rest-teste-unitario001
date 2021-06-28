package br.com.evangelistadeti.beerstock.repository;

import br.com.evangelistadeti.beerstock.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {
    //@Override
    Optional<Beer> findByName(String name);
}
