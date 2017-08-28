package org.openhab.io.transport.modbus;

import java.util.Arrays;

import net.wimpi.modbus.procimg.SimpleInputRegister;

/**
 * <p>ModbusRegisterImpl class.</p>
 *
 * @author Sami Salonen
 */
public class ModbusRegisterImpl implements ModbusRegister {

    private SimpleInputRegister wrapped;

    /**
     * Constructs a new <tt>BytesRegister</tt> instance.
     *
     * @param b1 the first (hi) byte of the word.
     * @param b2 the second (low) byte of the word.
     */
    public ModbusRegisterImpl(byte b1, byte b2) {
        wrapped = new SimpleInputRegister(b1, b2);
    }

    @Override
    public byte[] getBytes() {
        return wrapped.toBytes();
    }

    @Override
    public int getValue() {
        return wrapped.getValue();
    }

    @Override
    public int toUnsignedShort() {
        return wrapped.toUnsignedShort();
    }

    @Override
    public String toString() {
        return new StringBuffer("ModbusRegisterImpl(bytes=").append(Arrays.toString(wrapped.toBytes()))
                .append(",ushort=").append(toUnsignedShort()).append(')').toString();
    }
}