class TopManager extends Employee {

  private static final double TOP_MANAGER_BONUS_PERCENT = 1.5;

  TopManager() {
    super(50000);
  }

  @Override
  public double getMonthSalary() {
    if (getCompany().getIncome() > 10000000) {
      return getFixSalary() * TOP_MANAGER_BONUS_PERCENT;
    } else {
      return getFixSalary();
    }
  }
}
