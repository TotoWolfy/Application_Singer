package com.example.appli_singer.custom_icons

import androidx.compose.foundation.Image
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.materialIcon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.tooling.preview.Preview

val Icons.Clap: ImageVector
    get() {
        if (_clap != null) {
            return _clap!!
        }
        _clap = materialIcon(name = "Clap") {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 1.0F,
                strokeAlpha = 1.0F,
                strokeLineWidth = 0.0F,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0F,
                pathFillType = PathFillType.NonZero,
            ) {
                moveTo(18.0F, 4.0F)
                lineToRelative(2.0F, 4.0F)
                horizontalLineToRelative(-3.0F)
                lineToRelative(-2.0F, -4.0F)
                horizontalLineToRelative(-2.0F)
                lineToRelative(2.0F, 4.0F)
                horizontalLineToRelative(-3.0F)
                lineToRelative(-2.0F, -4.0F)
                horizontalLineTo(8.0F)
                lineToRelative(2.0F, 4.0F)
                horizontalLineTo(7.0F)
                lineTo(5.0F, 4.0F)
                horizontalLineTo(4.0F)
                curveToRelative(-1.1F, 0.0F, -1.99F, 0.9F, -1.99F, 2.0F)
                lineTo(2.0F, 18.0F)
                curveToRelative(0.0F, 1.1F, 0.9F, 2.0F, 2.0F, 2.0F)
                horizontalLineToRelative(16.0F)
                curveToRelative(1.1F, 0.0F, 2.0F, -0.9F, 2.0F, -2.0F)
                verticalLineTo(4.0F)
                horizontalLineToRelative(-4.0F)
                close()
            }
        }
        return _clap!!
    }

private var _clap: ImageVector? = null

@Preview
@Composable
@Suppress("UnusedPrivateMember")
private fun IconClapPreview() {
    Image(imageVector = Icons.Clap, contentDescription = null)
}