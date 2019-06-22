package com.abhishek.myapplication

import android.content.Context
import android.view.View
import android.view.animation.DecelerateInterpolator
import android.widget.Toast

fun View.setVisible(isVisible: Boolean) {
    visibility = if (isVisible) View.VISIBLE else View.GONE
}

fun View.slideInFromBottom(animationDuration: Long = 300, animateAlpha: Boolean = false,
                           startAlpha: Float = 0.0f,
                           translation: Float = 0F,
                           endAction: (() -> Unit) = {}) {
    translationY = if (translation == 0F) {
        measuredHeight.toFloat()
    } else {
        translation
    }

    val animator = animate()
        .translationY(0f)
    if (animateAlpha) {
        alpha = startAlpha
        animator.alpha(1.0f)
    }

    animator.setInterpolator(DecelerateInterpolator())
        .setDuration(animationDuration)
        .withEndAction(endAction)

    setVisible(true)
}

fun String.showToast(context: Context, length: Int = Toast.LENGTH_LONG) {
    Toast.makeText(context, this, length).show()
}