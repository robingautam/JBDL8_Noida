package org.gfg.JBDL8_SpringBoot.Logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Logging {

    Logger LOGGER = LoggerFactory.getLogger(Logging.class);

    @GetMapping("/logger")
    public String Log(){
        LOGGER.info("Hi This is info message");
        LOGGER.warn("Hi This is WARN message");
        LOGGER.error("Hi This is error message");
        LOGGER.debug("Hi This is DEBUG message");
        LOGGER.trace("Hi This is TRACE message");
        return "OK";
    }
}
