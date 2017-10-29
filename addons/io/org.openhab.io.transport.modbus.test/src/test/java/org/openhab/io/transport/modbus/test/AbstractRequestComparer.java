package org.openhab.io.transport.modbus.test;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;
import org.openhab.io.transport.modbus.ModbusWriteFunctionCode;
import org.openhab.io.transport.modbus.ModbusWriteRequestBlueprint;

abstract class AbstractRequestComparer<T extends ModbusWriteRequestBlueprint> extends TypeSafeMatcher<T> {

    private int expectedUnitId;
    private int expectedAddress;
    private ModbusWriteFunctionCode expectedFunctionCode;
    private int expectedMaxTries;

    public AbstractRequestComparer(int expectedUnitId, int expectedAddress,
            ModbusWriteFunctionCode expectedFunctionCode, int expectedMaxTries) {
        this.expectedUnitId = expectedUnitId;
        this.expectedAddress = expectedAddress;
        this.expectedFunctionCode = expectedFunctionCode;
        this.expectedMaxTries = expectedMaxTries;
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("should return correct values");
    }

    @SuppressWarnings("null")
    @Override
    protected boolean matchesSafely(T item) {
        if (item.getUnitID() != expectedUnitId) {
            return false;
        }
        if (item.getReference() != expectedAddress) {
            return false;
        }
        if (item.getFunctionCode() != expectedFunctionCode) {
            return false;
        }
        if (item.getMaxTries() != expectedMaxTries) {
            return false;
        }
        return doMatchData(item);
    }

    protected abstract boolean doMatchData(T item);
}