package org.openhab.io.transport.modbus;

import org.openhab.io.transport.modbus.internal.ModbusUnexpectedTransactionIdException;

import net.wimpi.modbus.ModbusException;

public interface ModbusReadCallback {

    /**
     * Callback for "input register" and "holding register" data in the case of no errors
     *
     * @param ModbusReadRequestBlueprint representing the request
     * @param registers data received from slave device in the last pollInterval
     */
    void onRegisters(ModbusReadRequestBlueprint request, ModbusRegisterArray registers);

    /**
     * Callback for "coil" and "discrete input" bit data in the case of no errors
     *
     * @param ModbusReadRequestBlueprint representing the request
     * @param bits data received from slave device
     */
    void onBits(ModbusReadRequestBlueprint request, BitArray bits);

    /**
     * Callback for errors with read
     *
     * @request ModbusRequestBlueprint representing the request
     * @param Exception representing the issue with the request. Instance of
     *            {@link ModbusUnexpectedTransactionIdException} or {@link ModbusException}.
     */
    void onError(ModbusReadRequestBlueprint request, Exception error);

}