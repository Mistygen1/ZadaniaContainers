package com.example.myapplication;// ShoppingAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class ShoppingAdapter extends
        RecyclerView.Adapter<ShoppingAdapter.ViewHolder> {
    private List<String> shoppingItems;

    public ShoppingAdapter(List<String> shoppingItems) {
        this.shoppingItems = shoppingItems;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int
            viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        String item = shoppingItems.get(position);
        holder.productNameTextView.setText(item);


    }

    @Override
    public int getItemCount() {
        return shoppingItems.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView productNameTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            productNameTextView =
                    itemView.findViewById(R.id.productNameTextView);
        }
    }
}