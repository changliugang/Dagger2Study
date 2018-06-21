package com.study.chang.dagger2study.student;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.study.chang.dagger2study.R;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.DaggerFragment;

/**
 * @author 2018/6/21 11:49 / changliugang
 */
public class StudentFragment extends DaggerFragment {

    @Inject
    Student mStudent;

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_student, container, false);
        TextView textView = rootView.findViewById(R.id.frag_student_desc);
        if (mStudent != null)
            textView.setText(mStudent.getName());
        return rootView;
    }
}
