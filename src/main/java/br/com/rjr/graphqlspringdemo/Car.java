package br.com.rjr.graphqlspringdemo;

import io.leangen.graphql.annotations.GraphQLQuery;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class Car {
    @GraphQLQuery(name = "id", description = "A car's id")
    private Long id;
    @GraphQLQuery(name = "name", description = "A car's name")
    private @NonNull String name;
}
