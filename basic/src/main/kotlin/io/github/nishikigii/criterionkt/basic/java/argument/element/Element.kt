package io.github.nishikigii.criterionkt.basic.java.argument.element

/**
 * parts of jvm startup parameters.
 *
 * FULLY NAME: Java Virtual Machine Startup Arguments Element.
 */
enum class Element
{
    // flags.
    Flag,

    // options.
    Option,

    // jar list.
    Classpath,

    // used to help jvm to finding the main function.
    MainClass,

    // it will be assigned to the main function's String array signature.
    Application
}