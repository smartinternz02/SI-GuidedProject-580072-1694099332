package com.example.week3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var amazon : ImageButton
    private lateinit var google : ImageButton
    private lateinit var facebook : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        amazon = findViewById(R.id.amazon)
        google = findViewById(R.id.google)
        facebook = findViewById(R.id.facebook)

        amazon.setOnClickListener {
            gotoUrl("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0")

        }

        google.setOnClickListener {
            gotoUrl("https://accounts.google.com/v3/signin/identifier?hl=en-GB&ifkv=AYZoVhc5BlvhepCNxxxpDzfIXTUtxWTqiN_-z9WB9-HERz9rungS7mRobl41EFZl360EoHbRyYtR&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1342429701%3A1694778404070352&theme=glif")
        }

        facebook.setOnClickListener {
            gotoUrl("https://www.facebook.com/login/")
        }
    }

    private fun gotoUrl(s: String) {
        val i= Intent(Intent.ACTION_VIEW, Uri.parse(s))
        startActivity(i)

    }

}