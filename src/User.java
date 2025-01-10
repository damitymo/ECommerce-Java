import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {
    private String name;
    private String email;
    private List <Expense> expenses;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.expenses = new ArrayList<>();
    }
    public void addExpense(double amount, Date date, Category category, String description) {
        Expense expense = new Expense(amount, date, category, description);
        expenses.add(expense);
        System.out.println("Expense added: " + expense);
    }
    public void removeExpense(int index) throws ExpenseNotFoundException {
        if (index < 0 || index >= expenses.size()) {
            throw new ExpenseNotFoundException("Expense not found at index: " + index);
        }
        Expense removedExpense = expenses.remove(index);
        System.out.println("Expense removed: " + removedExpense);
    }
    

}
