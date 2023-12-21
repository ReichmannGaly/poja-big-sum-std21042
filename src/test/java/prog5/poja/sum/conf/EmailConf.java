package prog5.poja.sum.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import prog5.poja.sum.PojaGenerated;

@PojaGenerated
public class EmailConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.ses.source", () -> "dummy-ses-source");
  }
}
