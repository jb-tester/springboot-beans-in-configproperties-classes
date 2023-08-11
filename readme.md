# Beans defined inside @ConfigurationProperties-classes

we don't recognize the beans defined as `@Bean`-annotated methods inside the `@ConfigurationProperties`-annotated classes, if these classes are added to context using the `@EnableConfigurationProperties`
If the configuration properties class is annotated with `@Component` itself, or is scanned by `@ConfigurationPropertiesScan`, then the beans defined there are recognized.

[IDEA-328118](https://youtrack.jetbrains.com/issue/IDEA-328118)