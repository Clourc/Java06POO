class Wilder {
  private String firstname;
  private boolean aware;

  // constructor
  public Wilder(String firstname, boolean aware) {
    this.firstname = firstname;
    this.aware = aware;
  }

  // getters
  public String getFirstname() {
    return this.firstname;
  }

  public boolean isAware() {
    return this.aware;
  }

  // setters
  public void setFirstname(String newFirstname) {
    this.firstname = newFirstname;
  }

  public void setAware(boolean newIsAware) {
    this.aware = newIsAware;
  }

  // method
  public String whoAmI() {
    if (this.aware) {
      return "Je m'appelle " + this.firstname + " et je suis aware";
    }
    return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
  }
}