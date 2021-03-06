/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan.templates

import org.lwjgl.generator.*
import org.lwjgl.vulkan.*

val AMD_gcn_shader = "AMDGCNShader".nativeClassVK("AMD_gcn_shader", postfix = AMD) {
	documentation =
		"""
		This extension adds support for the following SPIR-V extension in {apiname}:

		<ul>
			<li>SPV_AMD_gcn_shader</li>
		</ul>
		"""

	IntConstant(
		"The extension specification version.",

		"AMD_GCN_SHADER_SPEC_VERSION".."1"
	)

	StringConstant(
		"The extension name.",

		"AMD_GCN_SHADER_EXTENSION_NAME".."VK_AMD_gcn_shader"
	)
}