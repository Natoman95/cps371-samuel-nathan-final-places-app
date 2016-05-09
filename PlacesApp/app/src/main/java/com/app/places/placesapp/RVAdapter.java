package com.app.places.placesapp;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tkdsa on 5/9/2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CardViewHolder> {

    //Declare all the item types that you use in the card
    public static class CardViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView cardName;
        TextView cardAddress;
//        ImageView cardPhoto;

        // Tie them to the card xml object
        CardViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            cardName = (TextView)itemView.findViewById(R.id.card_name);
            cardAddress = (TextView)itemView.findViewById(R.id.card_address);
//            cardPhoto = (ImageView)itemView.findViewById(R.id.card_photo);
        }
    }

    List<Place> cards;

    RVAdapter(List<Place> cards) {
        this.cards = cards;
    }

    @Override
    public int getItemCount() {
        return cards.size();
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardlocation, viewGroup, false);
        CardViewHolder pvh = new CardViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(CardViewHolder cardViewHolder, int i) {
        cardViewHolder.cardName.setText(cards.get(i).name);
        cardViewHolder.cardAddress.setText(cards.get(i).address);
//        cardViewHolder.cardPhoto.setImageResource(cards.get(i).Photo);
    }


}