/*
 * package com.test.pet.handler;
 * 
 * import org.apache.ibatis.type.BaseTypeHandler; import
 * org.apache.ibatis.type.JdbcType;
 * 
 * import java.sql.PreparedStatement; import java.sql.ResultSet; import
 * java.sql.SQLException;
 * 
 * import org.apache.ibatis.type.BaseTypeHandler;
 * 
 * public class NullToEmptyStringTypeHandler extends BaseTypeHandler<String> {
 * 
 * @Override public void setNonNullParameter(PreparedStatement ps, int i, String
 * parameter, JdbcType jdbcType) throws SQLException { ps.setString(i,
 * parameter); }
 * 
 * @Override public String getNullableResult(ResultSet rs, String columnName)
 * throws SQLException { String result = rs.getString(columnName); return result
 * == null ? "" : result; // null이면 빈 문자열로 반환 }
 * 
 * @Override public String getNullableResult(ResultSet rs, int columnIndex)
 * throws SQLException { String result = rs.getString(columnIndex); return
 * result == null ? "" : result; // null이면 빈 문자열로 반환 }
 * 
 * @Override public String getNullableResult(java.sql.CallableStatement cs, int
 * columnIndex) throws SQLException { String result = cs.getString(columnIndex);
 * return result == null ? "" : result; // null이면 빈 문자열로 반환 } }
 * 
 * 
 * 
 */