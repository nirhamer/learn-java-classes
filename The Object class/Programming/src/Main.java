class Account {

  private long id;
  private String code;
  private Long balance;

  public Account(long id, String code, Long balance) {
    this.id = id;
    this.code = code;
    this.balance = balance;
  }


  public String toString () {
    return "Account{id=" + id + ", code='" + code + "', balance=" + balance + "}";
  }
}