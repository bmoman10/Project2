package mcis.jsu.edu.crosswordmagic;

import android.arch.lifecycle.ViewModelProviders;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CluesFragmentView extends Fragment {

    View root;
    private CrosswordMagicViewModel model;

    public CluesFragmentView() {}

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        model = ViewModelProviders.of(getActivity()).get(CrosswordMagicViewModel.class);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        root = inflater.inflate(R.layout.clues_fragment_view, container, false);
        return root;

    }

    @Override
    public void onStart() {

        super.onStart();
        initCluesView();

    }

    private void initCluesView() {

        TextView aContainer = root.findViewById(R.id.aContainer);
        TextView dContainer = root.findViewById(R.id.dContainer);

        aContainer.setTextColor(Color.BLACK);
        dContainer.setTextColor(Color.BLACK);

        aContainer.setText(model.getAClues());
        dContainer.setText(model.getDClues());

        aContainer.setMovementMethod(new ScrollingMovementMethod());
        dContainer.setMovementMethod(new ScrollingMovementMethod());

    }

}