package com.dl7.listclickfeedback.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import com.dl7.listclickfeedback.R;
import com.dl7.listclickfeedback.adapter.RecyclerFullAdapter;
import com.dl7.listclickfeedback.utils.RecyclerViewHelper;

import java.util.ArrayList;
import java.util.List;

public class RecyclerLayoutActivity extends AppCompatActivity {

    private RecyclerView mRvList;
    private RecyclerFullAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initView();
        _updateView();
    }

    private void initView() {
        mRvList = (RecyclerView) findViewById(R.id.rv_list);
        mAdapter = new RecyclerFullAdapter(this);
        RecyclerViewHelper.initRecyclerViewV(this, mRvList, true, mAdapter);
    }

    private void _updateView() {
        List<String> items = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            items.add("Item " + i);
        }
        mAdapter.updateItems(items);
    }
}
