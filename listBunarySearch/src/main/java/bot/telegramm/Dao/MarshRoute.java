package bot.telegramm.Dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@NoArgsConstructor
public class MarshRoute {

    public List<Integer> addMarshRoute(Integer id,List<Integer> list){
        Integer begin=1000 *id,end=begin+1000 ;
        for(int i=begin;i<end;i++){  list.add(i); }//заполняем набор данных
        return list;
    }
}
