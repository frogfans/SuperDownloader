package com.example.agentzengyu.superdownloader.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.agentzengyu.superdownloader.R;
import com.example.agentzengyu.superdownloader.adapter.ItemAdpter;
import com.example.agentzengyu.superdownloader.app.SuperDownloaderApp;
import com.example.agentzengyu.superdownloader.entity.DownloadItem;

import java.util.ArrayList;

/**
 * 历史任务
 */
public class HistoryTaskFragment extends Fragment implements View.OnClickListener {
    private SuperDownloaderApp superDownloaderApp = null;

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ItemAdpter itemAdpter;
    private ArrayList<DownloadItem> downloadItems = new ArrayList<>();

    public HistoryTaskFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_history_task, null);
        superDownloaderApp = (SuperDownloaderApp) getActivity().getApplication();
        initView(view);
        return view;
    }

    /**
     * 初始化布局
     */
    private void initView(View view ) {
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        itemAdpter = new ItemAdpter(downloadItems);
        itemAdpter.setItemClickListener(new ItemAdpter.OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(View view, DownloadItem downloadItem) {

            }
        });
        recyclerView.setAdapter(itemAdpter);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            default:
                break;
        }
    }
}
