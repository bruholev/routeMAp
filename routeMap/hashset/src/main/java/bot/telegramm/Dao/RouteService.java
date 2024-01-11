package bot.telegramm.Dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;


@Slf4j
public class RouteService {
   Map<Integer,Set<Integer>> routes =new HashMap<>();


    public RouteService( ) {
        MarshRoute marshRoute=new MarshRoute() ;
 for(int i=0;i<100000 ;i++){   routes.put(i, marshRoute.addMarshRoute(i,new HashSet<>()));  }// Здесь  заполнение routesMap
  }


    public boolean isDirectRoute(int from, int to) {
        Boolean response=false;
        Set<Integer> fromRoutes;
        for(int i=0;i<routes.size();i++){
            fromRoutes =  routes.getOrDefault(i,Collections.emptySet());
            if((fromRoutes.contains(from))&&(fromRoutes.contains(to))){response=true;break;}
        }
        log.info("количество записей  "+routes.size()*1000);
        return response;
    }
}

