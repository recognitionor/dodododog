package com.ham.dodododog.core.presentation

import androidx.compose.runtime.Composable
import dev.icerock.moko.resources.StringResource

@Composable
expect fun getString(id: StringResource, args: List<Any> = emptyList()): String

@Composable
expect fun getString(id: StringResource): String