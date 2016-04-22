package ru.fauzzzt.colorfiller.view.mvp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRecyclerAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private LayoutInflater inflater;
    private final List<T> items = new ArrayList<>();

    public void setItems(List<T> items) {
        this.items.clear();
        if (items != null) {
            this.items.addAll(items);
        }
        notifyDataSetChanged();
    }
    public T getItem(int position) {
        return items.get(position);
    }

    protected abstract int getItemLayoutId(int viewType);
    protected abstract VH onGetViewHolderInstance(View view, int viewType);

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        if (inflater == null) {
            inflater = LayoutInflater.from(parent.getContext());
        }
        View view = inflater.inflate(getItemLayoutId(viewType), parent, false);
        return onGetViewHolderInstance(view, viewType);
    }
    @Override
    public int getItemCount() {
        return items != null ? items.size() : 0;
    }
}