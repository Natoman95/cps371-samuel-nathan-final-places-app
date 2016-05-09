package com.app.places.placesapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.StrictMode;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import cz.msebera.android.httpclient.util.ByteArrayBuffer;

/**
 * Created by tkdsa on 5/9/2016.
 */
public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CardViewHolder> {

    //Declare all the item types that you use in the card
    public static class CardViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView cardName;
        TextView cardAddress;
        ImageView cardPhoto;
        TextView cardRating;

        // Tie them to the card xml object
        CardViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.card_view);
            cardName = (TextView)itemView.findViewById(R.id.card_name);
            cardAddress = (TextView)itemView.findViewById(R.id.card_address);
            cardPhoto = (ImageView)itemView.findViewById(R.id.card_photo);
            cardRating = (TextView)itemView.findViewById(R.id.card_rating);
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
        cardViewHolder.cardAddress.setText(toString(cards.get(i).rating));


        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        URL url = null;
        Bitmap logoBmp = null;
        try {
            url = new URL(cards.get(i).photoUrl);
            logoBmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (logoBmp == null)
        {
            ;
        }
        else
        {
            cardViewHolder.cardPhoto.setImageBitmap(logoBmp);
        }


    }


/*
*http://www.concretepage.com/android/android-load-image-from-url-with-internet-using-bitmapfactory-and-imageview-setimagebitmap-example
 */
//    public class AsyncTaskLoadImage  extends AsyncTask<String, String, Bitmap> {
//        private final static String TAG = "AsyncTaskLoadImage";
//        private ImageView imageView;
//        public AsyncTaskLoadImage(ImageView imageView) {
//            this.imageView = imageView;
//        }
//        @Override
//        protected Bitmap doInBackground(String... params) {
//            Bitmap bitmap = null;
//            try {
//                URL url = new URL(params[0]);
//                bitmap = BitmapFactory.decodeStream((InputStream)url.getContent());
//            } catch (IOException e) {
//                Log.e(TAG, e.getMessage());
//            }
//            return bitmap;
//        }
//        @Override
//        protected void onPostExecute(Bitmap bitmap) {
//            imageView.setImageBitmap(bitmap);
//        }
//    }
//
//    private Bitmap downloadImage(String stringUrl) {
//        URL url;
//        Bitmap bm = null;
//        try {
//            url = new URL(stringUrl);
//            URLConnection ucon = url.openConnection();
//            InputStream is;
//
//                HttpURLConnection httpConn = (HttpURLConnection) ucon;
//                int statusCode = httpConn.getResponseCode();
//                if (statusCode == 200) {
//                    is = httpConn.getInputStream();
//                    BitmapFactory.Options options = new BitmapFactory.Options();
//                    options.inSampleSize = 8;
//                    BufferedInputStream bis = new BufferedInputStream(is, 8192);
//                    ByteArrayBuffer baf = new ByteArrayBuffer(1024);
//                    int current = 0;
//                    while ((current = bis.read()) != -1) {
//                        baf.append((byte) current);
//                    }
//                    byte[] rawImage = baf.toByteArray();
//                    bm = BitmapFactory.decodeByteArray(rawImage, 0, rawImage.length);
//                    bis.close();
//                }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return bm;
//    }

//    private class GetPictures extends AsyncTask {
//
//        @Override
//        protected Bitmap doInBackground(URL ... url)
//        {
//            Bitmap logoBmp = null;
//            try {
//                logoBmp = BitmapFactory.decodeStream(url.openConnection().getInputStream());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return logoBmp;
//
//        }
//        @Override
//        protected void onPostExecute(String result) {
//        }
//
////        @Override
////        protected Object doInBackground(Object[] params) {
////            return null;
////        }
//
//        @Override
//        protected void onPreExecute() {
//        }
//
//        @Override
//        protected void onProgressUpdate(Void... values) {
//        }
//    }


}