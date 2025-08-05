package com.example.tryit.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.tryit.R;
import com.google.android.gms.common.SignInButton;

public class MyFragment extends Fragment {
    private OnFragmentInteractionListener listener;

    public interface OnFragmentInteractionListener {
        void onButtonClicked(String message);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            listener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context + " must implement OnFragmentInteractionListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_hehe, container, false);
        SignInButton btnSend = view.findViewById(R.id.btnGoogleSignIn);
        btnSend.setOnClickListener(v -> {
            if (listener != null) {
                String message = "Button clicked in MyFragment";
                listener.onButtonClicked(message);
            }
        });
        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
