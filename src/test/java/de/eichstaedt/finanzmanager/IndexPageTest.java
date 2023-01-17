package de.eichstaedt.finanzmanager;

import io.quarkus.test.common.http.TestHTTPResource;
import io.quarkus.test.junit.QuarkusTest;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by konrad.eichstaedt@gmx.de on 17.01.23.
 */

@QuarkusTest
public class IndexPageTest {

    @TestHTTPResource("index.xhtml")
    URL url;

    @Test
    public void testNavigationToIndexPage() throws IOException {

        try (InputStream in = url.openStream()) {
            String contents = new String(in.readAllBytes(), StandardCharsets.UTF_8);
            Assertions.assertTrue(contents.contains("<title>Finanzmanager für Ihre Ausgaben</title>"));
        }
    }

}
