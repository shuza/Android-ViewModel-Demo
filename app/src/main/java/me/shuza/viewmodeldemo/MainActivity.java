package me.shuza.viewmodeldemo;

import android.arch.lifecycle.ViewModelProviders;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tvResult)
    TextView tvResult;

    private DataModel dataModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        dataModel = ViewModelProviders.of(this).get(DataModel.class);
        displayCounter(dataModel.getCount());
    }

    @OnClick(R.id.btnCount)
    public void increaseCounter(View view) {
        dataModel.setCount(dataModel.getCount() + 1);
        displayCounter(dataModel.getCount());
    }

    private void displayCounter(int count) {
        tvResult.setText(String.valueOf(count));
    }
}
