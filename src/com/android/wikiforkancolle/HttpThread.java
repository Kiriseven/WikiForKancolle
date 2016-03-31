package com.android.wikiforkancolle;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Environment;
import android.os.Handler;
import android.widget.ImageView;

public class HttpThread extends Thread {

	private String url;
	private ImageView imageView1;
	private Handler handler;
	private File downloadFile;

	public HttpThread(String url, ImageView imageView1, Handler handler) {
		this.url = url;
		this.imageView1 = imageView1;
		this.handler = handler;
	}

	@Override
	public void run() {
		try {
			URL httpUrl = new URL(url);
			HttpURLConnection conn = (HttpURLConnection) httpUrl
					.openConnection();
			conn.setReadTimeout(5000);
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			InputStream in = conn.getInputStream();
			FileOutputStream out = null;

			String fileName = String.valueOf(System.currentTimeMillis());

			if (Environment.getExternalStorageState().equals(
					Environment.MEDIA_MOUNTED)) {
				File parent = Environment.getExternalStorageDirectory();
				downloadFile = new File(parent, fileName);

				out = new FileOutputStream(downloadFile);
			}

			byte[] b = new byte[2 * 1024];
			int len;
			if (out != null) {
				while ((len = in.read(b)) != -1) {
					out.write(b, 0, len);
				}
			}
			final Bitmap bitmap = BitmapFactory.decodeFile(downloadFile
					.getAbsolutePath());
			handler.post(new Runnable() {
				@Override
				public void run() {
					imageView1.setImageBitmap(bitmap);
				}
			});

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
