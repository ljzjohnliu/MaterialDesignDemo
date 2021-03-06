package com.study.demo.recyclerview;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import com.study.demo.MDBaseActivity;
import com.study.demo.R;
import com.study.demo.recyclerview.adapter.MDRvAdapter;
import com.study.demo.recyclerview.decoration.MDGridRvDividerDecoration;
import com.study.demo.recyclerview.mock.MDMockData;

/**
 * grid {@link RecyclerView} page
 * <p>
 * Created by wangkegang on 2016/07/05 .
 */
public class MDGridRvActivity extends MDBaseActivity {

    private RecyclerView mRecyclerView;

    private RecyclerView.Adapter mAdapter;

    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_grid);

        initData();
        initView();
    }

    private void initData() {
        // 竖直方向的网格样式，每行四个Item
        mLayoutManager = new GridLayoutManager(this, 4, OrientationHelper.VERTICAL, false);

        mAdapter = new MDRvAdapter(MDMockData.getRvData());
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        mRecyclerView.setLayoutManager(mLayoutManager);

        mRecyclerView.setAdapter(mAdapter);

        mRecyclerView.addItemDecoration(new MDGridRvDividerDecoration(this));

    }
}
