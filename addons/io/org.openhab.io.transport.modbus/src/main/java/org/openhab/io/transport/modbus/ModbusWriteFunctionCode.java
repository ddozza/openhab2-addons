/**
 * Copyright (c) 2010-2017 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.io.transport.modbus;

/**
 * Modbus write function codes supported by this binding
 *
 * @author Sami Salonen
 */
public enum ModbusWriteFunctionCode {
    WRITE_COIL,
    WRITE_SINGLE_REGISTER,
    WRITE_MULTIPLE_REGISTERS,
}
