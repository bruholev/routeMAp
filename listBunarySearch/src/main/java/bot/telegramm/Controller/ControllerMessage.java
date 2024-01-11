package bot.telegramm.Controller;

import bot.telegramm.Dao.RouteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import java.util.concurrent.*;

@RestController
@Slf4j
public class ControllerMessage {

        @GetMapping("/api/direct")
        public String checkDirectRoute(@RequestParam int from, @RequestParam int to) {
            RouteService routeService= new RouteService( );
            boolean direct = routeService.isDirectRoute(from, to);
            return "from :"+from+"\n to: "+to+"\n direct: "+direct;
        }

    }


