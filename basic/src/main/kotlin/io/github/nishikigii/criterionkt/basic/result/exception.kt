package io.github.nishikigii.criterionkt.basic.result

/**
 * 简化 Result<T> 判断
 */
fun <T> Result<T>.exception( action: (Throwable)->T = {throw it} ): T = this.fold (
    onSuccess = { it },
    onFailure = { action(it) }
)