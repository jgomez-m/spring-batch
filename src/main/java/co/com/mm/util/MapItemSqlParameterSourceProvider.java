/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.mm.util;

import java.util.Map;
import org.springframework.batch.item.database.ItemSqlParameterSourceProvider;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

/**
 *
 * @author Julian Gomez
 */
public class MapItemSqlParameterSourceProvider
        implements ItemSqlParameterSourceProvider<Map<String, Object>> {

    @Override
    public SqlParameterSource createSqlParameterSource(Map<String, Object> t) {
        return new MapSqlParameterSource(t);
    }

}
