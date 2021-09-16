package org.aplas.soccermatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LogAdapter extends RecyclerView.Adapter<LogAdapter.LogViewHolder> {
    private int listItemLayout;
    private ArrayList<LogItem> itemList;

    public LogAdapter(int layoutId, ArrayList<LogItem> itemList) {
        listItemLayout = layoutId;
        this.itemList = itemList;
    }
    @NonNull
    @Override
    public LogAdapter.LogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LogAdapter.LogViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }

    public class LogViewHolder extends RecyclerView.ViewHolder {
        public LogViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
