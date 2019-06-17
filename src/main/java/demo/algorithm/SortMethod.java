package demo.algorithm;

public enum SortMethod {
    /** SELECTION_SORT */
    SELECTION_SORT("SELECTION_SORT", "selection sort"),

    /** INSERTION_SORT */
    INSERTION_SORT("INSERTION_SORT", "insertion sort");

    private final String code;

    private final String description;

    SortMethod(String code, String description) {
        this.code = code;
        this.description = description;
    }

    /**
     * Getter method for property <tt>code</tt>.
     *
     * @return property value of code
     */
    public String getCode() {
        return code;
    }

    /**
     * Getter method for property <tt>description</tt>.
     *
     * @return property value of description
     */
    public String getDescription() {
        return description;
    }
}
