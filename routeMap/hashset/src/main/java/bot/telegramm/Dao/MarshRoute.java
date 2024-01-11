package bot.telegramm.Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
 @NoArgsConstructor
 @Slf4j
public class MarshRoute {
    public Set<Integer> addMarshRoute(Integer id, Set<Integer> set){
        Integer begin=1000 *id,end=begin+1000 ;
        for(int i=begin;i<end;i++){  set.add(i); }//заполняем набор данных
        return set;
    }
}
