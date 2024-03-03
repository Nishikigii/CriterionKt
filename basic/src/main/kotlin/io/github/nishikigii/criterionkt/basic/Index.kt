package io.github.nishikigii.criterionkt.basic

/**
 * special indexes.
 */
enum class Index
{
    Last,

    First;

    /**
     * the order between two objects.
     */
    enum class Order
    {
        Before,

        After
    }

}