package net.icepc.vertretungsplan;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentText extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        TextView text = new TextView(getActivity().getApplicationContext());
        text.setText("Fragment content");
        text.setTextColor(Color.BLACK);
        text.setGravity(Gravity.CENTER);

        return text;
    }
}
