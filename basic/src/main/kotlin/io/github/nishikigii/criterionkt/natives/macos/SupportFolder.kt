package io.github.nishikigii.criterionkt.natives.macos

import java.io.File


/**
 * application support folder.
 */
fun support( application: String ) = File(supportPath(application))

/**
 * application support folder path.
 */
fun supportPath( application: String ) = "${System.getProperty("user.home")}/Library/Application Support/$application"