package io.github.nishikigii.criterionkt.natives.macos

import io.github.nishikigii.criterionkt.natives.home
import java.io.File


/**
 * application support folder.
 */
fun support( application: String ) = File(supportPath(application))

/**
 * application support folder path.
 */
fun supportPath( application: String ) = "$home/Library/Application Support/$application"