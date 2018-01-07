package sphynx.generated;

import java.lang.String;
import org.apache.commons.lang3.SerializationUtils;
import sphynx.unitmodel.CodeUnit;
import sphynx.unitmodel.CodeUnitDatumType;
import sphynx.unitmodel.CodeUnitModifier;

public class StringUnitBuilder {
  private CodeUnit codeUnit;

  private StringUnitBuilder() {
    initializeDefaultCodeUnit();
  }

  private void initializeDefaultCodeUnit() {
    byte[] serializedCodeUnit = new byte[] {-84, -19, 0, 5, 115, 114, 0, 25, 115, 112, 104, 121, 110, 120, 46, 117, 110, 105, 116, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, -107, -25, -19, 116, 34, -109, 119, -102, 2, 0, 3, 76, 0, 4, 100, 97, 116, 97, 116, 0, 15, 76, 106, 97, 118, 97, 47, 117, 116, 105, 108, 47, 77, 97, 112, 59, 76, 0, 12, 115, 117, 98, 67, 111, 100, 101, 85, 110, 105, 116, 115, 116, 0, 16, 76, 106, 97, 118, 97, 47, 117, 116, 105, 108, 47, 76, 105, 115, 116, 59, 76, 0, 4, 116, 121, 112, 101, 116, 0, 31, 76, 115, 112, 104, 121, 110, 120, 47, 117, 110, 105, 116, 109, 111, 100, 101, 108, 47, 67, 111, 100, 101, 85, 110, 105, 116, 84, 121, 112, 101, 59, 120, 112, 115, 114, 0, 17, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 72, 97, 115, 104, 77, 97, 112, 5, 7, -38, -63, -61, 22, 96, -47, 3, 0, 2, 70, 0, 10, 108, 111, 97, 100, 70, 97, 99, 116, 111, 114, 73, 0, 9, 116, 104, 114, 101, 115, 104, 111, 108, 100, 120, 112, 63, 64, 0, 0, 0, 0, 0, 12, 119, 8, 0, 0, 0, 16, 0, 0, 0, 1, 126, 114, 0, 34, 115, 112, 104, 121, 110, 120, 46, 117, 110, 105, 116, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, 68, 97, 116, 117, 109, 84, 121, 112, 101, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 114, 0, 14, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 69, 110, 117, 109, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 112, 116, 0, 9, 68, 65, 84, 65, 95, 84, 89, 80, 69, 115, 114, 0, 30, 115, 112, 104, 121, 110, 120, 46, 117, 110, 105, 116, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, 68, 97, 116, 117, 109, -61, 44, -71, 3, 48, 26, 104, 91, 2, 0, 1, 76, 0, 9, 100, 97, 116, 117, 109, 68, 97, 116, 97, 113, 0, 126, 0, 2, 120, 112, 115, 114, 0, 20, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 76, 105, 110, 107, 101, 100, 76, 105, 115, 116, 12, 41, 83, 93, 74, 96, -120, 34, 3, 0, 0, 120, 112, 119, 4, 0, 0, 0, 1, 118, 114, 0, 16, 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 83, 116, 114, 105, 110, 103, -96, -16, -92, 56, 122, 59, -77, 66, 2, 0, 0, 120, 112, 120, 120, 115, 114, 0, 19, 106, 97, 118, 97, 46, 117, 116, 105, 108, 46, 65, 114, 114, 97, 121, 76, 105, 115, 116, 120, -127, -46, 29, -103, -57, 97, -99, 3, 0, 1, 73, 0, 4, 115, 105, 122, 101, 120, 112, 0, 0, 0, 0, 119, 4, 0, 0, 0, 0, 120, 126, 114, 0, 29, 115, 112, 104, 121, 110, 120, 46, 117, 110, 105, 116, 109, 111, 100, 101, 108, 46, 67, 111, 100, 101, 85, 110, 105, 116, 84, 121, 112, 101, 0, 0, 0, 0, 0, 0, 0, 0, 18, 0, 0, 120, 113, 0, 126, 0, 8, 116, 0, 5, 70, 73, 69, 76, 68};
    this.codeUnit = SerializationUtils.deserialize(serializedCodeUnit);
  }

  public static StringUnitBuilder createWithIdentifier(String identifier) {
    StringUnitBuilder cub = new StringUnitBuilder();
    cub.codeUnit.addCodeUnitDatum(CodeUnitDatumType.IDENTIFIER, identifier);
    return cub;
  }

  public CodeUnit end() {
    return codeUnit;
  }

  public StringUnitBuilder withModifiers(CodeUnitModifier... modifiers) {
    this.codeUnit.addCodeUnitDatum(CodeUnitDatumType.MODIFIER, modifiers);
    return this;
  }
}
