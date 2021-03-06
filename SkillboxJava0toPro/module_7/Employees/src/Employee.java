import java.time.LocalDate;

public abstract class Employee {

  private Integer id;
  private double fixSalary;
  private static Integer idCounter = 0;
  private double managerSales;
  private Company company;
  private LocalDate hireDate;

  Employee(double fixSalary) {
    this.fixSalary = fixSalary;
    id = ++idCounter;
  }

  public double getMonthSalary() {
    return getFixSalary();
  }

  void sale(double saleAmount) {
    managerSales = managerSales + saleAmount;
    company.calcIncome();
  }

  double getManagerSales() {
    return managerSales;
  }

  String getEmployeeType() {
    return this.getClass().getSimpleName();
  }

  double getFixSalary() {
    return fixSalary;
  }

  Company getCompany() {
    return company;
  }

  void setCompany(Company company) {
    this.company = company;
  }

  Integer getId() {
    return id;
  }

  LocalDate getHireDate() {
    return hireDate;
  }

  String getHireDateToString() {
    return Helper.formatDate(hireDate);
  }

  void setHireDate(LocalDate date) {
    hireDate = date;
  }
}
