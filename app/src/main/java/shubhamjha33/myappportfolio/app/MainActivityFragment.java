package shubhamjha33.myappportfolio.app;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_main, container, false);
        List<String> appList=new ArrayList();
        appList.add("Spotify Streamer");
        appList.add("Football Scores");
        appList.add("Library");
        appList.add("Build It Bigger");
        appList.add("XYZ Reader");
        appList.add("Capstone");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getContext(),R.layout.list_item_button,R.id.launcherButton,appList);
        ListView buttonList=(ListView)rootView.findViewById(R.id.listView);
        buttonList.setAdapter(arrayAdapter);
        return rootView;
    }


}
