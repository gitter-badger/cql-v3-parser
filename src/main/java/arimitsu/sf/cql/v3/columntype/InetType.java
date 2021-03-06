package arimitsu.sf.cql.v3.columntype;

import arimitsu.sf.cql.v3.util.Notation;

import java.net.InetAddress;
import java.nio.ByteBuffer;

public class InetType implements ColumnType {
    private static final Parser<InetAddress> PARSER = new Parser<InetAddress>() {
        @Override
        public InetAddress parse(ByteBuffer buffer) {
            int length = buffer.getInt();
            return Notation.toInet(Notation.getBytes(buffer, length));
        }
    };


    @Override
    public Parser<?> getParser() {
        return PARSER;
    }
}
