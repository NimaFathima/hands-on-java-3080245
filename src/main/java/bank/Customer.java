package bank;

public class Customer {
  private int id;
  private String name;
  private String password;
  private int accountId;

  public Customer(int id,String name,String username,String password,int accountId){
    setId(Id);
    setName(name);
    setusername(username);
    setPassword(password);
    setAccountId(accountId);
  }


  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return this.password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public int getAccountId() {
    return this.accountId;
  }

  public void setAccountId(int accountId) {
    this.accountId = accountId;
  }

}
