package practice.newSpringFramwwork.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record SerieDatas(
        @JsonAlias("Title") String title,
        @JsonAlias("totalSeasons") Integer totalTheSeason,
        @JsonAlias("imdbRating") String evaluation
) {
}
