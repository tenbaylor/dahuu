package com.gobest.error;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.context.embedded.ErrorPage;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

/**
 * @author baylorten
 */
@Component
public class CustomServletContainer implements EmbeddedServletContainerCustomizer {

    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8001);
        container.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND, "/error_page_404"));
        container.setSessionTimeout(10, TimeUnit.MINUTES);

    }


}
