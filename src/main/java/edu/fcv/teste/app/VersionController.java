package edu.fcv.teste.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/version")
public class VersionController {

    @RequestMapping(method = RequestMethod.GET)
    public String getVersion() {
        return "development";
    }

}
