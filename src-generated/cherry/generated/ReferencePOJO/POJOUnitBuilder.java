package cherry.generated.ReferencePOJO;

import cherry.model.ClassCodeUnit;
import cherry.model.CodeUnitDatumType;
import cherry.model.FieldCodeUnit;
import cherry.model.MethodCodeUnit;
import cherry.platform.CodeUnitBuilderUtils;
import java.lang.String;
import org.apache.commons.lang3.SerializationUtils;

public class POJOUnitBuilder {
  private ClassCodeUnit codeUnit;

  private POJOUnitBuilder() {
    initializeDefaultCodeUnit();
  }

  private void initializeDefaultCodeUnit() {
    // Initializes this builder's data with default data encoded into a byte[]
    byte[] serializedCodeUnit = new byte[] {-84, -19, 0, 5, 115, 114, 0, 26, 99, 104, 101, 114, 114, 121, 46, 109, 111, 100, 101, 108, 46, 67, 108, 97, 115, 115, 67, 111, 100, 101, 85, 110, 105, 116, 59, 27, 24, 89, 16, -111, -37, -122, 2, 0, 0, 120, 114, 0, 21, 99, 104, 101, 114, 114, 121, 46, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, -4, 20, 31, 95, -80, 39, -16, 90, 2, 0, 3, 76, 0, 4, 100, 97, 116, 97, 116, 0, 15, 76, 106, 97, 118, 97, 47, 117, 116, 105, 108, 47, 77, 97, 112, 59, 76, 0, 12, 115, 117, 98, 67, 111, 100, 101, 85, 110, 105, 116, 115, 116, 0, 16, 76, 106, 97, 118, 97, 47, 117, 116, 105, 108, 47, 76, 105, 115, 116, 59, 76, 0, 4, 116, 121, 112, 101, 116, 0, 27, 76, 99, 104, 101, 114, 114, 121, 47, 109, 111, 100, 101, 108, 47, 67, 111, 100, 101, 85, 110, 105, 116, 84, 121, 112, 101, 59, 120, 112, 115, 114, 0, 17, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 72, 97, 115, 104, 77, 97, 112, 5, 7, -38, -63, -61, 22, 96, -47, 3, 0, 2, 70, 0, 10, 108, 111, 97, 100, 70, 97, 99, 116, 111, 114, 73, 0, 9, 116, 104, 114, 101, 115, 104, 111, 108, 100, 120, 112, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 1, 126, 114, 0, 30, 99, 104, 101, 114, 114, 121, 46, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, 68, 97, 116, 117, 109, 84, 121, 112, 101, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 114, 0, 14, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 69, 110, 117, 109, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 112, 116, 0, 8, 77, 79, 68, 73, 70, 73, 69, 82, 115, 114, 0, 26, 99, 104, 101, 114, 114, 121, 46, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, 68, 97, 116, 117, 109, 97, 71, -38, 17, -62, -37, -11, 8, 2, 0, 1, 76, 0, 9, 100, 97, 116, 117, 109, 68, 97, 116, 97, 116, 0, 18, 76, 106, 97, 118, 97, 47, 108, 97, 110, 103, 47, 79, 98, 106, 101, 99, 116, 59, 120, 112, 117, 114, 0, 32, 91, 76, 99, 104, 101, 114, 114, 121, 46, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, 77, 111, 100, 105, 102, 105, 101, 114, 59, -49, -75, 67, 100, 89, 9, -12, 81, 2, 0, 0, 120, 112, 0, 0, 0, 2, 126, 114, 0, 29, 99, 104, 101, 114, 114, 121, 46, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, 77, 111, 100, 105, 102, 105, 101, 114, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 113, 0, 126, 0, 9, 116, 0, 6, 80, 85, 66, 76, 73, 67, 126, 113, 0, 126, 0, 17, 116, 0, 8, 65, 66, 83, 84, 82, 65, 67, 84, 120, 115, 114, 0, 19, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 65, 114, 114, 97, 121, 76, 105, 115, 116, 120, -127, -46, 29, -103, -57, 97, -99, 3, 0, 1, 73, 0, 4, 115, 105, 122, 101, 120, 112, 0, 0, 0, 7, 119, 4, 0, 0, 0, 7, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 3, 126, 113, 0, 126, 0, 8, 116, 0, 10, 73, 68, 69, 78, 84, 73, 70, 73, 69, 82, 115, 113, 0, 126, 0, 12, 116, 0, 5, 103, 101, 116, 73, 100, 126, 113, 0, 126, 0, 8, 116, 0, 11, 82, 69, 84, 85, 82, 78, 95, 84, 89, 80, 69, 115, 113, 0, 126, 0, 12, 118, 114, 0, 3, 105, 110, 116, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 120, 112, 113, 0, 126, 0, 10, 115, 113, 0, 126, 0, 12, 117, 113, 0, 126, 0, 15, 0, 0, 0, 1, 113, 0, 126, 0, 18, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 1, 119, 4, 0, 0, 0, 1, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 1, 126, 113, 0, 126, 0, 8, 116, 0, 18, 77, 69, 84, 72, 79, 68, 95, 66, 79, 68, 89, 95, 83, 84, 82, 73, 78, 71, 115, 113, 0, 126, 0, 12, 116, 0, 10, 114, 101, 116, 117, 114, 110, 32, 105, 100, 59, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 126, 114, 0, 25, 99, 104, 101, 114, 114, 121, 46, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, 84, 121, 112, 101, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 113, 0, 126, 0, 9, 116, 0, 11, 77, 69, 84, 72, 79, 68, 95, 66, 79, 68, 89, 120, 126, 113, 0, 126, 0, 45, 116, 0, 6, 77, 69, 84, 72, 79, 68, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 3, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 5, 115, 101, 116, 73, 100, 113, 0, 126, 0, 30, 115, 113, 0, 126, 0, 12, 118, 114, 0, 4, 118, 111, 105, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 120, 112, 113, 0, 126, 0, 10, 115, 113, 0, 126, 0, 12, 117, 113, 0, 126, 0, 15, 0, 0, 0, 1, 113, 0, 126, 0, 18, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 2, 119, 4, 0, 0, 0, 2, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 2, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 5, 118, 97, 108, 117, 101, 126, 113, 0, 126, 0, 8, 116, 0, 9, 68, 65, 84, 65, 95, 84, 89, 80, 69, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 126, 113, 0, 126, 0, 45, 116, 0, 12, 77, 69, 84, 72, 79, 68, 95, 80, 65, 82, 65, 77, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 1, 113, 0, 126, 0, 40, 115, 113, 0, 126, 0, 12, 116, 0, 16, 116, 104, 105, 115, 46, 105, 100, 32, 61, 32, 118, 97, 108, 117, 101, 59, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 46, 120, 113, 0, 126, 0, 48, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 3, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 2, 105, 100, 113, 0, 126, 0, 64, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 113, 0, 126, 0, 10, 115, 113, 0, 126, 0, 12, 117, 113, 0, 126, 0, 15, 0, 0, 0, 2, 126, 113, 0, 126, 0, 17, 116, 0, 7, 80, 82, 73, 86, 65, 84, 69, 126, 113, 0, 126, 0, 17, 116, 0, 9, 84, 82, 65, 78, 83, 73, 69, 78, 84, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 126, 113, 0, 126, 0, 45, 116, 0, 5, 70, 73, 69, 76, 68, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 3, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 7, 115, 101, 116, 78, 97, 109, 101, 113, 0, 126, 0, 30, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 56, 113, 0, 126, 0, 10, 115, 113, 0, 126, 0, 12, 117, 113, 0, 126, 0, 15, 0, 0, 0, 1, 113, 0, 126, 0, 18, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 2, 119, 4, 0, 0, 0, 2, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 2, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 63, 113, 0, 126, 0, 64, 115, 113, 0, 126, 0, 12, 118, 114, 0, 16, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 83, 116, 114, 105, 110, 103, -96, -16, -92, 56, 122, 59, -77, 66, 2, 0, 0, 120, 112, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 68, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 1, 113, 0, 126, 0, 40, 115, 113, 0, 126, 0, 12, 116, 0, 18, 116, 104, 105, 115, 46, 110, 97, 109, 101, 32, 61, 32, 118, 97, 108, 117, 101, 59, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 46, 120, 113, 0, 126, 0, 48, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 3, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 4, 110, 97, 109, 101, 113, 0, 126, 0, 64, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 102, 113, 0, 126, 0, 10, 115, 113, 0, 126, 0, 12, 117, 113, 0, 126, 0, 15, 0, 0, 0, 1, 113, 0, 126, 0, 82, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 87, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 3, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 3, 115, 117, 109, 113, 0, 126, 0, 30, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 113, 0, 126, 0, 10, 115, 113, 0, 126, 0, 12, 117, 113, 0, 126, 0, 15, 0, 0, 0, 1, 113, 0, 126, 0, 18, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 3, 119, 4, 0, 0, 0, 3, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 2, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 1, 97, 113, 0, 126, 0, 64, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 68, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 2, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 1, 98, 113, 0, 126, 0, 64, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 68, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 1, 113, 0, 126, 0, 40, 115, 113, 0, 126, 0, 12, 116, 0, 13, 114, 101, 116, 117, 114, 110, 32, 97, 32, 43, 32, 98, 59, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 46, 120, 113, 0, 126, 0, 48, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 3, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 3, 115, 117, 109, 113, 0, 126, 0, 30, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 113, 0, 126, 0, 10, 115, 113, 0, 126, 0, 12, 117, 113, 0, 126, 0, 15, 0, 0, 0, 1, 113, 0, 126, 0, 18, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 4, 119, 4, 0, 0, 0, 4, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 2, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 1, 97, 113, 0, 126, 0, 64, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 68, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 2, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 1, 98, 113, 0, 126, 0, 64, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 68, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 2, 113, 0, 126, 0, 26, 115, 113, 0, 126, 0, 12, 116, 0, 1, 99, 113, 0, 126, 0, 64, 115, 113, 0, 126, 0, 12, 113, 0, 126, 0, 34, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 68, 115, 113, 0, 126, 0, 1, 115, 113, 0, 126, 0, 6, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 1, 113, 0, 126, 0, 40, 115, 113, 0, 126, 0, 12, 116, 0, 17, 114, 101, 116, 117, 114, 110, 32, 97, 32, 43, 32, 98, 32, 43, 32, 99, 59, 120, 115, 113, 0, 126, 0, 22, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 113, 0, 126, 0, 46, 120, 113, 0, 126, 0, 48, 120, 126, 113, 0, 126, 0, 45, 116, 0, 5, 67, 76, 65, 83, 83};
    this.codeUnit = SerializationUtils.deserialize(serializedCodeUnit);
  }

  public static POJOUnitBuilder createWithIdentifier(String identifier) {
    POJOUnitBuilder cub = new POJOUnitBuilder();
    cub.codeUnit.addCodeUnitDatum(CodeUnitDatumType.IDENTIFIER, identifier);
    return cub;
  }

  public ClassCodeUnit end() {
    this.codeUnit.addSubCodeUnits(CodeUnitBuilderUtils.createDefaultMethodCodeUnits(codeUnit));
    return codeUnit;
  }

  public POJOUnitBuilder withField(FieldCodeUnit codeUnit) {
    this.codeUnit.addSubCodeUnit(codeUnit);
    return this;
  }

  public POJOUnitBuilder withMethod(MethodCodeUnit codeUnit) {
    this.codeUnit.addSubCodeUnit(codeUnit);
    return this;
  }
}