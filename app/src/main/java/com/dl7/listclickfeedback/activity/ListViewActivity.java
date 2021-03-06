package com.dl7.listclickfeedback.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dl7.listclickfeedback.R;
import com.dl7.listclickfeedback.adapter.ListViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private ListView mLvList;
    private ListViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initView();
        _updateView();
    }

    private void initView() {
        mLvList = (ListView) findViewById(R.id.lv_list);
        mAdapter = new ListViewAdapter(this);
        mLvList.setAdapter(mAdapter);
    }

    private void _updateView() {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("Item " + i);
        }
        mAdapter.updateItems(items);
    }
}
