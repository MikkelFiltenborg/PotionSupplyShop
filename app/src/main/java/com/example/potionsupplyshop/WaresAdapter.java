package com.example.potionsupplyshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.List;

public class WaresAdapter extends ArrayAdapter<Wares>
{
    private List<Wares> waresList;
    private Context context;

    public WaresAdapter(@NonNull Context context, int resource, @NonNull List<Wares> waresList) {
        super(context, resource, waresList);
        this.waresList = waresList;
        this.context = context;
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from
                    (context).inflate(R.layout.list_item, parent, false);

        Wares currentWares = waresList.get(position);
        TextView tvName = listItem.findViewById(R.id.txtName);
        tvName.setText(currentWares.getName());

        TextView tvPrice = listItem.findViewById(R.id.txtPrice);
        tvPrice.setText(String.valueOf(currentWares.getPrice()));

        TextView tvQty = listItem.findViewById(R.id.txtQty);
        tvQty.setText(String.valueOf(currentWares.getQty()));

        listItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (currentWares.getQty()>0)
                {
                    Data.ShoppingCart.add(currentWares);
                    Toast.makeText
                            (context, "Added" + currentWares.getName(), Toast.LENGTH_LONG).show();
                    int i = currentWares.getQty();
                    i--;
                    currentWares.setQty(i);
                    notifyDataSetChanged();
                }
            }
        });
        return listItem;
    }
}
