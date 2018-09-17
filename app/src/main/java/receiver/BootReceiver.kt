package receiver

import activity.MainActivity
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import app.Task


class BootReceiver : BroadcastReceiver()
{
    override fun onReceive(context: Context, intent: Intent)
    {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED)
        {
            Task.UiHandler.postDelayed( {
                val i = Intent(context, MainActivity::class.java)
                i.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                context.startActivity(i)
            }, 30 * 1000 )
        }
    }
}