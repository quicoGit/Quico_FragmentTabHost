package com.plumbaria.fragmenttabhost;

/**
 * Created by quico on 12/10/16.
 */
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.plumbaria.fragmenttabhost.R;

public class FragmentPestanya2 extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.pestanya2_layout,
                container, false);
        TextView tv = (TextView) v.findViewById(R.id.text);
        Resources res = getResources();
        tv.setText(res.getString(R.string.eti_tab2));
        return v;
    }
}