package com.uni.wechatbottomnavigation.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.uni.wechatbottomnavigation.R;
import com.uni.wechatbottomnavigation.util.L;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 微信
 */
public class ChatFragment extends Fragment {

    @BindView(R.id.tv)
    TextView tv;
    Unbinder unbinder;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chat, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }


    @OnClick(R.id.tv)
    public void onViewClicked() {
        Toast.makeText(getContext(), "点击了我", Toast.LENGTH_SHORT).show();
        L.d("点击了我");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
