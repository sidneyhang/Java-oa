package com.tinthon.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.filter.RegexPatternTypeFilter;

import java.util.regex.Pattern;
import com.tinthon.config.RootConfig.WebPackage;
/**
 * Created by sidney on 2017/1/7.
 */
@Configuration
@ComponentScan(basePackages = {"com.tinthon.repository"},
        excludeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM, value = WebPackage.class)
})
public class RootConfig {
    public static class WebPackage extends RegexPatternTypeFilter {
        public WebPackage() {
            super(Pattern.compile("Spitter\\.controller"));
        }
    }
}
