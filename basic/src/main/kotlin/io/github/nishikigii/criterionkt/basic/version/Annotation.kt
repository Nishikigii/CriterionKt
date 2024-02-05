package io.github.nishikigii.criterionkt.basic.version

/**
 * type annotation to version
 */
enum class Annotation
{

    Alpha,

    Beta,

    Release,

    /**
     * another name for the beta version.
     * you should change it into 「Beta」because it will be deprecated soon.
     */
    @Deprecated(replaceWith = ReplaceWith("Beta"), message = "This designation will be discarded")
    Snapshot,
}