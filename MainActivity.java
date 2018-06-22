package com.example.amrit.max;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    private AdView mAdView1;
    private AdView mAdView2;
    private AdView mAdView3;
    private AdView mAdView4;
    private AdView mAdView5;
    private AdView mAdView6;
    private AdView mAdView7;
    private AdView mAdView8;


    private InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-5747983837870037~6418158566");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView1 = findViewById(R.id.adView1);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);

        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest2 = new AdRequest.Builder().build();
        mAdView2.loadAd(adRequest2);

        mAdView3 = findViewById(R.id.adView3);
        AdRequest adRequest3 = new AdRequest.Builder().build();
        mAdView3.loadAd(adRequest3);

        mAdView4 = findViewById(R.id.adView4);
        AdRequest adRequest4 = new AdRequest.Builder().build();
        mAdView4.loadAd(adRequest4);

        mAdView5 = findViewById(R.id.adView5);
        AdRequest adRequest5 = new AdRequest.Builder().build();
        mAdView5.loadAd(adRequest5);

        mAdView6 = findViewById(R.id.adView6);
        AdRequest adRequest6 = new AdRequest.Builder().build();
        mAdView6.loadAd(adRequest6);

        mAdView7 = findViewById(R.id.adView7);
        AdRequest adRequest7 = new AdRequest.Builder().build();
        mAdView7.loadAd(adRequest7);

        mAdView8 = findViewById(R.id.adView8);
        AdRequest adRequest8 = new AdRequest.Builder().build();
        mAdView8.loadAd(adRequest8);





        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-5747983837870037/6953770210");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when the ad is displayed.
            }

            @Override
            public void onAdLeftApplication() {
                // Code to be executed when the user has left the app.
            }

            @Override
            public void onAdClosed() {
                mInterstitialAd.loadAd(new AdRequest.Builder().build());

                // Code to be executed when when the interstitial ad is closed.
            }
        });

    }
}
