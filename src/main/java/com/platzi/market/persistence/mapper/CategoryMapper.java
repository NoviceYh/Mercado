package com.platzi.market.persistence.mapper;

import com.platzi.market.domain.Category;
import com.platzi.market.persistence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoryMapper {

    //Despues de Java 8
    @Mapping(source = "idCategoria", target = "categoryId")
    @Mapping(source = "descripcion", target = "categoryName")
    @Mapping(source = "estado", target = "active")
    Category toCategory(Categoria categoria);

    //InheritInverse para hacer el inverso del mapping de arriba
    @InheritInverseConfiguration
    @Mapping(target = "productos", ignore = true)
    Categoria toCategoria(Category category);

}
