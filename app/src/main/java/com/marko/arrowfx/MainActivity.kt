package com.marko.arrowfx

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import arrow.effects.extensions.io.fx.fx
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		fx {
			effect {
				otherGreetings()
				greetings()
			}
		}
	}

	private suspend fun greetings() {
		delay(100)
		println("Hello!")
	}

	private suspend fun otherGreetings() {
		delay(200)
		println("Hi!")
	}
}