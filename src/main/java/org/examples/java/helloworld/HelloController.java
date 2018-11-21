package org.examples.java.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        return String.format(
                 "Hello Jenkins X + Spring Boot!\n" +
                 "java version \"%s\"\n%s (build %s)\n%s (build %s, %s)\n" +
                 "The number of processors on this box are: %d\n",
 		  System.getProperty("java.version"),
                  System.getProperty("java.runtime.name"),
                  System.getProperty("java.runtime.version"),
                  System.getProperty("java.vm.name"),
                  System.getProperty("java.vm.version"),
                  System.getProperty("java.vm.info"),
                  Runtime.getRuntime().availableProcessors());
    }
    
}
