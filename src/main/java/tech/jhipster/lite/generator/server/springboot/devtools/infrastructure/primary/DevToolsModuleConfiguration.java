package tech.jhipster.lite.generator.server.springboot.devtools.infrastructure.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.jhipster.lite.generator.module.domain.properties.JHipsterModulePropertiesDefinition;
import tech.jhipster.lite.generator.module.infrastructure.primary.JHipsterModuleApiDoc;
import tech.jhipster.lite.generator.module.infrastructure.primary.JHipsterModuleResource;
import tech.jhipster.lite.generator.server.springboot.devtools.application.DevToolsApplicationService;

@Configuration
class DevToolsModuleConfiguration {

  @Bean
  JHipsterModuleResource devTools(DevToolsApplicationService devtools) {
    return JHipsterModuleResource
      .builder()
      .legacyUrl("/api/servers/spring-boot/technical-tools/devtools")
      .slug("springboot-devtools")
      .propertiesDefinition(JHipsterModulePropertiesDefinition.builder().addBasePackage().addProjectBaseName().addIndentation().build())
      .apiDoc(new JHipsterModuleApiDoc("Spring Boot - Tools", "Add spring boot tools."))
      .factory(devtools::buildModule);
  }
}