package com.example.horoscoapp.ui.core.listeners

import android.content.Context
import android.view.GestureDetector
import android.view.MotionEvent
import android.view.View

open class OnSwipeTouchListener(context: Context) : View.OnTouchListener {

    //Constantes que se utilizan para detectar gestos de deslizamiento.
    companion object {
        private const val SWIPE_THRESHOLD = 100
        private const val SWIPE_VELOCITY_THRESHOLD = 100
    }

    private val gestureDetector: GestureDetector

    /*Constructor de la clase OnSwipeTouchListener que recibe un contexto como parámetro
     y crea un objeto GestureDetector para detectar gestos de deslizamiento.*/
    init {
        gestureDetector = GestureDetector(context, GestureListener())
    }

    //Este método se llama cuando se detecta un gesto de deslizamiento.
    override fun onTouch(v: View, event: MotionEvent): Boolean {
        return gestureDetector.onTouchEvent(event)
    }

    //Esta clase anidada implementa la interfaz GestureDetector.SimpleOnGestureListener
    private inner class GestureListener : GestureDetector.SimpleOnGestureListener() {

        //Este método se llama cuando se detecta un gesto de deslizamiento.
        override fun onDown(e: MotionEvent): Boolean {
            return true
        }

        //Estos métodos se llaman cuando se detecta un gesto de deslizamiento hacia la derecha o hacia la izquierda.
        override fun onFling(
            e1: MotionEvent?,
            e2: MotionEvent,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            var result = false
            try {
                val diffY = e2.y - e1!!.y
                val diffX = e2.x - e1.x
                if (Math.abs(diffX) > Math.abs(diffY)) {
                    if (Math.abs(diffX) > SWIPE_THRESHOLD && Math.abs(velocityX) > SWIPE_VELOCITY_THRESHOLD) {
                        if (diffX > 0) {
                            onSwipeRight()
                        } else {
                            onSwipeLeft()
                        }
                        result = true
                    }
                } else if (Math.abs(diffY) > SWIPE_THRESHOLD && Math.abs(velocityY) > SWIPE_VELOCITY_THRESHOLD) {
                    if (diffY > 0) {
                        onSwipeBottom()
                    } else {
                        onSwipeTop()
                    }
                    result = true
                }
            } catch (exception: Exception) {
                exception.printStackTrace()
            }

            return result
        }


    }

    open fun onSwipeRight() {}

    open fun onSwipeLeft() {}

    open fun onSwipeTop() {}

    open fun onSwipeBottom() {}
}