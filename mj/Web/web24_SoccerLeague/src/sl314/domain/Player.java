package sl314.domain;

/**
 * This domain object represents a player in a sports league.
 * The data attributes are all package-private to allow access to them
 * in the {@link RegisterService} class.
 */
public class Player {

  String name = "";
  String address = "";
  String city = "";
  String province = "";
  String postalCode = "";

  /**
   * This is the constructor.  I tis package-private to prevent
   * misuse.  The {@link RegisterServer} method should be used to
   * create a new player object.
   */
  Player(String name) {
    this(name, "", "", "", "");
  }

  /**
   * This is the full constructor.
   */
  Player(String name, String address, String city,
         String province, String postalCode) {
    this.name = name;
    this.address = address;
    this.city = city;
    this.province = province;
    this.postalCode = postalCode;
  }

  public String getName() {
    return name;
  }
  public void setName(String value) {
    name = value;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String value) {
    address = value;
  }
  public String getCity() {
    return city;
  }
  public void setCity(String value) {
    city = value;
  }
  public String getProvince() {
    return province;
  }
  public void setProvince(String value) {
    province = value;
  }
  public String getPostalCode() {
    return postalCode;
  }
  public void setPostalCode(String value) {
    postalCode = value;
  }
}
