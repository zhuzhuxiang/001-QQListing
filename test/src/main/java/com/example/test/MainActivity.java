package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.io.InputStream;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.iv);
        String url = "https://pics1.baidu.com/feed/ca1349540923dd54915aa147547990d29c824874.jpeg@f_auto?token=88f06f79805f678e14b1570f31aeca7e";
        handleSSLHandshake();
        Glide.with(this).load(url)
                .apply(RequestOptions.bitmapTransform(new RoundedCorners(20)))
                .into(imageView);
    }


    /**
     * 忽略https的证书校验
     * 避免Glide加载https图片报错：
     * javax.net.ssl.SSLHandshakeException: java.security.cert.CertPathValidatorException: Trust anchor for certification path not found.
     */

    public static void handleSSLHandshake() {

        try {

            TrustManager[] trustAllCerts =new TrustManager[]{new X509TrustManager() {

                public X509Certificate[]getAcceptedIssuers() {

                    return new X509Certificate[0];

                }

                @Override

                public void checkClientTrusted(X509Certificate[] certs, String authType){

                }

                @Override

                public void checkServerTrusted(X509Certificate[] certs, String authType)                       {

                }

            }};

            SSLContext sc = SSLContext.getInstance("TLS");

            // trustAllCerts信任所有的证书

            sc.init(null, trustAllCerts, new SecureRandom());

            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());

            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {

                @Override

                public boolean verify(String hostname, SSLSession session) {

                    return true;

                }

            });

        }catch (Exception ignored) {

        }

    }
}
