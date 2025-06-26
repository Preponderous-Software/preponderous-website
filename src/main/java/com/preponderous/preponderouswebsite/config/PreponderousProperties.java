
package com.preponderous.preponderouswebsite.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "preponderous")
@Data
public class PreponderousProperties {
    private CompanyInfo company;
    private List<Project> projects;

    @Data
    public static class CompanyInfo {
        private String name;
        private String description;
        private String githubLink;
    }

    @Data
    public static class Project {
        private String title;
        private String description;
        private String githubLink;
        private String technology;
    }
}