package com.agt.mes.helloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class ExitController {

    @RequestMapping("/exit")
    public void exit() {
        System.exit(1);
    }
}
