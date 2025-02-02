package com.ham.dodododog.core.presentation

import androidx.compose.runtime.Composable
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc
import dev.icerock.moko.resources.format

@Composable
actual fun getString(
    id: StringResource, args: List<Any>
): String {
    return if (args.isEmpty()) {
        StringDesc.Resource(id).localized()
    } else {
        id.format(*args.toTypedArray()).localized()
    }
}
@Composable
actual fun getString(id: StringResource): String {
    return StringDesc.Resource(id).localized()
}