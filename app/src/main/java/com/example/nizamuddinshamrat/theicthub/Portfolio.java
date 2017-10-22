package com.example.nizamuddinshamrat.theicthub;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Portfolio extends Fragment {


    public Portfolio() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_portfolio, container, false);

        ListView listView = (ListView)view.findViewById(R.id.lvid);
        String[]namey = {"Business Management. Android","Memories. Website","Sbebd. Website","Travel & Tourism"
                ,"ERP. Enterprise Software","POS. Enterprise Software"};
        String[]descriptiony = {"Android, Mobile Application","Web Application, Website","Web Application, Website"
                ,"Android, Mobile Application","Enterprise Software, ERP","Enterprise Software, POS"};
        int[]imagey = {R.drawable.businessmanagement,R.drawable.memoirimaes,R.drawable.sbebd,R.drawable.travel
                ,R.drawable.erp,R.drawable.pos
        };

        CustomAdapter Adapter = new CustomAdapter(this.getActivity(),namey,descriptiony,imagey);
        listView.setAdapter(Adapter);



        return view;
    }

}
