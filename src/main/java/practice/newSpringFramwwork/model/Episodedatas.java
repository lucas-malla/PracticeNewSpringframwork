package practice.newSpringFramwwork.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Episodedatas(
        @JsonAlias("Title") String title,
        @JsonAlias("Episode") Integer numberEpisode,
        @JsonAlias("imdbRating") String evaluacion,
        @JsonAlias("Released") String dateStart
) {
}
