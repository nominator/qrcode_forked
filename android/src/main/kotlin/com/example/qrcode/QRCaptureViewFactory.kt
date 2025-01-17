package com.example.qrcode

import android.content.Context
import com.example.qrcode.QRCaptureView
import io.flutter.plugin.common.BinaryMessenger
import io.flutter.plugin.common.PluginRegistry
import io.flutter.plugin.common.StandardMessageCodec
import io.flutter.plugin.platform.PlatformView
import io.flutter.plugin.platform.PlatformViewFactory


class QRCaptureViewFactory(private val messenger: BinaryMessenger) :
    PlatformViewFactory(StandardMessageCodec.INSTANCE) {

    override fun create(context: Context, id: Int, obj: Any?): PlatformView {
        return QRCaptureView(id, messenger, context)
    }

}