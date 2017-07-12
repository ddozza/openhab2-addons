/**
 * Copyright (c) 2014-2016 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.modbus;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.openhab.io.transport.modbus.ModbusReadFunctionCode;

/**
 * The {@link ModbusBinding} class defines common constants, which are
 * used across the whole binding.
 *
 * @author Sami Salonen - Initial contribution
 */
public class ModbusBindingConstants {

    public static final String BINDING_ID = "modbus";

    // List of all Thing Type UIDs
    public static final ThingTypeUID THING_TYPE_MODBUS_TCP = new ThingTypeUID(BINDING_ID, "tcp");
    public static final ThingTypeUID THING_TYPE_MODBUS_POLLER = new ThingTypeUID(BINDING_ID, "poller");
    public static final ThingTypeUID THING_TYPE_MODBUS_WRITE = new ThingTypeUID(BINDING_ID, "write");
    public static final ThingTypeUID THING_TYPE_MODBUS_READ = new ThingTypeUID(BINDING_ID, "read");
    public static final ThingTypeUID THING_TYPE_MODBUS_READ_WRITE = new ThingTypeUID(BINDING_ID, "readwrite");

    // List of all Channel ids
    public static final String CHANNEL_SWITCH = "switch";
    public static final String CHANNEL_CONTACT = "contact";
    public static final String CHANNEL_DATETIME = "datetime";
    public static final String CHANNEL_DIMMER = "dimmer";
    public static final String CHANNEL_NUMBER = "number";
    public static final String CHANNEL_STRING = "string";
    public static final String CHANNEL_ROLLERSHUTTER = "rollershutter";
    public static final String CHANNEL_LAST_READ_SUCCESS = "lastReadSuccess";
    public static final String CHANNEL_LAST_READ_ERROR = "lastReadError";
    public static final String CHANNEL_LAST_WRITE_SUCCESS = "lastWriteSuccess";
    public static final String CHANNEL_LAST_WRITE_ERROR = "lastWriteError";

    public static final String WRITE_TYPE_COIL = "coil";
    public static final String WRITE_TYPE_HOLDING = "holding";

    public static final String[] DATA_CHANNELS = { CHANNEL_SWITCH, CHANNEL_CONTACT, CHANNEL_DATETIME, CHANNEL_DIMMER,
            CHANNEL_NUMBER, CHANNEL_STRING, CHANNEL_ROLLERSHUTTER };

    public static final String[] DATA_CHANNELS_TO_COPY_FROM_READ_TO_READWRITE = { CHANNEL_SWITCH, CHANNEL_CONTACT,
            CHANNEL_DATETIME, CHANNEL_DIMMER, CHANNEL_NUMBER, CHANNEL_STRING, CHANNEL_ROLLERSHUTTER,
            CHANNEL_LAST_READ_SUCCESS, CHANNEL_LAST_READ_ERROR };

    public static final String[] DATA_CHANNELS_TO_DELEGATE_COMMAND_FROM_READWRITE_TO_WRITE = { CHANNEL_SWITCH,
            CHANNEL_CONTACT, CHANNEL_DATETIME, CHANNEL_DIMMER, CHANNEL_NUMBER, CHANNEL_STRING, CHANNEL_ROLLERSHUTTER };

    public static final Map<String, ModbusReadFunctionCode> READ_FUNCTION_CODES = new HashMap<String, ModbusReadFunctionCode>();
    static {
        READ_FUNCTION_CODES.put("coil", ModbusReadFunctionCode.READ_COILS);
        READ_FUNCTION_CODES.put("discrete", ModbusReadFunctionCode.READ_INPUT_DISCRETES);
        READ_FUNCTION_CODES.put("input", ModbusReadFunctionCode.READ_INPUT_REGISTERS);
        READ_FUNCTION_CODES.put("holding", ModbusReadFunctionCode.READ_MULTIPLE_REGISTERS);
    }
}