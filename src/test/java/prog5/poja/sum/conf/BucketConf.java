package prog5.poja.sum.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import prog5.poja.sum.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
