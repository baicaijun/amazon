package com.modeush.amazon.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author chenyixiao
 *
 */
public class HttpClientHelp {

	private static Logger logger = LoggerFactory.getLogger(HttpClientHelp.class);





	public static String httpClientGet(String url) throws Exception {
		String retStr = null;
		logger.info("===httpClientGet===");
		logger.info("httpClientGet url = " + url);
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();

		HttpGet httpGet = new HttpGet(url);
		try {
			CloseableHttpResponse response = closeableHttpClient.execute(httpGet);
			// 获取响应实体
			HttpEntity entity = response.getEntity();
			// // 打印响应状态
			if (entity != null) {
				retStr = EntityUtils.toString(entity);
				logger.info("httpClientGet retStr = " + retStr);
			}
		} catch (Exception ex) {
			throw ex;
		} finally {
			try {
				closeableHttpClient.close();
			} catch (IOException e) {
				throw e;
			}
		}
		return retStr;
	}

	public static String httpClientNoTimeoutGet(String url) throws Exception {
		String retStr = null;
		logger.info("===httpClientNoTimeoutGet===");
		logger.info("httpClientNoTimeoutGet url = " + url);
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		CloseableHttpClient closeableHttpClient = httpClientBuilder.build();

		HttpGet httpGet = new HttpGet(url);
		try {
			CloseableHttpResponse response = closeableHttpClient.execute(httpGet);
			// 获取响应实体
			HttpEntity entity = response.getEntity();
			// // 打印响应状态
			if (entity != null) {
				retStr = EntityUtils.toString(entity);
				logger.info("httpClientNoTimeoutGet retStr = " + retStr);
			}
		} catch (Exception ex) {
			throw ex;
		} finally {
			try {
				closeableHttpClient.close();
			} catch (IOException e) {
				throw e;
			}
		}
		return retStr;
	}





	private static class MyHostnameVerifier implements HostnameVerifier {

		@Override
		public boolean verify(String hostname, SSLSession session) {
			// TODO Auto-generated method stub
			return true;
		}
	}

	private static class MyTrustManager implements X509TrustManager {

		@Override
		public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType)
				throws CertificateException {
			// TODO Auto-generated method stub

		}

		@Override
		public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType)
				throws CertificateException {
			// TODO Auto-generated method stub

		}

		@Override
		public java.security.cert.X509Certificate[] getAcceptedIssuers() {
			// TODO Auto-generated method stub
			return null;
		}

	}

	public static final byte[] readBytes(InputStream is, int contentLen) throws Exception {
		if (contentLen > 0) {
			int readLen = 0;

			int readLengthThisTime = 0;

			byte[] message = new byte[contentLen];

			try {

				while (readLen != contentLen) {

					readLengthThisTime = is.read(message, readLen, contentLen - readLen);

					if (readLengthThisTime == -1) {// Should not happen.
						break;
					}

					readLen += readLengthThisTime;
				}

				return message;
			} catch (IOException e) {
				throw e;
			}
		}

		return new byte[] {};
	}
}
