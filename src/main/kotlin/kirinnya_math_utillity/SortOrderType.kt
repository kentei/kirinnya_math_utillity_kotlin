package kirinnya_math_utillity

/**
 * Enum class that summarizes the sort order type.
 * @author Kentei_Syunrai
 * @since 1.0
 */
enum class SortOrderType {      
    /**
     * Sort in ascending order.
     * ex：<code>1, 3, 2</code>　→　<code>1, 2, 3</code>
     * @author Kentei_Syunrai
     * @since 1.0
     */
    ASCENDING,

    /**
     * Sort in descending order.
     * ex：<code>1, 3, 2</code>　→　<code>3, 2, 1</code>
     * @author Kentei_Syunrai
     * @since 1.0
     */
    DESCENDING,

    /**
     * Unsorted.
     * @author Kentei_Syunrai
     * @since 1.0
     */
    UNSORTED
}