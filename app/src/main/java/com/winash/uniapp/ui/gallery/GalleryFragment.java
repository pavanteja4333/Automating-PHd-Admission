package com.winash.uniapp.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.winash.uniapp.R;
import com.winash.uniapp.databinding.FragmentHomeBinding;

public class GalleryFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = null;
        root=inflater.inflate(R.layout.fragment_gallery,container,false);

        return root;
    }
}