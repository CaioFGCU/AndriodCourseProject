package sample;

public enum EngineType {
  FOUR_CYLINDER("V4"),
  SIX_CYLINDER("V6"),
  EIGHT_CYLINDER("V8"),
  TWELVE_CYLINDER("V12");

  private String code;

  EngineType(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}
