/**
 * Class implementing an employee.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/10/">Lab 10 Description</a>
 */
public class Employee {
    /** String name. */
    private String name;
    /** String manager. */
    private String manager;

    /**
     * Constructor for initialization.
     *
     * @param n is a String.
     * @param m is a String.
     */
    public Employee(final String n, final String m) {
        this.name = n;
        this.manager = m;
    }

    /**
     * Getter for name.
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter for name.
     *
     * @param n is a String.
     */
    public void setName(final String n) {
        this.name = n;
    }

    /**
     * Getter for manager.
     *
     * @return manager
     */
    public String getManager() {
        return manager;
    }

    /**
     * Setter for manager.
     *
     * @param m is a String.
     */
    public void setManager(final String m) {
        this.manager = m;
    }
}
