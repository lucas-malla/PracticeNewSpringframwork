package practice.newSpringFramwwork.main;

import practice.newSpringFramwwork.Service.ApiConsumption;
import practice.newSpringFramwwork.Service.CombinesDatas;
import practice.newSpringFramwwork.model.Episodedatas;
import practice.newSpringFramwwork.model.SeasonData;
import practice.newSpringFramwwork.model.SerieDatas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private Scanner scanner = new Scanner(System.in);
    private ApiConsumption apiConsumption = new ApiConsumption();
    private CombinesDatas combinesDatas = new CombinesDatas();
    private final String URL_BASE ="http://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=25408fcb";

    public void showsTheMenu(){
        System.out.println("Entry the name of the series");
        var nameSerie = scanner.nextLine();
        var json = apiConsumption.getDatas(URL_BASE + nameSerie.replace(" ", "+") + API_KEY);
        var datas = combinesDatas.getDatas(json, SerieDatas.class);

        List<SeasonData> season = new ArrayList<>();
        for (int i = 1; i <=datas.totalTheSeason(); i++) {
            json = apiConsumption.getDatas(URL_BASE + nameSerie.replace(" ", "+") + "&Season=" +i+ API_KEY);
            var seasonData = combinesDatas.getDatas(json, SeasonData.class);
            season.add(seasonData);
        }

        System.out.println("Title the episode : ");
       season.forEach(t -> t.episodes().forEach(e -> System.out.println(e.title())));

        List<Episodedatas> episode = season.stream()
                .flatMap(t -> t.episodes().stream())
                .collect(Collectors.toList());
        //Filtramos los Top 5 episode
        System.out.println("Top 5 episode : ");
        episode.stream()
                .filter(e -> !e.evaluacion().equalsIgnoreCase("N/A"))
                .sorted(Comparator.comparing(Episodedatas::evaluacion))
                .limit(5)
                .forEach(System.out::println);
    }
}
