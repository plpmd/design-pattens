package br.com.plpmd.loja.http;

import java.util.Map;

//Design Pattern - Adapter
public interface HttpAdapter {

	void post(String url, Map<String, Object> dados);
}
