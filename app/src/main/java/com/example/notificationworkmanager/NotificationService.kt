package com.example.notificationworkmanager

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.annotation.DrawableRes
import androidx.core.app.NotificationCompat
import kotlin.random.Random

class NotificationService (private val context: Context) {


    private val notificationManager= context.getSystemService(NotificationManager::class.java)


    fun showBasicNotification(){

        val notification = NotificationCompat.Builder(context, "123")
            .setContentTitle("Notification title")
            .setContentText("Lorem ipsum dolor sit amet")
            .setSmallIcon(R.drawable.android)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setAutoCancel(true)
            .build()

        notificationManager.notify(Random.nextInt(), notification)

    }

    fun  showLargeNotification(){
        val notification = NotificationCompat.Builder(context, "123")
            .setContentTitle("Notification title")
            .setContentText("Lorem ipsum dolor sit amet")
            .setSmallIcon(R.drawable.android)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setStyle(NotificationCompat.BigTextStyle().bigText("Lorem, any samething, i will ve mobile engineer, with Flutter as Main Stack"))
            .setAutoCancel(true)
            .build()

        notificationManager.notify(Random.nextInt(), notification)

    }


    fun  showLInboxNotification(){
        val notification = NotificationCompat.Builder(context, "123")
            .setContentTitle("Notification title")
            .setContentText("Lorem ipsum dolor sit amet")
            .setSmallIcon(R.drawable.android)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setStyle(NotificationCompat.InboxStyle().addLine("Line 1").addLine("Line 2").addLine("Line 3").addLine("4"))
            .setAutoCancel(true)
            .build()

        notificationManager.notify(Random.nextInt(), notification)

    }


    fun showImageNotification(){
          val image = context.bitmapFromResource(R.drawable.notification)
        val notification = NotificationCompat.Builder(context, "123")
            .setContentTitle("Notification title")
            .setContentText("Lorem ipsum dolor sit amet")
            .setSmallIcon(R.drawable.android)
            .setPriority(NotificationManager.IMPORTANCE_HIGH)
            .setLargeIcon(image)
            .setStyle(NotificationCompat.BigPictureStyle().bigPicture(image).bigPicture(null as Bitmap?))
            .setAutoCancel(true)
            .build()

        notificationManager.notify(Random.nextInt(), notification)

    }


    private fun Context.bitmapFromResource(@DrawableRes resid: Int) = BitmapFactory.decodeResource(resources, resid)

}