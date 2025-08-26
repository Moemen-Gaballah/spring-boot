package com.springbootmoemen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(1, "Moemen", "PHP, Laravel"),
                new SoftwareEngineer(2, "Eslam", "js, node, react"),
                new SoftwareEngineer(3, "Hamza", "java, spring, spring boot")
        );
    }

    ;
}
