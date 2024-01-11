package bot.telegramm.Dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.*;


@Slf4j
public class RouteService {
    List<List<Integer>> routes =new ArrayList<>();

    public RouteService( ) {
        MarshRoute marshRoute=new MarshRoute() ;
        for(int i=0;i<100000 ;i++){   routes.add(marshRoute.addMarshRoute(i,new ArrayList<>()));  }// Здесь  заполнение routesMap
    }

    public boolean isDirectRoute(int from, int to) {
        Boolean response=false;
        for(List<Integer> route:routes){
            int fromRoutes=Collections.binarySearch(route,from);
            int toRoutes=Collections.binarySearch(route,to);
            if(fromRoutes>=0&&toRoutes>=0){response=true;break;}
        }
        log.info("количество записей  "+routes.size()*1000);
        return response;
    }
}

