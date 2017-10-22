package com.example.nizamuddinshamrat.theicthub;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactUs extends Fragment {


    public ContactUs() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_contact_us, container, false);

        Button eMail = (Button)v.findViewById(R.id.action_send_email);
        Button call = (Button)v.findViewById(R.id.callcion);
        Button fb = (Button)v.findViewById(R.id.facebook);
        Button map = (Button)v.findViewById(R.id.map);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:01913846060"));
                startActivity(intent);
            }
        });
        eMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO,Uri.fromParts("mailto","zubaer@theicthub.com",null));
                startActivity(Intent.createChooser(emailIntent,"send mail"));

            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facebook = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/theicthub/"));
                startActivity(facebook);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent map = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.com.bd/maps/place/THE+ICT+HUB/@23.7618224,90.3550145,17z/data=!3m1!4b1!4m5!3m4!1s0x3755bf5f934e832d:0x9569d0daa0b7ece6!8m2!3d23.7618175!4d90.3572032?hl=en"));
                startActivity(map);
            }
        });

        return v;
    }

}
