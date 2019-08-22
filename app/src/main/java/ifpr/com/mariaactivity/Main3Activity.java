package ifpr.com.mariaactivity;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {

        private Button ok;
        private EditText texto;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main3);

            ok = (Button) findViewById(R.id.botaoOk);
            texto = (EditText) findViewById(R.id.editTexto3);
        }

        public void fazerMagica(View v) {
            AlertDialog.Builder dlg = new AlertDialog.Builder(Main3Activity.this);
            dlg.setMessage(texto.getText().toString());
            dlg.setNeutralButton("ok", null);
            dlg.show();

            NotificationManager nm = (NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);

            if (Build.  VERSION.SDK_INT >= Build.VERSION_CODES.O){
                NotificationChannel canal = new NotificationChannel("id","canal",NotificationManager.IMPORTANCE_DEFAULT);
                nm.createNotificationChannel(canal);

                NotificationCompat.Builder builder = new NotificationCompat.Builder(this);
                builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);
            }

            NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this,"id");
            notificationBuilder.setSmallIcon(R.drawable.ic_launcher_background);
            notificationBuilder.setContentTitle("Mágica!!");
            notificationBuilder.setContentText("TAN NAN!");
            notificationBuilder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

            nm.notify(456789, notificationBuilder.build());
        }

       public void proximaTela(View v){
           Intent intent = new Intent(this, Main4Activity.class);
           startActivity(intent);
       }
}
