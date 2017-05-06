package com.therightdoctors.patientonetoonesample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class StartConsult extends AppCompatActivity implements View.OnClickListener {
    Button  strtcnslt;
    String Token,SessionID,APikey,did,type,booking_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_consult);
        strtcnslt=(Button)findViewById(R.id.startConsult);
        SessionID="1_MX40NTgzMjgyMn5-MTQ5Mzk3OTY1MjMxOX5MWkRHbCs0Zm50RysvMXk5K3pZYjZ1ZUh-fg";
        Token="T1==cGFydG5lcl9pZD00NTgzMjgyMiZzaWc9MWU2YWM0YmU5Y2NjMzIwNDIxOTkyOWFjZGMzYjc0OWEyZjkxMjBjZjpzZXNzaW9uX2lkPTFfTVg0ME5UZ3pNamd5TW41LU1UUTVNemszT1RZMU1qTXhPWDVNV2tSSGJDczBabTUwUnlzdk1YazVLM3BaWWpaMVpVaC1mZyZjcmVhdGVfdGltZT0xNDkzOTc5NjUyJm5vbmNlPTAuMTUwMTI5MzUwNjM1MTM5MSZyb2xlPXB1Ymxpc2hlciZleHBpcmVfdGltZT0xNDk0NTc5NjUyJmNvbm5lY3Rpb25fZGF0YT1uYW1lJTNEVFJERDU1NFRSRFA0";
        APikey="45832822";

        did="TRDD554";
        booking_id="120";
        type="video"; // keep once type = "tele"; 
        strtcnslt.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        System.out.println(SessionID + " hey bro" + Token);
        if (SessionID != null) {
            System.out.println(booking_id + " Session " + SessionID + " hey bro" + Token);
            Intent in = new Intent(this, MainActivity.class);
            in.putExtra("session", SessionID);
            in.putExtra("token", Token);
            in.putExtra("tkbxapi", APikey);
            in.putExtra("booking_id", booking_id);
            in.putExtra("type", type);
            startActivity(in);
            finish();
        }
    }
}
