package arimitsu.sf.cql.v3.messages.results.columntype;

import arimitsu.sf.cql.v3.messages.ColumnType;
import arimitsu.sf.cql.v3.messages.ColumnTypeEnum;
import arimitsu.sf.cql.v3.messages.Parser;

public class DecimalType implements ColumnType {
    @Override
    public short getId() {
        return ColumnTypeEnum.DECIMAL.id;
    }

    @Override
    public Parser<?> getParser() {
        return null;
    }
}