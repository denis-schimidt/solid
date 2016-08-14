package br.com.schimidtsolutions.cap2.zuado;

import java.sql.PreparedStatement;

public interface ConexaoBd {
	
	PreparedStatement preparaSql(String sql);
}
